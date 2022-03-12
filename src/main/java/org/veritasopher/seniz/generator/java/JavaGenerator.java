package org.veritasopher.seniz.generator.java;

import org.veritasopher.seniz.core.model.ControlSystem;
import org.veritasopher.seniz.core.model.GlobalEnvironment;
import org.veritasopher.seniz.core.model.TransitionSystem;
import org.veritasopher.seniz.core.model.common.*;
import org.veritasopher.seniz.exception.type.GeneratorException;
import org.veritasopher.seniz.generator.base.BaseGenerator;

import java.io.File;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static org.veritasopher.seniz.generator.java.dict.SourceFile.*;
import static org.veritasopher.seniz.generator.java.util.Template.*;
import static org.veritasopher.seniz.generator.java.util.Transform.*;

/**
 * Java Generator
 *
 * @author Yepeng Ding
 * @date 3/7/2022
 */
public class JavaGenerator extends BaseGenerator {

    public JavaGenerator(GlobalEnvironment globalEnvironment) {
        super(globalEnvironment);
    }

    public JavaGenerator(GlobalEnvironment globalEnvironment, String systemIdentifier) {
        super(globalEnvironment, systemIdentifier);
    }

    /**
     * Generate program to a given directory
     *
     * @param outDir output directory
     */
    public void generateToDir(String namespace, String outDir) {
        if (env.getTransitionSystem(systemIdentifier).isPresent()) {
            generateTSToDir(env.getTransitionSystem(systemIdentifier).get(), namespace, outDir);
        } else if (env.getControlSystem(systemIdentifier).isPresent()) {
            generateCSToDir(env.getControlSystem(systemIdentifier).get(), namespace, outDir);
        } else {
            throw new GeneratorException(systemIdentifier, "Unknown system is found.");
        }
    }

    private void generateTSToDir(TransitionSystem ts, String namespace, String outDir) {
        Path root = Path.of(outDir + File.separator + systemIdentifier.toLowerCase());
        String rootNamespace = "%s.%s".formatted(namespace, systemIdentifier.toLowerCase());

        generateArgument(ts, rootNamespace, root);
        generateVariable(ts, rootNamespace, root);
        generateAction(ts, rootNamespace, root);
        generateState(ts, rootNamespace, root);
        generateFramework(ts, rootNamespace, root);
    }

    private void generateCSToDir(ControlSystem cs, String namespace, String outDir) {

    }


    /**
     * Generate system argument file
     *
     * @param ts            transition system
     * @param rootNamespace root namespace
     * @param root          root path
     */
    private void generateArgument(TransitionSystem ts, String rootNamespace, Path root) {
        String arguments = ts.getSystemArgumentSet().stream()
                .map(arg -> "%s(\"%s\", %s, %s)"
                        .formatted(toJavaArgumentName(arg.getName()),
                                arg.getName(),
                                toJavaTypeClass(arg.getPrimaryType()),
                                toJavaEvaluation(ts, arg.getEvaluation())))
                .collect(Collectors.joining("," + System.lineSeparator()));

        String argumentProgram = generateArgumentFromTemplate(ARGUMENT.getNamespace(rootNamespace), arguments);

        writeToFile(argumentProgram, ARGUMENT.getFilePath(root));
    }

    /**
     * Generate state variable file
     *
     * @param ts            transition system
     * @param rootNamespace root namespace
     * @param root          root path
     */
    private void generateVariable(TransitionSystem ts, String rootNamespace, Path root) {
        String variables = ts.getStateVariables().getVariableSet().stream()
                .map(v -> "%s(\"%s\", %s)"
                        .formatted(toJavaVariableName(v.getName()),
                                v.getName(),
                                toJavaTypeClass(v.getPrimaryType())))
                .collect(Collectors.joining("," + System.lineSeparator()));

        String variableProgram = generateVariableFromTemplate(VARIABLE.getNamespace(rootNamespace), variables);

        writeToFile(variableProgram, VARIABLE.getFilePath(root));
    }


    /**
     * Generate action file
     *
     * @param ts            transition system
     * @param rootNamespace root namespace
     * @param root          root path
     */
    private void generateAction(TransitionSystem ts, String rootNamespace, Path root) {
        String actions = ts.getActionSet().stream()
                .filter(action -> !action.isEpsilon())
                .map(a -> "void %s();".formatted(a.getName()))
                .collect(Collectors.joining(System.lineSeparator()));

        String actionProgram = generateActionFromTemplate(ACTION.getNamespace(rootNamespace), actions);

        writeToFile(actionProgram, ACTION.getFilePath(root));
    }

