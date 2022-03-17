package org.veritasopher.seniz.generator.dot.util;

import org.veritasopher.seniz.core.model.common.Action;
import org.veritasopher.seniz.core.model.common.ControlStatement;
import org.veritasopher.seniz.core.model.common.State;
import org.veritasopher.seniz.core.model.domain.CompositionType;
import org.veritasopher.seniz.exception.type.GeneratorException;

/**
 * DOT Transform Tool
 *
 * @author Yepeng Ding
 * @date 3/8/2022
 */
public class Transform {

    /**
     * Get a state name for a state in DOT
     *
     * @param state a state
     * @return state name
     */
    public static String toDotStateName(String identifier, State state) {
        return "%s.%d".formatted(identifier, state.hashCode()).replace("-", "_");
    }

    /**
     * Get corresponding state name in DOT
     *
     * @param name a state name
     * @return state name
     */
    public static String toDotStateName(String name) {
        return name.replace("-", "_");
    }

    /**
     * Get action name in DOT
     *
     * @param action action
     * @return action name
     */
    public static String toDotActionName(Action action) {
        if (action.isEpsilon()) {
            return "&epsilon;";
        } else {
            return action.getName();
        }
    }

    public static String toDotControlStatement(ControlStatement controlStatement) {
        if (controlStatement.getCompositionType() == CompositionType.ASYNC) {
            return String.join(" ||| ", controlStatement.getSystemIdentifiers());
        } else if (controlStatement.getCompositionType() == CompositionType.SYNC) {
            return String.join(" || ", controlStatement.getSystemIdentifiers());
        } else {
            throw new GeneratorException("Unsupported control statement.");
        }
    }

}
