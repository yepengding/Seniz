// Generated from C:/Project/ResearchProject/FDD/Seniz/project/Seniz/src/main/resources\SenizParser.g4 by ANTLR 4.8
package org.veritasopher.seniz.core.base;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SenizParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IMPORT=1, SYSTEM=2, VARIABLE=3, OVER=4, BOOLEAN=5, INT=6, FLOAT=7, STRING=8, 
		VALUEOF=9, TYPEOF=10, EQ=11, TO=12, POS=13, NEG=14, BOOL_LITERAL=15, DECIMAL_LITERAL=16, 
		HEX_LITERAL=17, OCT_LITERAL=18, BINARY_LITERAL=19, FLOAT_LITERAL=20, HEX_FLOAT_LITERAL=21, 
		STRING_LITERAL=22, NULL_LITERAL=23, LPAREN=24, RPAREN=25, LBRACE=26, RBRACE=27, 
		LBRACK=28, RBRACK=29, SEMI=30, COMMA=31, DOT=32, IDENTIFIER=33, WS=34, 
		COMMENT=35, LINE_COMMENT=36;
	public static final int
		RULE_compilationUnit = 0, RULE_importDeclaration = 1, RULE_systemDeclaration = 2, 
		RULE_systemHeader = 3, RULE_systemParameter = 4, RULE_systemBody = 5, 
		RULE_systemBodyDeclaration = 6, RULE_stateDeclaration = 7, RULE_stateBody = 8, 
		RULE_stateDeclarator = 9, RULE_stateExpression = 10, RULE_transitionStatement = 11, 
		RULE_actionDeclaration = 12, RULE_stateIdentifier = 13, RULE_variableDeclaration = 14, 
		RULE_variableHeader = 15, RULE_variableBody = 16, RULE_variableDeclarator = 17, 
		RULE_variableExpression = 18, RULE_primitiveType = 19, RULE_literal = 20, 
		RULE_numberLiteral = 21, RULE_stringLiteral = 22, RULE_booleanLiteral = 23, 
		RULE_otherLiteral = 24, RULE_integerLiteral = 25, RULE_floatLiteral = 26, 
		RULE_qualifiedName = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "importDeclaration", "systemDeclaration", "systemHeader", 
			"systemParameter", "systemBody", "systemBodyDeclaration", "stateDeclaration", 
			"stateBody", "stateDeclarator", "stateExpression", "transitionStatement", 
			"actionDeclaration", "stateIdentifier", "variableDeclaration", "variableHeader", 
			"variableBody", "variableDeclarator", "variableExpression", "primitiveType", 
			"literal", "numberLiteral", "stringLiteral", "booleanLiteral", "otherLiteral", 
			"integerLiteral", "floatLiteral", "qualifiedName"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'system'", "'variable'", "'over'", "'bool'", "'int'", 
			"'float'", "'string'", "':'", "'::'", "'='", "'->'", "'+'", "'-'", null, 
			null, null, null, null, null, null, null, "'null'", "'('", "')'", "'{'", 
			"'}'", "'['", "']'", "';'", "','", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IMPORT", "SYSTEM", "VARIABLE", "OVER", "BOOLEAN", "INT", "FLOAT", 
			"STRING", "VALUEOF", "TYPEOF", "EQ", "TO", "POS", "NEG", "BOOL_LITERAL", 
			"DECIMAL_LITERAL", "HEX_LITERAL", "OCT_LITERAL", "BINARY_LITERAL", "FLOAT_LITERAL", 
			"HEX_FLOAT_LITERAL", "STRING_LITERAL", "NULL_LITERAL", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "IDENTIFIER", 
			"WS", "COMMENT", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SenizParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SenizParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SenizParser.EOF, 0); }
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public SystemDeclarationContext systemDeclaration() {
			return getRuleContext(SystemDeclarationContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(56);
				importDeclaration();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SYSTEM) {
				{
				setState(62);
				systemDeclaration();
				}
			}

			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARIABLE) {
				{
				setState(65);
				variableDeclaration();
				}
			}

			setState(68);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(SenizParser.IMPORT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_importDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(IMPORT);
			setState(71);
			qualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SystemDeclarationContext extends ParserRuleContext {
		public SystemHeaderContext systemHeader() {
			return getRuleContext(SystemHeaderContext.class,0);
		}
		public SystemBodyContext systemBody() {
			return getRuleContext(SystemBodyContext.class,0);
		}
		public SystemDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_systemDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterSystemDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitSystemDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitSystemDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SystemDeclarationContext systemDeclaration() throws RecognitionException {
		SystemDeclarationContext _localctx = new SystemDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_systemDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			systemHeader();
			setState(74);
			systemBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SystemHeaderContext extends ParserRuleContext {
		public TerminalNode SYSTEM() { return getToken(SenizParser.SYSTEM, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SenizParser.IDENTIFIER, 0); }
		public SystemParameterContext systemParameter() {
			return getRuleContext(SystemParameterContext.class,0);
		}
		public SystemHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_systemHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterSystemHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitSystemHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitSystemHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SystemHeaderContext systemHeader() throws RecognitionException {
		SystemHeaderContext _localctx = new SystemHeaderContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_systemHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(SYSTEM);
			setState(77);
			match(IDENTIFIER);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OVER) {
				{
				setState(78);
				systemParameter();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SystemParameterContext extends ParserRuleContext {
		public TerminalNode OVER() { return getToken(SenizParser.OVER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SenizParser.IDENTIFIER, 0); }
		public SystemParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_systemParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterSystemParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitSystemParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitSystemParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SystemParameterContext systemParameter() throws RecognitionException {
		SystemParameterContext _localctx = new SystemParameterContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_systemParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(OVER);
			setState(82);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SystemBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(SenizParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SenizParser.RBRACE, 0); }
		public List<SystemBodyDeclarationContext> systemBodyDeclaration() {
			return getRuleContexts(SystemBodyDeclarationContext.class);
		}
		public SystemBodyDeclarationContext systemBodyDeclaration(int i) {
			return getRuleContext(SystemBodyDeclarationContext.class,i);
		}
		public SystemBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_systemBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterSystemBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitSystemBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitSystemBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SystemBodyContext systemBody() throws RecognitionException {
		SystemBodyContext _localctx = new SystemBodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_systemBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(LBRACE);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACE || _la==IDENTIFIER) {
				{
				{
				setState(85);
				systemBodyDeclaration();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SystemBodyDeclarationContext extends ParserRuleContext {
		public StateDeclarationContext stateDeclaration() {
			return getRuleContext(StateDeclarationContext.class,0);
		}
		public TransitionStatementContext transitionStatement() {
			return getRuleContext(TransitionStatementContext.class,0);
		}
		public SystemBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_systemBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterSystemBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitSystemBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitSystemBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SystemBodyDeclarationContext systemBodyDeclaration() throws RecognitionException {
		SystemBodyDeclarationContext _localctx = new SystemBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_systemBodyDeclaration);
		try {
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				stateDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				transitionStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StateDeclarationContext extends ParserRuleContext {
		public Token bop;
		public TerminalNode IDENTIFIER() { return getToken(SenizParser.IDENTIFIER, 0); }
		public StateBodyContext stateBody() {
			return getRuleContext(StateBodyContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SenizParser.EQ, 0); }
		public StateDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterStateDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitStateDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitStateDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateDeclarationContext stateDeclaration() throws RecognitionException {
		StateDeclarationContext _localctx = new StateDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stateDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(IDENTIFIER);
			setState(98);
			((StateDeclarationContext)_localctx).bop = match(EQ);
			setState(99);
			stateBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StateBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(SenizParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SenizParser.RBRACE, 0); }
		public StateDeclaratorContext stateDeclarator() {
			return getRuleContext(StateDeclaratorContext.class,0);
		}
		public StateBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterStateBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitStateBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitStateBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateBodyContext stateBody() throws RecognitionException {
		StateBodyContext _localctx = new StateBodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stateBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(LBRACE);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(102);
				stateDeclarator();
				}
			}

			setState(105);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StateDeclaratorContext extends ParserRuleContext {
		public List<StateExpressionContext> stateExpression() {
			return getRuleContexts(StateExpressionContext.class);
		}
		public StateExpressionContext stateExpression(int i) {
			return getRuleContext(StateExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SenizParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SenizParser.COMMA, i);
		}
		public StateDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterStateDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitStateDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitStateDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateDeclaratorContext stateDeclarator() throws RecognitionException {
		StateDeclaratorContext _localctx = new StateDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stateDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			stateExpression();
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(108);
				match(COMMA);
				setState(109);
				stateExpression();
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StateExpressionContext extends ParserRuleContext {
		public Token bop;
		public TerminalNode IDENTIFIER() { return getToken(SenizParser.IDENTIFIER, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode VALUEOF() { return getToken(SenizParser.VALUEOF, 0); }
		public StateExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterStateExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitStateExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitStateExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateExpressionContext stateExpression() throws RecognitionException {
		StateExpressionContext _localctx = new StateExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_stateExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(IDENTIFIER);
			setState(116);
			((StateExpressionContext)_localctx).bop = match(VALUEOF);
			setState(117);
			literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransitionStatementContext extends ParserRuleContext {
		public List<StateIdentifierContext> stateIdentifier() {
			return getRuleContexts(StateIdentifierContext.class);
		}
		public StateIdentifierContext stateIdentifier(int i) {
			return getRuleContext(StateIdentifierContext.class,i);
		}
		public List<TerminalNode> TO() { return getTokens(SenizParser.TO); }
		public TerminalNode TO(int i) {
			return getToken(SenizParser.TO, i);
		}
		public List<ActionDeclarationContext> actionDeclaration() {
			return getRuleContexts(ActionDeclarationContext.class);
		}
		public ActionDeclarationContext actionDeclaration(int i) {
			return getRuleContext(ActionDeclarationContext.class,i);
		}
		public TransitionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transitionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterTransitionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitTransitionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitTransitionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransitionStatementContext transitionStatement() throws RecognitionException {
		TransitionStatementContext _localctx = new TransitionStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_transitionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			stateIdentifier();
			setState(125); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(120);
				match(TO);
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACK) {
					{
					setState(121);
					actionDeclaration();
					}
				}

				setState(124);
				stateIdentifier();
				}
				}
				setState(127); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TO );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActionDeclarationContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(SenizParser.LBRACK, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SenizParser.IDENTIFIER, 0); }
		public TerminalNode RBRACK() { return getToken(SenizParser.RBRACK, 0); }
		public ActionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterActionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitActionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitActionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionDeclarationContext actionDeclaration() throws RecognitionException {
		ActionDeclarationContext _localctx = new ActionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_actionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(LBRACK);
			setState(130);
			match(IDENTIFIER);
			setState(131);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StateIdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SenizParser.IDENTIFIER, 0); }
		public StateBodyContext stateBody() {
			return getRuleContext(StateBodyContext.class,0);
		}
		public StateIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterStateIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitStateIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitStateIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateIdentifierContext stateIdentifier() throws RecognitionException {
		StateIdentifierContext _localctx = new StateIdentifierContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_stateIdentifier);
		try {
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				match(IDENTIFIER);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				stateBody();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public VariableHeaderContext variableHeader() {
			return getRuleContext(VariableHeaderContext.class,0);
		}
		public VariableBodyContext variableBody() {
			return getRuleContext(VariableBodyContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			variableHeader();
			setState(138);
			variableBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableHeaderContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(SenizParser.VARIABLE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SenizParser.IDENTIFIER, 0); }
		public VariableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterVariableHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitVariableHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitVariableHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableHeaderContext variableHeader() throws RecognitionException {
		VariableHeaderContext _localctx = new VariableHeaderContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variableHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(VARIABLE);
			setState(141);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(SenizParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SenizParser.RBRACE, 0); }
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public VariableBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterVariableBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitVariableBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitVariableBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableBodyContext variableBody() throws RecognitionException {
		VariableBodyContext _localctx = new VariableBodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variableBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(LBRACE);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(144);
				variableDeclarator();
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(150);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public List<VariableExpressionContext> variableExpression() {
			return getRuleContexts(VariableExpressionContext.class);
		}
		public VariableExpressionContext variableExpression(int i) {
			return getRuleContext(VariableExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SenizParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SenizParser.COMMA, i);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			variableExpression();
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(153);
				match(COMMA);
				setState(154);
				variableExpression();
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableExpressionContext extends ParserRuleContext {
		public Token bop;
		public TerminalNode IDENTIFIER() { return getToken(SenizParser.IDENTIFIER, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode TYPEOF() { return getToken(SenizParser.TYPEOF, 0); }
		public VariableExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterVariableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitVariableExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitVariableExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableExpressionContext variableExpression() throws RecognitionException {
		VariableExpressionContext _localctx = new VariableExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_variableExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(IDENTIFIER);
			setState(161);
			((VariableExpressionContext)_localctx).bop = match(TYPEOF);
			setState(162);
			primitiveType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(SenizParser.BOOLEAN, 0); }
		public TerminalNode INT() { return getToken(SenizParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(SenizParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(SenizParser.STRING, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public OtherLiteralContext otherLiteral() {
			return getRuleContext(OtherLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_literal);
		try {
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case POS:
			case NEG:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				numberLiteral();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				stringLiteral();
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				booleanLiteral();
				}
				break;
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(169);
				otherLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberLiteralContext extends ParserRuleContext {
		public Token prefix;
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public TerminalNode POS() { return getToken(SenizParser.POS, 0); }
		public TerminalNode NEG() { return getToken(SenizParser.NEG, 0); }
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public NumberLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterNumberLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitNumberLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitNumberLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberLiteralContext numberLiteral() throws RecognitionException {
		NumberLiteralContext _localctx = new NumberLiteralContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_numberLiteral);
		int _la;
		try {
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==POS || _la==NEG) {
					{
					setState(172);
					((NumberLiteralContext)_localctx).prefix = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==POS || _la==NEG) ) {
						((NumberLiteralContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(175);
				integerLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==POS || _la==NEG) {
					{
					setState(176);
					((NumberLiteralContext)_localctx).prefix = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==POS || _la==NEG) ) {
						((NumberLiteralContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(179);
				floatLiteral();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringLiteralContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(SenizParser.STRING_LITERAL, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanLiteralContext extends ParserRuleContext {
		public TerminalNode BOOL_LITERAL() { return getToken(SenizParser.BOOL_LITERAL, 0); }
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_booleanLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(BOOL_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OtherLiteralContext extends ParserRuleContext {
		public TerminalNode NULL_LITERAL() { return getToken(SenizParser.NULL_LITERAL, 0); }
		public OtherLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterOtherLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitOtherLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitOtherLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtherLiteralContext otherLiteral() throws RecognitionException {
		OtherLiteralContext _localctx = new OtherLiteralContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_otherLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(NULL_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(SenizParser.DECIMAL_LITERAL, 0); }
		public TerminalNode HEX_LITERAL() { return getToken(SenizParser.HEX_LITERAL, 0); }
		public TerminalNode OCT_LITERAL() { return getToken(SenizParser.OCT_LITERAL, 0); }
		public TerminalNode BINARY_LITERAL() { return getToken(SenizParser.BINARY_LITERAL, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatLiteralContext extends ParserRuleContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(SenizParser.FLOAT_LITERAL, 0); }
		public TerminalNode HEX_FLOAT_LITERAL() { return getToken(SenizParser.HEX_FLOAT_LITERAL, 0); }
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitFloatLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_floatLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_la = _input.LA(1);
			if ( !(_la==FLOAT_LITERAL || _la==HEX_FLOAT_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(SenizParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SenizParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(SenizParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SenizParser.DOT, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_qualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(IDENTIFIER);
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(193);
				match(DOT);
				setState(194);
				match(IDENTIFIER);
				}
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u00cb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\7\2<\n\2\f\2\16\2?\13\2\3"+
		"\2\5\2B\n\2\3\2\5\2E\n\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\5"+
		"\5R\n\5\3\6\3\6\3\6\3\7\3\7\7\7Y\n\7\f\7\16\7\\\13\7\3\7\3\7\3\b\3\b\5"+
		"\bb\n\b\3\t\3\t\3\t\3\t\3\n\3\n\5\nj\n\n\3\n\3\n\3\13\3\13\3\13\7\13q"+
		"\n\13\f\13\16\13t\13\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\5\r}\n\r\3\r\6\r\u0080"+
		"\n\r\r\r\16\r\u0081\3\16\3\16\3\16\3\16\3\17\3\17\5\17\u008a\n\17\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\22\3\22\7\22\u0094\n\22\f\22\16\22\u0097\13"+
		"\22\3\22\3\22\3\23\3\23\3\23\7\23\u009e\n\23\f\23\16\23\u00a1\13\23\3"+
		"\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u00ad\n\26\3\27"+
		"\5\27\u00b0\n\27\3\27\3\27\5\27\u00b4\n\27\3\27\5\27\u00b7\n\27\3\30\3"+
		"\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\7\35\u00c6"+
		"\n\35\f\35\16\35\u00c9\13\35\3\35\2\2\36\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668\2\6\3\2\7\n\3\2\17\20\3\2\22\25\3\2\26"+
		"\27\2\u00c2\2=\3\2\2\2\4H\3\2\2\2\6K\3\2\2\2\bN\3\2\2\2\nS\3\2\2\2\fV"+
		"\3\2\2\2\16a\3\2\2\2\20c\3\2\2\2\22g\3\2\2\2\24m\3\2\2\2\26u\3\2\2\2\30"+
		"y\3\2\2\2\32\u0083\3\2\2\2\34\u0089\3\2\2\2\36\u008b\3\2\2\2 \u008e\3"+
		"\2\2\2\"\u0091\3\2\2\2$\u009a\3\2\2\2&\u00a2\3\2\2\2(\u00a6\3\2\2\2*\u00ac"+
		"\3\2\2\2,\u00b6\3\2\2\2.\u00b8\3\2\2\2\60\u00ba\3\2\2\2\62\u00bc\3\2\2"+
		"\2\64\u00be\3\2\2\2\66\u00c0\3\2\2\28\u00c2\3\2\2\2:<\5\4\3\2;:\3\2\2"+
		"\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>A\3\2\2\2?=\3\2\2\2@B\5\6\4\2A@\3\2\2"+
		"\2AB\3\2\2\2BD\3\2\2\2CE\5\36\20\2DC\3\2\2\2DE\3\2\2\2EF\3\2\2\2FG\7\2"+
		"\2\3G\3\3\2\2\2HI\7\3\2\2IJ\58\35\2J\5\3\2\2\2KL\5\b\5\2LM\5\f\7\2M\7"+
		"\3\2\2\2NO\7\4\2\2OQ\7#\2\2PR\5\n\6\2QP\3\2\2\2QR\3\2\2\2R\t\3\2\2\2S"+
		"T\7\6\2\2TU\7#\2\2U\13\3\2\2\2VZ\7\34\2\2WY\5\16\b\2XW\3\2\2\2Y\\\3\2"+
		"\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\Z\3\2\2\2]^\7\35\2\2^\r\3\2\2\2_b"+
		"\5\20\t\2`b\5\30\r\2a_\3\2\2\2a`\3\2\2\2b\17\3\2\2\2cd\7#\2\2de\7\r\2"+
		"\2ef\5\22\n\2f\21\3\2\2\2gi\7\34\2\2hj\5\24\13\2ih\3\2\2\2ij\3\2\2\2j"+
		"k\3\2\2\2kl\7\35\2\2l\23\3\2\2\2mr\5\26\f\2no\7!\2\2oq\5\26\f\2pn\3\2"+
		"\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\25\3\2\2\2tr\3\2\2\2uv\7#\2\2vw\7"+
		"\13\2\2wx\5*\26\2x\27\3\2\2\2y\177\5\34\17\2z|\7\16\2\2{}\5\32\16\2|{"+
		"\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\u0080\5\34\17\2\177z\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\31\3\2\2\2\u0083"+
		"\u0084\7\36\2\2\u0084\u0085\7#\2\2\u0085\u0086\7\37\2\2\u0086\33\3\2\2"+
		"\2\u0087\u008a\7#\2\2\u0088\u008a\5\22\n\2\u0089\u0087\3\2\2\2\u0089\u0088"+
		"\3\2\2\2\u008a\35\3\2\2\2\u008b\u008c\5 \21\2\u008c\u008d\5\"\22\2\u008d"+
		"\37\3\2\2\2\u008e\u008f\7\5\2\2\u008f\u0090\7#\2\2\u0090!\3\2\2\2\u0091"+
		"\u0095\7\34\2\2\u0092\u0094\5$\23\2\u0093\u0092\3\2\2\2\u0094\u0097\3"+
		"\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0098\u0099\7\35\2\2\u0099#\3\2\2\2\u009a\u009f\5&\24\2"+
		"\u009b\u009c\7!\2\2\u009c\u009e\5&\24\2\u009d\u009b\3\2\2\2\u009e\u00a1"+
		"\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0%\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a2\u00a3\7#\2\2\u00a3\u00a4\7\f\2\2\u00a4\u00a5\5(\25"+
		"\2\u00a5\'\3\2\2\2\u00a6\u00a7\t\2\2\2\u00a7)\3\2\2\2\u00a8\u00ad\5,\27"+
		"\2\u00a9\u00ad\5.\30\2\u00aa\u00ad\5\60\31\2\u00ab\u00ad\5\62\32\2\u00ac"+
		"\u00a8\3\2\2\2\u00ac\u00a9\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ab\3\2"+
		"\2\2\u00ad+\3\2\2\2\u00ae\u00b0\t\3\2\2\u00af\u00ae\3\2\2\2\u00af\u00b0"+
		"\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b7\5\64\33\2\u00b2\u00b4\t\3\2\2"+
		"\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7"+
		"\5\66\34\2\u00b6\u00af\3\2\2\2\u00b6\u00b3\3\2\2\2\u00b7-\3\2\2\2\u00b8"+
		"\u00b9\7\30\2\2\u00b9/\3\2\2\2\u00ba\u00bb\7\21\2\2\u00bb\61\3\2\2\2\u00bc"+
		"\u00bd\7\31\2\2\u00bd\63\3\2\2\2\u00be\u00bf\t\4\2\2\u00bf\65\3\2\2\2"+
		"\u00c0\u00c1\t\5\2\2\u00c1\67\3\2\2\2\u00c2\u00c7\7#\2\2\u00c3\u00c4\7"+
		"\"\2\2\u00c4\u00c6\7#\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c89\3\2\2\2\u00c9\u00c7\3\2\2\2"+
		"\24=ADQZair|\u0081\u0089\u0095\u009f\u00ac\u00af\u00b3\u00b6\u00c7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}