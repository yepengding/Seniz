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
		IMPORT=1, MAIN=2, CONTROL=3, SYSTEM=4, VARSET=5, CHANSET=6, OVER=7, INIT=8, 
		AS=9, SYNC=10, ASYNC=11, ARGS=12, PROP=13, LTL=14, BOOLEAN=15, INT=16, 
		FLOAT=17, STRING=18, INTERNAL=19, EXTERNAL=20, VALUEOF=21, TYPEOF=22, 
		TO=23, GT=24, LT=25, BANG=26, TILDE=27, QUESTION=28, EQ=29, LE=30, GE=31, 
		NEQ=32, AND=33, OR=34, LAND=35, LOR=36, ADD=37, SUB=38, MUL=39, DIV=40, 
		CARET=41, MOD=42, GLOBAL=43, ALWAYS=44, EVENTUALLY=45, NEXT=46, UNTIL=47, 
		BOOL_LITERAL=48, DECIMAL_LITERAL=49, HEX_LITERAL=50, OCT_LITERAL=51, BINARY_LITERAL=52, 
		FLOAT_LITERAL=53, HEX_FLOAT_LITERAL=54, STRING_LITERAL=55, NULL_LITERAL=56, 
		LPAREN=57, RPAREN=58, LBRACE=59, RBRACE=60, LBRACK=61, RBRACK=62, SEMI=63, 
		COMMA=64, DOT=65, IDENTIFIER=66, WS=67, COMMENT=68, LINE_COMMENT=69;
	public static final int
		RULE_compilationUnit = 0, RULE_importDeclaration = 1, RULE_systemDeclaration = 2, 
		RULE_systemHeader = 3, RULE_systemModifiers = 4, RULE_mainModifier = 5, 
		RULE_controlModifier = 6, RULE_systemParameter = 7, RULE_systemBody = 8, 
		RULE_systemBodyDeclaration = 9, RULE_controlSystemBodyDeclaration = 10, 
		RULE_controlVarStatement = 11, RULE_controlVarExpression = 12, RULE_logicStatement = 13, 
		RULE_controlStatement = 14, RULE_syncControlStatement = 15, RULE_asyncControlStatement = 16, 
		RULE_subSystemIdentifier = 17, RULE_systemIdentifier = 18, RULE_stateNaming = 19, 
		RULE_stateBody = 20, RULE_stateDeclarator = 21, RULE_stateExpression = 22, 
		RULE_stateIdentifier = 23, RULE_stateNameIdentifier = 24, RULE_expression = 25, 
		RULE_primary = 26, RULE_transitionStatement = 27, RULE_initIdentifier = 28, 
		RULE_transitionDeclaration = 29, RULE_guardIdentifier = 30, RULE_actionDeclaration = 31, 
		RULE_formalParameterList = 32, RULE_formalParameter = 33, RULE_variableIdentifier = 34, 
		RULE_parameterList = 35, RULE_propositionStatement = 36, RULE_propositionBody = 37, 
		RULE_propositionExpression = 38, RULE_propositionPrimary = 39, RULE_propositionIdentifer = 40, 
		RULE_ltlStatement = 41, RULE_ltlBody = 42, RULE_ltlExpression = 43, RULE_ltlPrimary = 44, 
		RULE_varSetDeclaration = 45, RULE_varSetHeader = 46, RULE_varSetBody = 47, 
		RULE_varSetDeclarator = 48, RULE_varTypeDeclaration = 49, RULE_varSetIdentifer = 50, 
		RULE_varIdentifier = 51, RULE_chanSetDeclaration = 52, RULE_chanSetHeader = 53, 
		RULE_chanSetBody = 54, RULE_chanSetDeclarator = 55, RULE_chanTypeDeclaration = 56, 
		RULE_chanExpression = 57, RULE_chanType = 58, RULE_chanSetIdentifer = 59, 
		RULE_chanIdentifier = 60, RULE_primitiveType = 61, RULE_literal = 62, 
		RULE_numberLiteral = 63, RULE_stringLiteral = 64, RULE_booleanLiteral = 65, 
		RULE_otherLiteral = 66, RULE_integerLiteral = 67, RULE_floatLiteral = 68, 
		RULE_qualifiedName = 69;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "importDeclaration", "systemDeclaration", "systemHeader", 
			"systemModifiers", "mainModifier", "controlModifier", "systemParameter", 
			"systemBody", "systemBodyDeclaration", "controlSystemBodyDeclaration", 
			"controlVarStatement", "controlVarExpression", "logicStatement", "controlStatement", 
			"syncControlStatement", "asyncControlStatement", "subSystemIdentifier", 
			"systemIdentifier", "stateNaming", "stateBody", "stateDeclarator", "stateExpression", 
			"stateIdentifier", "stateNameIdentifier", "expression", "primary", "transitionStatement", 
			"initIdentifier", "transitionDeclaration", "guardIdentifier", "actionDeclaration", 
			"formalParameterList", "formalParameter", "variableIdentifier", "parameterList", 
			"propositionStatement", "propositionBody", "propositionExpression", "propositionPrimary", 
			"propositionIdentifer", "ltlStatement", "ltlBody", "ltlExpression", "ltlPrimary", 
			"varSetDeclaration", "varSetHeader", "varSetBody", "varSetDeclarator", 
			"varTypeDeclaration", "varSetIdentifer", "varIdentifier", "chanSetDeclaration", 
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
			"'over'", "'init'", "'as'", "'sync'", "'async'", "'args'", "'prop'", 
			"'ltl'", "'bool'", "'int'", "'float'", "'string'", "'internal'", "'external'", 
			"':'", "'::'", "'->'", "'>'", "'<'", "'!'", "'~'", "'?'", "'='", "'<='", 
			"'>='", "'/='", "'&'", "'|'", "'and'", "'or'", "'+'", "'-'", "'*'", "'/'", 
			"'^'", "'%'", "'@'", "'G'", "'F'", "'X'", "'U'", null, null, null, null, 
			null, null, null, null, "'null'", "'('", "')'", "'{'", "'}'", "'['", 
			"']'", "';'", "','", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IMPORT", "MAIN", "CONTROL", "SYSTEM", "VARSET", "CHANSET", "OVER", 
			"INIT", "AS", "SYNC", "ASYNC", "ARGS", "PROP", "LTL", "BOOLEAN", "INT", 
			"FLOAT", "STRING", "INTERNAL", "EXTERNAL", "VALUEOF", "TYPEOF", "TO", 
			"GT", "LT", "BANG", "TILDE", "QUESTION", "EQ", "LE", "GE", "NEQ", "AND", 
			"OR", "LAND", "LOR", "ADD", "SUB", "MUL", "DIV", "CARET", "MOD", "GLOBAL", 
			"ALWAYS", "EVENTUALLY", "NEXT", "UNTIL", "BOOL_LITERAL", "DECIMAL_LITERAL", 
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
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(140);
				importDeclaration();
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAIN) | (1L << CONTROL) | (1L << SYSTEM))) != 0)) {
				{
				setState(146);
				systemDeclaration();
				}
			}

			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARSET) {
				{
				setState(149);
				varSetDeclaration();
				}
			}

			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHANSET) {
				{
				setState(152);
				chanSetDeclaration();
				}
			}

			setState(155);
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
			setState(157);
			match(IMPORT);
			setState(158);
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
			setState(160);
			systemHeader();
			setState(161);
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
			setState(163);
			systemModifiers();
			setState(164);
			match(SYSTEM);
			setState(165);
			systemIdentifier();
			setState(166);
			match(LPAREN);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(167);
				formalParameterList();
				}
			}

			setState(170);
			match(RPAREN);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OVER) {
				{
				setState(171);
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
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MAIN) {
				{
				setState(174);
				mainModifier();
				}
			}

			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONTROL) {
				{
				setState(177);
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
			setState(180);
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
			setState(182);
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
		public VarSetIdentiferContext varSetIdentifer() {
			return getRuleContext(VarSetIdentiferContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SenizParser.COMMA, 0); }
		public ChanSetIdentiferContext chanSetIdentifer() {
			return getRuleContext(ChanSetIdentiferContext.class,0);
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
		enterRule(_localctx, 14, RULE_systemParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(OVER);
			setState(185);
			varSetIdentifer();
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(186);
				match(COMMA);
				setState(187);
				chanSetIdentifer();
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
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				match(LBRACE);
				setState(191);
				controlStatement();
				setState(192);
				controlSystemBodyDeclaration();
				setState(193);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				match(LBRACE);
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (INIT - 8)) | (1L << (PROP - 8)) | (1L << (LTL - 8)) | (1L << (LBRACE - 8)) | (1L << (IDENTIFIER - 8)))) != 0)) {
					{
					{
					setState(196);
					systemBodyDeclaration();
					}
					}
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(202);
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
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				stateNaming();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				transitionStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(207);
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
		public ControlVarStatementContext controlVarStatement() {
			return getRuleContext(ControlVarStatementContext.class,0);
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
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL) {
					{
					setState(210);
					controlVarStatement();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PROP || _la==LTL) {
					{
					{
					setState(213);
					logicStatement();
					}
					}
					setState(218);
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

	public static class ControlVarStatementContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(SenizParser.GLOBAL, 0); }
		public TerminalNode LBRACE() { return getToken(SenizParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SenizParser.RBRACE, 0); }
		public List<ControlVarExpressionContext> controlVarExpression() {
			return getRuleContexts(ControlVarExpressionContext.class);
		}
		public ControlVarExpressionContext controlVarExpression(int i) {
			return getRuleContext(ControlVarExpressionContext.class,i);
		}
		public ControlVarStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlVarStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterControlVarStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitControlVarStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitControlVarStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ControlVarStatementContext controlVarStatement() throws RecognitionException {
		ControlVarStatementContext _localctx = new ControlVarStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_controlVarStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(GLOBAL);
			setState(222);
			match(LBRACE);
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(223);
				controlVarExpression();
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(229);
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

	public static class ControlVarExpressionContext extends ParserRuleContext {
		public Token bop;
		public VarIdentifierContext varIdentifier() {
			return getRuleContext(VarIdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode VALUEOF() { return getToken(SenizParser.VALUEOF, 0); }
		public ControlVarExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlVarExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterControlVarExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitControlVarExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitControlVarExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ControlVarExpressionContext controlVarExpression() throws RecognitionException {
		ControlVarExpressionContext _localctx = new ControlVarExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_controlVarExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			varIdentifier();
			setState(232);
			((ControlVarExpressionContext)_localctx).bop = match(VALUEOF);
			setState(233);
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
		enterRule(_localctx, 26, RULE_logicStatement);
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
		enterRule(_localctx, 28, RULE_controlStatement);
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
		enterRule(_localctx, 30, RULE_syncControlStatement);
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
		enterRule(_localctx, 32, RULE_asyncControlStatement);
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
		enterRule(_localctx, 34, RULE_subSystemIdentifier);
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
			if (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & ((1L << (BANG - 26)) | (1L << (ADD - 26)) | (1L << (SUB - 26)) | (1L << (BOOL_LITERAL - 26)) | (1L << (DECIMAL_LITERAL - 26)) | (1L << (HEX_LITERAL - 26)) | (1L << (OCT_LITERAL - 26)) | (1L << (BINARY_LITERAL - 26)) | (1L << (FLOAT_LITERAL - 26)) | (1L << (HEX_FLOAT_LITERAL - 26)) | (1L << (STRING_LITERAL - 26)) | (1L << (NULL_LITERAL - 26)) | (1L << (LPAREN - 26)) | (1L << (IDENTIFIER - 26)))) != 0)) {
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
		enterRule(_localctx, 36, RULE_systemIdentifier);
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
		enterRule(_localctx, 38, RULE_stateNaming);
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
		enterRule(_localctx, 40, RULE_stateBody);
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
		enterRule(_localctx, 42, RULE_stateDeclarator);
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
		enterRule(_localctx, 44, RULE_stateExpression);
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
		enterRule(_localctx, 46, RULE_stateIdentifier);
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
		enterRule(_localctx, 48, RULE_stateNameIdentifier);
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
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_expression, _p);
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
		enterRule(_localctx, 52, RULE_primary);
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
		enterRule(_localctx, 54, RULE_transitionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INIT) {
				{
				setState(332);
				initIdentifier();
				}
			}

			setState(335);
			stateIdentifier();
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TO || _la==LBRACK) {
				{
				{
				setState(336);
				transitionDeclaration();
				}
				}
				setState(341);
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
		enterRule(_localctx, 56, RULE_initIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
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
		public ControlVarStatementContext controlVarStatement() {
			return getRuleContext(ControlVarStatementContext.class,0);
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
		enterRule(_localctx, 58, RULE_transitionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(344);
				guardIdentifier();
				}
			}

			setState(347);
			match(TO);
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(348);
				actionDeclaration();
				}
				break;
			}
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GLOBAL) {
				{
				setState(351);
				controlVarStatement();
				}
			}

			setState(354);
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
		enterRule(_localctx, 60, RULE_guardIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(LBRACK);
			setState(357);
			propositionExpression(0);
			setState(358);
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
		enterRule(_localctx, 62, RULE_actionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(IDENTIFIER);
			setState(361);
			match(LPAREN);
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(362);
				chanExpression();
				}
			}

			setState(365);
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
		enterRule(_localctx, 64, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			formalParameter();
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(368);
				match(COMMA);
				setState(369);
				formalParameter();
				}
				}
				setState(374);
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
		enterRule(_localctx, 66, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			variableIdentifier();
			setState(376);
			((FormalParameterContext)_localctx).bop = match(TYPEOF);
			setState(377);
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
		enterRule(_localctx, 68, RULE_variableIdentifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(IDENTIFIER);
			setState(384);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(380);
					match(DOT);
					setState(381);
					match(IDENTIFIER);
					}
					} 
				}
				setState(386);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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
		enterRule(_localctx, 70, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			expression(0);
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(388);
				match(COMMA);
				setState(389);
				expression(0);
				}
				}
				setState(394);
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
		enterRule(_localctx, 72, RULE_propositionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(PROP);
			setState(396);
			propositionIdentifer();
			setState(397);
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
		enterRule(_localctx, 74, RULE_propositionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(LBRACE);
			setState(400);
			propositionExpression(0);
			setState(401);
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
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_propositionExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesesPropExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(404);
				match(LPAREN);
				setState(405);
				((ParenthesesPropExpressionContext)_localctx).inner = propositionExpression(0);
				setState(406);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new PropPrimaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(408);
				propositionPrimary();
				}
				break;
			case 3:
				{
				_localctx = new PropExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(409);
				expression(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(417);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PropConditionalExpressionContext(new PropositionExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_propositionExpression);
					setState(412);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(413);
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
					setState(414);
					propositionExpression(2);
					}
					} 
				}
				setState(419);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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
		enterRule(_localctx, 78, RULE_propositionPrimary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(420);
				systemIdentifier();
				setState(421);
				match(DOT);
				}
				break;
			}
			setState(425);
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
		enterRule(_localctx, 80, RULE_propositionIdentifer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
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
		enterRule(_localctx, 82, RULE_ltlStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(LTL);
			setState(430);
			match(IDENTIFIER);
			setState(431);
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
		enterRule(_localctx, 84, RULE_ltlBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(LBRACE);
			setState(434);
			ltlExpression(0);
			setState(435);
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
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_ltlExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
			case IDENTIFIER:
				{
				_localctx = new LtlPrimaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(438);
				ltlPrimary();
				}
				break;
			case BANG:
				{
				_localctx = new LtlNotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(439);
				((LtlNotExpressionContext)_localctx).prefix = match(BANG);
				setState(440);
				ltlExpression(8);
				}
				break;
			case ALWAYS:
				{
				_localctx = new AlwaysExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(441);
				((AlwaysExpressionContext)_localctx).prefix = match(ALWAYS);
				setState(442);
				ltlExpression(3);
				}
				break;
			case EVENTUALLY:
				{
				_localctx = new EventuallyExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(443);
				((EventuallyExpressionContext)_localctx).prefix = match(EVENTUALLY);
				setState(444);
				ltlExpression(2);
				}
				break;
			case NEXT:
				{
				_localctx = new NextExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(445);
				((NextExpressionContext)_localctx).prefix = match(NEXT);
				setState(446);
				ltlExpression(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(463);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(461);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
					case 1:
						{
						_localctx = new LtlConditionalAndExpressionContext(new LtlExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_ltlExpression);
						setState(449);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(450);
						((LtlConditionalAndExpressionContext)_localctx).bop = match(AND);
						setState(451);
						ltlExpression(8);
						}
						break;
					case 2:
						{
						_localctx = new LtlConditionalOrExpressionContext(new LtlExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_ltlExpression);
						setState(452);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(453);
						((LtlConditionalOrExpressionContext)_localctx).bop = match(OR);
						setState(454);
						ltlExpression(7);
						}
						break;
					case 3:
						{
						_localctx = new LtlConditionalImplyExpressionContext(new LtlExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_ltlExpression);
						setState(455);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(456);
						((LtlConditionalImplyExpressionContext)_localctx).bop = match(TO);
						setState(457);
						ltlExpression(6);
						}
						break;
					case 4:
						{
						_localctx = new UntilExpressionContext(new LtlExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_ltlExpression);
						setState(458);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(459);
						((UntilExpressionContext)_localctx).bop = match(UNTIL);
						setState(460);
						ltlExpression(5);
						}
						break;
					}
					} 
				}
				setState(465);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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
		enterRule(_localctx, 88, RULE_ltlPrimary);
		try {
			setState(471);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(466);
				match(LPAREN);
				setState(467);
				ltlExpression(0);
				setState(468);
				match(RPAREN);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(470);
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
		enterRule(_localctx, 90, RULE_varSetDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			varSetHeader();
			setState(474);
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
		public VarSetIdentiferContext varSetIdentifer() {
			return getRuleContext(VarSetIdentiferContext.class,0);
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
		enterRule(_localctx, 92, RULE_varSetHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			match(VARSET);
			setState(477);
			varSetIdentifer();
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
		enterRule(_localctx, 94, RULE_varSetBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			match(LBRACE);
			setState(480);
			varSetDeclarator();
			setState(481);
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
		enterRule(_localctx, 96, RULE_varSetDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			varTypeDeclaration();
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(484);
				match(COMMA);
				setState(485);
				varTypeDeclaration();
				}
				}
				setState(490);
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
		enterRule(_localctx, 98, RULE_varTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			varIdentifier();
			setState(492);
			((VarTypeDeclarationContext)_localctx).bop = match(TYPEOF);
			setState(493);
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

	public static class VarSetIdentiferContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SenizParser.IDENTIFIER, 0); }
		public VarSetIdentiferContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varSetIdentifer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterVarSetIdentifer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitVarSetIdentifer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitVarSetIdentifer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarSetIdentiferContext varSetIdentifer() throws RecognitionException {
		VarSetIdentiferContext _localctx = new VarSetIdentiferContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_varSetIdentifer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
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
		enterRule(_localctx, 102, RULE_varIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
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
		enterRule(_localctx, 104, RULE_chanSetDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			chanSetHeader();
			setState(500);
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
		enterRule(_localctx, 106, RULE_chanSetHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			match(CHANSET);
			setState(503);
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
		enterRule(_localctx, 108, RULE_chanSetBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(LBRACE);
			setState(506);
			chanSetDeclarator();
			setState(507);
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
		enterRule(_localctx, 110, RULE_chanSetDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			chanTypeDeclaration();
			setState(514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(510);
				match(COMMA);
				setState(511);
				chanTypeDeclaration();
				}
				}
				setState(516);
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
		enterRule(_localctx, 112, RULE_chanTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			chanIdentifier();
			setState(518);
			((ChanTypeDeclarationContext)_localctx).bop = match(TYPEOF);
			setState(519);
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
		enterRule(_localctx, 114, RULE_chanExpression);
		try {
			setState(529);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				_localctx = new SendingExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(521);
				chanIdentifier();
				setState(522);
				match(BANG);
				setState(523);
				variableIdentifier();
				}
				break;
			case 2:
				_localctx = new ReceivingExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(525);
				chanIdentifier();
				setState(526);
				match(QUESTION);
				setState(527);
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
		enterRule(_localctx, 116, RULE_chanType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
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
		enterRule(_localctx, 118, RULE_chanSetIdentifer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
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
		enterRule(_localctx, 120, RULE_chanIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
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
		enterRule(_localctx, 122, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
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
		enterRule(_localctx, 124, RULE_literal);
		try {
			setState(543);
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
				setState(539);
				numberLiteral();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(540);
				stringLiteral();
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(541);
				booleanLiteral();
				}
				break;
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(542);
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
		enterRule(_localctx, 126, RULE_numberLiteral);
		int _la;
		try {
			setState(553);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(546);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ADD || _la==SUB) {
					{
					setState(545);
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

				setState(548);
				integerLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(550);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ADD || _la==SUB) {
					{
					setState(549);
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

				setState(552);
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
		enterRule(_localctx, 128, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
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
		enterRule(_localctx, 130, RULE_booleanLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
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
		enterRule(_localctx, 132, RULE_otherLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
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
		enterRule(_localctx, 134, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
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
		enterRule(_localctx, 136, RULE_floatLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
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
		enterRule(_localctx, 138, RULE_qualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			match(IDENTIFIER);
			setState(570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(566);
				match(DOT);
				setState(567);
				match(IDENTIFIER);
				}
				}
				setState(572);
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
		case 25:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 38:
			return propositionExpression_sempred((PropositionExpressionContext)_localctx, predIndex);
		case 43:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3G\u0240\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\3\2\7\2\u0090"+
		"\n\2\f\2\16\2\u0093\13\2\3\2\5\2\u0096\n\2\3\2\5\2\u0099\n\2\3\2\5\2\u009c"+
		"\n\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5\u00ab\n\5"+
		"\3\5\3\5\5\5\u00af\n\5\3\6\5\6\u00b2\n\6\3\6\5\6\u00b5\n\6\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\5\t\u00bf\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00c8"+
		"\n\n\f\n\16\n\u00cb\13\n\3\n\5\n\u00ce\n\n\3\13\3\13\3\13\5\13\u00d3\n"+
		"\13\3\f\5\f\u00d6\n\f\3\f\7\f\u00d9\n\f\f\f\16\f\u00dc\13\f\5\f\u00de"+
		"\n\f\3\r\3\r\3\r\7\r\u00e3\n\r\f\r\16\r\u00e6\13\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\5\17\u00f0\n\17\3\20\3\20\5\20\u00f4\n\20\3\21\3\21"+
		"\3\21\3\21\7\21\u00fa\n\21\f\21\16\21\u00fd\13\21\3\22\3\22\3\22\3\22"+
		"\7\22\u0103\n\22\f\22\16\22\u0106\13\22\3\23\3\23\3\23\5\23\u010b\n\23"+
		"\3\23\3\23\3\23\5\23\u0110\n\23\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\7\27\u011f\n\27\f\27\16\27\u0122\13\27\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\5\31\u012a\n\31\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0138\n\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u0146\n\33\f\33\16\33\u0149\13"+
		"\33\3\34\3\34\5\34\u014d\n\34\3\35\5\35\u0150\n\35\3\35\3\35\7\35\u0154"+
		"\n\35\f\35\16\35\u0157\13\35\3\36\3\36\3\37\5\37\u015c\n\37\3\37\3\37"+
		"\5\37\u0160\n\37\3\37\5\37\u0163\n\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\5"+
		"!\u016e\n!\3!\3!\3\"\3\"\3\"\7\"\u0175\n\"\f\"\16\"\u0178\13\"\3#\3#\3"+
		"#\3#\3$\3$\3$\7$\u0181\n$\f$\16$\u0184\13$\3%\3%\3%\7%\u0189\n%\f%\16"+
		"%\u018c\13%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\5(\u019d"+
		"\n(\3(\3(\3(\7(\u01a2\n(\f(\16(\u01a5\13(\3)\3)\3)\5)\u01aa\n)\3)\3)\3"+
		"*\3*\3+\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u01c2\n"+
		"-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\7-\u01d0\n-\f-\16-\u01d3\13-\3."+
		"\3.\3.\3.\3.\5.\u01da\n.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3"+
		"\62\3\62\3\62\7\62\u01e9\n\62\f\62\16\62\u01ec\13\62\3\63\3\63\3\63\3"+
		"\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38\38\39\3"+
		"9\39\79\u0203\n9\f9\169\u0206\139\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3;"+
		"\5;\u0214\n;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3@\3@\5@\u0222\n@\3A\5A\u0225"+
		"\nA\3A\3A\5A\u0229\nA\3A\5A\u022c\nA\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G"+
		"\3G\3G\7G\u023b\nG\fG\16G\u023e\13G\3G\2\5\64NXH\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp"+
		"rtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\2\13\3\2\'(\3\2),\4"+
		"\2\32\33\37\"\3\2#$\4\2\31\31%&\3\2\25\26\3\2\21\24\3\2\63\66\3\2\678"+
		"\2\u023a\2\u0091\3\2\2\2\4\u009f\3\2\2\2\6\u00a2\3\2\2\2\b\u00a5\3\2\2"+
		"\2\n\u00b1\3\2\2\2\f\u00b6\3\2\2\2\16\u00b8\3\2\2\2\20\u00ba\3\2\2\2\22"+
		"\u00cd\3\2\2\2\24\u00d2\3\2\2\2\26\u00dd\3\2\2\2\30\u00df\3\2\2\2\32\u00e9"+
		"\3\2\2\2\34\u00ef\3\2\2\2\36\u00f3\3\2\2\2 \u00f5\3\2\2\2\"\u00fe\3\2"+
		"\2\2$\u0107\3\2\2\2&\u0111\3\2\2\2(\u0113\3\2\2\2*\u0117\3\2\2\2,\u011b"+
		"\3\2\2\2.\u0123\3\2\2\2\60\u0129\3\2\2\2\62\u012b\3\2\2\2\64\u0137\3\2"+
		"\2\2\66\u014c\3\2\2\28\u014f\3\2\2\2:\u0158\3\2\2\2<\u015b\3\2\2\2>\u0166"+
		"\3\2\2\2@\u016a\3\2\2\2B\u0171\3\2\2\2D\u0179\3\2\2\2F\u017d\3\2\2\2H"+
		"\u0185\3\2\2\2J\u018d\3\2\2\2L\u0191\3\2\2\2N\u019c\3\2\2\2P\u01a9\3\2"+
		"\2\2R\u01ad\3\2\2\2T\u01af\3\2\2\2V\u01b3\3\2\2\2X\u01c1\3\2\2\2Z\u01d9"+
		"\3\2\2\2\\\u01db\3\2\2\2^\u01de\3\2\2\2`\u01e1\3\2\2\2b\u01e5\3\2\2\2"+
		"d\u01ed\3\2\2\2f\u01f1\3\2\2\2h\u01f3\3\2\2\2j\u01f5\3\2\2\2l\u01f8\3"+
		"\2\2\2n\u01fb\3\2\2\2p\u01ff\3\2\2\2r\u0207\3\2\2\2t\u0213\3\2\2\2v\u0215"+
		"\3\2\2\2x\u0217\3\2\2\2z\u0219\3\2\2\2|\u021b\3\2\2\2~\u0221\3\2\2\2\u0080"+
		"\u022b\3\2\2\2\u0082\u022d\3\2\2\2\u0084\u022f\3\2\2\2\u0086\u0231\3\2"+
		"\2\2\u0088\u0233\3\2\2\2\u008a\u0235\3\2\2\2\u008c\u0237\3\2\2\2\u008e"+
		"\u0090\5\4\3\2\u008f\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2"+
		"\2\2\u0091\u0092\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0094"+
		"\u0096\5\6\4\2\u0095\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2"+
		"\2\2\u0097\u0099\5\\/\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u009b\3\2\2\2\u009a\u009c\5j\66\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2"+
		"\2\2\u009c\u009d\3\2\2\2\u009d\u009e\7\2\2\3\u009e\3\3\2\2\2\u009f\u00a0"+
		"\7\3\2\2\u00a0\u00a1\5\u008cG\2\u00a1\5\3\2\2\2\u00a2\u00a3\5\b\5\2\u00a3"+
		"\u00a4\5\22\n\2\u00a4\7\3\2\2\2\u00a5\u00a6\5\n\6\2\u00a6\u00a7\7\6\2"+
		"\2\u00a7\u00a8\5&\24\2\u00a8\u00aa\7;\2\2\u00a9\u00ab\5B\"\2\u00aa\u00a9"+
		"\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\7<\2\2\u00ad"+
		"\u00af\5\20\t\2\u00ae\u00ad\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\t\3\2\2"+
		"\2\u00b0\u00b2\5\f\7\2\u00b1\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4"+
		"\3\2\2\2\u00b3\u00b5\5\16\b\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5\3\2\2\2"+
		"\u00b5\13\3\2\2\2\u00b6\u00b7\7\4\2\2\u00b7\r\3\2\2\2\u00b8\u00b9\7\5"+
		"\2\2\u00b9\17\3\2\2\2\u00ba\u00bb\7\t\2\2\u00bb\u00be\5f\64\2\u00bc\u00bd"+
		"\7B\2\2\u00bd\u00bf\5x=\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"\21\3\2\2\2\u00c0\u00c1\7=\2\2\u00c1\u00c2\5\36\20\2\u00c2\u00c3\5\26"+
		"\f\2\u00c3\u00c4\7>\2\2\u00c4\u00ce\3\2\2\2\u00c5\u00c9\7=\2\2\u00c6\u00c8"+
		"\5\24\13\2\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2"+
		"\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00ce"+
		"\7>\2\2\u00cd\u00c0\3\2\2\2\u00cd\u00c5\3\2\2\2\u00ce\23\3\2\2\2\u00cf"+
		"\u00d3\5(\25\2\u00d0\u00d3\58\35\2\u00d1\u00d3\5\34\17\2\u00d2\u00cf\3"+
		"\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3\25\3\2\2\2\u00d4"+
		"\u00d6\5\30\r\2\u00d5\u00d4\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00de\3"+
		"\2\2\2\u00d7\u00d9\5\34\17\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da"+
		"\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2"+
		"\2\2\u00dd\u00d5\3\2\2\2\u00dd\u00da\3\2\2\2\u00de\27\3\2\2\2\u00df\u00e0"+
		"\7-\2\2\u00e0\u00e4\7=\2\2\u00e1\u00e3\5\32\16\2\u00e2\u00e1\3\2\2\2\u00e3"+
		"\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2"+
		"\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e8\7>\2\2\u00e8\31\3\2\2\2\u00e9\u00ea"+
		"\5h\65\2\u00ea\u00eb\7\27\2\2\u00eb\u00ec\5\64\33\2\u00ec\33\3\2\2\2\u00ed"+
		"\u00f0\5J&\2\u00ee\u00f0\5T+\2\u00ef\u00ed\3\2\2\2\u00ef\u00ee\3\2\2\2"+
		"\u00f0\35\3\2\2\2\u00f1\u00f4\5 \21\2\u00f2\u00f4\5\"\22\2\u00f3\u00f1"+
		"\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f4\37\3\2\2\2\u00f5\u00f6\7\f\2\2\u00f6"+
		"\u00fb\5$\23\2\u00f7\u00f8\7B\2\2\u00f8\u00fa\5$\23\2\u00f9\u00f7\3\2"+
		"\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc"+
		"!\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u00ff\7\r\2\2\u00ff\u0104\5$\23\2"+
		"\u0100\u0101\7B\2\2\u0101\u0103\5$\23\2\u0102\u0100\3\2\2\2\u0103\u0106"+
		"\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105#\3\2\2\2\u0106"+
		"\u0104\3\2\2\2\u0107\u0108\5&\24\2\u0108\u010a\7;\2\2\u0109\u010b\5H%"+
		"\2\u010a\u0109\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010f"+
		"\7<\2\2\u010d\u010e\7\13\2\2\u010e\u0110\7D\2\2\u010f\u010d\3\2\2\2\u010f"+
		"\u0110\3\2\2\2\u0110%\3\2\2\2\u0111\u0112\7D\2\2\u0112\'\3\2\2\2\u0113"+
		"\u0114\5\62\32\2\u0114\u0115\7\37\2\2\u0115\u0116\5*\26\2\u0116)\3\2\2"+
		"\2\u0117\u0118\7=\2\2\u0118\u0119\5,\27\2\u0119\u011a\7>\2\2\u011a+\3"+
		"\2\2\2\u011b\u0120\5.\30\2\u011c\u011d\7B\2\2\u011d\u011f\5.\30\2\u011e"+
		"\u011c\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2"+
		"\2\2\u0121-\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0124\5h\65\2\u0124\u0125"+
		"\7\27\2\2\u0125\u0126\5\64\33\2\u0126/\3\2\2\2\u0127\u012a\5\62\32\2\u0128"+
		"\u012a\5*\26\2\u0129\u0127\3\2\2\2\u0129\u0128\3\2\2\2\u012a\61\3\2\2"+
		"\2\u012b\u012c\7D\2\2\u012c\63\3\2\2\2\u012d\u012e\b\33\1\2\u012e\u012f"+
		"\7;\2\2\u012f\u0130\5\64\33\2\u0130\u0131\7<\2\2\u0131\u0138\3\2\2\2\u0132"+
		"\u0138\5\66\34\2\u0133\u0134\t\2\2\2\u0134\u0138\5\64\33\b\u0135\u0136"+
		"\7\34\2\2\u0136\u0138\5\64\33\7\u0137\u012d\3\2\2\2\u0137\u0132\3\2\2"+
		"\2\u0137\u0133\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u0147\3\2\2\2\u0139\u013a"+
		"\f\6\2\2\u013a\u013b\t\3\2\2\u013b\u0146\5\64\33\7\u013c\u013d\f\5\2\2"+
		"\u013d\u013e\t\2\2\2\u013e\u0146\5\64\33\6\u013f\u0140\f\4\2\2\u0140\u0141"+
		"\t\4\2\2\u0141\u0146\5\64\33\5\u0142\u0143\f\3\2\2\u0143\u0144\t\5\2\2"+
		"\u0144\u0146\5\64\33\4\u0145\u0139\3\2\2\2\u0145\u013c\3\2\2\2\u0145\u013f"+
		"\3\2\2\2\u0145\u0142\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147"+
		"\u0148\3\2\2\2\u0148\65\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u014d\5~@\2"+
		"\u014b\u014d\5F$\2\u014c\u014a\3\2\2\2\u014c\u014b\3\2\2\2\u014d\67\3"+
		"\2\2\2\u014e\u0150\5:\36\2\u014f\u014e\3\2\2\2\u014f\u0150\3\2\2\2\u0150"+
		"\u0151\3\2\2\2\u0151\u0155\5\60\31\2\u0152\u0154\5<\37\2\u0153\u0152\3"+
		"\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156"+
		"9\3\2\2\2\u0157\u0155\3\2\2\2\u0158\u0159\7\n\2\2\u0159;\3\2\2\2\u015a"+
		"\u015c\5> \2\u015b\u015a\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d\3\2\2"+
		"\2\u015d\u015f\7\31\2\2\u015e\u0160\5@!\2\u015f\u015e\3\2\2\2\u015f\u0160"+
		"\3\2\2\2\u0160\u0162\3\2\2\2\u0161\u0163\5\30\r\2\u0162\u0161\3\2\2\2"+
		"\u0162\u0163\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\5\60\31\2\u0165="+
		"\3\2\2\2\u0166\u0167\7?\2\2\u0167\u0168\5N(\2\u0168\u0169\7@\2\2\u0169"+
		"?\3\2\2\2\u016a\u016b\7D\2\2\u016b\u016d\7;\2\2\u016c\u016e\5t;\2\u016d"+
		"\u016c\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\7<"+
		"\2\2\u0170A\3\2\2\2\u0171\u0176\5D#\2\u0172\u0173\7B\2\2\u0173\u0175\5"+
		"D#\2\u0174\u0172\3\2\2\2\u0175\u0178\3\2\2\2\u0176\u0174\3\2\2\2\u0176"+
		"\u0177\3\2\2\2\u0177C\3\2\2\2\u0178\u0176\3\2\2\2\u0179\u017a\5F$\2\u017a"+
		"\u017b\7\30\2\2\u017b\u017c\5|?\2\u017cE\3\2\2\2\u017d\u0182\7D\2\2\u017e"+
		"\u017f\7C\2\2\u017f\u0181\7D\2\2\u0180\u017e\3\2\2\2\u0181\u0184\3\2\2"+
		"\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183G\3\2\2\2\u0184\u0182"+
		"\3\2\2\2\u0185\u018a\5\64\33\2\u0186\u0187\7B\2\2\u0187\u0189\5\64\33"+
		"\2\u0188\u0186\3\2\2\2\u0189\u018c\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b"+
		"\3\2\2\2\u018bI\3\2\2\2\u018c\u018a\3\2\2\2\u018d\u018e\7\17\2\2\u018e"+
		"\u018f\5R*\2\u018f\u0190\5L\'\2\u0190K\3\2\2\2\u0191\u0192\7=\2\2\u0192"+
		"\u0193\5N(\2\u0193\u0194\7>\2\2\u0194M\3\2\2\2\u0195\u0196\b(\1\2\u0196"+
		"\u0197\7;\2\2\u0197\u0198\5N(\2\u0198\u0199\7<\2\2\u0199\u019d\3\2\2\2"+
		"\u019a\u019d\5P)\2\u019b\u019d\5\64\33\2\u019c\u0195\3\2\2\2\u019c\u019a"+
		"\3\2\2\2\u019c\u019b\3\2\2\2\u019d\u01a3\3\2\2\2\u019e\u019f\f\3\2\2\u019f"+
		"\u01a0\t\6\2\2\u01a0\u01a2\5N(\4\u01a1\u019e\3\2\2\2\u01a2\u01a5\3\2\2"+
		"\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4O\3\2\2\2\u01a5\u01a3"+
		"\3\2\2\2\u01a6\u01a7\5&\24\2\u01a7\u01a8\7C\2\2\u01a8\u01aa\3\2\2\2\u01a9"+
		"\u01a6\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\5R"+
		"*\2\u01acQ\3\2\2\2\u01ad\u01ae\7D\2\2\u01aeS\3\2\2\2\u01af\u01b0\7\20"+
		"\2\2\u01b0\u01b1\7D\2\2\u01b1\u01b2\5V,\2\u01b2U\3\2\2\2\u01b3\u01b4\7"+
		"=\2\2\u01b4\u01b5\5X-\2\u01b5\u01b6\7>\2\2\u01b6W\3\2\2\2\u01b7\u01b8"+
		"\b-\1\2\u01b8\u01c2\5Z.\2\u01b9\u01ba\7\34\2\2\u01ba\u01c2\5X-\n\u01bb"+
		"\u01bc\7.\2\2\u01bc\u01c2\5X-\5\u01bd\u01be\7/\2\2\u01be\u01c2\5X-\4\u01bf"+
		"\u01c0\7\60\2\2\u01c0\u01c2\5X-\3\u01c1\u01b7\3\2\2\2\u01c1\u01b9\3\2"+
		"\2\2\u01c1\u01bb\3\2\2\2\u01c1\u01bd\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2"+
		"\u01d1\3\2\2\2\u01c3\u01c4\f\t\2\2\u01c4\u01c5\7#\2\2\u01c5\u01d0\5X-"+
		"\n\u01c6\u01c7\f\b\2\2\u01c7\u01c8\7$\2\2\u01c8\u01d0\5X-\t\u01c9\u01ca"+
		"\f\7\2\2\u01ca\u01cb\7\31\2\2\u01cb\u01d0\5X-\b\u01cc\u01cd\f\6\2\2\u01cd"+
		"\u01ce\7\61\2\2\u01ce\u01d0\5X-\7\u01cf\u01c3\3\2\2\2\u01cf\u01c6\3\2"+
		"\2\2\u01cf\u01c9\3\2\2\2\u01cf\u01cc\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1"+
		"\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2Y\3\2\2\2\u01d3\u01d1\3\2\2\2"+
		"\u01d4\u01d5\7;\2\2\u01d5\u01d6\5X-\2\u01d6\u01d7\7<\2\2\u01d7\u01da\3"+
		"\2\2\2\u01d8\u01da\5R*\2\u01d9\u01d4\3\2\2\2\u01d9\u01d8\3\2\2\2\u01da"+
		"[\3\2\2\2\u01db\u01dc\5^\60\2\u01dc\u01dd\5`\61\2\u01dd]\3\2\2\2\u01de"+
		"\u01df\7\7\2\2\u01df\u01e0\5f\64\2\u01e0_\3\2\2\2\u01e1\u01e2\7=\2\2\u01e2"+
		"\u01e3\5b\62\2\u01e3\u01e4\7>\2\2\u01e4a\3\2\2\2\u01e5\u01ea\5d\63\2\u01e6"+
		"\u01e7\7B\2\2\u01e7\u01e9\5d\63\2\u01e8\u01e6\3\2\2\2\u01e9\u01ec\3\2"+
		"\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01ebc\3\2\2\2\u01ec\u01ea"+
		"\3\2\2\2\u01ed\u01ee\5h\65\2\u01ee\u01ef\7\30\2\2\u01ef\u01f0\5|?\2\u01f0"+
		"e\3\2\2\2\u01f1\u01f2\7D\2\2\u01f2g\3\2\2\2\u01f3\u01f4\7D\2\2\u01f4i"+
		"\3\2\2\2\u01f5\u01f6\5l\67\2\u01f6\u01f7\5n8\2\u01f7k\3\2\2\2\u01f8\u01f9"+
		"\7\b\2\2\u01f9\u01fa\5x=\2\u01fam\3\2\2\2\u01fb\u01fc\7=\2\2\u01fc\u01fd"+
		"\5p9\2\u01fd\u01fe\7>\2\2\u01feo\3\2\2\2\u01ff\u0204\5r:\2\u0200\u0201"+
		"\7B\2\2\u0201\u0203\5r:\2\u0202\u0200\3\2\2\2\u0203\u0206\3\2\2\2\u0204"+
		"\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205q\3\2\2\2\u0206\u0204\3\2\2\2"+
		"\u0207\u0208\5z>\2\u0208\u0209\7\30\2\2\u0209\u020a\5v<\2\u020as\3\2\2"+
		"\2\u020b\u020c\5z>\2\u020c\u020d\7\34\2\2\u020d\u020e\5F$\2\u020e\u0214"+
		"\3\2\2\2\u020f\u0210\5z>\2\u0210\u0211\7\36\2\2\u0211\u0212\5F$\2\u0212"+
		"\u0214\3\2\2\2\u0213\u020b\3\2\2\2\u0213\u020f\3\2\2\2\u0214u\3\2\2\2"+
		"\u0215\u0216\t\7\2\2\u0216w\3\2\2\2\u0217\u0218\7D\2\2\u0218y\3\2\2\2"+
		"\u0219\u021a\7D\2\2\u021a{\3\2\2\2\u021b\u021c\t\b\2\2\u021c}\3\2\2\2"+
		"\u021d\u0222\5\u0080A\2\u021e\u0222\5\u0082B\2\u021f\u0222\5\u0084C\2"+
		"\u0220\u0222\5\u0086D\2\u0221\u021d\3\2\2\2\u0221\u021e\3\2\2\2\u0221"+
		"\u021f\3\2\2\2\u0221\u0220\3\2\2\2\u0222\177\3\2\2\2\u0223\u0225\t\2\2"+
		"\2\u0224\u0223\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u022c"+
		"\5\u0088E\2\u0227\u0229\t\2\2\2\u0228\u0227\3\2\2\2\u0228\u0229\3\2\2"+
		"\2\u0229\u022a\3\2\2\2\u022a\u022c\5\u008aF\2\u022b\u0224\3\2\2\2\u022b"+
		"\u0228\3\2\2\2\u022c\u0081\3\2\2\2\u022d\u022e\79\2\2\u022e\u0083\3\2"+
		"\2\2\u022f\u0230\7\62\2\2\u0230\u0085\3\2\2\2\u0231\u0232\7:\2\2\u0232"+
		"\u0087\3\2\2\2\u0233\u0234\t\t\2\2\u0234\u0089\3\2\2\2\u0235\u0236\t\n"+
		"\2\2\u0236\u008b\3\2\2\2\u0237\u023c\7D\2\2\u0238\u0239\7C\2\2\u0239\u023b"+
		"\7D\2\2\u023a\u0238\3\2\2\2\u023b\u023e\3\2\2\2\u023c\u023a\3\2\2\2\u023c"+
		"\u023d\3\2\2\2\u023d\u008d\3\2\2\2\u023e\u023c\3\2\2\2\66\u0091\u0095"+
		"\u0098\u009b\u00aa\u00ae\u00b1\u00b4\u00be\u00c9\u00cd\u00d2\u00d5\u00da"+
		"\u00dd\u00e4\u00ef\u00f3\u00fb\u0104\u010a\u010f\u0120\u0129\u0137\u0145"+
		"\u0147\u014c\u014f\u0155\u015b\u015f\u0162\u016d\u0176\u0182\u018a\u019c"+
		"\u01a3\u01a9\u01c1\u01cf\u01d1\u01d9\u01ea\u0204\u0213\u0221\u0224\u0228"+
		"\u022b\u023c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}