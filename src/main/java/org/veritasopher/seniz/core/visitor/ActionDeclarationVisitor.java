package org.veritasopher.seniz.core.visitor;

import org.veritasopher.seniz.core.base.SenizParser;
import org.veritasopher.seniz.core.base.SenizParserBaseVisitor;
import org.veritasopher.seniz.core.model.common.Action;
import org.veritasopher.seniz.core.tool.Naming;
import org.veritasopher.seniz.exception.type.ActionException;

/**
 * Action Declaration Visitor
 *
 * @author Yepeng Ding
 * @date 12/15/2020
 */
public class ActionDeclarationVisitor extends SenizParserBaseVisitor<Action> {

    @Override
    public Action visitActionDeclaration(SenizParser.ActionDeclarationContext ctx) {
        if (ctx.IDENTIFIER() == null) {
            throw new ActionException("", ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Unsupported action type.");
        }

        String actionName = ctx.IDENTIFIER().getText();
        if (!Naming.satisfyActionNamingRule(actionName)) {
            throw new ActionException("", ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Action name (" + actionName + ") is invalid.");
        }
//        if (ctx.formalParameterList() != null) {
//            ctx.formalParameterList().formalParameter().forEach(param -> {
//                System.out.println(param.variableIdentifier().IDENTIFIER().getText());
//            });
//        }

        return new Action(ctx.IDENTIFIER().getText());
    }

}
