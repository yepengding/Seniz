// Generated from /Users/michaeltei/Projects/ResearchProjects/FDD/Seniz/project/Seniz/Grammar/SenizParser.g4 by ANTLR 4.9.2
package org.veritasopher.seniz.core.base;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SenizParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SenizParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SenizParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(SenizParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(SenizParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#systemDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystemDeclaration(SenizParser.SystemDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#systemHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystemHeader(SenizParser.SystemHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#systemModifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystemModifiers(SenizParser.SystemModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#mainModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainModifier(SenizParser.MainModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#controlModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlModifier(SenizParser.ControlModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#systemParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystemParameter(SenizParser.SystemParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#systemBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystemBody(SenizParser.SystemBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#systemBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystemBodyDeclaration(SenizParser.SystemBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#initControlState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitControlState(SenizParser.InitControlStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#logicStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicStatement(SenizParser.LogicStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#controlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlStatement(SenizParser.ControlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#syncControlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSyncControlStatement(SenizParser.SyncControlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#asyncControlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsyncControlStatement(SenizParser.AsyncControlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#subSystemIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubSystemIdentifier(SenizParser.SubSystemIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#systemIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystemIdentifier(SenizParser.SystemIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#systemAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystemAlias(SenizParser.SystemAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#stateNaming}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateNaming(SenizParser.StateNamingContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#stateBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateBody(SenizParser.StateBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#stateDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateDeclarator(SenizParser.StateDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#stateExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateExpression(SenizParser.StateExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#stateIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateIdentifier(SenizParser.StateIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#stateNameIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateNameIdentifier(SenizParser.StateNameIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryExpression}
	 * labeled alternative in {@link SenizParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(SenizParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesesExpression}
	 * labeled alternative in {@link SenizParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesesExpression(SenizParser.ParenthesesExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additiveExpression}
	 * labeled alternative in {@link SenizParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(SenizParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpression}
	 * labeled alternative in {@link SenizParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(SenizParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionalExpression}
	 * labeled alternative in {@link SenizParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(SenizParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link SenizParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(SenizParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicativeExpression}
	 * labeled alternative in {@link SenizParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(SenizParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpression}
	 * labeled alternative in {@link SenizParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(SenizParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(SenizParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#globalStateBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalStateBody(SenizParser.GlobalStateBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#globalStateNaming}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalStateNaming(SenizParser.GlobalStateNamingContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#globalStateNameIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalStateNameIdentifier(SenizParser.GlobalStateNameIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#globalStateIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalStateIdentifier(SenizParser.GlobalStateIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#transitionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransitionStatement(SenizParser.TransitionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#initIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitIdentifier(SenizParser.InitIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#transitionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransitionDeclaration(SenizParser.TransitionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#guardIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuardIdentifier(SenizParser.GuardIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#actionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionDeclaration(SenizParser.ActionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(SenizParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(SenizParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#variableIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableIdentifier(SenizParser.VariableIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(SenizParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#propositionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropositionStatement(SenizParser.PropositionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#propositionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropositionBody(SenizParser.PropositionBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code propConditionalExpression}
	 * labeled alternative in {@link SenizParser#propositionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropConditionalExpression(SenizParser.PropConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code propExpression}
	 * labeled alternative in {@link SenizParser#propositionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropExpression(SenizParser.PropExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesesPropExpression}
	 * labeled alternative in {@link SenizParser#propositionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesesPropExpression(SenizParser.ParenthesesPropExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code propPrimaryExpression}
	 * labeled alternative in {@link SenizParser#propositionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropPrimaryExpression(SenizParser.PropPrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#propositionPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropositionPrimary(SenizParser.PropositionPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#propositionIdentifer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropositionIdentifer(SenizParser.PropositionIdentiferContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#ltlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtlStatement(SenizParser.LtlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#ltlBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtlBody(SenizParser.LtlBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ltlNotExpression}
	 * labeled alternative in {@link SenizParser#ltlExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtlNotExpression(SenizParser.LtlNotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ltlConditionalAndExpression}
	 * labeled alternative in {@link SenizParser#ltlExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtlConditionalAndExpression(SenizParser.LtlConditionalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ltlPrimaryExpression}
	 * labeled alternative in {@link SenizParser#ltlExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtlPrimaryExpression(SenizParser.LtlPrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alwaysExpression}
	 * labeled alternative in {@link SenizParser#ltlExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlwaysExpression(SenizParser.AlwaysExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ltlConditionalOrExpression}
	 * labeled alternative in {@link SenizParser#ltlExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtlConditionalOrExpression(SenizParser.LtlConditionalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nextExpression}
	 * labeled alternative in {@link SenizParser#ltlExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNextExpression(SenizParser.NextExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ltlConditionalImplyExpression}
	 * labeled alternative in {@link SenizParser#ltlExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtlConditionalImplyExpression(SenizParser.LtlConditionalImplyExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eventuallyExpression}
	 * labeled alternative in {@link SenizParser#ltlExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventuallyExpression(SenizParser.EventuallyExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code untilExpression}
	 * labeled alternative in {@link SenizParser#ltlExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUntilExpression(SenizParser.UntilExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#ltlPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtlPrimary(SenizParser.LtlPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#varSetDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarSetDeclaration(SenizParser.VarSetDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#varSetHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarSetHeader(SenizParser.VarSetHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#varSetBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarSetBody(SenizParser.VarSetBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#varSetDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarSetDeclarator(SenizParser.VarSetDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#varTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarTypeDeclaration(SenizParser.VarTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#varSetIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarSetIdentifier(SenizParser.VarSetIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#varIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarIdentifier(SenizParser.VarIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#chanSetDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChanSetDeclaration(SenizParser.ChanSetDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#chanSetHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChanSetHeader(SenizParser.ChanSetHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#chanSetBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChanSetBody(SenizParser.ChanSetBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#chanSetDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChanSetDeclarator(SenizParser.ChanSetDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#chanTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChanTypeDeclaration(SenizParser.ChanTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sendingExpression}
	 * labeled alternative in {@link SenizParser#chanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSendingExpression(SenizParser.SendingExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code receivingExpression}
	 * labeled alternative in {@link SenizParser#chanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceivingExpression(SenizParser.ReceivingExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#chanType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChanType(SenizParser.ChanTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#chanSetIdentifer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChanSetIdentifer(SenizParser.ChanSetIdentiferContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#chanIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChanIdentifier(SenizParser.ChanIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(SenizParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(SenizParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#numberLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLiteral(SenizParser.NumberLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(SenizParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(SenizParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#otherLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtherLiteral(SenizParser.OtherLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(SenizParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#floatLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(SenizParser.FloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(SenizParser.QualifiedNameContext ctx);
}