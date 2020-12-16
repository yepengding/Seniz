// Generated from D:/Project/ResearchProject/FDD/Seniz/project/Seniz/src/main/resources\SenizParser.g4 by ANTLR 4.9
package org.veritasopher.seniz.core.base;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SenizParser}.
 */
public interface SenizParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SenizParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(SenizParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SenizParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(SenizParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SenizParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(SenizParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SenizParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(SenizParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SenizParser#systemDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSystemDeclaration(SenizParser.SystemDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SenizParser#systemDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSystemDeclaration(SenizParser.SystemDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SenizParser#systemHeader}.
	 * @param ctx the parse tree
	 */
	void enterSystemHeader(SenizParser.SystemHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link SenizParser#systemHeader}.
	 * @param ctx the parse tree
	 */
	void exitSystemHeader(SenizParser.SystemHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link SenizParser#systemParameter}.
	 * @param ctx the parse tree
	 */
	void enterSystemParameter(SenizParser.SystemParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SenizParser#systemParameter}.
	 * @param ctx the parse tree
	 */
	void exitSystemParameter(SenizParser.SystemParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SenizParser#systemBody}.
	 * @param ctx the parse tree
	 */
	void enterSystemBody(SenizParser.SystemBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SenizParser#systemBody}.
	 * @param ctx the parse tree
	 */
	void exitSystemBody(SenizParser.SystemBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SenizParser#systemBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSystemBodyDeclaration(SenizParser.SystemBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SenizParser#systemBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSystemBodyDeclaration(SenizParser.SystemBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SenizParser#systemIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterSystemIdentifier(SenizParser.SystemIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SenizParser#systemIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitSystemIdentifier(SenizParser.SystemIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SenizParser#stateNaming}.
	 * @param ctx the parse tree
	 */
	void enterStateNaming(SenizParser.StateNamingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SenizParser#stateNaming}.
	 * @param ctx the parse tree
	 */
	void exitStateNaming(SenizParser.StateNamingContext ctx);
	/**
	 * Enter a parse tree produced by {@link SenizParser#stateBody}.
	 * @param ctx the parse tree
	 */
	void enterStateBody(SenizParser.StateBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SenizParser#stateBody}.
	 * @param ctx the parse tree
	 */
	void exitStateBody(SenizParser.StateBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SenizParser#stateDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterStateDeclarator(SenizParser.StateDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SenizParser#stateDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitStateDeclarator(SenizParser.StateDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SenizParser#stateExpression}.
	 * @param ctx the parse tree
	 */
	void enterStateExpression(SenizParser.StateExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SenizParser#stateExpression}.
	 * @param ctx the parse tree
	 */
	void exitStateExpression(SenizParser.StateExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SenizParser#stateIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterStateIdentifier(SenizParser.StateIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SenizParser#stateIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitStateIdentifier(SenizParser.StateIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SenizParser#stateNameIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterStateNameIdentifier(SenizParser.StateNameIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SenizParser#stateNameIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitStateNameIdentifier(SenizParser.StateNameIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryExpression}
	 * labeled alternative in {@link SenizParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(SenizParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryExpression}
	 * labeled alternative in {@link SenizParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(SenizParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesesExpression}
	 * labeled alternative in {@link SenizParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesesExpression(SenizParser.ParenthesesExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesesExpression}
	 * labeled alternative in {@link SenizParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesesExpression(SenizParser.ParenthesesExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additiveExpression}
	 * labeled alternative in {@link SenizParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(SenizParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additiveExpression}
	 * labeled alternative in {@link SenizParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(SenizParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpression}
	 * labeled alternative in {@link SenizParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(SenizParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpression}
	 * labeled alternative in {@link SenizParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(SenizParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditionalExpression}
	 * labeled alternative in {@link SenizParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(SenizParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditionalExpression}
	 * labeled alternative in {@link SenizParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(SenizParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link SenizParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(SenizParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link SenizParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(SenizParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicativeExpression}
	 * labeled alternative in {@link SenizParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(SenizParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicativeExpression}
	 * labeled alternative in {@link SenizParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(SenizParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpression}
	 * labeled alternative in {@link SenizParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(SenizParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpression}
	 * labeled alternative in {@link SenizParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(SenizParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SenizParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(SenizParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SenizParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(SenizParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SenizParser#transitionStatement}.
	 * @param ctx the parse tree
	 */
	void enterTransitionStatement(SenizParser.TransitionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SenizParser#transitionStatement}.
	 * @param ctx the parse tree
	 */
	void exitTransitionStatement(SenizParser.TransitionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SenizParser#initIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterInitIdentifier(SenizParser.InitIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SenizParser#initIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitInitIdentifier(SenizParser.InitIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SenizParser#actionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterActionDeclaration(SenizParser.ActionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SenizParser#actionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitActionDeclaration(SenizParser.ActionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SenizParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(SenizParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SenizParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(SenizParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SenizParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(SenizParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SenizParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(SenizParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SenizParser#variableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableIdentifier(SenizParser.VariableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SenizParser#variableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableIdentifier(SenizParser.VariableIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SenizParser#propositionStatement}.
	 * @param ctx the parse tree
	 */
	void enterPropositionStatement(SenizParser.PropositionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SenizParser#propositionStatement}.
	 * @param ctx the parse tree
	 */
	void exitPropositionStatement(SenizParser.PropositionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SenizParser#propositionBody}.
	 * @param ctx the parse tree
	 */
	void enterPropositionBody(SenizParser.PropositionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SenizParser#propositionBody}.
	 * @param ctx the parse tree
	 */
	void exitPropositionBody(SenizParser.PropositionBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code propConditionalOrExpression}
	 * labeled alternative in {@link SenizParser#propositionExpression}.
	 * @param ctx the parse tree
	 */
	void enterPropConditionalOrExpression(SenizParser.PropConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code propConditionalOrExpression}
	 * labeled alternative in {@link SenizParser#propositionExpression}.
	 * @param ctx the parse tree
	 */
	void exitPropConditionalOrExpression(SenizParser.PropConditionalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code propConditionalAndExpression}
	 * labeled alternative in {@link SenizParser#propositionExpression}.
	 * @param ctx the parse tree
	 */
	void enterPropConditionalAndExpression(SenizParser.PropConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code propConditionalAndExpression}
	 * labeled alternative in {@link SenizParser#propositionExpression}.
	 * @param ctx the parse tree
	 */
	void exitPropConditionalAndExpression(SenizParser.PropConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code propPrimaryExpression}
	 * labeled alternative in {@link SenizParser#propositionExpression}.
	 * @param ctx the parse tree
	 */
	void enterPropPrimaryExpression(SenizParser.PropPrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code propPrimaryExpression}
	 * labeled alternative in {@link SenizParser#propositionExpression}.
	 * @param ctx the parse tree
	 */
	void exitPropPrimaryExpression(SenizParser.PropPrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code propNotExpression}
	 * labeled alternative in {@link SenizParser#propositionExpression}.
	 * @param ctx the parse tree
	 */
	void enterPropNotExpression(SenizParser.PropNotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code propNotExpression}
	 * labeled alternative in {@link SenizParser#propositionExpression}.
	 * @param ctx the parse tree
	 */
	void exitPropNotExpression(SenizParser.PropNotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SenizParser#propositionPrimary}.
	 * @param ctx the parse tree
	 */
	void enterPropositionPrimary(SenizParser.PropositionPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SenizParser#propositionPrimary}.
	 * @param ctx the parse tree
	 */
	void exitPropositionPrimary(SenizParser.PropositionPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SenizParser#propositionIdentifer}.
	 * @param ctx the parse tree
	 */
	void enterPropositionIdentifer(SenizParser.PropositionIdentiferContext ctx);
	/**
	 * Exit a parse tree produced by {@link SenizParser#propositionIdentifer}.
	 * @param ctx the parse tree
	 */
	void exitPropositionIdentifer(SenizParser.PropositionIdentiferContext ctx);
	/**
	 * Enter a parse tree produced by {@link SenizParser#stateVarSetDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStateVarSetDeclaration(SenizParser.StateVarSetDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SenizParser#stateVarSetDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStateVarSetDeclaration(SenizParser.StateVarSetDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SenizParser#stateVarSetHeader}.
	 * @param ctx the parse tree
	 */
	void enterStateVarSetHeader(SenizParser.StateVarSetHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link SenizParser#stateVarSetHeader}.
	 * @param ctx the parse tree
	 */
	void exitStateVarSetHeader(SenizParser.StateVarSetHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link SenizParser#stateVarSetBody}.
	 * @param ctx the parse tree
	 */
	void enterStateVarSetBody(SenizParser.StateVarSetBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SenizParser#stateVarSetBody}.
	 * @param ctx the parse tree
	 */
	void exitStateVarSetBody(SenizParser.StateVarSetBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SenizParser#stateVarSetDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterStateVarSetDeclarator(SenizParser.StateVarSetDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SenizParser#stateVarSetDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitStateVarSetDeclarator(SenizParser.StateVarSetDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SenizParser#stateVarExpression}.
	 * @param ctx the parse tree
	 */
	void enterStateVarExpression(SenizParser.StateVarExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SenizParser#stateVarExpression}.
	 * @param ctx the parse tree
	 */
	void exitStateVarExpression(SenizParser.StateVarExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SenizParser#stateVarSetIdentifer}.
	 * @param ctx the parse tree
	 */
	void enterStateVarSetIdentifer(SenizParser.StateVarSetIdentiferContext ctx);
	/**
	 * Exit a parse tree produced by {@link SenizParser#stateVarSetIdentifer}.
	 * @param ctx the parse tree
	 */
	void exitStateVarSetIdentifer(SenizParser.StateVarSetIdentiferContext ctx);
	/**
	 * Enter a parse tree produced by {@link SenizParser#stateVarIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterStateVarIdentifier(SenizParser.StateVarIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SenizParser#stateVarIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitStateVarIdentifier(SenizParser.StateVarIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SenizParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(SenizParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SenizParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(SenizParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SenizParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(SenizParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SenizParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(SenizParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SenizParser#numberLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumberLiteral(SenizParser.NumberLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SenizParser#numberLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumberLiteral(SenizParser.NumberLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SenizParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(SenizParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SenizParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(SenizParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SenizParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(SenizParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SenizParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(SenizParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SenizParser#otherLiteral}.
	 * @param ctx the parse tree
	 */
	void enterOtherLiteral(SenizParser.OtherLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SenizParser#otherLiteral}.
	 * @param ctx the parse tree
	 */
	void exitOtherLiteral(SenizParser.OtherLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SenizParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(SenizParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SenizParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(SenizParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SenizParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(SenizParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SenizParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(SenizParser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SenizParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(SenizParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SenizParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(SenizParser.QualifiedNameContext ctx);
}