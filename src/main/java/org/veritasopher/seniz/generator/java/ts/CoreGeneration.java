package org.veritasopher.seniz.generator.java.ts;

import lombok.AllArgsConstructor;
import org.veritasopher.seniz.core.model.TransitionSystem;
import org.veritasopher.seniz.core.model.common.*;
import org.veritasopher.seniz.exception.type.GeneratorException;
import org.veritasopher.seniz.util.FileUtil;

import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static org.veritasopher.seniz.generator.java.dict.SourceFile.*;
import static org.veritasopher.seniz.generator.java.util.Template.*;
import static org.veritasopher.seniz.generator.java.util.Transform.*;
import static org.veritasopher.seniz.util.FileUtil.writeToFile;

/**
 * Java Core Package Generation
 *
 * @author Yepeng Ding
 * @date 4/10/2022
 */
public record CoreGeneration(TransitionSystem ts, String globalNamespace,
                             String rootNamespace, Path root) {

    public void generate() {
        generateArgument();
        generateAction();
        generateVariable();
        generateState();
        if (globalNamespace.equals(rootNamespace)) {
            // Only generate GlobalVariable file if no global system exists
            generateGlobalVariable();
        }
    }

    /**
     * Generate system argument file
     */
    public void generateArgument() {
        String arguments = ts.getSystemArguments().stream()
                .map(arg -> "%s(\"%s\", %s)"
                        .formatted(toJavaArgumentName(arg.getName()),
                                arg.getName(),
                                toJavaTypeClass(arg.getPrimaryType())))
                .collect(Collectors.joining("," + System.lineSeparator()));

        String argumentProgram = generateArgumentFromTemplate(ARGUMENT.getNamespace(rootNamespace), arguments);

        writeToFile(argumentProgram, ARGUMENT.getFilePath(root));
    }

    /**
     * Generate Action file
     */
    public void generateAction() {
        String actions = ts.getActionSet().stream()
                .filter(action -> !action.isEpsilon())
                .map(a -> "void %s();".formatted(a.getName()))
                .collect(Collectors.joining(System.lineSeparator()));

        String actionProgram = generateActionFromTemplate(ACTION.getNamespace(rootNamespace), actions);

        writeToFile(actionProgram, ACTION.getFilePath(root));
    }

    /**
     * Generate state variable file
     */
    public void generateVariable() {
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
     * Generate global variable file
     */
    public void generateGlobalVariable() {
        String globalVariables = ts.getGlobalStateVariables().getVariableSet().stream()
                .map(v -> "%s(\"%s\", %s)"
                        .formatted(toJavaVariableName(v.getName()),
                                v.getName(),
                                toJavaTypeClass(v.getPrimaryType())))
                .collect(Collectors.joining("," + System.lineSeparator()));

        String globalVariableProgram = generateGlobalVariableFromTemplate(GLOBAL_VARIABLE.getNamespace(rootNamespace), globalVariables);

        writeToFile(globalVariableProgram, GLOBAL_VARIABLE.getFilePath(root));
    }

    /**
     * Generate state file
     */
    public void generateState() {
        // Generate variable settings for each state
        Map<Integer, String> variableSettingMap = generateVariableSettingMap(ts);

        // Generate transition settings for each state
        Map<Integer, String> transitionSettingMap = generateTransitionSettingMap(ts);

        String stateProgramBody = ts.getStates().values().stream()
                .map(state -> FileUtil.readFromFileInResource("template/core/State_Body").formatted(
                        toJavaStateName(state),
                        variableSettingMap.get(state.hashCode()),
                        transitionSettingMap.get(state.hashCode())))
                .collect(Collectors.joining("," + System.lineSeparator()));


        String stateProgram = generateStateFromTemplate(
                STATE.getNamespace(rootNamespace),
                toJavaImport(rootNamespace, ACTION_EXECUTOR, false),
                toJavaImport(rootNamespace, STATE_BEHAVIOR, false),
                toJavaImport(rootNamespace, ARGUMENT, true),
                toJavaImport(rootNamespace, VARIABLE, true),
                toJavaImport(globalNamespace, GLOBAL_VARIABLE, false),
                toJavaImport(globalNamespace, GLOBAL_VARIABLE, true),
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

                transitionSetting = transitions.stream()
                        .filter(t -> !ts.getProposition(t.getGuard()).orElseThrow(() -> {
                            throw new GeneratorException(ts.getIdentifier(), "Unknown guard is found");
                        }).isTautology())
                        .map(t ->
                                "if (%s) {%s %s}".formatted(
                                        toJavaEvaluation(ts, ts.getProposition(t.getGuard()).orElseThrow(() -> {
                                            throw new GeneratorException(ts.getIdentifier(), "Unknown guard is found");
                                        }).getEvaluation()),
                                        generateGlobalVariableStatement(ts, t),
                                        generateActionStatement(ts, t))
                        ).collect(Collectors.joining(System.lineSeparator()));

                String defaultGlobalVariable = "";
                String defaultAction = "return null;";
                if (tautologyTransitions.size() == 1) {
                    Transition transition = tautologyTransitions.iterator().next();
                    defaultGlobalVariable = generateGlobalVariableStatement(ts, transition);
                    defaultAction = generateActionStatement(ts, transition);
                }
                transitionSetting = transitionSetting + System.lineSeparator() + defaultGlobalVariable + System.lineSeparator() + defaultAction;
            } else if (transitions.size() == 1) {
                // One transition
                Transition transition = transitions.iterator().next();
                transitionSetting = generateGlobalVariableStatement(ts, transition) + System.lineSeparator() + generateActionStatement(ts, transition);

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
     * Generate GlobalVariable Statement
     *
     * @param ts         transition system
     * @param transition transition
     * @return GlobalVariable Statement
     */
    private String generateGlobalVariableStatement(TransitionSystem ts, Transition transition) {
        StateDeclarator stateDeclarator = ts.getGlobalStateDeclarator(transition.getGlobalStateDeclarator()).orElseThrow(() ->
                new GeneratorException(ts.getIdentifier(), "Unknown global state is found."));

        return stateDeclarator.getVariables().stream()
                .map(v -> "gVarSet.put(%s, %s);".formatted(toJavaVariableName(v.getName()), toJavaEvaluation(ts, v.getEvaluation())))
                .collect(Collectors.joining(System.lineSeparator()));
    }

}
