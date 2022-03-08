package org.veritasopher.seniz.generator.dot;

import org.veritasopher.seniz.core.model.GlobalEnvironment;
import org.veritasopher.seniz.core.model.TransitionSystem;
import org.veritasopher.seniz.core.model.common.Action;
import org.veritasopher.seniz.core.model.common.State;
import org.veritasopher.seniz.core.model.common.Transition;
import org.veritasopher.seniz.core.tool.Naming;
import org.veritasopher.seniz.exception.type.GeneratorException;
import org.veritasopher.seniz.generator.base.BaseGenerator;
import org.veritasopher.seniz.generator.dot.dict.Prefix;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * DOT Generator
 *
 * @author Yepeng Ding
 * @date 12/5/2020
 */
public class DOTGenerator extends BaseGenerator {

    public DOTGenerator(GlobalEnvironment globalEnvironment, TransitionSystem transitionSystem) {
        super(globalEnvironment, transitionSystem);
    }

    /**
     * Generate DOT program and print to console
     */
    public void generateToConsole() {
        System.out.println(generateAsString());
    }

    /**
     * Generate DOT program and return as string
     */
    public String generateAsString() {
        if (ts.isControl()) {
            // Control system
            return buildControlSystem();
        } else {
            // Plain system
            return build();
        }
    }

    /**
     * Build plain transition system
     *
     * @return DOT program describing plain transition system
     */
    private String build() {
        return String.format("digraph %s { %s%s }", ts.getIdentifier(), System.lineSeparator(), getSystemBody(ts));
    }

    /**
     * Build control system
     *
     * @return DOT program describing control system
     */
    private String buildControlSystem() {
        // Collect all identifiers of plain TSs
        Set<String> identifiers = new HashSet<>();
        collectIdentifiers(identifiers, ts);

        StringBuilder program = new StringBuilder();

        // Generate header
        program.append("digraph").append(' ').append(ts.getIdentifier()).append('{').append(System.lineSeparator());

        for (String id : identifiers) {
            // Generate subsystem header
            program.append("subgraph").append(' ').append("cluster").append(id).append(" {").append(System.lineSeparator());

            // Generate system label
            program.append("label=").append(id).append(System.lineSeparator());

            // Generate subsystem body
            program.append(getSystemBody(env.getTransitionSystem(id)));

            // Generate subsystem footer
            program.append('}').append(System.lineSeparator());
        }

        // Generate footer
        program.append('}');

        return program.toString();
    }

    private void collectIdentifiers(Set<String> identifiers, TransitionSystem system) {
        for (String id : system.getControlSystemIds()) {
            system = env.getTransitionSystem(id);
            if (system.isControl()) {
                collectIdentifiers(identifiers, system);
            } else {
                identifiers.add(system.getIdentifier());
            }
        }
    }

    /**
     * Get system body
     *
     * @param ts plain transition system
     * @return transitions and initial states
     */
    private String getSystemBody(TransitionSystem ts) {
        StringBuilder systemBody = new StringBuilder();
        // Generate transitions
        ts.getTransitions().forEach((hashCode, transition) -> {
            systemBody.append(String.format("\"%d\"", transition.getSrcState()));
            systemBody.append(" -> ");
            systemBody.append(String.format("\"%d\"", transition.getDstState()));
            systemBody.append(String.format("[label=\"%s\"]", getActionName(ts, transition)));
            systemBody.append(System.lineSeparator());
        });

        systemBody.append(System.lineSeparator());

        // Append state labels
        ts.getStates().forEach((hashCode, state) -> {
            systemBody.append(String.format("\"%d\"", hashCode));
            systemBody.append(String.format("[label=\"%s\"]", getStateName(ts, hashCode)));
            systemBody.append(System.lineSeparator());
        });

        systemBody.append(System.lineSeparator());

        // Highlight initial state
        systemBody.append(String.format("\"%d\"", ts.getInitState().hashCode())).append("[color=blue]");
        systemBody.append(System.lineSeparator());

        return systemBody.toString();
    }

    /**
     * Get state name
     *
     * @param ts       transition system
     * @param hashCode state hash code
     * @return state name
     */
    private String getStateName(TransitionSystem ts, int hashCode) {
        StringBuilder nameBuilder = new StringBuilder();
        Set<String> names = new HashSet<>();
        State state = ts.getState(hashCode);
        ts.getStateDeclarators().forEach((n, s) -> {
            // If variables of a named state is the subset of the current state, then naming the current state with the same name
            if (state.getVariables().containsAll(s.getVariables())) {
                names.add(n);
            }
        });

        if (names.size() == 0) {
            throw new GeneratorException(ts.getIdentifier(), String.format("Unlabeled state (%s)", hashCode));
        } else if (names.size() == 1) {
            nameBuilder.append(Naming.eliminateSpecialChars(names.iterator().next()));
        } else {
            // Filter names (only includes explicit names if exists. Otherwise, includes all names)
            String delimiter = "\\n";
            Pattern explicitNamePattern = Pattern.compile(String.format("^%s\\.(?!\\$)(.+)", ts.getIdentifier()));
            if (names.stream().anyMatch(n -> explicitNamePattern.matcher(n).matches())) {
                nameBuilder.append(names.stream().filter(n -> explicitNamePattern.matcher(n).matches()).map(Naming::eliminateSpecialChars).collect(Collectors.joining(delimiter)));
            } else {
                nameBuilder.append(names.stream().map(Naming::eliminateSpecialChars).collect(Collectors.joining(delimiter)));
            }
        }
        return nameBuilder.toString();
    }


    /**
     * Get action name
     *
     * @param ts         transition system
     * @param transition transition
     * @return action name
     */
    private String getActionName(TransitionSystem ts, Transition transition) {
        Optional<Action> action = ts.getAction(transition.getAction());

        return action.map(Action::getName).orElse(Prefix.ACTION + transition.hashCode());
    }

}
