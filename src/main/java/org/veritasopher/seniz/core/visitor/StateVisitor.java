package org.veritasopher.seniz.core.visitor;

import org.veritasopher.seniz.core.base.SenizParser;
import org.veritasopher.seniz.core.base.SenizParserBaseVisitor;
import org.veritasopher.seniz.exception.StateException;
import org.veritasopher.seniz.core.model.SystemEnv;
import org.veritasopher.seniz.core.model.domain.State;

/**
 * State Visitor
 *
 * @author Yepeng Ding
 * @date 12/3/2020
 */
public class StateVisitor extends SenizParserBaseVisitor<SystemEnv> {

    private final SystemEnv systemEnv;

    private final StateDeclaratorVisitor stateDeclaratorVisitor;

    public StateVisitor(SystemEnv systemEnv) {
        this.systemEnv = systemEnv;
        this.stateDeclaratorVisitor = new StateDeclaratorVisitor(systemEnv);
    }

    /**
     * Visit states with explicit declarations
     *
     * @param ctx
     * @return
     */
    @Override
    public SystemEnv visitStateDeclaration(SenizParser.StateDeclarationContext ctx) {
        String name = ctx.IDENTIFIER().getText();

        State state = ctx.stateBody().stateDeclarator().accept(stateDeclaratorVisitor);

        // Check the uniqueness of state declaration
        String stateName = systemEnv.getStateName(state);
        if (stateName != null) {
            throw new StateException(ctx.start.getLine(), "Cannot name the named state (" + stateName + ").");
        }

        systemEnv.addState(name, state);
        return systemEnv;
    }

    /**
     * Visit states without explicit declarations
     *
     * @param ctx
     * @return
     */
    @Override
    public SystemEnv visitStateBody(SenizParser.StateBodyContext ctx) {
        State state = ctx.stateDeclarator().accept(stateDeclaratorVisitor);

        systemEnv.addState(state);
        return systemEnv;
    }

}
