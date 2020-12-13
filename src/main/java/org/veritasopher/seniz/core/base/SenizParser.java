// Generated from D:/Project/ResearchProject/FDD/Seniz/project/Seniz/src/main/resources\SenizParser.g4 by ANTLR 4.9
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
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IMPORT=1, SYSTEM=2, VARIABLE=3, OVER=4, INIT=5, BOOLEAN=6, INT=7, FLOAT=8, 
		STRING=9, VALUEOF=10, TYPEOF=11, EQ=12, TO=13, POS=14, NEG=15, BOOL_LITERAL=16, 
		DECIMAL_LITERAL=17, HEX_LITERAL=18, OCT_LITERAL=19, BINARY_LITERAL=20, 
		FLOAT_LITERAL=21, HEX_FLOAT_LITERAL=22, STRING_LITERAL=23, NULL_LITERAL=24, 
		LPAREN=25, RPAREN=26, LBRACE=27, RBRACE=28, LBRACK=29, RBRACK=30, SEMI=31, 
		COMMA=32, DOT=33, IDENTIFIER=34, WS=35, COMMENT=36, LINE_COMMENT=37;
	public static final int
		RULE_compilationUnit = 0, RULE_importDeclaration = 1, RULE_systemDeclaration = 2, 
		RULE_systemHeader = 3, RULE_systemParameter = 4, RULE_systemBody = 5, 
		RULE_systemBodyDeclaration = 6, RULE_systemIdentifier = 7, RULE_stateNaming = 8, 
		RULE_stateBody = 9, RULE_stateDeclarator = 10, RULE_stateExpression = 11, 
		RULE_transitionStatement = 12, RULE_initIdentifier = 13, RULE_actionDeclaration = 14, 
		RULE_stateIdentifier = 15, RULE_stateNameIdentifier = 16, RULE_stateVarSetDeclaration = 17, 
		RULE_stateVarSetHeader = 18, RULE_stateVarSetBody = 19, RULE_stateVarSetDeclarator = 20, 
		RULE_stateVarExpression = 21, RULE_stateVarSetIdentifer = 22, RULE_stateVarIdentifier = 23, 
		RULE_primitiveType = 24, RULE_literal = 25, RULE_numberLiteral = 26, RULE_stringLiteral = 27, 
		RULE_booleanLiteral = 28, RULE_otherLiteral = 29, RULE_integerLiteral = 30, 
		RULE_floatLiteral = 31, RULE_qualifiedName = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "importDeclaration", "systemDeclaration", "systemHeader", 
			"systemParameter", "systemBody", "systemBodyDeclaration", "systemIdentifier", 
			"stateNaming", "stateBody", "stateDeclarator", "stateExpression", "transitionStatement", 
			"initIdentifier", "actionDeclaration", "stateIdentifier", "stateNameIdentifier", 
			"stateVarSetDeclaration", "stateVarSetHeader", "stateVarSetBody", "stateVarSetDeclarator", 
			"stateVarExpression", "stateVarSetIdentifer", "stateVarIdentifier", "primitiveType", 
			"literal", "numberLiteral", "stringLiteral", "booleanLiteral", "otherLiteral", 
			"integerLiteral", "floatLiteral", "qualifiedName"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'system'", "'variable'", "'over'", "'init'", "'bool'", 
			"'int'", "'float'", "'string'", "':'", "'::'", "'='", "'->'", "'+'", 
			"'-'", null, null, null, null, null, null, null, null, "'null'", "'('", 
			"')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IMPORT", "SYSTEM", "VARIABLE", "OVER", "INIT", "BOOLEAN", "INT", 
			"FLOAT", "STRING", "VALUEOF", "TYPEOF", "EQ", "TO", "POS", "NEG", "BOOL_LITERAL", 
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
		public StateVarSetDeclarationContext stateVarSetDeclaration() {
			return getRuleContext(StateVarSetDeclarationContext.class,0);
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
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(66);
				importDeclaration();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SYSTEM) {
				{
				setState(72);
				systemDeclaration();
				}
			}

			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARIABLE) {
				{
				setState(75);
				stateVarSetDeclaration();
				}
			}

			setState(78);
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
			setState(80);
			match(IMPORT);
			setState(81);
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
			setState(83);
			systemHeader();
			setState(84);
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
		public SystemIdentifierContext systemIdentifier() {
			return getRuleContext(SystemIdentifierContext.class,0);
		}
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
			setState(86);
			match(SYSTEM);
			setState(87);
			systemIdentifier();
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OVER) {
				{
				setState(88);
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
		public StateVarSetIdentiferContext stateVarSetIdentifer() {
			return getRuleContext(StateVarSetIdentiferContext.class,0);
		}
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
			setState(91);
			match(OVER);
			setState(92);
			stateVarSetIdentifer();
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
			setState(94);
			match(LBRACE);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INIT) | (1L << LBRACE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(95);
				systemBodyDeclaration();
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
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
		public StateNamingContext stateNaming() {
			return getRuleContext(StateNamingContext.class,0);
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
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				stateNaming();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
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

	public static class SystemIdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SenizParser.IDENTIFIER, 0); }
		public SystemIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_systemIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterSystemIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitSystemIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitSystemIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SystemIdentifierContext systemIdentifier() throws RecognitionException {
		SystemIdentifierContext _localctx = new SystemIdentifierContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_systemIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
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

	public static class StateNamingContext extends ParserRuleContext {
		public Token bop;
		public StateNameIdentifierContext stateNameIdentifier() {
			return getRuleContext(StateNameIdentifierContext.class,0);
		}
		public StateBodyContext stateBody() {
			return getRuleContext(StateBodyContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SenizParser.EQ, 0); }
		public StateNamingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateNaming; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterStateNaming(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitStateNaming(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitStateNaming(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateNamingContext stateNaming() throws RecognitionException {
		StateNamingContext _localctx = new StateNamingContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stateNaming);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			stateNameIdentifier();
			setState(110);
			((StateNamingContext)_localctx).bop = match(EQ);
			setState(111);
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
		public StateDeclaratorContext stateDeclarator() {
			return getRuleContext(StateDeclaratorContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SenizParser.RBRACE, 0); }
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
		enterRule(_localctx, 18, RULE_stateBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(LBRACE);
			setState(114);
			stateDeclarator();
			setState(115);
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
		enterRule(_localctx, 20, RULE_stateDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			stateExpression();
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(118);
				match(COMMA);
				setState(119);
				stateExpression();
				}
				}
				setState(124);
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
		public StateVarIdentifierContext stateVarIdentifier() {
			return getRuleContext(StateVarIdentifierContext.class,0);
		}
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
		enterRule(_localctx, 22, RULE_stateExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			stateVarIdentifier();
			setState(126);
			((StateExpressionContext)_localctx).bop = match(VALUEOF);
			setState(127);
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
		public InitIdentifierContext initIdentifier() {
			return getRuleContext(InitIdentifierContext.class,0);
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
		enterRule(_localctx, 24, RULE_transitionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INIT) {
				{
				setState(129);
				initIdentifier();
				}
			}

			setState(132);
			stateIdentifier();
			setState(138); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(133);
				match(TO);
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACK) {
					{
					setState(134);
					actionDeclaration();
					}
				}

				setState(137);
				stateIdentifier();
				}
				}
				setState(140); 
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

	public static class InitIdentifierContext extends ParserRuleContext {
		public TerminalNode INIT() { return getToken(SenizParser.INIT, 0); }
		public InitIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterInitIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitInitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitInitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitIdentifierContext initIdentifier() throws RecognitionException {
		InitIdentifierContext _localctx = new InitIdentifierContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_initIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(INIT);
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
		enterRule(_localctx, 28, RULE_actionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(LBRACK);
			setState(145);
			match(IDENTIFIER);
			setState(146);
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
		public StateNameIdentifierContext stateNameIdentifier() {
			return getRuleContext(StateNameIdentifierContext.class,0);
		}
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
		enterRule(_localctx, 30, RULE_stateIdentifier);
		try {
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				stateNameIdentifier();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
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

	public static class StateNameIdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SenizParser.IDENTIFIER, 0); }
		public StateNameIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateNameIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterStateNameIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitStateNameIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitStateNameIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateNameIdentifierContext stateNameIdentifier() throws RecognitionException {
		StateNameIdentifierContext _localctx = new StateNameIdentifierContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_stateNameIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
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

	public static class StateVarSetDeclarationContext extends ParserRuleContext {
		public StateVarSetHeaderContext stateVarSetHeader() {
			return getRuleContext(StateVarSetHeaderContext.class,0);
		}
		public StateVarSetBodyContext stateVarSetBody() {
			return getRuleContext(StateVarSetBodyContext.class,0);
		}
		public StateVarSetDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateVarSetDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterStateVarSetDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitStateVarSetDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitStateVarSetDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateVarSetDeclarationContext stateVarSetDeclaration() throws RecognitionException {
		StateVarSetDeclarationContext _localctx = new StateVarSetDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_stateVarSetDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			stateVarSetHeader();
			setState(155);
			stateVarSetBody();
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

	public static class StateVarSetHeaderContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(SenizParser.VARIABLE, 0); }
		public StateVarSetIdentiferContext stateVarSetIdentifer() {
			return getRuleContext(StateVarSetIdentiferContext.class,0);
		}
		public StateVarSetHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateVarSetHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterStateVarSetHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitStateVarSetHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitStateVarSetHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateVarSetHeaderContext stateVarSetHeader() throws RecognitionException {
		StateVarSetHeaderContext _localctx = new StateVarSetHeaderContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_stateVarSetHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(VARIABLE);
			setState(158);
			stateVarSetIdentifer();
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

	public static class StateVarSetBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(SenizParser.LBRACE, 0); }
		public StateVarSetDeclaratorContext stateVarSetDeclarator() {
			return getRuleContext(StateVarSetDeclaratorContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SenizParser.RBRACE, 0); }
		public StateVarSetBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateVarSetBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterStateVarSetBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitStateVarSetBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitStateVarSetBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateVarSetBodyContext stateVarSetBody() throws RecognitionException {
		StateVarSetBodyContext _localctx = new StateVarSetBodyContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_stateVarSetBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(LBRACE);
			setState(161);
			stateVarSetDeclarator();
			setState(162);
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

	public static class StateVarSetDeclaratorContext extends ParserRuleContext {
		public List<StateVarExpressionContext> stateVarExpression() {
			return getRuleContexts(StateVarExpressionContext.class);
		}
		public StateVarExpressionContext stateVarExpression(int i) {
			return getRuleContext(StateVarExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SenizParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SenizParser.COMMA, i);
		}
		public StateVarSetDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateVarSetDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterStateVarSetDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitStateVarSetDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitStateVarSetDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateVarSetDeclaratorContext stateVarSetDeclarator() throws RecognitionException {
		StateVarSetDeclaratorContext _localctx = new StateVarSetDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_stateVarSetDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			stateVarExpression();
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(165);
				match(COMMA);
				setState(166);
				stateVarExpression();
				}
				}
				setState(171);
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

	public static class StateVarExpressionContext extends ParserRuleContext {
		public Token bop;
		public StateVarIdentifierContext stateVarIdentifier() {
			return getRuleContext(StateVarIdentifierContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode TYPEOF() { return getToken(SenizParser.TYPEOF, 0); }
		public StateVarExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateVarExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterStateVarExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitStateVarExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitStateVarExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateVarExpressionContext stateVarExpression() throws RecognitionException {
		StateVarExpressionContext _localctx = new StateVarExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_stateVarExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			stateVarIdentifier();
			setState(173);
			((StateVarExpressionContext)_localctx).bop = match(TYPEOF);
			setState(174);
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

	public static class StateVarSetIdentiferContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SenizParser.IDENTIFIER, 0); }
		public StateVarSetIdentiferContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateVarSetIdentifer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterStateVarSetIdentifer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitStateVarSetIdentifer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitStateVarSetIdentifer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateVarSetIdentiferContext stateVarSetIdentifer() throws RecognitionException {
		StateVarSetIdentiferContext _localctx = new StateVarSetIdentiferContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_stateVarSetIdentifer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
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

	public static class StateVarIdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SenizParser.IDENTIFIER, 0); }
		public StateVarIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateVarIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterStateVarIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitStateVarIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitStateVarIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateVarIdentifierContext stateVarIdentifier() throws RecognitionException {
		StateVarIdentifierContext _localctx = new StateVarIdentifierContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_stateVarIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
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
		enterRule(_localctx, 48, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
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
		enterRule(_localctx, 50, RULE_literal);
		try {
			setState(186);
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
				setState(182);
				numberLiteral();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				stringLiteral();
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				booleanLiteral();
				}
				break;
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(185);
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
		enterRule(_localctx, 52, RULE_numberLiteral);
		int _la;
		try {
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==POS || _la==NEG) {
					{
					setState(188);
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

				setState(191);
				integerLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==POS || _la==NEG) {
					{
					setState(192);
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

				setState(195);
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
		enterRule(_localctx, 54, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
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
		enterRule(_localctx, 56, RULE_booleanLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
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
		enterRule(_localctx, 58, RULE_otherLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
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
		enterRule(_localctx, 60, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
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
		enterRule(_localctx, 62, RULE_floatLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
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
		enterRule(_localctx, 64, RULE_qualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(IDENTIFIER);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(209);
				match(DOT);
				setState(210);
				match(IDENTIFIER);
				}
				}
				setState(215);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u00db\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\7\2F\n\2\f\2\16\2I\13\2\3\2\5\2L\n\2\3\2\5\2O\n\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\5\5\\\n\5\3\6\3\6\3\6\3\7\3\7"+
		"\7\7c\n\7\f\7\16\7f\13\7\3\7\3\7\3\b\3\b\5\bl\n\b\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\7\f{\n\f\f\f\16\f~\13\f\3\r\3\r\3"+
		"\r\3\r\3\16\5\16\u0085\n\16\3\16\3\16\3\16\5\16\u008a\n\16\3\16\6\16\u008d"+
		"\n\16\r\16\16\16\u008e\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\5\21\u0099"+
		"\n\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\7\26\u00aa\n\26\f\26\16\26\u00ad\13\26\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\5\33\u00bd\n\33\3\34"+
		"\5\34\u00c0\n\34\3\34\3\34\5\34\u00c4\n\34\3\34\5\34\u00c7\n\34\3\35\3"+
		"\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\7\"\u00d6\n\"\f\"\16\""+
		"\u00d9\13\"\3\"\2\2#\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@B\2\6\3\2\b\13\3\2\20\21\3\2\23\26\3\2\27\30\2\u00cc\2G"+
		"\3\2\2\2\4R\3\2\2\2\6U\3\2\2\2\bX\3\2\2\2\n]\3\2\2\2\f`\3\2\2\2\16k\3"+
		"\2\2\2\20m\3\2\2\2\22o\3\2\2\2\24s\3\2\2\2\26w\3\2\2\2\30\177\3\2\2\2"+
		"\32\u0084\3\2\2\2\34\u0090\3\2\2\2\36\u0092\3\2\2\2 \u0098\3\2\2\2\"\u009a"+
		"\3\2\2\2$\u009c\3\2\2\2&\u009f\3\2\2\2(\u00a2\3\2\2\2*\u00a6\3\2\2\2,"+
		"\u00ae\3\2\2\2.\u00b2\3\2\2\2\60\u00b4\3\2\2\2\62\u00b6\3\2\2\2\64\u00bc"+
		"\3\2\2\2\66\u00c6\3\2\2\28\u00c8\3\2\2\2:\u00ca\3\2\2\2<\u00cc\3\2\2\2"+
		">\u00ce\3\2\2\2@\u00d0\3\2\2\2B\u00d2\3\2\2\2DF\5\4\3\2ED\3\2\2\2FI\3"+
		"\2\2\2GE\3\2\2\2GH\3\2\2\2HK\3\2\2\2IG\3\2\2\2JL\5\6\4\2KJ\3\2\2\2KL\3"+
		"\2\2\2LN\3\2\2\2MO\5$\23\2NM\3\2\2\2NO\3\2\2\2OP\3\2\2\2PQ\7\2\2\3Q\3"+
		"\3\2\2\2RS\7\3\2\2ST\5B\"\2T\5\3\2\2\2UV\5\b\5\2VW\5\f\7\2W\7\3\2\2\2"+
		"XY\7\4\2\2Y[\5\20\t\2Z\\\5\n\6\2[Z\3\2\2\2[\\\3\2\2\2\\\t\3\2\2\2]^\7"+
		"\6\2\2^_\5.\30\2_\13\3\2\2\2`d\7\35\2\2ac\5\16\b\2ba\3\2\2\2cf\3\2\2\2"+
		"db\3\2\2\2de\3\2\2\2eg\3\2\2\2fd\3\2\2\2gh\7\36\2\2h\r\3\2\2\2il\5\22"+
		"\n\2jl\5\32\16\2ki\3\2\2\2kj\3\2\2\2l\17\3\2\2\2mn\7$\2\2n\21\3\2\2\2"+
		"op\5\"\22\2pq\7\16\2\2qr\5\24\13\2r\23\3\2\2\2st\7\35\2\2tu\5\26\f\2u"+
		"v\7\36\2\2v\25\3\2\2\2w|\5\30\r\2xy\7\"\2\2y{\5\30\r\2zx\3\2\2\2{~\3\2"+
		"\2\2|z\3\2\2\2|}\3\2\2\2}\27\3\2\2\2~|\3\2\2\2\177\u0080\5\60\31\2\u0080"+
		"\u0081\7\f\2\2\u0081\u0082\5\64\33\2\u0082\31\3\2\2\2\u0083\u0085\5\34"+
		"\17\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\u008c\5 \21\2\u0087\u0089\7\17\2\2\u0088\u008a\5\36\20\2\u0089\u0088"+
		"\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\5 \21\2\u008c"+
		"\u0087\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2"+
		"\2\2\u008f\33\3\2\2\2\u0090\u0091\7\7\2\2\u0091\35\3\2\2\2\u0092\u0093"+
		"\7\37\2\2\u0093\u0094\7$\2\2\u0094\u0095\7 \2\2\u0095\37\3\2\2\2\u0096"+
		"\u0099\5\"\22\2\u0097\u0099\5\24\13\2\u0098\u0096\3\2\2\2\u0098\u0097"+
		"\3\2\2\2\u0099!\3\2\2\2\u009a\u009b\7$\2\2\u009b#\3\2\2\2\u009c\u009d"+
		"\5&\24\2\u009d\u009e\5(\25\2\u009e%\3\2\2\2\u009f\u00a0\7\5\2\2\u00a0"+
		"\u00a1\5.\30\2\u00a1\'\3\2\2\2\u00a2\u00a3\7\35\2\2\u00a3\u00a4\5*\26"+
		"\2\u00a4\u00a5\7\36\2\2\u00a5)\3\2\2\2\u00a6\u00ab\5,\27\2\u00a7\u00a8"+
		"\7\"\2\2\u00a8\u00aa\5,\27\2\u00a9\u00a7\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab"+
		"\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac+\3\2\2\2\u00ad\u00ab\3\2\2\2"+
		"\u00ae\u00af\5\60\31\2\u00af\u00b0\7\r\2\2\u00b0\u00b1\5\62\32\2\u00b1"+
		"-\3\2\2\2\u00b2\u00b3\7$\2\2\u00b3/\3\2\2\2\u00b4\u00b5\7$\2\2\u00b5\61"+
		"\3\2\2\2\u00b6\u00b7\t\2\2\2\u00b7\63\3\2\2\2\u00b8\u00bd\5\66\34\2\u00b9"+
		"\u00bd\58\35\2\u00ba\u00bd\5:\36\2\u00bb\u00bd\5<\37\2\u00bc\u00b8\3\2"+
		"\2\2\u00bc\u00b9\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd"+
		"\65\3\2\2\2\u00be\u00c0\t\3\2\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2\2"+
		"\2\u00c0\u00c1\3\2\2\2\u00c1\u00c7\5> \2\u00c2\u00c4\t\3\2\2\u00c3\u00c2"+
		"\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\5@!\2\u00c6"+
		"\u00bf\3\2\2\2\u00c6\u00c3\3\2\2\2\u00c7\67\3\2\2\2\u00c8\u00c9\7\31\2"+
		"\2\u00c99\3\2\2\2\u00ca\u00cb\7\22\2\2\u00cb;\3\2\2\2\u00cc\u00cd\7\32"+
		"\2\2\u00cd=\3\2\2\2\u00ce\u00cf\t\4\2\2\u00cf?\3\2\2\2\u00d0\u00d1\t\5"+
		"\2\2\u00d1A\3\2\2\2\u00d2\u00d7\7$\2\2\u00d3\u00d4\7#\2\2\u00d4\u00d6"+
		"\7$\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8C\3\2\2\2\u00d9\u00d7\3\2\2\2\23GKN[dk|\u0084\u0089"+
		"\u008e\u0098\u00ab\u00bc\u00bf\u00c3\u00c6\u00d7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}