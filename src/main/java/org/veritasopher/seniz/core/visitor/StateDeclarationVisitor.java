package org.veritasopher.seniz.core.visitor;

import org.veritasopher.seniz.core.base.SenizParser;
import org.veritasopher.seniz.core.base.SenizParserBaseVisitor;
import org.veritasopher.seniz.exception.StateException;
import org.veritasopher.seniz.core.model.SystemEnv;
import org.veritasopher.seniz.core.model.domain.State;

/**
 * State Declaration Visitor
 *
 * @author Yepeng Ding
 * @date 12/3/2020
 */
public class StateDeclarationVisitor extends SenizParserBaseVisitor<SystemEnv> {

    private final SystemEnv systemEnv;

    private final StateDeclaratorVisitor stateDeclaratorVisitor;

    public StateDeclarationVisitor(SystemEnv systemEnv) {
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
            throw new StateException(ctx.start.getLine(), "Cannot use occupied state name (" + stateName + ").");
        }

        systemEnv.addState(name, state);
        return systemEnv;
    }

}
