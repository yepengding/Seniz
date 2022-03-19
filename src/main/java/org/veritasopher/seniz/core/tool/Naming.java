package org.veritasopher.seniz.core.tool;

import org.veritasopher.seniz.core.model.common.Proposition;
import org.veritasopher.seniz.core.model.common.StateDeclarator;

/**
 * Naming Tool
 *
 * @author Yepeng Ding
 * @date 3/5/2022
 */
public class Naming {

    /**
     * Check satisfaction of state declarator naming rule
     *
     * @param name state declarator name
     * @return true if satisfied
     */
    public static boolean satisfyStateDeclaratorNamingRule(String name) {
        return name.matches("^(?![$@_&]).+");
    }

    /**
     * Check satisfaction of action naming rule
     *
     * @param name action Name
     * @return true if satisfied
     */
    public static boolean satisfyActionNamingRule(String name) {
        return name.matches("^(?![$@_&]).+");
    }

    /**
     * Check satisfaction of proposition naming rule
     *
     * @param name proposition Name
     * @return true if satisfied
     */
    public static boolean satisfyPropositionNamingRule(String name) {
        return name.matches("^(?![$@_&]).+");
    }

    /**
     * Generate a name for an anonymous state declarator
     *
     * @param stateDeclarator anonymous State Declarator
     * @return name
     */
    public static String getNameForAnonymousStateDeclarator(StateDeclarator stateDeclarator) {
        return "$" + stateDeclarator.hashCode();
    }

    /**
     * Generate a name for an anonymous proposition
     *
     * @param proposition anonymous proposition
     * @return name
     */
    public static String getNameForAnonymousProposition(Proposition proposition) {
        return "$" + proposition.hashCode();
    }

    /**
     * Generate global state name
     *
     * @param identifier transition system identifier
     * @param name       state name
     * @return global state name
     */
    public static String getGlobalStateName(String identifier, String name) {
        return identifier + "." + name;
    }

    /**
     * Generate global proposition name
     *
     * @param identifier global identifier
     * @param name       proposition name
     * @return global proposition name
     */
    public static String getGlobalPropositionName(String identifier, String name) {
        return identifier + "." + name;
    }

}
