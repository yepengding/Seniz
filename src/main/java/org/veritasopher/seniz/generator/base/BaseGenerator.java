package org.veritasopher.seniz.generator.base;

import org.veritasopher.seniz.core.model.GlobalEnvironment;
import org.veritasopher.seniz.core.model.TransitionSystem;

/**
 * Base Generator
 *
 * @author Yepeng Ding
 * @date 3/7/2022
 */
public abstract class BaseGenerator {

    protected final GlobalEnvironment env;
    protected final TransitionSystem ts;

    public BaseGenerator(GlobalEnvironment globalEnvironment, TransitionSystem transitionSystem) {
        this.env = globalEnvironment;
        this.ts = transitionSystem;
    }

}
