package org.veritasopher.seniz.generator.java;

import org.veritasopher.seniz.core.model.GlobalEnvironment;
import org.veritasopher.seniz.core.model.TransitionSystem;
import org.veritasopher.seniz.core.model.common.Action;
import org.veritasopher.seniz.core.model.common.State;
import org.veritasopher.seniz.core.model.common.StateVariable;
import org.veritasopher.seniz.core.model.common.Transition;
import org.veritasopher.seniz.exception.type.GeneratorException;
import org.veritasopher.seniz.generator.base.BaseGenerator;
import org.veritasopher.seniz.generator.java.util.Transform;

import java.io.File;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static org.veritasopher.seniz.generator.java.dict.SourceFile.ACTION;
import static org.veritasopher.seniz.generator.java.dict.SourceFile.VARIABLE;

/**
 * Java Generator
 *
 * @author Yepeng Ding
 * @date 3/7/2022
 */
public class JavaGenerator extends BaseGenerator {

    public JavaGenerator(GlobalEnvironment globalEnvironment, TransitionSystem transitionSystem) {
        super(globalEnvironment, transitionSystem);
    }


    /**
     * Generate program to a given directory
     *
     * @param outDir output directory
     */
    public void generateToDir(String namespace, String outDir) {
        Path root = Path.of(outDir + File.separator + ts.getIdentifier().toLowerCase());
        String rootNamespace = "%s.%s".formatted(namespace, ts.getIdentifier().toLowerCase());

        generateVariable(rootNamespace, root);
        generateAction(rootNamespace, root);
        generateState(rootNamespace, root);
    }

    /**
     * Generate variable file
     */
    private void generateVariable(String rootNamespace, Path root) {
        String variables = ts.getStateVariables().getVariableSet().stream()
                .map(v -> "%s(\"%s\", %s)".formatted(v.getName(), v.getName(), Transform.toJavaType(v.getPrimaryType())))
                .collect(Collectors.joining("," + System.lineSeparator()));

        String variableProgram = """
                package %s;
                import lombok.Getter;
                @Getter
                public enum Variable {
                    %s;

                    private final String name;
                    private final Class<?> type;

                    Variable(final String name, final Class<?> type) {
                        this.name = name;
                        this.type = type;
                    }
                }
                """.formatted(VARIABLE.getNamespace(rootNamespace), variables);

        writeToFile(variableProgram, VARIABLE.getFilePath(root));
    }


    /**
     * Generate action file
     */
    private void generateAction(String rootNamespace, Path root) {
        String actions = ts.getActionSet().stream()
                .filter(action -> !action.isEpsilon())
                .map(a -> "void %s();".formatted(a.getName()))
                .collect(Collectors.joining(System.lineSeparator()));

        String actionProgram = """
                package %s;
                public interface Action {
                   %s
                }
                """
                .formatted(ACTION.getNamespace(rootNamespace), actions);

        writeToFile(actionProgram, ACTION.getFilePath(root));
    }

    private void generateState(String rootNamespace, Path root) {
        StringBuilder stateProgram = new StringBuilder();

        // Generate variable settings for each state
        Map<Integer, String> variableSettingMap = generateVariableSettingMap();

        // Generate transition settings for each state
        Map<Integer, String> transitionSettingMap = generateTransitionSettingMap();
        System.out.println(transitionSettingMap);

        // Generate init method


        // Generate next method

    }

    /**
     * Generate variable setting map
     *
     * @return Map(State HashCode, State Variable Setting)
     */
    private Map<Integer, String> generateVariableSettingMap() {
        // Map<State HashCode, Variable Setting>
        Map<Integer, String> variableSettingMap = new HashMap<>();

        // Get the initial state
        State initState = ts.getInitState();

        // Generate the initial state variable setting
        String initStateVariableSetting = initState.getVariables().stream()
                .map(v -> "varSet.put(%s, %s);".formatted(v.getName(), Transform.toJavaEvaluation(v.getEvaluation())))
                .collect(Collectors.joining(System.lineSeparator()));

        variableSettingMap.put(initState.hashCode(), initStateVariableSetting);

        // Generate variable settings for all destination states derived from the initial state
        generateVariableSettingForDstStates(initState, variableSettingMap);
        return variableSettingMap;
    }


    /**
     * Generate variable settings for all destination states derived from a given source state.
     *
     * @param srcState           source state
     * @param variableSettingMap variable setting map
     */
    private void generateVariableSettingForDstStates(State srcState, Map<Integer, String> variableSettingMap) {
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
                            .map(v -> "varSet.put(%s, %s);".formatted(v.getName(), Transform.toJavaEvaluation(v.getEvaluation())))
                            .collect(Collectors.joining(System.lineSeparator()));
                    variableSettingMap.put(dstState.hashCode(), variableSetting);
                    // Recursively generate variable settings for all destination states derived from this destination state.
                    generateVariableSettingForDstStates(dstState, variableSettingMap);
                });
    }

    /**
     * Generate transition setting map
     *
     * @return Map(State HashCode, State Transition Setting)
     */
    private Map<Integer, String> generateTransitionSettingMap() {
        // Map<State HashCode, Transition>
        Map<Integer, String> transitionSettingMap = new HashMap<>();

        ts.getStates().forEach((hashCode, state) -> {
            Set<Transition> transitions = ts.getTransitionsBySrcStateHashCode(hashCode);
            String transitionSetting;
            if (transitions.size() > 1) {
                // Multiple transitions
                transitionSetting = "return null;";
            } else if (transitions.size() == 1) {
                // One transition
                Transition transition = transitions.iterator().next();
                Action action = ts.getAction(transition.getAction()).orElseThrow(() ->
                        new GeneratorException(ts.getIdentifier(), "Unknown action is found."));
                State dstState = ts.getState(transition.getDstState()).orElseThrow(() ->
                        new GeneratorException(ts.getIdentifier(), "Unknown state is found."));
                transitionSetting = "exec.%s(); return %s;".formatted(action.getName(), Transform.toJavaStateName(dstState));
            } else {
                // Ending state
                transitionSetting = "return null;";
            }
            transitionSettingMap.put(hashCode, transitionSetting);
        });

        return transitionSettingMap;
    }


}