    /**
     * Generate state file
     *
     * @param ts            transition system
     * @param rootNamespace root namespace
     * @param root          root path
     */
    private void generateState(TransitionSystem ts, String rootNamespace, Path root) {
        // Generate variable settings for each state
        Map<Integer, String> variableSettingMap = generateVariableSettingMap(ts);

        // Generate transition settings for each state
        Map<Integer, String> transitionSettingMap = generateTransitionSettingMap(ts);

        String stateProgramBody = ts.getStates().values().stream()
                .map(state -> """
                        %s() {
                            @Override
                            public void init(Map<Variable, Object> varSet) {
                            %s
                            }
                            @Override
                            public State next(ActionExecutor exec, Map<Variable, Object> varSet) {
                            %s
                            }
                        }
                        """.formatted(toJavaStateName(state),
                        variableSettingMap.get(state.hashCode()),
                        transitionSettingMap.get(state.hashCode())))
                .collect(Collectors.joining("," + System.lineSeparator()));


        String stateProgram = generateStateFromTemplate(
                STATE.getNamespace(rootNamespace),
                toJavaImport(rootNamespace, ACTION_EXECUTOR, false),
                toJavaImport(rootNamespace, STATE_BEHAVIOR, false),
                toJavaImport(rootNamespace, ARGUMENT, true),
                toJavaImport(rootNamespace, VARIABLE, true),
                stateProgramBody);

        writeToFile(stateProgram, STATE.getFilePath(root));
    }

    /**
     * Generate variable setting map
     *
     * @param ts transition system
     * @return Map(State HashCode, State Variable Setting)
     */
    private Map<Integer, String> generateVariableSettingMap(TransitionSystem ts) {
        // Map<State HashCode, Variable Setting>
        Map<Integer, String> variableSettingMap = new HashMap<>();

        // Get the initial state
        State initState = ts.getInitState();

        // Generate the initial state variable setting
        String initStateVariableSetting = initState.getVariables().stream()
                .map(v -> "varSet.put(%s, %s);".formatted(toJavaVariableName(v.getName()), toJavaEvaluation(ts, v.getEvaluation())))
                .collect(Collectors.joining(System.lineSeparator()));

        variableSettingMap.put(initState.hashCode(), initStateVariableSetting);

        // Generate variable settings for all destination states derived from the initial state
        generateVariableSettingForDstStates(ts, initState, variableSettingMap);
        return variableSettingMap;
    }


    /**
     * Generate variable settings for all destination states derived from a given source state.
     *
     * @param ts                 transition system
     * @param srcState           source state
     * @param variableSettingMap variable setting map
     */
    private void generateVariableSettingForDstStates(TransitionSystem ts, State srcState, Map<Integer, String> variableSettingMap) {
        Set<Transition> transitions = ts.getTransitionsBySrcStateHashCode(srcState.hashCode());

        transitions.stream()
                .filter(t -> !variableSettingMap.containsKey(t.getDstState()))
                .map(t -> ts.getState(t.getDstState()).orElseThrow(() ->
                        new GeneratorException(ts.getIdentifier(), "Unknown state is found.")))
                .forEach(dstState -> {
                    // Only update changed variables
                    Set<StateVariable> changedVariables = dstState.getVariables().stream()
                            .filter(stateVariable -> !srcState.getVariables().contains(stateVariable))
                            .collect(Collectors.toSet());
                    String variableSetting = changedVariables.stream()
                            .map(v -> "varSet.put(%s, %s);".formatted(toJavaVariableName(v.getName()), toJavaEvaluation(ts, v.getEvaluation())))
                            .collect(Collectors.joining(System.lineSeparator()));
                    variableSettingMap.put(dstState.hashCode(), variableSetting);
                    // Recursively generate variable settings for all destination states derived from this destination state.
                    generateVariableSettingForDstStates(ts, dstState, variableSettingMap);
                });
    }

