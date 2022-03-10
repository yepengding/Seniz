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
        return name.length() > 0 && !name.startsWith("$") && !name.startsWith("@");
    }

    /**
     * Check satisfaction of action naming rule
     *
     * @param name action Name
     * @return true if satisfied
     */
    public static boolean satisfyActionNamingRule(String name) {
        return name.length() > 0 && !name.startsWith("$") && !name.startsWith("@");
    }

    /**
     * Check satisfaction of proposition naming rule
     *
     * @param name proposition Name
     * @return true if satisfied
     */
    public static boolean satisfyPropositionNamingRule(String name) {
        return name.length() > 0 && !name.startsWith("$") && !name.startsWith("@");
    }

    /**
     * Generate a name for an unnamed state declarator
     *
     * @param unnamedStateDeclarator unnamed State Declarator
     * @return name
     */
    public static String getNameForUnnamedStateDeclarator(StateDeclarator unnamedStateDeclarator) {
        return "$" + unnamedStateDeclarator.hashCode();
    }

    /**
     * Generate a name for an unnamed proposition
     *
     * @param proposition unnamed proposition
     * @return name
     */
    public static String getNameForUnnamedProposition(Proposition proposition) {
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
