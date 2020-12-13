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