    /**
     * Generate transition setting map
     *
     * @param ts transition system
     * @return Map(State HashCode, State Transition Setting)
     */
    private Map<Integer, String> generateTransitionSettingMap(TransitionSystem ts) {
        // Map<State HashCode, Transition>
        Map<Integer, String> transitionSettingMap = new HashMap<>();

        ts.getStates().forEach((hashCode, state) -> {
            Set<Transition> transitions = ts.getTransitionsBySrcStateHashCode(hashCode);
            String transitionSetting;
            if (transitions.size() > 1) {
                // Multiple transitions
                // TODO check condition overlapping (currently only preventing multiple tautologies)
                Set<Transition> tautologyTransitions = transitions.stream()
                        .filter(t -> ts.getProposition(t.getGuard()).orElseThrow(() -> {
                            throw new GeneratorException(ts.getIdentifier(), "Unknown guard is found");
                        }).isTautology())
                        .collect(Collectors.toSet());
                if (tautologyTransitions.size() > 1) {
                    // Multiple tautologies
                    throw new GeneratorException(ts.getIdentifier(), "Multiple tautologies for a state transition are found.");
                }

                transitionSetting = transitions.stream().map(t ->
                        "if (%s) {%s}".formatted(
                                toJavaEvaluation(ts, ts.getProposition(t.getGuard()).orElseThrow(() -> {
                                    throw new GeneratorException(ts.getIdentifier(), "Unknown guard is found");
                                }).getEvaluation()),
                                generateActionStatement(ts, t))
                ).collect(Collectors.joining(System.lineSeparator()));
                transitionSetting = transitionSetting + System.lineSeparator() + "return null;";
            } else if (transitions.size() == 1) {
                // One transition
                Transition transition = transitions.iterator().next();
                transitionSetting = generateActionStatement(ts, transition);

                Proposition guard = ts.getProposition(transition.getGuard()).orElseThrow(() -> {
                    throw new GeneratorException(ts.getIdentifier(), "Unknown guard is found");
                });

                // If not tautology, add transition condition.
                if (!guard.isTautology()) {
                    transitionSetting = "if (%s) {%s} else {return null;} "
                            .formatted(toJavaEvaluation(ts, guard.getEvaluation()), transitionSetting);
                }

            } else {
                // Ending state
                transitionSetting = "return null;";
            }
            transitionSettingMap.put(hashCode, transitionSetting);
        });

        return transitionSettingMap;
    }

    /**
     * Generate Action Statement
     *
     * @param ts         transition system
     * @param transition transition
     * @return action statement
     */
    private String generateActionStatement(TransitionSystem ts, Transition transition) {
        String actionStatement;
        Action action = ts.getAction(transition.getAction()).orElseThrow(() ->
                new GeneratorException(ts.getIdentifier(), "Unknown action is found."));
        State dstState = ts.getState(transition.getDstState()).orElseThrow(() ->
                new GeneratorException(ts.getIdentifier(), "Unknown state is found."));
        if (!action.isEpsilon()) {
            actionStatement = "exec.%s(); return %s;".formatted(action.getName(), toJavaStateName(dstState));
        } else {
            actionStatement = "return %s;".formatted(toJavaStateName(dstState));
        }
        return actionStatement;
    }

    /**
     * Generate framework files
     *
     * @param ts            transition system
     * @param rootNamespace root namespace
     * @param root          root path
     */
    private void generateFramework(TransitionSystem ts, String rootNamespace, Path root) {
        String program;
        // Generate ActionExecutor file
        program = generateActionExecutorFromTemplate(
                ACTION_EXECUTOR.getNamespace(rootNamespace),
                toJavaImport(rootNamespace, ACTION, false),
                toJavaImport(rootNamespace, ARGUMENT, false),
                toJavaImport(rootNamespace, VARIABLE, false)
        );
        writeToFile(program, ACTION_EXECUTOR.getFilePath(root));

        // Generate StateBehavior file
        program = generateStateBehaviorFromTemplate(
                STATE_BEHAVIOR.getNamespace(rootNamespace),
                toJavaImport(rootNamespace, STATE, false),
                toJavaImport(rootNamespace, VARIABLE, false)
        );
        writeToFile(program, STATE_BEHAVIOR.getFilePath(root));

        // Generate ActionEffect file
        String actionEffects = ts.getActionSet().stream()
                .filter(action -> !action.isEpsilon())
                .map(a -> """
                        @Override
                        public void %s() {
                                                
                        }
                        """.formatted(a.getName()))
                .collect(Collectors.joining(System.lineSeparator()));

        program = generateActionEffectFromTemplate(
                ACTION_EFFECT.getNamespace(rootNamespace),
                toJavaImport(rootNamespace, ACTION_EXECUTOR, false),
                toJavaImport(rootNamespace, ARGUMENT, true),
                toJavaImport(rootNamespace, VARIABLE, true),
                actionEffects
        );
        writeToFile(program, ACTION_EFFECT.getFilePath(root));

        // Generate SystemExecutor file
        program = generateSystemExecutorFromTemplate(
                SYSTEM_EXECUTOR.getNamespace(rootNamespace),
                toJavaImport(rootNamespace, STATE, false),
                toJavaImport(rootNamespace, VARIABLE, false),
                toJavaStateName(ts.getInitState())
        );
        writeToFile(program, SYSTEM_EXECUTOR.getFilePath(root));
    }


}
