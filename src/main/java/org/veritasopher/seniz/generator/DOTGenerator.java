package org.veritasopher.seniz.generator;

import org.veritasopher.seniz.core.model.TransitionSystem;
import org.veritasopher.seniz.core.model.domain.Action;
import org.veritasopher.seniz.core.model.domain.State;
import org.veritasopher.seniz.core.model.domain.Transition;
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

    private final TransitionSystem ts;

    public DOTGenerator(TransitionSystem transitionSystem) {
        this.ts = transitionSystem;
    }

    /**
     * Generate DOT program and print to console
     */
    public void generateToConsole() {
        System.out.println(build());
    }

    /**
     * Generate DOT program and return as string
     */
    public String generateAsString() {
        return build();
    }

    private String build() {
        StringBuilder program = new StringBuilder();

        // Generate header
        program.append("digraph").append(' ').append(ts.getIdentifier()).append('{').append(System.lineSeparator());

        // Generate transitions
        ts.getTransitions().forEach((hashCode, transition) -> {
            program.append(getStateName(transition.getSrcState())).append(' ');
            program.append("->").append(' ');
            program.append(getStateName(transition.getDstState())).append(' ');
            program.append("[label=\"").append(getActionName(transition)).append("\"]");
            program.append(System.lineSeparator());
        });

        // Generate footer
        program.append('}');
        return program.toString();
    }

    /**
     * Get state name
     *
     * @param hashCode state hash code
     * @return state name
     */
    private String getStateName(int hashCode) {
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

    private String getActionName(Transition transition) {
        Optional<Action> action = ts.getAction(transition.getAction());

        return action.map(Action::getName).orElse(Prefix.ACTION + transition.hashCode());
    }

}
