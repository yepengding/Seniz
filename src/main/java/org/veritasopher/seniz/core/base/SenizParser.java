// Generated from /Users/michaeltei/Projects/ResearchProjects/FDD/Seniz/project/Seniz/src/main/resources/SenizParser.g4 by ANTLR 4.9.2
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
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IMPORT=1, MAIN=2, CONTROL=3, SYSTEM=4, VARSET=5, CHANSET=6, OVER=7, WITH=8, 
		INIT=9, AS=10, SYNC=11, ASYNC=12, ARGS=13, PROP=14, LTL=15, BOOLEAN=16, 
		INT=17, FLOAT=18, STRING=19, INTERNAL=20, EXTERNAL=21, VALUEOF=22, TYPEOF=23, 
		TO=24, GT=25, LT=26, BANG=27, TILDE=28, QUESTION=29, EQ=30, LE=31, GE=32, 
		NEQ=33, AND=34, OR=35, LAND=36, LOR=37, ADD=38, SUB=39, MUL=40, DIV=41, 
		CARET=42, MOD=43, GLOBAL=44, ALWAYS=45, EVENTUALLY=46, NEXT=47, UNTIL=48, 
		BOOL_LITERAL=49, DECIMAL_LITERAL=50, HEX_LITERAL=51, OCT_LITERAL=52, BINARY_LITERAL=53, 
		FLOAT_LITERAL=54, HEX_FLOAT_LITERAL=55, STRING_LITERAL=56, NULL_LITERAL=57, 
		LPAREN=58, RPAREN=59, LBRACE=60, RBRACE=61, LBRACK=62, RBRACK=63, SEMI=64, 
		COMMA=65, DOT=66, IDENTIFIER=67, WS=68, COMMENT=69, LINE_COMMENT=70;
	public static final int
		RULE_compilationUnit = 0, RULE_importDeclaration = 1, RULE_systemDeclaration = 2, 
		RULE_systemHeader = 3, RULE_systemModifiers = 4, RULE_mainModifier = 5, 
		RULE_controlModifier = 6, RULE_systemParameter = 7, RULE_systemBody = 8, 
		RULE_systemBodyDeclaration = 9, RULE_controlSystemBodyDeclaration = 10, 
		RULE_globalStateBody = 11, RULE_logicStatement = 12, RULE_controlStatement = 13, 
		RULE_syncControlStatement = 14, RULE_asyncControlStatement = 15, RULE_subSystemIdentifier = 16, 
		RULE_systemIdentifier = 17, RULE_stateNaming = 18, RULE_stateBody = 19, 
		RULE_stateDeclarator = 20, RULE_stateExpression = 21, RULE_stateIdentifier = 22, 
		RULE_stateNameIdentifier = 23, RULE_expression = 24, RULE_primary = 25, 
		RULE_globalStateNaming = 26, RULE_globalStateNameIdentifier = 27, RULE_globalStateIdentifier = 28, 
		RULE_transitionStatement = 29, RULE_initIdentifier = 30, RULE_transitionDeclaration = 31, 
		RULE_guardIdentifier = 32, RULE_actionDeclaration = 33, RULE_formalParameterList = 34, 
		RULE_formalParameter = 35, RULE_variableIdentifier = 36, RULE_parameterList = 37, 
		RULE_propositionStatement = 38, RULE_propositionBody = 39, RULE_propositionExpression = 40, 
		RULE_propositionPrimary = 41, RULE_propositionIdentifer = 42, RULE_ltlStatement = 43, 
		RULE_ltlBody = 44, RULE_ltlExpression = 45, RULE_ltlPrimary = 46, RULE_varSetDeclaration = 47, 
		RULE_varSetHeader = 48, RULE_varSetBody = 49, RULE_varSetDeclarator = 50, 
		RULE_varTypeDeclaration = 51, RULE_varSetIdentifier = 52, RULE_varIdentifier = 53, 
		RULE_chanSetDeclaration = 54, RULE_chanSetHeader = 55, RULE_chanSetBody = 56, 
		RULE_chanSetDeclarator = 57, RULE_chanTypeDeclaration = 58, RULE_chanExpression = 59, 
		RULE_chanType = 60, RULE_chanSetIdentifer = 61, RULE_chanIdentifier = 62, 
		RULE_primitiveType = 63, RULE_literal = 64, RULE_numberLiteral = 65, RULE_stringLiteral = 66, 
		RULE_booleanLiteral = 67, RULE_otherLiteral = 68, RULE_integerLiteral = 69, 
		RULE_floatLiteral = 70, RULE_qualifiedName = 71;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "importDeclaration", "systemDeclaration", "systemHeader", 
			"systemModifiers", "mainModifier", "controlModifier", "systemParameter", 
			"systemBody", "systemBodyDeclaration", "controlSystemBodyDeclaration", 
			"globalStateBody", "logicStatement", "controlStatement", "syncControlStatement", 
			"asyncControlStatement", "subSystemIdentifier", "systemIdentifier", "stateNaming", 
			"stateBody", "stateDeclarator", "stateExpression", "stateIdentifier", 
			"stateNameIdentifier", "expression", "primary", "globalStateNaming", 
			"globalStateNameIdentifier", "globalStateIdentifier", "transitionStatement", 
			"initIdentifier", "transitionDeclaration", "guardIdentifier", "actionDeclaration", 
			"formalParameterList", "formalParameter", "variableIdentifier", "parameterList", 
			"propositionStatement", "propositionBody", "propositionExpression", "propositionPrimary", 
			"propositionIdentifer", "ltlStatement", "ltlBody", "ltlExpression", "ltlPrimary", 
			"varSetDeclaration", "varSetHeader", "varSetBody", "varSetDeclarator", 
			"varTypeDeclaration", "varSetIdentifier", "varIdentifier", "chanSetDeclaration", 
			"chanSetHeader", "chanSetBody", "chanSetDeclarator", "chanTypeDeclaration", 
			"chanExpression", "chanType", "chanSetIdentifer", "chanIdentifier", "primitiveType", 
			"literal", "numberLiteral", "stringLiteral", "booleanLiteral", "otherLiteral", 
			"integerLiteral", "floatLiteral", "qualifiedName"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'main'", "'control'", "'system'", "'varset'", "'chanset'", 
			"'over'", "'with'", "'init'", "'as'", "'sync'", "'async'", "'args'", 
			"'prop'", "'ltl'", "'bool'", "'int'", "'float'", "'string'", "'internal'", 
			"'external'", "':'", "'::'", "'->'", "'>'", "'<'", "'!'", "'~'", "'?'", 
			"'='", "'<='", "'>='", "'/='", "'&'", "'|'", "'and'", "'or'", "'+'", 
			"'-'", "'*'", "'/'", "'^'", "'%'", "'@'", "'G'", "'F'", "'X'", "'U'", 
			null, null, null, null, null, null, null, null, "'null'", "'('", "')'", 
			"'{'", "'}'", "'['", "']'", "';'", "','", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IMPORT", "MAIN", "CONTROL", "SYSTEM", "VARSET", "CHANSET", "OVER", 
			"WITH", "INIT", "AS", "SYNC", "ASYNC", "ARGS", "PROP", "LTL", "BOOLEAN", 
			"INT", "FLOAT", "STRING", "INTERNAL", "EXTERNAL", "VALUEOF", "TYPEOF", 
			"TO", "GT", "LT", "BANG", "TILDE", "QUESTION", "EQ", "LE", "GE", "NEQ", 
			"AND", "OR", "LAND", "LOR", "ADD", "SUB", "MUL", "DIV", "CARET", "MOD", 
			"GLOBAL", "ALWAYS", "EVENTUALLY", "NEXT", "UNTIL", "BOOL_LITERAL", "DECIMAL_LITERAL", 
			"HEX_LITERAL", "OCT_LITERAL", "BINARY_LITERAL", "FLOAT_LITERAL", "HEX_FLOAT_LITERAL", 
			"STRING_LITERAL", "NULL_LITERAL", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "IDENTIFIER", "WS", "COMMENT", 
			"LINE_COMMENT"
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
		public VarSetDeclarationContext varSetDeclaration() {
			return getRuleContext(VarSetDeclarationContext.class,0);
		}
		public ChanSetDeclarationContext chanSetDeclaration() {
			return getRuleContext(ChanSetDeclarationContext.class,0);
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
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(144);
				importDeclaration();
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAIN) | (1L << CONTROL) | (1L << SYSTEM))) != 0)) {
				{
				setState(150);
				systemDeclaration();
				}
			}

			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARSET) {
				{
				setState(153);
				varSetDeclaration();
				}
			}

			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHANSET) {
				{
				setState(156);
				chanSetDeclaration();
				}
			}

			setState(159);
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
			setState(161);
			match(IMPORT);
			setState(162);
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
			setState(164);
			systemHeader();
			setState(165);
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
		public SystemModifiersContext systemModifiers() {
			return getRuleContext(SystemModifiersContext.class,0);
		}
		public TerminalNode SYSTEM() { return getToken(SenizParser.SYSTEM, 0); }
		public SystemIdentifierContext systemIdentifier() {
			return getRuleContext(SystemIdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(SenizParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SenizParser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
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
			setState(167);
			systemModifiers();
			setState(168);
			match(SYSTEM);
			setState(169);
			systemIdentifier();
			setState(170);
			match(LPAREN);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(171);
				formalParameterList();
				}
			}

			setState(174);
			match(RPAREN);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OVER) {
				{
				setState(175);
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

	public static class SystemModifiersContext extends ParserRuleContext {
		public MainModifierContext mainModifier() {
			return getRuleContext(MainModifierContext.class,0);
		}
		public ControlModifierContext controlModifier() {
			return getRuleContext(ControlModifierContext.class,0);
		}
		public SystemModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_systemModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterSystemModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitSystemModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitSystemModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SystemModifiersContext systemModifiers() throws RecognitionException {
		SystemModifiersContext _localctx = new SystemModifiersContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_systemModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MAIN) {
				{
				setState(178);
				mainModifier();
				}
			}

			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONTROL) {
				{
				setState(181);
				controlModifier();
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

	public static class MainModifierContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(SenizParser.MAIN, 0); }
		public MainModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterMainModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitMainModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitMainModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainModifierContext mainModifier() throws RecognitionException {
		MainModifierContext _localctx = new MainModifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mainModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(MAIN);
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

	public static class ControlModifierContext extends ParserRuleContext {
		public TerminalNode CONTROL() { return getToken(SenizParser.CONTROL, 0); }
		public ControlModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterControlModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitControlModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitControlModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ControlModifierContext controlModifier() throws RecognitionException {
		ControlModifierContext _localctx = new ControlModifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_controlModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(CONTROL);
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
		public List<VarSetIdentifierContext> varSetIdentifier() {
			return getRuleContexts(VarSetIdentifierContext.class);
		}
		public VarSetIdentifierContext varSetIdentifier(int i) {
			return getRuleContext(VarSetIdentifierContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(SenizParser.COMMA, 0); }
		public ChanSetIdentiferContext chanSetIdentifer() {
			return getRuleContext(ChanSetIdentiferContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SenizParser.WITH, 0); }
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
		enterRule(_localctx, 14, RULE_systemParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(OVER);
			setState(189);
			varSetIdentifier();
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(190);
				match(COMMA);
				setState(191);
				chanSetIdentifer();
				}
			}

			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(194);
				match(WITH);
				setState(195);
				varSetIdentifier();
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

	public static class SystemBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(SenizParser.LBRACE, 0); }
		public ControlStatementContext controlStatement() {
			return getRuleContext(ControlStatementContext.class,0);
		}
		public ControlSystemBodyDeclarationContext controlSystemBodyDeclaration() {
			return getRuleContext(ControlSystemBodyDeclarationContext.class,0);
		}
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
		enterRule(_localctx, 16, RULE_systemBody);
		int _la;
		try {
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				match(LBRACE);
				setState(199);
				controlStatement();
				setState(200);
				controlSystemBodyDeclaration();
				setState(201);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				match(LBRACE);
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (INIT - 9)) | (1L << (PROP - 9)) | (1L << (LTL - 9)) | (1L << (GLOBAL - 9)) | (1L << (LBRACE - 9)) | (1L << (IDENTIFIER - 9)))) != 0)) {
					{
					{
					setState(204);
					systemBodyDeclaration();
					}
					}
					setState(209);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(210);
				match(RBRACE);
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

	public static class SystemBodyDeclarationContext extends ParserRuleContext {
		public StateNamingContext stateNaming() {
			return getRuleContext(StateNamingContext.class,0);
		}
		public GlobalStateNamingContext globalStateNaming() {
			return getRuleContext(GlobalStateNamingContext.class,0);
		}
		public TransitionStatementContext transitionStatement() {
			return getRuleContext(TransitionStatementContext.class,0);
		}
		public LogicStatementContext logicStatement() {
			return getRuleContext(LogicStatementContext.class,0);
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
		enterRule(_localctx, 18, RULE_systemBodyDeclaration);
		try {
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				stateNaming();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				globalStateNaming();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(215);
				transitionStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(216);
				logicStatement();
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

	public static class ControlSystemBodyDeclarationContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(SenizParser.GLOBAL, 0); }
		public GlobalStateBodyContext globalStateBody() {
			return getRuleContext(GlobalStateBodyContext.class,0);
		}
		public List<LogicStatementContext> logicStatement() {
			return getRuleContexts(LogicStatementContext.class);
		}
		public LogicStatementContext logicStatement(int i) {
			return getRuleContext(LogicStatementContext.class,i);
		}
		public ControlSystemBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlSystemBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterControlSystemBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitControlSystemBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitControlSystemBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ControlSystemBodyDeclarationContext controlSystemBodyDeclaration() throws RecognitionException {
		ControlSystemBodyDeclarationContext _localctx = new ControlSystemBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_controlSystemBodyDeclaration);
		int _la;
		try {
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL) {
					{
					setState(219);
					match(GLOBAL);
					setState(220);
					globalStateBody();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PROP || _la==LTL) {
					{
					{
					setState(223);
					logicStatement();
					}
					}
					setState(228);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class GlobalStateBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(SenizParser.LBRACE, 0); }
		public StateDeclaratorContext stateDeclarator() {
			return getRuleContext(StateDeclaratorContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SenizParser.RBRACE, 0); }
		public GlobalStateBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalStateBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterGlobalStateBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitGlobalStateBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitGlobalStateBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalStateBodyContext globalStateBody() throws RecognitionException {
		GlobalStateBodyContext _localctx = new GlobalStateBodyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_globalStateBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(LBRACE);
			setState(232);
			stateDeclarator();
			setState(233);
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

	public static class LogicStatementContext extends ParserRuleContext {
		public PropositionStatementContext propositionStatement() {
			return getRuleContext(PropositionStatementContext.class,0);
		}
		public LtlStatementContext ltlStatement() {
			return getRuleContext(LtlStatementContext.class,0);
		}
		public LogicStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterLogicStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitLogicStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitLogicStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicStatementContext logicStatement() throws RecognitionException {
		LogicStatementContext _localctx = new LogicStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_logicStatement);
		try {
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROP:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				propositionStatement();
				}
				break;
			case LTL:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				ltlStatement();
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

	public static class ControlStatementContext extends ParserRuleContext {
		public SyncControlStatementContext syncControlStatement() {
			return getRuleContext(SyncControlStatementContext.class,0);
		}
		public AsyncControlStatementContext asyncControlStatement() {
			return getRuleContext(AsyncControlStatementContext.class,0);
		}
		public ControlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterControlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitControlStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitControlStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ControlStatementContext controlStatement() throws RecognitionException {
		ControlStatementContext _localctx = new ControlStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_controlStatement);
		try {
			setState(241);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SYNC:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				syncControlStatement();
				}
				break;
			case ASYNC:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				asyncControlStatement();
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

	public static class SyncControlStatementContext extends ParserRuleContext {
		public TerminalNode SYNC() { return getToken(SenizParser.SYNC, 0); }
		public List<SubSystemIdentifierContext> subSystemIdentifier() {
			return getRuleContexts(SubSystemIdentifierContext.class);
		}
		public SubSystemIdentifierContext subSystemIdentifier(int i) {
			return getRuleContext(SubSystemIdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SenizParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SenizParser.COMMA, i);
		}
		public SyncControlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syncControlStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterSyncControlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitSyncControlStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitSyncControlStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SyncControlStatementContext syncControlStatement() throws RecognitionException {
		SyncControlStatementContext _localctx = new SyncControlStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_syncControlStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(SYNC);
			setState(244);
			subSystemIdentifier();
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(245);
				match(COMMA);
				setState(246);
				subSystemIdentifier();
				}
				}
				setState(251);
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

	public static class AsyncControlStatementContext extends ParserRuleContext {
		public TerminalNode ASYNC() { return getToken(SenizParser.ASYNC, 0); }
		public List<SubSystemIdentifierContext> subSystemIdentifier() {
			return getRuleContexts(SubSystemIdentifierContext.class);
		}
		public SubSystemIdentifierContext subSystemIdentifier(int i) {
			return getRuleContext(SubSystemIdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SenizParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SenizParser.COMMA, i);
		}
		public AsyncControlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asyncControlStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterAsyncControlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitAsyncControlStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitAsyncControlStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsyncControlStatementContext asyncControlStatement() throws RecognitionException {
		AsyncControlStatementContext _localctx = new AsyncControlStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_asyncControlStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(ASYNC);
			setState(253);
			subSystemIdentifier();
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(254);
				match(COMMA);
				setState(255);
				subSystemIdentifier();
				}
				}
				setState(260);
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

	public static class SubSystemIdentifierContext extends ParserRuleContext {
		public SystemIdentifierContext systemIdentifier() {
			return getRuleContext(SystemIdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(SenizParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SenizParser.RPAREN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode AS() { return getToken(SenizParser.AS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SenizParser.IDENTIFIER, 0); }
		public SubSystemIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subSystemIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterSubSystemIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitSubSystemIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitSubSystemIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubSystemIdentifierContext subSystemIdentifier() throws RecognitionException {
		SubSystemIdentifierContext _localctx = new SubSystemIdentifierContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_subSystemIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			systemIdentifier();
			setState(262);
			match(LPAREN);
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 27)) & ~0x3f) == 0 && ((1L << (_la - 27)) & ((1L << (BANG - 27)) | (1L << (ADD - 27)) | (1L << (SUB - 27)) | (1L << (BOOL_LITERAL - 27)) | (1L << (DECIMAL_LITERAL - 27)) | (1L << (HEX_LITERAL - 27)) | (1L << (OCT_LITERAL - 27)) | (1L << (BINARY_LITERAL - 27)) | (1L << (FLOAT_LITERAL - 27)) | (1L << (HEX_FLOAT_LITERAL - 27)) | (1L << (STRING_LITERAL - 27)) | (1L << (NULL_LITERAL - 27)) | (1L << (LPAREN - 27)) | (1L << (IDENTIFIER - 27)))) != 0)) {
				{
				setState(263);
				parameterList();
				}
			}

			setState(266);
			match(RPAREN);
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(267);
				match(AS);
				setState(268);
				match(IDENTIFIER);
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
		enterRule(_localctx, 34, RULE_systemIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
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
		enterRule(_localctx, 36, RULE_stateNaming);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			stateNameIdentifier();
			setState(274);
			((StateNamingContext)_localctx).bop = match(EQ);
			setState(275);
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
		enterRule(_localctx, 38, RULE_stateBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(LBRACE);
			setState(278);
			stateDeclarator();
			setState(279);
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
		enterRule(_localctx, 40, RULE_stateDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			stateExpression();
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(282);
				match(COMMA);
				setState(283);
				stateExpression();
				}
				}
				setState(288);
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
		public VarIdentifierContext varIdentifier() {
			return getRuleContext(VarIdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 42, RULE_stateExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			varIdentifier();
			setState(290);
			((StateExpressionContext)_localctx).bop = match(VALUEOF);
			setState(291);
			expression(0);
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
		enterRule(_localctx, 44, RULE_stateIdentifier);
		try {
			setState(295);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				stateNameIdentifier();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
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
		enterRule(_localctx, 46, RULE_stateNameIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrimaryExpressionContext extends ExpressionContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public PrimaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesesExpressionContext extends ExpressionContext {
		public ExpressionContext inner;
		public TerminalNode LPAREN() { return getToken(SenizParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SenizParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesesExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterParenthesesExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitParenthesesExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitParenthesesExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditiveExpressionContext extends ExpressionContext {
		public Token bop;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(SenizParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(SenizParser.SUB, 0); }
		public AdditiveExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationalExpressionContext extends ExpressionContext {
		public Token bop;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQ() { return getToken(SenizParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(SenizParser.NEQ, 0); }
		public TerminalNode LE() { return getToken(SenizParser.LE, 0); }
		public TerminalNode GE() { return getToken(SenizParser.GE, 0); }
		public TerminalNode GT() { return getToken(SenizParser.GT, 0); }
		public TerminalNode LT() { return getToken(SenizParser.LT, 0); }
		public RelationalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditionalExpressionContext extends ExpressionContext {
		public Token bop;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(SenizParser.AND, 0); }
		public TerminalNode OR() { return getToken(SenizParser.OR, 0); }
		public ConditionalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExpressionContext extends ExpressionContext {
		public Token prefix;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BANG() { return getToken(SenizParser.BANG, 0); }
		public NotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicativeExpressionContext extends ExpressionContext {
		public Token bop;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(SenizParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(SenizParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SenizParser.MOD, 0); }
		public TerminalNode CARET() { return getToken(SenizParser.CARET, 0); }
		public MultiplicativeExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExpressionContext extends ExpressionContext {
		public Token prefix;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SenizParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(SenizParser.SUB, 0); }
		public UnaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesesExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(300);
				match(LPAREN);
				setState(301);
				((ParenthesesExpressionContext)_localctx).inner = expression(0);
				setState(302);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new PrimaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(304);
				primary();
				}
				break;
			case 3:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(305);
				((UnaryExpressionContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
					((UnaryExpressionContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(306);
				expression(6);
				}
				break;
			case 4:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(307);
				((NotExpressionContext)_localctx).prefix = match(BANG);
				setState(308);
				expression(5);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(325);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(323);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(311);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(312);
						((MultiplicativeExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << CARET) | (1L << MOD))) != 0)) ) {
							((MultiplicativeExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(313);
						expression(5);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(314);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(315);
						((AdditiveExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AdditiveExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(316);
						expression(4);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(317);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(318);
						((RelationalExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << EQ) | (1L << LE) | (1L << GE) | (1L << NEQ))) != 0)) ) {
							((RelationalExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(319);
						expression(3);
						}
						break;
					case 4:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(320);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(321);
						((ConditionalExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((ConditionalExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(322);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(327);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public VariableIdentifierContext variableIdentifier() {
			return getRuleContext(VariableIdentifierContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_primary);
		try {
			setState(330);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case SUB:
			case BOOL_LITERAL:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				literal();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(329);
				variableIdentifier();
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

	public static class GlobalStateNamingContext extends ParserRuleContext {
		public Token bop;
		public GlobalStateNameIdentifierContext globalStateNameIdentifier() {
			return getRuleContext(GlobalStateNameIdentifierContext.class,0);
		}
		public GlobalStateBodyContext globalStateBody() {
			return getRuleContext(GlobalStateBodyContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SenizParser.EQ, 0); }
		public GlobalStateNamingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalStateNaming; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterGlobalStateNaming(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitGlobalStateNaming(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitGlobalStateNaming(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalStateNamingContext globalStateNaming() throws RecognitionException {
		GlobalStateNamingContext _localctx = new GlobalStateNamingContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_globalStateNaming);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			globalStateNameIdentifier();
			setState(333);
			((GlobalStateNamingContext)_localctx).bop = match(EQ);
			setState(334);
			globalStateBody();
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

	public static class GlobalStateNameIdentifierContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(SenizParser.GLOBAL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SenizParser.IDENTIFIER, 0); }
		public GlobalStateNameIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalStateNameIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterGlobalStateNameIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitGlobalStateNameIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitGlobalStateNameIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalStateNameIdentifierContext globalStateNameIdentifier() throws RecognitionException {
		GlobalStateNameIdentifierContext _localctx = new GlobalStateNameIdentifierContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_globalStateNameIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(GLOBAL);
			setState(337);
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

	public static class GlobalStateIdentifierContext extends ParserRuleContext {
		public GlobalStateNameIdentifierContext globalStateNameIdentifier() {
			return getRuleContext(GlobalStateNameIdentifierContext.class,0);
		}
		public TerminalNode GLOBAL() { return getToken(SenizParser.GLOBAL, 0); }
		public GlobalStateBodyContext globalStateBody() {
			return getRuleContext(GlobalStateBodyContext.class,0);
		}
		public GlobalStateIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalStateIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterGlobalStateIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitGlobalStateIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitGlobalStateIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalStateIdentifierContext globalStateIdentifier() throws RecognitionException {
		GlobalStateIdentifierContext _localctx = new GlobalStateIdentifierContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_globalStateIdentifier);
		try {
			setState(342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				globalStateNameIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(340);
				match(GLOBAL);
				setState(341);
				globalStateBody();
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

	public static class TransitionStatementContext extends ParserRuleContext {
		public StateIdentifierContext stateIdentifier() {
			return getRuleContext(StateIdentifierContext.class,0);
		}
		public InitIdentifierContext initIdentifier() {
			return getRuleContext(InitIdentifierContext.class,0);
		}
		public List<TransitionDeclarationContext> transitionDeclaration() {
			return getRuleContexts(TransitionDeclarationContext.class);
		}
		public TransitionDeclarationContext transitionDeclaration(int i) {
			return getRuleContext(TransitionDeclarationContext.class,i);
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
		enterRule(_localctx, 58, RULE_transitionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INIT) {
				{
				setState(344);
				initIdentifier();
				}
			}

			setState(347);
			stateIdentifier();
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TO || _la==LBRACK) {
				{
				{
				setState(348);
				transitionDeclaration();
				}
				}
				setState(353);
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
		enterRule(_localctx, 60, RULE_initIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
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

	public static class TransitionDeclarationContext extends ParserRuleContext {
		public TerminalNode TO() { return getToken(SenizParser.TO, 0); }
		public StateIdentifierContext stateIdentifier() {
			return getRuleContext(StateIdentifierContext.class,0);
		}
		public GuardIdentifierContext guardIdentifier() {
			return getRuleContext(GuardIdentifierContext.class,0);
		}
		public ActionDeclarationContext actionDeclaration() {
			return getRuleContext(ActionDeclarationContext.class,0);
		}
		public GlobalStateIdentifierContext globalStateIdentifier() {
			return getRuleContext(GlobalStateIdentifierContext.class,0);
		}
		public TransitionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transitionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterTransitionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitTransitionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitTransitionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransitionDeclarationContext transitionDeclaration() throws RecognitionException {
		TransitionDeclarationContext _localctx = new TransitionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_transitionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(356);
				guardIdentifier();
				}
			}

			setState(359);
			match(TO);
			setState(361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(360);
				actionDeclaration();
				}
				break;
			}
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GLOBAL) {
				{
				setState(363);
				globalStateIdentifier();
				}
			}

			setState(366);
			stateIdentifier();
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

	public static class GuardIdentifierContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(SenizParser.LBRACK, 0); }
		public PropositionExpressionContext propositionExpression() {
			return getRuleContext(PropositionExpressionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(SenizParser.RBRACK, 0); }
		public GuardIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guardIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterGuardIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitGuardIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitGuardIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GuardIdentifierContext guardIdentifier() throws RecognitionException {
		GuardIdentifierContext _localctx = new GuardIdentifierContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_guardIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(LBRACK);
			setState(369);
			propositionExpression(0);
			setState(370);
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

	public static class ActionDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SenizParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(SenizParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SenizParser.RPAREN, 0); }
		public ChanExpressionContext chanExpression() {
			return getRuleContext(ChanExpressionContext.class,0);
		}
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
		enterRule(_localctx, 66, RULE_actionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(IDENTIFIER);
			setState(373);
			match(LPAREN);
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(374);
				chanExpression();
				}
			}

			setState(377);
			match(RPAREN);
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

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SenizParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SenizParser.COMMA, i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			formalParameter();
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(380);
				match(COMMA);
				setState(381);
				formalParameter();
				}
				}
				setState(386);
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

	public static class FormalParameterContext extends ParserRuleContext {
		public Token bop;
		public VariableIdentifierContext variableIdentifier() {
			return getRuleContext(VariableIdentifierContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode TYPEOF() { return getToken(SenizParser.TYPEOF, 0); }
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			variableIdentifier();
			setState(388);
			((FormalParameterContext)_localctx).bop = match(TYPEOF);
			setState(389);
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

	public static class VariableIdentifierContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(SenizParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SenizParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(SenizParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SenizParser.DOT, i);
		}
		public VariableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterVariableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitVariableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitVariableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableIdentifierContext variableIdentifier() throws RecognitionException {
		VariableIdentifierContext _localctx = new VariableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_variableIdentifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(IDENTIFIER);
			setState(396);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(392);
					match(DOT);
					setState(393);
					match(IDENTIFIER);
					}
					} 
				}
				setState(398);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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

	public static class ParameterListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SenizParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SenizParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			expression(0);
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(400);
				match(COMMA);
				setState(401);
				expression(0);
				}
				}
				setState(406);
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

	public static class PropositionStatementContext extends ParserRuleContext {
		public TerminalNode PROP() { return getToken(SenizParser.PROP, 0); }
		public PropositionIdentiferContext propositionIdentifer() {
			return getRuleContext(PropositionIdentiferContext.class,0);
		}
		public PropositionBodyContext propositionBody() {
			return getRuleContext(PropositionBodyContext.class,0);
		}
		public PropositionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propositionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterPropositionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitPropositionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitPropositionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropositionStatementContext propositionStatement() throws RecognitionException {
		PropositionStatementContext _localctx = new PropositionStatementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_propositionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(PROP);
			setState(408);
			propositionIdentifer();
			setState(409);
			propositionBody();
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

	public static class PropositionBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(SenizParser.LBRACE, 0); }
		public PropositionExpressionContext propositionExpression() {
			return getRuleContext(PropositionExpressionContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SenizParser.RBRACE, 0); }
		public PropositionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propositionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterPropositionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitPropositionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitPropositionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropositionBodyContext propositionBody() throws RecognitionException {
		PropositionBodyContext _localctx = new PropositionBodyContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_propositionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			match(LBRACE);
			setState(412);
			propositionExpression(0);
			setState(413);
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

	public static class PropositionExpressionContext extends ParserRuleContext {
		public PropositionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propositionExpression; }
	 
		public PropositionExpressionContext() { }
		public void copyFrom(PropositionExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PropConditionalExpressionContext extends PropositionExpressionContext {
		public Token bop;
		public List<PropositionExpressionContext> propositionExpression() {
			return getRuleContexts(PropositionExpressionContext.class);
		}
		public PropositionExpressionContext propositionExpression(int i) {
			return getRuleContext(PropositionExpressionContext.class,i);
		}
		public TerminalNode LAND() { return getToken(SenizParser.LAND, 0); }
		public TerminalNode LOR() { return getToken(SenizParser.LOR, 0); }
		public TerminalNode TO() { return getToken(SenizParser.TO, 0); }
		public PropConditionalExpressionContext(PropositionExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterPropConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitPropConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitPropConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PropExpressionContext extends PropositionExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PropExpressionContext(PropositionExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterPropExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitPropExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitPropExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesesPropExpressionContext extends PropositionExpressionContext {
		public PropositionExpressionContext inner;
		public TerminalNode LPAREN() { return getToken(SenizParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SenizParser.RPAREN, 0); }
		public PropositionExpressionContext propositionExpression() {
			return getRuleContext(PropositionExpressionContext.class,0);
		}
		public ParenthesesPropExpressionContext(PropositionExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterParenthesesPropExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitParenthesesPropExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitParenthesesPropExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PropPrimaryExpressionContext extends PropositionExpressionContext {
		public PropositionPrimaryContext propositionPrimary() {
			return getRuleContext(PropositionPrimaryContext.class,0);
		}
		public PropPrimaryExpressionContext(PropositionExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterPropPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitPropPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitPropPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropositionExpressionContext propositionExpression() throws RecognitionException {
		return propositionExpression(0);
	}

	private PropositionExpressionContext propositionExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PropositionExpressionContext _localctx = new PropositionExpressionContext(_ctx, _parentState);
		PropositionExpressionContext _prevctx = _localctx;
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_propositionExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesesPropExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(416);
				match(LPAREN);
				setState(417);
				((ParenthesesPropExpressionContext)_localctx).inner = propositionExpression(0);
				setState(418);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new PropPrimaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(420);
				propositionPrimary();
				}
				break;
			case 3:
				{
				_localctx = new PropExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(421);
				expression(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(429);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PropConditionalExpressionContext(new PropositionExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_propositionExpression);
					setState(424);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(425);
					((PropConditionalExpressionContext)_localctx).bop = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TO) | (1L << LAND) | (1L << LOR))) != 0)) ) {
						((PropConditionalExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(426);
					propositionExpression(2);
					}
					} 
				}
				setState(431);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PropositionPrimaryContext extends ParserRuleContext {
		public PropositionIdentiferContext propositionIdentifer() {
			return getRuleContext(PropositionIdentiferContext.class,0);
		}
		public SystemIdentifierContext systemIdentifier() {
			return getRuleContext(SystemIdentifierContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SenizParser.DOT, 0); }
		public PropositionPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propositionPrimary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterPropositionPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitPropositionPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitPropositionPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropositionPrimaryContext propositionPrimary() throws RecognitionException {
		PropositionPrimaryContext _localctx = new PropositionPrimaryContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_propositionPrimary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(432);
				systemIdentifier();
				setState(433);
				match(DOT);
				}
				break;
			}
			setState(437);
			propositionIdentifer();
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

	public static class PropositionIdentiferContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SenizParser.IDENTIFIER, 0); }
		public PropositionIdentiferContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propositionIdentifer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterPropositionIdentifer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitPropositionIdentifer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitPropositionIdentifer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropositionIdentiferContext propositionIdentifer() throws RecognitionException {
		PropositionIdentiferContext _localctx = new PropositionIdentiferContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_propositionIdentifer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
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

	public static class LtlStatementContext extends ParserRuleContext {
		public TerminalNode LTL() { return getToken(SenizParser.LTL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SenizParser.IDENTIFIER, 0); }
		public LtlBodyContext ltlBody() {
			return getRuleContext(LtlBodyContext.class,0);
		}
		public LtlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ltlStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterLtlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitLtlStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitLtlStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LtlStatementContext ltlStatement() throws RecognitionException {
		LtlStatementContext _localctx = new LtlStatementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_ltlStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(LTL);
			setState(442);
			match(IDENTIFIER);
			setState(443);
			ltlBody();
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

	public static class LtlBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(SenizParser.LBRACE, 0); }
		public LtlExpressionContext ltlExpression() {
			return getRuleContext(LtlExpressionContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SenizParser.RBRACE, 0); }
		public LtlBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ltlBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterLtlBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitLtlBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitLtlBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LtlBodyContext ltlBody() throws RecognitionException {
		LtlBodyContext _localctx = new LtlBodyContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_ltlBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(LBRACE);
			setState(446);
			ltlExpression(0);
			setState(447);
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

	public static class LtlExpressionContext extends ParserRuleContext {
		public LtlExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ltlExpression; }
	 
		public LtlExpressionContext() { }
		public void copyFrom(LtlExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LtlNotExpressionContext extends LtlExpressionContext {
		public Token prefix;
		public LtlExpressionContext ltlExpression() {
			return getRuleContext(LtlExpressionContext.class,0);
		}
		public TerminalNode BANG() { return getToken(SenizParser.BANG, 0); }
		public LtlNotExpressionContext(LtlExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterLtlNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitLtlNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitLtlNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LtlConditionalAndExpressionContext extends LtlExpressionContext {
		public Token bop;
		public List<LtlExpressionContext> ltlExpression() {
			return getRuleContexts(LtlExpressionContext.class);
		}
		public LtlExpressionContext ltlExpression(int i) {
			return getRuleContext(LtlExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(SenizParser.AND, 0); }
		public LtlConditionalAndExpressionContext(LtlExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterLtlConditionalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitLtlConditionalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitLtlConditionalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LtlPrimaryExpressionContext extends LtlExpressionContext {
		public LtlPrimaryContext ltlPrimary() {
			return getRuleContext(LtlPrimaryContext.class,0);
		}
		public LtlPrimaryExpressionContext(LtlExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterLtlPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitLtlPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitLtlPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlwaysExpressionContext extends LtlExpressionContext {
		public Token prefix;
		public LtlExpressionContext ltlExpression() {
			return getRuleContext(LtlExpressionContext.class,0);
		}
		public TerminalNode ALWAYS() { return getToken(SenizParser.ALWAYS, 0); }
		public AlwaysExpressionContext(LtlExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterAlwaysExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitAlwaysExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitAlwaysExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LtlConditionalOrExpressionContext extends LtlExpressionContext {
		public Token bop;
		public List<LtlExpressionContext> ltlExpression() {
			return getRuleContexts(LtlExpressionContext.class);
		}
		public LtlExpressionContext ltlExpression(int i) {
			return getRuleContext(LtlExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(SenizParser.OR, 0); }
		public LtlConditionalOrExpressionContext(LtlExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterLtlConditionalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitLtlConditionalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitLtlConditionalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NextExpressionContext extends LtlExpressionContext {
		public Token prefix;
		public LtlExpressionContext ltlExpression() {
			return getRuleContext(LtlExpressionContext.class,0);
		}
		public TerminalNode NEXT() { return getToken(SenizParser.NEXT, 0); }
		public NextExpressionContext(LtlExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterNextExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitNextExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitNextExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LtlConditionalImplyExpressionContext extends LtlExpressionContext {
		public Token bop;
		public List<LtlExpressionContext> ltlExpression() {
			return getRuleContexts(LtlExpressionContext.class);
		}
		public LtlExpressionContext ltlExpression(int i) {
			return getRuleContext(LtlExpressionContext.class,i);
		}
		public TerminalNode TO() { return getToken(SenizParser.TO, 0); }
		public LtlConditionalImplyExpressionContext(LtlExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterLtlConditionalImplyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitLtlConditionalImplyExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitLtlConditionalImplyExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EventuallyExpressionContext extends LtlExpressionContext {
		public Token prefix;
		public LtlExpressionContext ltlExpression() {
			return getRuleContext(LtlExpressionContext.class,0);
		}
		public TerminalNode EVENTUALLY() { return getToken(SenizParser.EVENTUALLY, 0); }
		public EventuallyExpressionContext(LtlExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterEventuallyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitEventuallyExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitEventuallyExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UntilExpressionContext extends LtlExpressionContext {
		public Token bop;
		public List<LtlExpressionContext> ltlExpression() {
			return getRuleContexts(LtlExpressionContext.class);
		}
		public LtlExpressionContext ltlExpression(int i) {
			return getRuleContext(LtlExpressionContext.class,i);
		}
		public TerminalNode UNTIL() { return getToken(SenizParser.UNTIL, 0); }
		public UntilExpressionContext(LtlExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterUntilExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitUntilExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitUntilExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LtlExpressionContext ltlExpression() throws RecognitionException {
		return ltlExpression(0);
	}

	private LtlExpressionContext ltlExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LtlExpressionContext _localctx = new LtlExpressionContext(_ctx, _parentState);
		LtlExpressionContext _prevctx = _localctx;
		int _startState = 90;
		enterRecursionRule(_localctx, 90, RULE_ltlExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
			case IDENTIFIER:
				{
				_localctx = new LtlPrimaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(450);
				ltlPrimary();
				}
				break;
			case BANG:
				{
				_localctx = new LtlNotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(451);
				((LtlNotExpressionContext)_localctx).prefix = match(BANG);
				setState(452);
				ltlExpression(8);
				}
				break;
			case ALWAYS:
				{
				_localctx = new AlwaysExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(453);
				((AlwaysExpressionContext)_localctx).prefix = match(ALWAYS);
				setState(454);
				ltlExpression(3);
				}
				break;
			case EVENTUALLY:
				{
				_localctx = new EventuallyExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(455);
				((EventuallyExpressionContext)_localctx).prefix = match(EVENTUALLY);
				setState(456);
				ltlExpression(2);
				}
				break;
			case NEXT:
				{
				_localctx = new NextExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(457);
				((NextExpressionContext)_localctx).prefix = match(NEXT);
				setState(458);
				ltlExpression(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(475);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(473);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
					case 1:
						{
						_localctx = new LtlConditionalAndExpressionContext(new LtlExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_ltlExpression);
						setState(461);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(462);
						((LtlConditionalAndExpressionContext)_localctx).bop = match(AND);
						setState(463);
						ltlExpression(8);
						}
						break;
					case 2:
						{
						_localctx = new LtlConditionalOrExpressionContext(new LtlExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_ltlExpression);
						setState(464);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(465);
						((LtlConditionalOrExpressionContext)_localctx).bop = match(OR);
						setState(466);
						ltlExpression(7);
						}
						break;
					case 3:
						{
						_localctx = new LtlConditionalImplyExpressionContext(new LtlExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_ltlExpression);
						setState(467);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(468);
						((LtlConditionalImplyExpressionContext)_localctx).bop = match(TO);
						setState(469);
						ltlExpression(6);
						}
						break;
					case 4:
						{
						_localctx = new UntilExpressionContext(new LtlExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_ltlExpression);
						setState(470);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(471);
						((UntilExpressionContext)_localctx).bop = match(UNTIL);
						setState(472);
						ltlExpression(5);
						}
						break;
					}
					} 
				}
				setState(477);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LtlPrimaryContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(SenizParser.LPAREN, 0); }
		public LtlExpressionContext ltlExpression() {
			return getRuleContext(LtlExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SenizParser.RPAREN, 0); }
		public PropositionIdentiferContext propositionIdentifer() {
			return getRuleContext(PropositionIdentiferContext.class,0);
		}
		public LtlPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ltlPrimary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterLtlPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitLtlPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitLtlPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LtlPrimaryContext ltlPrimary() throws RecognitionException {
		LtlPrimaryContext _localctx = new LtlPrimaryContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_ltlPrimary);
		try {
			setState(483);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(478);
				match(LPAREN);
				setState(479);
				ltlExpression(0);
				setState(480);
				match(RPAREN);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(482);
				propositionIdentifer();
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

	public static class VarSetDeclarationContext extends ParserRuleContext {
		public VarSetHeaderContext varSetHeader() {
			return getRuleContext(VarSetHeaderContext.class,0);
		}
		public VarSetBodyContext varSetBody() {
			return getRuleContext(VarSetBodyContext.class,0);
		}
		public VarSetDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varSetDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterVarSetDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitVarSetDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitVarSetDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarSetDeclarationContext varSetDeclaration() throws RecognitionException {
		VarSetDeclarationContext _localctx = new VarSetDeclarationContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_varSetDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			varSetHeader();
			setState(486);
			varSetBody();
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

	public static class VarSetHeaderContext extends ParserRuleContext {
		public TerminalNode VARSET() { return getToken(SenizParser.VARSET, 0); }
		public VarSetIdentifierContext varSetIdentifier() {
			return getRuleContext(VarSetIdentifierContext.class,0);
		}
		public VarSetHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varSetHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterVarSetHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitVarSetHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitVarSetHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarSetHeaderContext varSetHeader() throws RecognitionException {
		VarSetHeaderContext _localctx = new VarSetHeaderContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_varSetHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			match(VARSET);
			setState(489);
			varSetIdentifier();
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

	public static class VarSetBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(SenizParser.LBRACE, 0); }
		public VarSetDeclaratorContext varSetDeclarator() {
			return getRuleContext(VarSetDeclaratorContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SenizParser.RBRACE, 0); }
		public VarSetBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varSetBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterVarSetBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitVarSetBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitVarSetBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarSetBodyContext varSetBody() throws RecognitionException {
		VarSetBodyContext _localctx = new VarSetBodyContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_varSetBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			match(LBRACE);
			setState(492);
			varSetDeclarator();
			setState(493);
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

	public static class VarSetDeclaratorContext extends ParserRuleContext {
		public List<VarTypeDeclarationContext> varTypeDeclaration() {
			return getRuleContexts(VarTypeDeclarationContext.class);
		}
		public VarTypeDeclarationContext varTypeDeclaration(int i) {
			return getRuleContext(VarTypeDeclarationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SenizParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SenizParser.COMMA, i);
		}
		public VarSetDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varSetDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterVarSetDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitVarSetDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitVarSetDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarSetDeclaratorContext varSetDeclarator() throws RecognitionException {
		VarSetDeclaratorContext _localctx = new VarSetDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_varSetDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			varTypeDeclaration();
			setState(500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(496);
				match(COMMA);
				setState(497);
				varTypeDeclaration();
				}
				}
				setState(502);
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

	public static class VarTypeDeclarationContext extends ParserRuleContext {
		public Token bop;
		public VarIdentifierContext varIdentifier() {
			return getRuleContext(VarIdentifierContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode TYPEOF() { return getToken(SenizParser.TYPEOF, 0); }
		public VarTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterVarTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitVarTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitVarTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarTypeDeclarationContext varTypeDeclaration() throws RecognitionException {
		VarTypeDeclarationContext _localctx = new VarTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_varTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			varIdentifier();
			setState(504);
			((VarTypeDeclarationContext)_localctx).bop = match(TYPEOF);
			setState(505);
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

	public static class VarSetIdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SenizParser.IDENTIFIER, 0); }
		public VarSetIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varSetIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterVarSetIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitVarSetIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitVarSetIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarSetIdentifierContext varSetIdentifier() throws RecognitionException {
		VarSetIdentifierContext _localctx = new VarSetIdentifierContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_varSetIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
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

	public static class VarIdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SenizParser.IDENTIFIER, 0); }
		public VarIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterVarIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitVarIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitVarIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarIdentifierContext varIdentifier() throws RecognitionException {
		VarIdentifierContext _localctx = new VarIdentifierContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_varIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
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

	public static class ChanSetDeclarationContext extends ParserRuleContext {
		public ChanSetHeaderContext chanSetHeader() {
			return getRuleContext(ChanSetHeaderContext.class,0);
		}
		public ChanSetBodyContext chanSetBody() {
			return getRuleContext(ChanSetBodyContext.class,0);
		}
		public ChanSetDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chanSetDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterChanSetDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitChanSetDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitChanSetDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChanSetDeclarationContext chanSetDeclaration() throws RecognitionException {
		ChanSetDeclarationContext _localctx = new ChanSetDeclarationContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_chanSetDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			chanSetHeader();
			setState(512);
			chanSetBody();
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

	public static class ChanSetHeaderContext extends ParserRuleContext {
		public TerminalNode CHANSET() { return getToken(SenizParser.CHANSET, 0); }
		public ChanSetIdentiferContext chanSetIdentifer() {
			return getRuleContext(ChanSetIdentiferContext.class,0);
		}
		public ChanSetHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chanSetHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterChanSetHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitChanSetHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitChanSetHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChanSetHeaderContext chanSetHeader() throws RecognitionException {
		ChanSetHeaderContext _localctx = new ChanSetHeaderContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_chanSetHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			match(CHANSET);
			setState(515);
			chanSetIdentifer();
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

	public static class ChanSetBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(SenizParser.LBRACE, 0); }
		public ChanSetDeclaratorContext chanSetDeclarator() {
			return getRuleContext(ChanSetDeclaratorContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SenizParser.RBRACE, 0); }
		public ChanSetBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chanSetBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterChanSetBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitChanSetBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitChanSetBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChanSetBodyContext chanSetBody() throws RecognitionException {
		ChanSetBodyContext _localctx = new ChanSetBodyContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_chanSetBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			match(LBRACE);
			setState(518);
			chanSetDeclarator();
			setState(519);
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

	public static class ChanSetDeclaratorContext extends ParserRuleContext {
		public List<ChanTypeDeclarationContext> chanTypeDeclaration() {
			return getRuleContexts(ChanTypeDeclarationContext.class);
		}
		public ChanTypeDeclarationContext chanTypeDeclaration(int i) {
			return getRuleContext(ChanTypeDeclarationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SenizParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SenizParser.COMMA, i);
		}
		public ChanSetDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chanSetDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterChanSetDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitChanSetDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitChanSetDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChanSetDeclaratorContext chanSetDeclarator() throws RecognitionException {
		ChanSetDeclaratorContext _localctx = new ChanSetDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_chanSetDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			chanTypeDeclaration();
			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(522);
				match(COMMA);
				setState(523);
				chanTypeDeclaration();
				}
				}
				setState(528);
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

	public static class ChanTypeDeclarationContext extends ParserRuleContext {
		public Token bop;
		public ChanIdentifierContext chanIdentifier() {
			return getRuleContext(ChanIdentifierContext.class,0);
		}
		public ChanTypeContext chanType() {
			return getRuleContext(ChanTypeContext.class,0);
		}
		public TerminalNode TYPEOF() { return getToken(SenizParser.TYPEOF, 0); }
		public ChanTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chanTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterChanTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitChanTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitChanTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChanTypeDeclarationContext chanTypeDeclaration() throws RecognitionException {
		ChanTypeDeclarationContext _localctx = new ChanTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_chanTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			chanIdentifier();
			setState(530);
			((ChanTypeDeclarationContext)_localctx).bop = match(TYPEOF);
			setState(531);
			chanType();
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

	public static class ChanExpressionContext extends ParserRuleContext {
		public ChanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chanExpression; }
	 
		public ChanExpressionContext() { }
		public void copyFrom(ChanExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReceivingExpressionContext extends ChanExpressionContext {
		public ChanIdentifierContext chanIdentifier() {
			return getRuleContext(ChanIdentifierContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(SenizParser.QUESTION, 0); }
		public VariableIdentifierContext variableIdentifier() {
			return getRuleContext(VariableIdentifierContext.class,0);
		}
		public ReceivingExpressionContext(ChanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterReceivingExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitReceivingExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitReceivingExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SendingExpressionContext extends ChanExpressionContext {
		public ChanIdentifierContext chanIdentifier() {
			return getRuleContext(ChanIdentifierContext.class,0);
		}
		public TerminalNode BANG() { return getToken(SenizParser.BANG, 0); }
		public VariableIdentifierContext variableIdentifier() {
			return getRuleContext(VariableIdentifierContext.class,0);
		}
		public SendingExpressionContext(ChanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterSendingExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitSendingExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitSendingExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChanExpressionContext chanExpression() throws RecognitionException {
		ChanExpressionContext _localctx = new ChanExpressionContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_chanExpression);
		try {
			setState(541);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				_localctx = new SendingExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(533);
				chanIdentifier();
				setState(534);
				match(BANG);
				setState(535);
				variableIdentifier();
				}
				break;
			case 2:
				_localctx = new ReceivingExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(537);
				chanIdentifier();
				setState(538);
				match(QUESTION);
				setState(539);
				variableIdentifier();
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

	public static class ChanTypeContext extends ParserRuleContext {
		public TerminalNode INTERNAL() { return getToken(SenizParser.INTERNAL, 0); }
		public TerminalNode EXTERNAL() { return getToken(SenizParser.EXTERNAL, 0); }
		public ChanTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chanType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterChanType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitChanType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitChanType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChanTypeContext chanType() throws RecognitionException {
		ChanTypeContext _localctx = new ChanTypeContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_chanType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			_la = _input.LA(1);
			if ( !(_la==INTERNAL || _la==EXTERNAL) ) {
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

	public static class ChanSetIdentiferContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SenizParser.IDENTIFIER, 0); }
		public ChanSetIdentiferContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chanSetIdentifer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterChanSetIdentifer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitChanSetIdentifer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitChanSetIdentifer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChanSetIdentiferContext chanSetIdentifer() throws RecognitionException {
		ChanSetIdentiferContext _localctx = new ChanSetIdentiferContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_chanSetIdentifer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
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

	public static class ChanIdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SenizParser.IDENTIFIER, 0); }
		public ChanIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chanIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterChanIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitChanIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitChanIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChanIdentifierContext chanIdentifier() throws RecognitionException {
		ChanIdentifierContext _localctx = new ChanIdentifierContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_chanIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
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
		enterRule(_localctx, 126, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
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
		enterRule(_localctx, 128, RULE_literal);
		try {
			setState(555);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case SUB:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(551);
				numberLiteral();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(552);
				stringLiteral();
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(553);
				booleanLiteral();
				}
				break;
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(554);
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
		public TerminalNode ADD() { return getToken(SenizParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(SenizParser.SUB, 0); }
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
		enterRule(_localctx, 130, RULE_numberLiteral);
		int _la;
		try {
			setState(565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(558);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ADD || _la==SUB) {
					{
					setState(557);
					((NumberLiteralContext)_localctx).prefix = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==ADD || _la==SUB) ) {
						((NumberLiteralContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(560);
				integerLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(562);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ADD || _la==SUB) {
					{
					setState(561);
					((NumberLiteralContext)_localctx).prefix = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==ADD || _la==SUB) ) {
						((NumberLiteralContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(564);
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
		enterRule(_localctx, 132, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
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
		enterRule(_localctx, 134, RULE_booleanLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
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
		enterRule(_localctx, 136, RULE_otherLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
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
		enterRule(_localctx, 138, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
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
		enterRule(_localctx, 140, RULE_floatLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
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
		enterRule(_localctx, 142, RULE_qualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			match(IDENTIFIER);
			setState(582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(578);
				match(DOT);
				setState(579);
				match(IDENTIFIER);
				}
				}
				setState(584);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 24:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 40:
			return propositionExpression_sempred((PropositionExpressionContext)_localctx, predIndex);
		case 45:
			return ltlExpression_sempred((LtlExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean propositionExpression_sempred(PropositionExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean ltlExpression_sempred(LtlExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3H\u024c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\3\2\7\2\u0094\n\2\f\2\16\2\u0097\13\2\3\2\5\2\u009a\n\2\3\2\5\2\u009d"+
		"\n\2\3\2\5\2\u00a0\n\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\5\5\u00af\n\5\3\5\3\5\5\5\u00b3\n\5\3\6\5\6\u00b6\n\6\3\6\5\6\u00b9"+
		"\n\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\5\t\u00c3\n\t\3\t\3\t\5\t\u00c7\n"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00d0\n\n\f\n\16\n\u00d3\13\n\3\n\5"+
		"\n\u00d6\n\n\3\13\3\13\3\13\3\13\5\13\u00dc\n\13\3\f\3\f\5\f\u00e0\n\f"+
		"\3\f\7\f\u00e3\n\f\f\f\16\f\u00e6\13\f\5\f\u00e8\n\f\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\5\16\u00f0\n\16\3\17\3\17\5\17\u00f4\n\17\3\20\3\20\3\20\3\20"+
		"\7\20\u00fa\n\20\f\20\16\20\u00fd\13\20\3\21\3\21\3\21\3\21\7\21\u0103"+
		"\n\21\f\21\16\21\u0106\13\21\3\22\3\22\3\22\5\22\u010b\n\22\3\22\3\22"+
		"\3\22\5\22\u0110\n\22\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\7\26\u011f\n\26\f\26\16\26\u0122\13\26\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\5\30\u012a\n\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\5\32\u0138\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\7\32\u0146\n\32\f\32\16\32\u0149\13\32\3\33"+
		"\3\33\5\33\u014d\n\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\5\36\u0159\n\36\3\37\5\37\u015c\n\37\3\37\3\37\7\37\u0160\n\37\f\37\16"+
		"\37\u0163\13\37\3 \3 \3!\5!\u0168\n!\3!\3!\5!\u016c\n!\3!\5!\u016f\n!"+
		"\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\5#\u017a\n#\3#\3#\3$\3$\3$\7$\u0181\n"+
		"$\f$\16$\u0184\13$\3%\3%\3%\3%\3&\3&\3&\7&\u018d\n&\f&\16&\u0190\13&\3"+
		"\'\3\'\3\'\7\'\u0195\n\'\f\'\16\'\u0198\13\'\3(\3(\3(\3(\3)\3)\3)\3)\3"+
		"*\3*\3*\3*\3*\3*\3*\5*\u01a9\n*\3*\3*\3*\7*\u01ae\n*\f*\16*\u01b1\13*"+
		"\3+\3+\3+\5+\u01b6\n+\3+\3+\3,\3,\3-\3-\3-\3-\3.\3.\3.\3.\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\3/\3/\5/\u01ce\n/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\7/"+
		"\u01dc\n/\f/\16/\u01df\13/\3\60\3\60\3\60\3\60\3\60\5\60\u01e6\n\60\3"+
		"\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\64\3\64\3\64\7\64\u01f5"+
		"\n\64\f\64\16\64\u01f8\13\64\3\65\3\65\3\65\3\65\3\66\3\66\3\67\3\67\3"+
		"8\38\38\39\39\39\3:\3:\3:\3:\3;\3;\3;\7;\u020f\n;\f;\16;\u0212\13;\3<"+
		"\3<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3=\5=\u0220\n=\3>\3>\3?\3?\3@\3@\3A\3A"+
		"\3B\3B\3B\3B\5B\u022e\nB\3C\5C\u0231\nC\3C\3C\5C\u0235\nC\3C\5C\u0238"+
		"\nC\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3I\7I\u0247\nI\fI\16I\u024a\13"+
		"I\3I\2\5\62R\\J\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\2\13\3\2()\3\2*-\4\2\33\34 #\3\2$%\4\2\32\32"+
		"&\'\3\2\26\27\3\2\22\25\3\2\64\67\3\289\2\u0246\2\u0095\3\2\2\2\4\u00a3"+
		"\3\2\2\2\6\u00a6\3\2\2\2\b\u00a9\3\2\2\2\n\u00b5\3\2\2\2\f\u00ba\3\2\2"+
		"\2\16\u00bc\3\2\2\2\20\u00be\3\2\2\2\22\u00d5\3\2\2\2\24\u00db\3\2\2\2"+
		"\26\u00e7\3\2\2\2\30\u00e9\3\2\2\2\32\u00ef\3\2\2\2\34\u00f3\3\2\2\2\36"+
		"\u00f5\3\2\2\2 \u00fe\3\2\2\2\"\u0107\3\2\2\2$\u0111\3\2\2\2&\u0113\3"+
		"\2\2\2(\u0117\3\2\2\2*\u011b\3\2\2\2,\u0123\3\2\2\2.\u0129\3\2\2\2\60"+
		"\u012b\3\2\2\2\62\u0137\3\2\2\2\64\u014c\3\2\2\2\66\u014e\3\2\2\28\u0152"+
		"\3\2\2\2:\u0158\3\2\2\2<\u015b\3\2\2\2>\u0164\3\2\2\2@\u0167\3\2\2\2B"+
		"\u0172\3\2\2\2D\u0176\3\2\2\2F\u017d\3\2\2\2H\u0185\3\2\2\2J\u0189\3\2"+
		"\2\2L\u0191\3\2\2\2N\u0199\3\2\2\2P\u019d\3\2\2\2R\u01a8\3\2\2\2T\u01b5"+
		"\3\2\2\2V\u01b9\3\2\2\2X\u01bb\3\2\2\2Z\u01bf\3\2\2\2\\\u01cd\3\2\2\2"+
		"^\u01e5\3\2\2\2`\u01e7\3\2\2\2b\u01ea\3\2\2\2d\u01ed\3\2\2\2f\u01f1\3"+
		"\2\2\2h\u01f9\3\2\2\2j\u01fd\3\2\2\2l\u01ff\3\2\2\2n\u0201\3\2\2\2p\u0204"+
		"\3\2\2\2r\u0207\3\2\2\2t\u020b\3\2\2\2v\u0213\3\2\2\2x\u021f\3\2\2\2z"+
		"\u0221\3\2\2\2|\u0223\3\2\2\2~\u0225\3\2\2\2\u0080\u0227\3\2\2\2\u0082"+
		"\u022d\3\2\2\2\u0084\u0237\3\2\2\2\u0086\u0239\3\2\2\2\u0088\u023b\3\2"+
		"\2\2\u008a\u023d\3\2\2\2\u008c\u023f\3\2\2\2\u008e\u0241\3\2\2\2\u0090"+
		"\u0243\3\2\2\2\u0092\u0094\5\4\3\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2"+
		"\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0099\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0098\u009a\5\6\4\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2"+
		"\2\2\u009a\u009c\3\2\2\2\u009b\u009d\5`\61\2\u009c\u009b\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u00a0\5n8\2\u009f\u009e\3\2\2"+
		"\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\7\2\2\3\u00a2\3"+
		"\3\2\2\2\u00a3\u00a4\7\3\2\2\u00a4\u00a5\5\u0090I\2\u00a5\5\3\2\2\2\u00a6"+
		"\u00a7\5\b\5\2\u00a7\u00a8\5\22\n\2\u00a8\7\3\2\2\2\u00a9\u00aa\5\n\6"+
		"\2\u00aa\u00ab\7\6\2\2\u00ab\u00ac\5$\23\2\u00ac\u00ae\7<\2\2\u00ad\u00af"+
		"\5F$\2\u00ae\u00ad\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00b2\7=\2\2\u00b1\u00b3\5\20\t\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3\2"+
		"\2\2\u00b3\t\3\2\2\2\u00b4\u00b6\5\f\7\2\u00b5\u00b4\3\2\2\2\u00b5\u00b6"+
		"\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b9\5\16\b\2\u00b8\u00b7\3\2\2\2"+
		"\u00b8\u00b9\3\2\2\2\u00b9\13\3\2\2\2\u00ba\u00bb\7\4\2\2\u00bb\r\3\2"+
		"\2\2\u00bc\u00bd\7\5\2\2\u00bd\17\3\2\2\2\u00be\u00bf\7\t\2\2\u00bf\u00c2"+
		"\5j\66\2\u00c0\u00c1\7C\2\2\u00c1\u00c3\5|?\2\u00c2\u00c0\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c5\7\n\2\2\u00c5\u00c7\5j"+
		"\66\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\21\3\2\2\2\u00c8\u00c9"+
		"\7>\2\2\u00c9\u00ca\5\34\17\2\u00ca\u00cb\5\26\f\2\u00cb\u00cc\7?\2\2"+
		"\u00cc\u00d6\3\2\2\2\u00cd\u00d1\7>\2\2\u00ce\u00d0\5\24\13\2\u00cf\u00ce"+
		"\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\u00d4\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d6\7?\2\2\u00d5\u00c8\3\2"+
		"\2\2\u00d5\u00cd\3\2\2\2\u00d6\23\3\2\2\2\u00d7\u00dc\5&\24\2\u00d8\u00dc"+
		"\5\66\34\2\u00d9\u00dc\5<\37\2\u00da\u00dc\5\32\16\2\u00db\u00d7\3\2\2"+
		"\2\u00db\u00d8\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00da\3\2\2\2\u00dc\25"+
		"\3\2\2\2\u00dd\u00de\7.\2\2\u00de\u00e0\5\30\r\2\u00df\u00dd\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00e8\3\2\2\2\u00e1\u00e3\5\32\16\2\u00e2\u00e1\3"+
		"\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00df\3\2\2\2\u00e7\u00e4\3\2"+
		"\2\2\u00e8\27\3\2\2\2\u00e9\u00ea\7>\2\2\u00ea\u00eb\5*\26\2\u00eb\u00ec"+
		"\7?\2\2\u00ec\31\3\2\2\2\u00ed\u00f0\5N(\2\u00ee\u00f0\5X-\2\u00ef\u00ed"+
		"\3\2\2\2\u00ef\u00ee\3\2\2\2\u00f0\33\3\2\2\2\u00f1\u00f4\5\36\20\2\u00f2"+
		"\u00f4\5 \21\2\u00f3\u00f1\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f4\35\3\2\2"+
		"\2\u00f5\u00f6\7\r\2\2\u00f6\u00fb\5\"\22\2\u00f7\u00f8\7C\2\2\u00f8\u00fa"+
		"\5\"\22\2\u00f9\u00f7\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2"+
		"\u00fb\u00fc\3\2\2\2\u00fc\37\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u00ff"+
		"\7\16\2\2\u00ff\u0104\5\"\22\2\u0100\u0101\7C\2\2\u0101\u0103\5\"\22\2"+
		"\u0102\u0100\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105"+
		"\3\2\2\2\u0105!\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0108\5$\23\2\u0108"+
		"\u010a\7<\2\2\u0109\u010b\5L\'\2\u010a\u0109\3\2\2\2\u010a\u010b\3\2\2"+
		"\2\u010b\u010c\3\2\2\2\u010c\u010f\7=\2\2\u010d\u010e\7\f\2\2\u010e\u0110"+
		"\7E\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110#\3\2\2\2\u0111\u0112"+
		"\7E\2\2\u0112%\3\2\2\2\u0113\u0114\5\60\31\2\u0114\u0115\7 \2\2\u0115"+
		"\u0116\5(\25\2\u0116\'\3\2\2\2\u0117\u0118\7>\2\2\u0118\u0119\5*\26\2"+
		"\u0119\u011a\7?\2\2\u011a)\3\2\2\2\u011b\u0120\5,\27\2\u011c\u011d\7C"+
		"\2\2\u011d\u011f\5,\27\2\u011e\u011c\3\2\2\2\u011f\u0122\3\2\2\2\u0120"+
		"\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121+\3\2\2\2\u0122\u0120\3\2\2\2"+
		"\u0123\u0124\5l\67\2\u0124\u0125\7\30\2\2\u0125\u0126\5\62\32\2\u0126"+
		"-\3\2\2\2\u0127\u012a\5\60\31\2\u0128\u012a\5(\25\2\u0129\u0127\3\2\2"+
		"\2\u0129\u0128\3\2\2\2\u012a/\3\2\2\2\u012b\u012c\7E\2\2\u012c\61\3\2"+
		"\2\2\u012d\u012e\b\32\1\2\u012e\u012f\7<\2\2\u012f\u0130\5\62\32\2\u0130"+
		"\u0131\7=\2\2\u0131\u0138\3\2\2\2\u0132\u0138\5\64\33\2\u0133\u0134\t"+
		"\2\2\2\u0134\u0138\5\62\32\b\u0135\u0136\7\35\2\2\u0136\u0138\5\62\32"+
		"\7\u0137\u012d\3\2\2\2\u0137\u0132\3\2\2\2\u0137\u0133\3\2\2\2\u0137\u0135"+
		"\3\2\2\2\u0138\u0147\3\2\2\2\u0139\u013a\f\6\2\2\u013a\u013b\t\3\2\2\u013b"+
		"\u0146\5\62\32\7\u013c\u013d\f\5\2\2\u013d\u013e\t\2\2\2\u013e\u0146\5"+
		"\62\32\6\u013f\u0140\f\4\2\2\u0140\u0141\t\4\2\2\u0141\u0146\5\62\32\5"+
		"\u0142\u0143\f\3\2\2\u0143\u0144\t\5\2\2\u0144\u0146\5\62\32\4\u0145\u0139"+
		"\3\2\2\2\u0145\u013c\3\2\2\2\u0145\u013f\3\2\2\2\u0145\u0142\3\2\2\2\u0146"+
		"\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\63\3\2\2"+
		"\2\u0149\u0147\3\2\2\2\u014a\u014d\5\u0082B\2\u014b\u014d\5J&\2\u014c"+
		"\u014a\3\2\2\2\u014c\u014b\3\2\2\2\u014d\65\3\2\2\2\u014e\u014f\58\35"+
		"\2\u014f\u0150\7 \2\2\u0150\u0151\5\30\r\2\u0151\67\3\2\2\2\u0152\u0153"+
		"\7.\2\2\u0153\u0154\7E\2\2\u01549\3\2\2\2\u0155\u0159\58\35\2\u0156\u0157"+
		"\7.\2\2\u0157\u0159\5\30\r\2\u0158\u0155\3\2\2\2\u0158\u0156\3\2\2\2\u0159"+
		";\3\2\2\2\u015a\u015c\5> \2\u015b\u015a\3\2\2\2\u015b\u015c\3\2\2\2\u015c"+
		"\u015d\3\2\2\2\u015d\u0161\5.\30\2\u015e\u0160\5@!\2\u015f\u015e\3\2\2"+
		"\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162="+
		"\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0165\7\13\2\2\u0165?\3\2\2\2\u0166"+
		"\u0168\5B\"\2\u0167\u0166\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169\3\2"+
		"\2\2\u0169\u016b\7\32\2\2\u016a\u016c\5D#\2\u016b\u016a\3\2\2\2\u016b"+
		"\u016c\3\2\2\2\u016c\u016e\3\2\2\2\u016d\u016f\5:\36\2\u016e\u016d\3\2"+
		"\2\2\u016e\u016f\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\5.\30\2\u0171"+
		"A\3\2\2\2\u0172\u0173\7@\2\2\u0173\u0174\5R*\2\u0174\u0175\7A\2\2\u0175"+
		"C\3\2\2\2\u0176\u0177\7E\2\2\u0177\u0179\7<\2\2\u0178\u017a\5x=\2\u0179"+
		"\u0178\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017c\7="+
		"\2\2\u017cE\3\2\2\2\u017d\u0182\5H%\2\u017e\u017f\7C\2\2\u017f\u0181\5"+
		"H%\2\u0180\u017e\3\2\2\2\u0181\u0184\3\2\2\2\u0182\u0180\3\2\2\2\u0182"+
		"\u0183\3\2\2\2\u0183G\3\2\2\2\u0184\u0182\3\2\2\2\u0185\u0186\5J&\2\u0186"+
		"\u0187\7\31\2\2\u0187\u0188\5\u0080A\2\u0188I\3\2\2\2\u0189\u018e\7E\2"+
		"\2\u018a\u018b\7D\2\2\u018b\u018d\7E\2\2\u018c\u018a\3\2\2\2\u018d\u0190"+
		"\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018fK\3\2\2\2\u0190"+
		"\u018e\3\2\2\2\u0191\u0196\5\62\32\2\u0192\u0193\7C\2\2\u0193\u0195\5"+
		"\62\32\2\u0194\u0192\3\2\2\2\u0195\u0198\3\2\2\2\u0196\u0194\3\2\2\2\u0196"+
		"\u0197\3\2\2\2\u0197M\3\2\2\2\u0198\u0196\3\2\2\2\u0199\u019a\7\20\2\2"+
		"\u019a\u019b\5V,\2\u019b\u019c\5P)\2\u019cO\3\2\2\2\u019d\u019e\7>\2\2"+
		"\u019e\u019f\5R*\2\u019f\u01a0\7?\2\2\u01a0Q\3\2\2\2\u01a1\u01a2\b*\1"+
		"\2\u01a2\u01a3\7<\2\2\u01a3\u01a4\5R*\2\u01a4\u01a5\7=\2\2\u01a5\u01a9"+
		"\3\2\2\2\u01a6\u01a9\5T+\2\u01a7\u01a9\5\62\32\2\u01a8\u01a1\3\2\2\2\u01a8"+
		"\u01a6\3\2\2\2\u01a8\u01a7\3\2\2\2\u01a9\u01af\3\2\2\2\u01aa\u01ab\f\3"+
		"\2\2\u01ab\u01ac\t\6\2\2\u01ac\u01ae\5R*\4\u01ad\u01aa\3\2\2\2\u01ae\u01b1"+
		"\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0S\3\2\2\2\u01b1"+
		"\u01af\3\2\2\2\u01b2\u01b3\5$\23\2\u01b3\u01b4\7D\2\2\u01b4\u01b6\3\2"+
		"\2\2\u01b5\u01b2\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7"+
		"\u01b8\5V,\2\u01b8U\3\2\2\2\u01b9\u01ba\7E\2\2\u01baW\3\2\2\2\u01bb\u01bc"+
		"\7\21\2\2\u01bc\u01bd\7E\2\2\u01bd\u01be\5Z.\2\u01beY\3\2\2\2\u01bf\u01c0"+
		"\7>\2\2\u01c0\u01c1\5\\/\2\u01c1\u01c2\7?\2\2\u01c2[\3\2\2\2\u01c3\u01c4"+
		"\b/\1\2\u01c4\u01ce\5^\60\2\u01c5\u01c6\7\35\2\2\u01c6\u01ce\5\\/\n\u01c7"+
		"\u01c8\7/\2\2\u01c8\u01ce\5\\/\5\u01c9\u01ca\7\60\2\2\u01ca\u01ce\5\\"+
		"/\4\u01cb\u01cc\7\61\2\2\u01cc\u01ce\5\\/\3\u01cd\u01c3\3\2\2\2\u01cd"+
		"\u01c5\3\2\2\2\u01cd\u01c7\3\2\2\2\u01cd\u01c9\3\2\2\2\u01cd\u01cb\3\2"+
		"\2\2\u01ce\u01dd\3\2\2\2\u01cf\u01d0\f\t\2\2\u01d0\u01d1\7$\2\2\u01d1"+
		"\u01dc\5\\/\n\u01d2\u01d3\f\b\2\2\u01d3\u01d4\7%\2\2\u01d4\u01dc\5\\/"+
		"\t\u01d5\u01d6\f\7\2\2\u01d6\u01d7\7\32\2\2\u01d7\u01dc\5\\/\b\u01d8\u01d9"+
		"\f\6\2\2\u01d9\u01da\7\62\2\2\u01da\u01dc\5\\/\7\u01db\u01cf\3\2\2\2\u01db"+
		"\u01d2\3\2\2\2\u01db\u01d5\3\2\2\2\u01db\u01d8\3\2\2\2\u01dc\u01df\3\2"+
		"\2\2\u01dd\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01de]\3\2\2\2\u01df\u01dd"+
		"\3\2\2\2\u01e0\u01e1\7<\2\2\u01e1\u01e2\5\\/\2\u01e2\u01e3\7=\2\2\u01e3"+
		"\u01e6\3\2\2\2\u01e4\u01e6\5V,\2\u01e5\u01e0\3\2\2\2\u01e5\u01e4\3\2\2"+
		"\2\u01e6_\3\2\2\2\u01e7\u01e8\5b\62\2\u01e8\u01e9\5d\63\2\u01e9a\3\2\2"+
		"\2\u01ea\u01eb\7\7\2\2\u01eb\u01ec\5j\66\2\u01ecc\3\2\2\2\u01ed\u01ee"+
		"\7>\2\2\u01ee\u01ef\5f\64\2\u01ef\u01f0\7?\2\2\u01f0e\3\2\2\2\u01f1\u01f6"+
		"\5h\65\2\u01f2\u01f3\7C\2\2\u01f3\u01f5\5h\65\2\u01f4\u01f2\3\2\2\2\u01f5"+
		"\u01f8\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7g\3\2\2\2"+
		"\u01f8\u01f6\3\2\2\2\u01f9\u01fa\5l\67\2\u01fa\u01fb\7\31\2\2\u01fb\u01fc"+
		"\5\u0080A\2\u01fci\3\2\2\2\u01fd\u01fe\7E\2\2\u01fek\3\2\2\2\u01ff\u0200"+
		"\7E\2\2\u0200m\3\2\2\2\u0201\u0202\5p9\2\u0202\u0203\5r:\2\u0203o\3\2"+
		"\2\2\u0204\u0205\7\b\2\2\u0205\u0206\5|?\2\u0206q\3\2\2\2\u0207\u0208"+
		"\7>\2\2\u0208\u0209\5t;\2\u0209\u020a\7?\2\2\u020as\3\2\2\2\u020b\u0210"+
		"\5v<\2\u020c\u020d\7C\2\2\u020d\u020f\5v<\2\u020e\u020c\3\2\2\2\u020f"+
		"\u0212\3\2\2\2\u0210\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211u\3\2\2\2"+
		"\u0212\u0210\3\2\2\2\u0213\u0214\5~@\2\u0214\u0215\7\31\2\2\u0215\u0216"+
		"\5z>\2\u0216w\3\2\2\2\u0217\u0218\5~@\2\u0218\u0219\7\35\2\2\u0219\u021a"+
		"\5J&\2\u021a\u0220\3\2\2\2\u021b\u021c\5~@\2\u021c\u021d\7\37\2\2\u021d"+
		"\u021e\5J&\2\u021e\u0220\3\2\2\2\u021f\u0217\3\2\2\2\u021f\u021b\3\2\2"+
		"\2\u0220y\3\2\2\2\u0221\u0222\t\7\2\2\u0222{\3\2\2\2\u0223\u0224\7E\2"+
		"\2\u0224}\3\2\2\2\u0225\u0226\7E\2\2\u0226\177\3\2\2\2\u0227\u0228\t\b"+
		"\2\2\u0228\u0081\3\2\2\2\u0229\u022e\5\u0084C\2\u022a\u022e\5\u0086D\2"+
		"\u022b\u022e\5\u0088E\2\u022c\u022e\5\u008aF\2\u022d\u0229\3\2\2\2\u022d"+
		"\u022a\3\2\2\2\u022d\u022b\3\2\2\2\u022d\u022c\3\2\2\2\u022e\u0083\3\2"+
		"\2\2\u022f\u0231\t\2\2\2\u0230\u022f\3\2\2\2\u0230\u0231\3\2\2\2\u0231"+
		"\u0232\3\2\2\2\u0232\u0238\5\u008cG\2\u0233\u0235\t\2\2\2\u0234\u0233"+
		"\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0238\5\u008eH"+
		"\2\u0237\u0230\3\2\2\2\u0237\u0234\3\2\2\2\u0238\u0085\3\2\2\2\u0239\u023a"+
		"\7:\2\2\u023a\u0087\3\2\2\2\u023b\u023c\7\63\2\2\u023c\u0089\3\2\2\2\u023d"+
		"\u023e\7;\2\2\u023e\u008b\3\2\2\2\u023f\u0240\t\t\2\2\u0240\u008d\3\2"+
		"\2\2\u0241\u0242\t\n\2\2\u0242\u008f\3\2\2\2\u0243\u0248\7E\2\2\u0244"+
		"\u0245\7D\2\2\u0245\u0247\7E\2\2\u0246\u0244\3\2\2\2\u0247\u024a\3\2\2"+
		"\2\u0248\u0246\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u0091\3\2\2\2\u024a\u0248"+
		"\3\2\2\2\67\u0095\u0099\u009c\u009f\u00ae\u00b2\u00b5\u00b8\u00c2\u00c6"+
		"\u00d1\u00d5\u00db\u00df\u00e4\u00e7\u00ef\u00f3\u00fb\u0104\u010a\u010f"+
		"\u0120\u0129\u0137\u0145\u0147\u014c\u0158\u015b\u0161\u0167\u016b\u016e"+
		"\u0179\u0182\u018e\u0196\u01a8\u01af\u01b5\u01cd\u01db\u01dd\u01e5\u01f6"+
		"\u0210\u021f\u022d\u0230\u0234\u0237\u0248";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}