// Generated from D:/Project/ResearchProject/FDD/Seniz/project/Seniz/src/main/resources\SenizParser.g4 by ANTLR 4.9
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
	 * Visit a parse tree produced by {@link SenizParser#systemIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystemIdentifier(SenizParser.SystemIdentifierContext ctx);
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
	 * Visit a parse tree produced by {@link SenizParser#actionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionDeclaration(SenizParser.ActionDeclarationContext ctx);
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
	 * Visit a parse tree produced by {@link SenizParser#stateVarSetDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateVarSetDeclaration(SenizParser.StateVarSetDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#stateVarSetHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateVarSetHeader(SenizParser.StateVarSetHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#stateVarSetBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateVarSetBody(SenizParser.StateVarSetBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#stateVarSetDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateVarSetDeclarator(SenizParser.StateVarSetDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#stateVarExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateVarExpression(SenizParser.StateVarExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#stateVarSetIdentifer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateVarSetIdentifer(SenizParser.StateVarSetIdentiferContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenizParser#stateVarIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateVarIdentifier(SenizParser.StateVarIdentifierContext ctx);
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