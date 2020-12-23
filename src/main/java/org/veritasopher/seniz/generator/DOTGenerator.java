package org.veritasopher.seniz.generator;

import org.veritasopher.seniz.core.model.GlobalEnvironment;
import org.veritasopher.seniz.core.model.TransitionSystem;
import org.veritasopher.seniz.core.model.common.Action;
import org.veritasopher.seniz.core.model.common.State;
import org.veritasopher.seniz.core.model.common.Transition;
import org.veritasopher.seniz.generator.dict.Prefix;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

/**
 * DOT Generator
 *
 * @author Yepeng Ding
 * @date 12/5/2020
 */
public class DOTGenerator {

    private final GlobalEnvironment env;
    private final TransitionSystem ts;

    public DOTGenerator(GlobalEnvironment globalEnvironment, TransitionSystem transitionSystem) {
        this.env = globalEnvironment;
        this.ts = transitionSystem;
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
        StringBuilder program = new StringBuilder();

        // Generate header
        program.append("digraph").append(' ').append(ts.getIdentifier()).append('{').append(System.lineSeparator());

        // Generate body
        program.append(getSystemBody(ts));

        // Generate footer
        program.append('}');
        return program.toString();
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

        for (String id :
                identifiers) {
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
        for (String id :
                system.getControlSystemIds()) {
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
            systemBody.append(getStateName(ts, transition.getSrcState())).append(' ');
            systemBody.append("->").append(' ');
            systemBody.append(getStateName(ts, transition.getDstState())).append(' ');
            systemBody.append("[label=\"").append(getActionName(ts, transition)).append("\"]");
            systemBody.append(System.lineSeparator());
        });

        // Highlight initial states
        ts.getInitStates().forEach(hashCode -> {
            systemBody.append(getStateName(ts, hashCode)).append("[color=blue]").append(System.lineSeparator());
        });

        return systemBody.toString();
    }

    /**
     * Get state name
     *
     * @param ts transition system
     * @param hashCode state hash code
     * @return state name
     */
    private String getStateName(TransitionSystem ts, int hashCode) {
        StringBuilder nameBuilder = new StringBuilder();
        Set<String> names = new HashSet<>();
        State state = ts.getState(hashCode);
        ts.getStateNames().forEach((n, s) -> {
            // If variables of a named state is the subset of the current state, then naming the current state with the same name
            if (state.getVariables().containsAll(s.getVariables())) {
                names.add(n);
            }
        });

        nameBuilder.append('\"');
        if (names.size() == 0) {
            // No explicit name
            nameBuilder.append(Prefix.STATE).append(hashCode).append(",");
        } else {
            names.forEach(n -> nameBuilder.append(n).append(","));
        }
        return nameBuilder.substring(0, nameBuilder.length() - 1) + '\"';
    }


    /**
     * Get action name
     *
     * @param ts transition system
     * @param transition transition
     * @return action name
     */
    private String getActionName(TransitionSystem ts, Transition transition) {
        Optional<Action> action = ts.getAction(transition.getAction());

        return action.map(Action::getName).orElse(Prefix.ACTION + transition.hashCode());
    }

}
