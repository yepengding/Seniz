// Generated from C:/Project/ResearchProject/FDD/Seniz/project/Seniz/src/main/resources\SenizParser.g4 by ANTLR 4.8
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
	 * Enter a parse tree produced by {@link SenizParser#stateDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStateDeclaration(SenizParser.StateDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SenizParser#stateDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStateDeclaration(SenizParser.StateDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link SenizParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(SenizParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SenizParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(SenizParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SenizParser#variableHeader}.
	 * @param ctx the parse tree
	 */
	void enterVariableHeader(SenizParser.VariableHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link SenizParser#variableHeader}.
	 * @param ctx the parse tree
	 */
	void exitVariableHeader(SenizParser.VariableHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link SenizParser#variableBody}.
	 * @param ctx the parse tree
	 */
	void enterVariableBody(SenizParser.VariableBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SenizParser#variableBody}.
	 * @param ctx the parse tree
	 */
	void exitVariableBody(SenizParser.VariableBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SenizParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(SenizParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SenizParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(SenizParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SenizParser#variableExpression}.
	 * @param ctx the parse tree
	 */
	void enterVariableExpression(SenizParser.VariableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SenizParser#variableExpression}.
	 * @param ctx the parse tree
	 */
	void exitVariableExpression(SenizParser.VariableExpressionContext ctx);
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