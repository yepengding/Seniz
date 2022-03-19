package org.veritasopher.seniz.generator.dot;

import org.veritasopher.seniz.core.model.ControlSystem;
import org.veritasopher.seniz.core.model.GlobalEnvironment;
import org.veritasopher.seniz.core.model.TransitionSystem;
import org.veritasopher.seniz.core.model.common.ControlStatement;
import org.veritasopher.seniz.core.model.common.State;
import org.veritasopher.seniz.exception.type.GeneratorException;
import org.veritasopher.seniz.generator.base.BaseGenerator;
import org.veritasopher.seniz.generator.dot.util.Transform;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static org.veritasopher.seniz.generator.dot.util.Transform.*;

/**
 * DOT Generator
 *
 * @author Yepeng Ding
 * @date 12/5/2020
 */
public class DOTGenerator extends BaseGenerator {

    public DOTGenerator(GlobalEnvironment globalEnvironment) {
        super(globalEnvironment);
    }

    public DOTGenerator(GlobalEnvironment globalEnvironment, String systemIdentifier) {
        super(globalEnvironment, systemIdentifier);
    }

    /**
     * Generate DOT program and print to console
     */
    public void generateToConsole() {
        System.out.println(generateAsString());
    }

    /**
     * Generate DOT program for a transition system or a control system
     *
     * @return DOT program
     */
    public String generateAsString() {
        if (env.getTransitionSystem(systemIdentifier).isPresent()) {
            return generateTS(env.getTransitionSystem(systemIdentifier).get());
        } else if (env.getControlSystem(systemIdentifier).isPresent()) {
            return generateCS(env.getControlSystem(systemIdentifier).get());
        } else {
            throw new GeneratorException(systemIdentifier, "Unknown system is found.");
        }
    }

    /**
     * Build transition system
     *
     * @return DOT program describing plain transition system
     */
    private String generateTS(TransitionSystem ts) {
        return """
                digraph %s {
                label="%s"
                %s
                }
                """.formatted(
                ts.getIdentifier(),
                ts.getIdentifier(),
                getSystemBody(ts)
        );
    }

    /**
     * Build control system
     *
     * @return DOT program describing control system
     */
    private String generateCS(ControlSystem cs) {
        ControlStatement controlStatement = cs.getControlStatement();

        // Generate subsystems
        String subSystems = controlStatement.getSystemIdentifiers().stream().distinct()
                .map(id -> """
                        subgraph cluster%s {
                        label="%s"
                        %s
                        }
                        """.formatted(id,
                        id,
                        getSystemBody(env.getTransitionSystem(id).orElseThrow(() -> {
                            throw new GeneratorException(id, "Unknown system is found.");
                        }))))
                .collect(Collectors.joining());

        return """
                digraph %s {
                label="%s"
                %s
                }
                """.formatted(
                cs.getIdentifier(),
                toDotControlStatement(controlStatement),
                subSystems
        );
    }

    /**
     * Get system body
     *
     * @param ts transition system
     * @return transitions, state names, and initial state
     */
    private String getSystemBody(TransitionSystem ts) {
        // Generate transitions
        String transitions = ts.getTransitions().values().stream()
                .map(t -> """
                        "%s" -> "%s" [label="%s"]
                        """.formatted(
                        toDotStateName(ts.getIdentifier(), ts.getState(t.getSrcState()).orElseThrow(() -> {
                            throw new GeneratorException(ts.getIdentifier(), "Unknown state is found.");
                        })),
                        toDotStateName(ts.getIdentifier(), ts.getState(t.getDstState()).orElseThrow(() -> {
                            throw new GeneratorException(ts.getIdentifier(), "Unknown state is found.");
                        })),
                        toDotActionName(ts.getAction(t.getAction()).orElseThrow(() -> {
                            throw new GeneratorException(ts.getIdentifier(), "Unknown action is found.");
                        }))
                )).collect(Collectors.joining());

        // Generate names attached to states
        String attachedNames = ts.getStates().values().stream()
                .map(s -> """
                                "%s" [label="%s"]
                                """.formatted(
                                toDotStateName(ts.getIdentifier(), s),
                                getStateNames(ts, s)
                        )
                ).collect(Collectors.joining());

        // Highlight initial state
        String initialState = """
                "%s"[color=blue]
                """.formatted(toDotStateName(ts.getIdentifier(), ts.getInitState()));

        return """
                %s
                %s
                %s
                """.formatted(
                transitions,
                attachedNames,
                initialState
        );
    }

    /**
     * Get names for a given state
     *
     * @param ts    transition system
     * @param state state
     * @return state name
     */
    private String getStateNames(TransitionSystem ts, State state) {
        StringBuilder nameBuilder = new StringBuilder();
        Set<String> names = new HashSet<>();
        ts.getStateDeclarators().forEach((n, s) -> {
            // If variables of a named state is the subset of the current state, then naming the current state with the same name
            if (state.getVariables().containsAll(s.getVariables())) {
                names.add(n);
            }
        });

        if (names.size() == 0) {
            throw new GeneratorException(ts.getIdentifier(), String.format("Unlabeled state (%s)", state.hashCode()));
        } else if (names.size() == 1) {
            nameBuilder.append(toDotStateName(names.iterator().next()));
        } else {
            // Filter names (only includes explicit names if exists. Otherwise, includes all names)
            String delimiter = "\\n";
            Pattern explicitNamePattern = Pattern.compile(String.format("^%s\\.(?!\\$)(.+)", ts.getIdentifier()));
            if (names.stream().anyMatch(n -> explicitNamePattern.matcher(n).matches())) {
                nameBuilder.append(names.stream().filter(n -> explicitNamePattern.matcher(n).matches()).map(Transform::toDotStateName).collect(Collectors.joining(delimiter)));
            } else {
                nameBuilder.append(names.stream().map(Transform::toDotStateName).collect(Collectors.joining(delimiter)));
            }
        }
        return nameBuilder.toString();
    }

}
