package org.veritasopher.seniz.core.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Global Environment
 *
 * @author Yepeng Ding
 * @date 12/18/2020
 */
public final class GlobalEnvironment {

    private static GlobalEnvironment INSTANCE;

    // State Variable Map<Identifier, State Variable Set>
    private final Map<String, StateVariableSet> stateVariableSets;

    private GlobalEnvironment() {
        this.stateVariableSets = new HashMap<>();
    }

    public synchronized static GlobalEnvironment getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new GlobalEnvironment();
        }

        return INSTANCE;
    }

}
