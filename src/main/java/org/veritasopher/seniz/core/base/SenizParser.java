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
		IMPORT=1, MAIN=2, CONTROL=3, SYSTEM=4, VARSET=5, OVER=6, INIT=7, AS=8, 
		LTL=9, BOOLEAN=10, INT=11, FLOAT=12, STRING=13, VALUEOF=14, TYPEOF=15, 
		TO=16, GT=17, LT=18, BANG=19, TILDE=20, QUESTION=21, EQ=22, LE=23, GE=24, 
		NEQ=25, AND=26, OR=27, ADD=28, SUB=29, MUL=30, DIV=31, CARET=32, MOD=33, 
		PAR=34, INTERLEAVE=35, ALWAYS=36, EVENTUALLY=37, NEXT=38, UNTIL=39, BOOL_LITERAL=40, 
		DECIMAL_LITERAL=41, HEX_LITERAL=42, OCT_LITERAL=43, BINARY_LITERAL=44, 
		FLOAT_LITERAL=45, HEX_FLOAT_LITERAL=46, STRING_LITERAL=47, NULL_LITERAL=48, 
		LPAREN=49, RPAREN=50, LBRACE=51, RBRACE=52, LBRACK=53, RBRACK=54, SEMI=55, 
		COMMA=56, DOT=57, IDENTIFIER=58, WS=59, COMMENT=60, LINE_COMMENT=61;
	public static final int
		RULE_compilationUnit = 0, RULE_importDeclaration = 1, RULE_systemDeclaration = 2, 
		RULE_systemHeader = 3, RULE_systemModifiers = 4, RULE_mainModifier = 5, 
		RULE_controlModifier = 6, RULE_systemParameter = 7, RULE_systemBody = 8, 
		RULE_systemBodyDeclaration = 9, RULE_controlSystemDeclaration = 10, RULE_formalismStatement = 11, 
		RULE_controlStatement = 12, RULE_subSystemIdentifier = 13, RULE_systemIdentifier = 14, 
		RULE_stateNaming = 15, RULE_stateBody = 16, RULE_stateDeclarator = 17, 
		RULE_stateExpression = 18, RULE_stateIdentifier = 19, RULE_stateNameIdentifier = 20, 
		RULE_expression = 21, RULE_primary = 22, RULE_transitionStatement = 23, 
		RULE_initIdentifier = 24, RULE_actionDeclaration = 25, RULE_formalParameterList = 26, 
		RULE_formalParameter = 27, RULE_variableIdentifier = 28, RULE_parameterList = 29, 
		RULE_propositionStatement = 30, RULE_propositionBody = 31, RULE_propositionExpression = 32, 
		RULE_propositionPrimary = 33, RULE_propositionIdentifer = 34, RULE_ltlStatement = 35, 
		RULE_ltlBody = 36, RULE_ltlExpression = 37, RULE_ltlPrimary = 38, RULE_stateVarSetDeclaration = 39, 
		RULE_stateVarSetHeader = 40, RULE_stateVarSetBody = 41, RULE_stateVarSetDeclarator = 42, 
		RULE_stateVarExpression = 43, RULE_stateVarSetIdentifer = 44, RULE_stateVarIdentifier = 45, 
		RULE_primitiveType = 46, RULE_literal = 47, RULE_numberLiteral = 48, RULE_stringLiteral = 49, 
		RULE_booleanLiteral = 50, RULE_otherLiteral = 51, RULE_integerLiteral = 52, 
		RULE_floatLiteral = 53, RULE_qualifiedName = 54;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "importDeclaration", "systemDeclaration", "systemHeader", 
			"systemModifiers", "mainModifier", "controlModifier", "systemParameter", 
			"systemBody", "systemBodyDeclaration", "controlSystemDeclaration", "formalismStatement", 
			"controlStatement", "subSystemIdentifier", "systemIdentifier", "stateNaming", 
			"stateBody", "stateDeclarator", "stateExpression", "stateIdentifier", 
			"stateNameIdentifier", "expression", "primary", "transitionStatement", 
			"initIdentifier", "actionDeclaration", "formalParameterList", "formalParameter", 
			"variableIdentifier", "parameterList", "propositionStatement", "propositionBody", 
			"propositionExpression", "propositionPrimary", "propositionIdentifer", 
			"ltlStatement", "ltlBody", "ltlExpression", "ltlPrimary", "stateVarSetDeclaration", 
			"stateVarSetHeader", "stateVarSetBody", "stateVarSetDeclarator", "stateVarExpression", 
			"stateVarSetIdentifer", "stateVarIdentifier", "primitiveType", "literal", 
			"numberLiteral", "stringLiteral", "booleanLiteral", "otherLiteral", "integerLiteral", 
			"floatLiteral", "qualifiedName"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'main'", "'control'", "'system'", "'varset'", "'over'", 
			"'init'", "'as'", "'ltl'", "'bool'", "'int'", "'float'", "'string'", 
			"':'", "'::'", "'->'", "'>'", "'<'", "'!'", "'~'", "'?'", "'='", "'<='", 
			"'>='", "'/='", "'&'", "'|'", "'+'", "'-'", "'*'", "'/'", "'^'", "'%'", 
			"'||'", "'|||'", "'always'", "'eventually'", "'next'", "'until'", null, 
			null, null, null, null, null, null, null, "'null'", "'('", "')'", "'{'", 
			"'}'", "'['", "']'", "';'", "','", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IMPORT", "MAIN", "CONTROL", "SYSTEM", "VARSET", "OVER", "INIT", 
			"AS", "LTL", "BOOLEAN", "INT", "FLOAT", "STRING", "VALUEOF", "TYPEOF", 
			"TO", "GT", "LT", "BANG", "TILDE", "QUESTION", "EQ", "LE", "GE", "NEQ", 
			"AND", "OR", "ADD", "SUB", "MUL", "DIV", "CARET", "MOD", "PAR", "INTERLEAVE", 
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
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(110);
				importDeclaration();
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAIN) | (1L << CONTROL) | (1L << SYSTEM))) != 0)) {
				{
				setState(116);
				systemDeclaration();
				}
			}

			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARSET) {
				{
				setState(119);
				stateVarSetDeclaration();
				}
			}

			setState(122);
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
			setState(124);
			match(IMPORT);
			setState(125);
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
			setState(127);
			systemHeader();
			setState(128);
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
			setState(130);
			systemModifiers();
			setState(131);
			match(SYSTEM);
			setState(132);
			systemIdentifier();
			setState(133);
			match(LPAREN);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(134);
				formalParameterList();
				}
			}

			setState(137);
			match(RPAREN);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OVER) {
				{
				setState(138);
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
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MAIN) {
				{
				setState(141);
				mainModifier();
				}
			}

			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONTROL) {
				{
				setState(144);
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
			setState(147);
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
			setState(149);
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
		enterRule(_localctx, 14, RULE_systemParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(OVER);
			setState(152);
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
		public ControlSystemDeclarationContext controlSystemDeclaration() {
			return getRuleContext(ControlSystemDeclarationContext.class,0);
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
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				match(LBRACE);
				setState(155);
				controlSystemDeclaration();
				setState(156);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				match(LBRACE);
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INIT) | (1L << LTL) | (1L << LBRACE) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(159);
					systemBodyDeclaration();
					}
					}
					setState(164);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(165);
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
		public FormalismStatementContext formalismStatement() {
			return getRuleContext(FormalismStatementContext.class,0);
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
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				stateNaming();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				transitionStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				formalismStatement();
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

	public static class ControlSystemDeclarationContext extends ParserRuleContext {
		public ControlStatementContext controlStatement() {
			return getRuleContext(ControlStatementContext.class,0);
		}
		public List<FormalismStatementContext> formalismStatement() {
			return getRuleContexts(FormalismStatementContext.class);
		}
		public FormalismStatementContext formalismStatement(int i) {
			return getRuleContext(FormalismStatementContext.class,i);
		}
		public ControlSystemDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlSystemDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterControlSystemDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitControlSystemDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitControlSystemDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ControlSystemDeclarationContext controlSystemDeclaration() throws RecognitionException {
		ControlSystemDeclarationContext _localctx = new ControlSystemDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_controlSystemDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(173);
				controlStatement();
				}
				break;
			}
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LTL || _la==IDENTIFIER) {
				{
				{
				setState(176);
				formalismStatement();
				}
				}
				setState(181);
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

	public static class FormalismStatementContext extends ParserRuleContext {
		public PropositionStatementContext propositionStatement() {
			return getRuleContext(PropositionStatementContext.class,0);
		}
		public LtlStatementContext ltlStatement() {
			return getRuleContext(LtlStatementContext.class,0);
		}
		public FormalismStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalismStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterFormalismStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitFormalismStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitFormalismStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalismStatementContext formalismStatement() throws RecognitionException {
		FormalismStatementContext _localctx = new FormalismStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_formalismStatement);
		try {
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				propositionStatement();
				}
				break;
			case LTL:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
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
		public List<SubSystemIdentifierContext> subSystemIdentifier() {
			return getRuleContexts(SubSystemIdentifierContext.class);
		}
		public SubSystemIdentifierContext subSystemIdentifier(int i) {
			return getRuleContext(SubSystemIdentifierContext.class,i);
		}
		public List<TerminalNode> INTERLEAVE() { return getTokens(SenizParser.INTERLEAVE); }
		public TerminalNode INTERLEAVE(int i) {
			return getToken(SenizParser.INTERLEAVE, i);
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
		enterRule(_localctx, 24, RULE_controlStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			subSystemIdentifier();
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTERLEAVE) {
				{
				{
				setState(187);
				match(INTERLEAVE);
				setState(188);
				subSystemIdentifier();
				}
				}
				setState(193);
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
		enterRule(_localctx, 26, RULE_subSystemIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			systemIdentifier();
			setState(195);
			match(LPAREN);
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BANG) | (1L << ADD) | (1L << SUB) | (1L << BOOL_LITERAL) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(196);
				parameterList();
				}
			}

			setState(199);
			match(RPAREN);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(200);
				match(AS);
				setState(201);
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
		enterRule(_localctx, 28, RULE_systemIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
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
		enterRule(_localctx, 30, RULE_stateNaming);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			stateNameIdentifier();
			setState(207);
			((StateNamingContext)_localctx).bop = match(EQ);
			setState(208);
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
		enterRule(_localctx, 32, RULE_stateBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(LBRACE);
			setState(211);
			stateDeclarator();
			setState(212);
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
		enterRule(_localctx, 34, RULE_stateDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			stateExpression();
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(215);
				match(COMMA);
				setState(216);
				stateExpression();
				}
				}
				setState(221);
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
		enterRule(_localctx, 36, RULE_stateExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			stateVarIdentifier();
			setState(223);
			((StateExpressionContext)_localctx).bop = match(VALUEOF);
			setState(224);
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
		enterRule(_localctx, 38, RULE_stateIdentifier);
		try {
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				stateNameIdentifier();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
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
		enterRule(_localctx, 40, RULE_stateNameIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
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
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesesExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(233);
				match(LPAREN);
				setState(234);
				((ParenthesesExpressionContext)_localctx).inner = expression(0);
				setState(235);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new PrimaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(237);
				primary();
				}
				break;
			case 3:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(238);
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
				setState(239);
				expression(6);
				}
				break;
			case 4:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(240);
				((NotExpressionContext)_localctx).prefix = match(BANG);
				setState(241);
				expression(5);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(258);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(256);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(244);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(245);
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
						setState(246);
						expression(5);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(247);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(248);
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
						setState(249);
						expression(4);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(250);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(251);
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
						setState(252);
						expression(3);
						}
						break;
					case 4:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(253);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(254);
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
						setState(255);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(260);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		enterRule(_localctx, 44, RULE_primary);
		try {
			setState(263);
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
				setState(261);
				literal();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
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
		enterRule(_localctx, 46, RULE_transitionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INIT) {
				{
				setState(265);
				initIdentifier();
				}
			}

			setState(268);
			stateIdentifier();
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TO) {
				{
				{
				setState(269);
				match(TO);
				setState(271);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(270);
					actionDeclaration();
					}
					break;
				}
				setState(273);
				stateIdentifier();
				}
				}
				setState(278);
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
		enterRule(_localctx, 48, RULE_initIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
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
		public TerminalNode IDENTIFIER() { return getToken(SenizParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(SenizParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SenizParser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
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
		enterRule(_localctx, 50, RULE_actionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(IDENTIFIER);
			setState(282);
			match(LPAREN);
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(283);
				formalParameterList();
				}
			}

			setState(286);
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
		enterRule(_localctx, 52, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			formalParameter();
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(289);
				match(COMMA);
				setState(290);
				formalParameter();
				}
				}
				setState(295);
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
		enterRule(_localctx, 54, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			variableIdentifier();
			setState(297);
			((FormalParameterContext)_localctx).bop = match(TYPEOF);
			setState(298);
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
		enterRule(_localctx, 56, RULE_variableIdentifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(IDENTIFIER);
			setState(305);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(301);
					match(DOT);
					setState(302);
					match(IDENTIFIER);
					}
					} 
				}
				setState(307);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		enterRule(_localctx, 58, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			expression(0);
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(309);
				match(COMMA);
				setState(310);
				expression(0);
				}
				}
				setState(315);
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
		public Token bop;
		public PropositionIdentiferContext propositionIdentifer() {
			return getRuleContext(PropositionIdentiferContext.class,0);
		}
		public PropositionBodyContext propositionBody() {
			return getRuleContext(PropositionBodyContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SenizParser.EQ, 0); }
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
		enterRule(_localctx, 60, RULE_propositionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			propositionIdentifer();
			setState(317);
			((PropositionStatementContext)_localctx).bop = match(EQ);
			setState(318);
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
		enterRule(_localctx, 62, RULE_propositionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(LBRACE);
			setState(321);
			propositionExpression(0);
			setState(322);
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
	public static class PropConditionalOrExpressionContext extends PropositionExpressionContext {
		public Token bop;
		public List<PropositionExpressionContext> propositionExpression() {
			return getRuleContexts(PropositionExpressionContext.class);
		}
		public PropositionExpressionContext propositionExpression(int i) {
			return getRuleContext(PropositionExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(SenizParser.OR, 0); }
		public PropConditionalOrExpressionContext(PropositionExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterPropConditionalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitPropConditionalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitPropConditionalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PropConditionalAndExpressionContext extends PropositionExpressionContext {
		public Token bop;
		public List<PropositionExpressionContext> propositionExpression() {
			return getRuleContexts(PropositionExpressionContext.class);
		}
		public PropositionExpressionContext propositionExpression(int i) {
			return getRuleContext(PropositionExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(SenizParser.AND, 0); }
		public PropConditionalAndExpressionContext(PropositionExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterPropConditionalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitPropConditionalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitPropConditionalAndExpression(this);
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
	public static class PropNotExpressionContext extends PropositionExpressionContext {
		public Token prefix;
		public PropositionExpressionContext propositionExpression() {
			return getRuleContext(PropositionExpressionContext.class,0);
		}
		public TerminalNode BANG() { return getToken(SenizParser.BANG, 0); }
		public PropNotExpressionContext(PropositionExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterPropNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitPropNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitPropNotExpression(this);
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
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_propositionExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
			case IDENTIFIER:
				{
				_localctx = new PropPrimaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(325);
				propositionPrimary();
				}
				break;
			case BANG:
				{
				_localctx = new PropNotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(326);
				((PropNotExpressionContext)_localctx).prefix = match(BANG);
				setState(327);
				propositionExpression(3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(338);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(336);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new PropConditionalAndExpressionContext(new PropositionExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_propositionExpression);
						setState(330);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(331);
						((PropConditionalAndExpressionContext)_localctx).bop = match(AND);
						setState(332);
						propositionExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new PropConditionalOrExpressionContext(new PropositionExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_propositionExpression);
						setState(333);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(334);
						((PropConditionalOrExpressionContext)_localctx).bop = match(OR);
						setState(335);
						propositionExpression(2);
						}
						break;
					}
					} 
				}
				setState(340);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
		public TerminalNode LPAREN() { return getToken(SenizParser.LPAREN, 0); }
		public PropositionExpressionContext propositionExpression() {
			return getRuleContext(PropositionExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SenizParser.RPAREN, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(SenizParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SenizParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(SenizParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SenizParser.DOT, i);
		}
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
		enterRule(_localctx, 66, RULE_propositionPrimary);
		try {
			int _alt;
			setState(353);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				match(LPAREN);
				setState(342);
				propositionExpression(0);
				setState(343);
				match(RPAREN);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(345);
				match(IDENTIFIER);
				setState(350);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(346);
						match(DOT);
						setState(347);
						match(IDENTIFIER);
						}
						} 
					}
					setState(352);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				}
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
		enterRule(_localctx, 68, RULE_propositionIdentifer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
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
		public Token bop;
		public TerminalNode LTL() { return getToken(SenizParser.LTL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SenizParser.IDENTIFIER, 0); }
		public LtlBodyContext ltlBody() {
			return getRuleContext(LtlBodyContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SenizParser.EQ, 0); }
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
		enterRule(_localctx, 70, RULE_ltlStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(LTL);
			setState(358);
			match(IDENTIFIER);
			setState(359);
			((LtlStatementContext)_localctx).bop = match(EQ);
			setState(360);
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
		enterRule(_localctx, 72, RULE_ltlBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(LBRACE);
			setState(363);
			ltlExpression(0);
			setState(364);
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
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_ltlExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
			case IDENTIFIER:
				{
				_localctx = new LtlPrimaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(367);
				ltlPrimary();
				}
				break;
			case BANG:
				{
				_localctx = new LtlNotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(368);
				((LtlNotExpressionContext)_localctx).prefix = match(BANG);
				setState(369);
				ltlExpression(7);
				}
				break;
			case ALWAYS:
				{
				_localctx = new AlwaysExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(370);
				((AlwaysExpressionContext)_localctx).prefix = match(ALWAYS);
				setState(371);
				ltlExpression(3);
				}
				break;
			case EVENTUALLY:
				{
				_localctx = new EventuallyExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(372);
				((EventuallyExpressionContext)_localctx).prefix = match(EVENTUALLY);
				setState(373);
				ltlExpression(2);
				}
				break;
			case NEXT:
				{
				_localctx = new NextExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(374);
				((NextExpressionContext)_localctx).prefix = match(NEXT);
				setState(375);
				ltlExpression(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(389);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(387);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						_localctx = new LtlConditionalAndExpressionContext(new LtlExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_ltlExpression);
						setState(378);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(379);
						((LtlConditionalAndExpressionContext)_localctx).bop = match(AND);
						setState(380);
						ltlExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new LtlConditionalOrExpressionContext(new LtlExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_ltlExpression);
						setState(381);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(382);
						((LtlConditionalOrExpressionContext)_localctx).bop = match(OR);
						setState(383);
						ltlExpression(6);
						}
						break;
					case 3:
						{
						_localctx = new UntilExpressionContext(new LtlExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_ltlExpression);
						setState(384);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(385);
						((UntilExpressionContext)_localctx).bop = match(UNTIL);
						setState(386);
						ltlExpression(5);
						}
						break;
					}
					} 
				}
				setState(391);
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
		enterRule(_localctx, 76, RULE_ltlPrimary);
		try {
			setState(397);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(392);
				match(LPAREN);
				setState(393);
				ltlExpression(0);
				setState(394);
				match(RPAREN);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(396);
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
		enterRule(_localctx, 78, RULE_stateVarSetDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			stateVarSetHeader();
			setState(400);
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
		public TerminalNode VARSET() { return getToken(SenizParser.VARSET, 0); }
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
		enterRule(_localctx, 80, RULE_stateVarSetHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(VARSET);
			setState(403);
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
		enterRule(_localctx, 82, RULE_stateVarSetBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(LBRACE);
			setState(406);
			stateVarSetDeclarator();
			setState(407);
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
		enterRule(_localctx, 84, RULE_stateVarSetDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			stateVarExpression();
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(410);
				match(COMMA);
				setState(411);
				stateVarExpression();
				}
				}
				setState(416);
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
		enterRule(_localctx, 86, RULE_stateVarExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			stateVarIdentifier();
			setState(418);
			((StateVarExpressionContext)_localctx).bop = match(TYPEOF);
			setState(419);
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
		enterRule(_localctx, 88, RULE_stateVarSetIdentifer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
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
		enterRule(_localctx, 90, RULE_stateVarIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
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
		enterRule(_localctx, 92, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
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
		enterRule(_localctx, 94, RULE_literal);
		try {
			setState(431);
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
				setState(427);
				numberLiteral();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(428);
				stringLiteral();
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(429);
				booleanLiteral();
				}
				break;
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(430);
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
		enterRule(_localctx, 96, RULE_numberLiteral);
		int _la;
		try {
			setState(441);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ADD || _la==SUB) {
					{
					setState(433);
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

				setState(436);
				integerLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ADD || _la==SUB) {
					{
					setState(437);
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

				setState(440);
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
		enterRule(_localctx, 98, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
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
		enterRule(_localctx, 100, RULE_booleanLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
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
		enterRule(_localctx, 102, RULE_otherLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
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
		enterRule(_localctx, 104, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
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
		enterRule(_localctx, 106, RULE_floatLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
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
		enterRule(_localctx, 108, RULE_qualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(IDENTIFIER);
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(454);
				match(DOT);
				setState(455);
				match(IDENTIFIER);
				}
				}
				setState(460);
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
		case 21:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 32:
			return propositionExpression_sempred((PropositionExpressionContext)_localctx, predIndex);
		case 37:
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
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean ltlExpression_sempred(LtlExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3?\u01d0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\7\2r\n\2\f\2\16\2u\13\2\3"+
		"\2\5\2x\n\2\3\2\5\2{\n\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\5\5\u008a\n\5\3\5\3\5\5\5\u008e\n\5\3\6\5\6\u0091\n\6\3\6\5\6\u0094"+
		"\n\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00a3\n\n"+
		"\f\n\16\n\u00a6\13\n\3\n\5\n\u00a9\n\n\3\13\3\13\3\13\5\13\u00ae\n\13"+
		"\3\f\5\f\u00b1\n\f\3\f\7\f\u00b4\n\f\f\f\16\f\u00b7\13\f\3\r\3\r\5\r\u00bb"+
		"\n\r\3\16\3\16\3\16\7\16\u00c0\n\16\f\16\16\16\u00c3\13\16\3\17\3\17\3"+
		"\17\5\17\u00c8\n\17\3\17\3\17\3\17\5\17\u00cd\n\17\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\7\23\u00dc\n\23\f\23\16"+
		"\23\u00df\13\23\3\24\3\24\3\24\3\24\3\25\3\25\5\25\u00e7\n\25\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00f5\n\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u0103\n\27"+
		"\f\27\16\27\u0106\13\27\3\30\3\30\5\30\u010a\n\30\3\31\5\31\u010d\n\31"+
		"\3\31\3\31\3\31\5\31\u0112\n\31\3\31\7\31\u0115\n\31\f\31\16\31\u0118"+
		"\13\31\3\32\3\32\3\33\3\33\3\33\5\33\u011f\n\33\3\33\3\33\3\34\3\34\3"+
		"\34\7\34\u0126\n\34\f\34\16\34\u0129\13\34\3\35\3\35\3\35\3\35\3\36\3"+
		"\36\3\36\7\36\u0132\n\36\f\36\16\36\u0135\13\36\3\37\3\37\3\37\7\37\u013a"+
		"\n\37\f\37\16\37\u013d\13\37\3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\5"+
		"\"\u014b\n\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u0153\n\"\f\"\16\"\u0156\13\""+
		"\3#\3#\3#\3#\3#\3#\3#\7#\u015f\n#\f#\16#\u0162\13#\5#\u0164\n#\3$\3$\3"+
		"%\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'"+
		"\u017b\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u0186\n\'\f\'\16\'"+
		"\u0189\13\'\3(\3(\3(\3(\3(\5(\u0190\n(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3+\3"+
		",\3,\3,\7,\u019f\n,\f,\16,\u01a2\13,\3-\3-\3-\3-\3.\3.\3/\3/\3\60\3\60"+
		"\3\61\3\61\3\61\3\61\5\61\u01b2\n\61\3\62\5\62\u01b5\n\62\3\62\3\62\5"+
		"\62\u01b9\n\62\3\62\5\62\u01bc\n\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66"+
		"\3\66\3\67\3\67\38\38\38\78\u01cb\n8\f8\168\u01ce\138\38\2\5,BL9\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT"+
		"VXZ\\^`bdfhjln\2\t\3\2\36\37\3\2 #\4\2\23\24\30\33\3\2\34\35\3\2\f\17"+
		"\3\2+.\3\2/\60\2\u01cf\2s\3\2\2\2\4~\3\2\2\2\6\u0081\3\2\2\2\b\u0084\3"+
		"\2\2\2\n\u0090\3\2\2\2\f\u0095\3\2\2\2\16\u0097\3\2\2\2\20\u0099\3\2\2"+
		"\2\22\u00a8\3\2\2\2\24\u00ad\3\2\2\2\26\u00b0\3\2\2\2\30\u00ba\3\2\2\2"+
		"\32\u00bc\3\2\2\2\34\u00c4\3\2\2\2\36\u00ce\3\2\2\2 \u00d0\3\2\2\2\"\u00d4"+
		"\3\2\2\2$\u00d8\3\2\2\2&\u00e0\3\2\2\2(\u00e6\3\2\2\2*\u00e8\3\2\2\2,"+
		"\u00f4\3\2\2\2.\u0109\3\2\2\2\60\u010c\3\2\2\2\62\u0119\3\2\2\2\64\u011b"+
		"\3\2\2\2\66\u0122\3\2\2\28\u012a\3\2\2\2:\u012e\3\2\2\2<\u0136\3\2\2\2"+
		">\u013e\3\2\2\2@\u0142\3\2\2\2B\u014a\3\2\2\2D\u0163\3\2\2\2F\u0165\3"+
		"\2\2\2H\u0167\3\2\2\2J\u016c\3\2\2\2L\u017a\3\2\2\2N\u018f\3\2\2\2P\u0191"+
		"\3\2\2\2R\u0194\3\2\2\2T\u0197\3\2\2\2V\u019b\3\2\2\2X\u01a3\3\2\2\2Z"+
		"\u01a7\3\2\2\2\\\u01a9\3\2\2\2^\u01ab\3\2\2\2`\u01b1\3\2\2\2b\u01bb\3"+
		"\2\2\2d\u01bd\3\2\2\2f\u01bf\3\2\2\2h\u01c1\3\2\2\2j\u01c3\3\2\2\2l\u01c5"+
		"\3\2\2\2n\u01c7\3\2\2\2pr\5\4\3\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2"+
		"\2\2tw\3\2\2\2us\3\2\2\2vx\5\6\4\2wv\3\2\2\2wx\3\2\2\2xz\3\2\2\2y{\5P"+
		")\2zy\3\2\2\2z{\3\2\2\2{|\3\2\2\2|}\7\2\2\3}\3\3\2\2\2~\177\7\3\2\2\177"+
		"\u0080\5n8\2\u0080\5\3\2\2\2\u0081\u0082\5\b\5\2\u0082\u0083\5\22\n\2"+
		"\u0083\7\3\2\2\2\u0084\u0085\5\n\6\2\u0085\u0086\7\6\2\2\u0086\u0087\5"+
		"\36\20\2\u0087\u0089\7\63\2\2\u0088\u008a\5\66\34\2\u0089\u0088\3\2\2"+
		"\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\7\64\2\2\u008c"+
		"\u008e\5\20\t\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\t\3\2\2"+
		"\2\u008f\u0091\5\f\7\2\u0090\u008f\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093"+
		"\3\2\2\2\u0092\u0094\5\16\b\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2"+
		"\u0094\13\3\2\2\2\u0095\u0096\7\4\2\2\u0096\r\3\2\2\2\u0097\u0098\7\5"+
		"\2\2\u0098\17\3\2\2\2\u0099\u009a\7\b\2\2\u009a\u009b\5Z.\2\u009b\21\3"+
		"\2\2\2\u009c\u009d\7\65\2\2\u009d\u009e\5\26\f\2\u009e\u009f\7\66\2\2"+
		"\u009f\u00a9\3\2\2\2\u00a0\u00a4\7\65\2\2\u00a1\u00a3\5\24\13\2\u00a2"+
		"\u00a1\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2"+
		"\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a9\7\66\2\2\u00a8"+
		"\u009c\3\2\2\2\u00a8\u00a0\3\2\2\2\u00a9\23\3\2\2\2\u00aa\u00ae\5 \21"+
		"\2\u00ab\u00ae\5\60\31\2\u00ac\u00ae\5\30\r\2\u00ad\u00aa\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\25\3\2\2\2\u00af\u00b1\5\32\16"+
		"\2\u00b0\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b5\3\2\2\2\u00b2\u00b4"+
		"\5\30\r\2\u00b3\u00b2\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2"+
		"\u00b5\u00b6\3\2\2\2\u00b6\27\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00bb"+
		"\5> \2\u00b9\u00bb\5H%\2\u00ba\u00b8\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb"+
		"\31\3\2\2\2\u00bc\u00c1\5\34\17\2\u00bd\u00be\7%\2\2\u00be\u00c0\5\34"+
		"\17\2\u00bf\u00bd\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\33\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5\5\36\20"+
		"\2\u00c5\u00c7\7\63\2\2\u00c6\u00c8\5<\37\2\u00c7\u00c6\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cc\7\64\2\2\u00ca\u00cb\7"+
		"\n\2\2\u00cb\u00cd\7<\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\35\3\2\2\2\u00ce\u00cf\7<\2\2\u00cf\37\3\2\2\2\u00d0\u00d1\5*\26\2\u00d1"+
		"\u00d2\7\30\2\2\u00d2\u00d3\5\"\22\2\u00d3!\3\2\2\2\u00d4\u00d5\7\65\2"+
		"\2\u00d5\u00d6\5$\23\2\u00d6\u00d7\7\66\2\2\u00d7#\3\2\2\2\u00d8\u00dd"+
		"\5&\24\2\u00d9\u00da\7:\2\2\u00da\u00dc\5&\24\2\u00db\u00d9\3\2\2\2\u00dc"+
		"\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de%\3\2\2\2"+
		"\u00df\u00dd\3\2\2\2\u00e0\u00e1\5\\/\2\u00e1\u00e2\7\20\2\2\u00e2\u00e3"+
		"\5,\27\2\u00e3\'\3\2\2\2\u00e4\u00e7\5*\26\2\u00e5\u00e7\5\"\22\2\u00e6"+
		"\u00e4\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7)\3\2\2\2\u00e8\u00e9\7<\2\2\u00e9"+
		"+\3\2\2\2\u00ea\u00eb\b\27\1\2\u00eb\u00ec\7\63\2\2\u00ec\u00ed\5,\27"+
		"\2\u00ed\u00ee\7\64\2\2\u00ee\u00f5\3\2\2\2\u00ef\u00f5\5.\30\2\u00f0"+
		"\u00f1\t\2\2\2\u00f1\u00f5\5,\27\b\u00f2\u00f3\7\25\2\2\u00f3\u00f5\5"+
		",\27\7\u00f4\u00ea\3\2\2\2\u00f4\u00ef\3\2\2\2\u00f4\u00f0\3\2\2\2\u00f4"+
		"\u00f2\3\2\2\2\u00f5\u0104\3\2\2\2\u00f6\u00f7\f\6\2\2\u00f7\u00f8\t\3"+
		"\2\2\u00f8\u0103\5,\27\7\u00f9\u00fa\f\5\2\2\u00fa\u00fb\t\2\2\2\u00fb"+
		"\u0103\5,\27\6\u00fc\u00fd\f\4\2\2\u00fd\u00fe\t\4\2\2\u00fe\u0103\5,"+
		"\27\5\u00ff\u0100\f\3\2\2\u0100\u0101\t\5\2\2\u0101\u0103\5,\27\4\u0102"+
		"\u00f6\3\2\2\2\u0102\u00f9\3\2\2\2\u0102\u00fc\3\2\2\2\u0102\u00ff\3\2"+
		"\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"-\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u010a\5`\61\2\u0108\u010a\5:\36\2"+
		"\u0109\u0107\3\2\2\2\u0109\u0108\3\2\2\2\u010a/\3\2\2\2\u010b\u010d\5"+
		"\62\32\2\u010c\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
		"\u0116\5(\25\2\u010f\u0111\7\22\2\2\u0110\u0112\5\64\33\2\u0111\u0110"+
		"\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0115\5(\25\2\u0114"+
		"\u010f\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2"+
		"\2\2\u0117\61\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011a\7\t\2\2\u011a\63"+
		"\3\2\2\2\u011b\u011c\7<\2\2\u011c\u011e\7\63\2\2\u011d\u011f\5\66\34\2"+
		"\u011e\u011d\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121"+
		"\7\64\2\2\u0121\65\3\2\2\2\u0122\u0127\58\35\2\u0123\u0124\7:\2\2\u0124"+
		"\u0126\58\35\2\u0125\u0123\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2"+
		"\2\2\u0127\u0128\3\2\2\2\u0128\67\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012b"+
		"\5:\36\2\u012b\u012c\7\21\2\2\u012c\u012d\5^\60\2\u012d9\3\2\2\2\u012e"+
		"\u0133\7<\2\2\u012f\u0130\7;\2\2\u0130\u0132\7<\2\2\u0131\u012f\3\2\2"+
		"\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134;"+
		"\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u013b\5,\27\2\u0137\u0138\7:\2\2\u0138"+
		"\u013a\5,\27\2\u0139\u0137\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2"+
		"\2\2\u013b\u013c\3\2\2\2\u013c=\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u013f"+
		"\5F$\2\u013f\u0140\7\30\2\2\u0140\u0141\5@!\2\u0141?\3\2\2\2\u0142\u0143"+
		"\7\65\2\2\u0143\u0144\5B\"\2\u0144\u0145\7\66\2\2\u0145A\3\2\2\2\u0146"+
		"\u0147\b\"\1\2\u0147\u014b\5D#\2\u0148\u0149\7\25\2\2\u0149\u014b\5B\""+
		"\5\u014a\u0146\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u0154\3\2\2\2\u014c\u014d"+
		"\f\4\2\2\u014d\u014e\7\34\2\2\u014e\u0153\5B\"\5\u014f\u0150\f\3\2\2\u0150"+
		"\u0151\7\35\2\2\u0151\u0153\5B\"\4\u0152\u014c\3\2\2\2\u0152\u014f\3\2"+
		"\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155"+
		"C\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u0158\7\63\2\2\u0158\u0159\5B\"\2"+
		"\u0159\u015a\7\64\2\2\u015a\u0164\3\2\2\2\u015b\u0160\7<\2\2\u015c\u015d"+
		"\7;\2\2\u015d\u015f\7<\2\2\u015e\u015c\3\2\2\2\u015f\u0162\3\2\2\2\u0160"+
		"\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2"+
		"\2\2\u0163\u0157\3\2\2\2\u0163\u015b\3\2\2\2\u0164E\3\2\2\2\u0165\u0166"+
		"\7<\2\2\u0166G\3\2\2\2\u0167\u0168\7\13\2\2\u0168\u0169\7<\2\2\u0169\u016a"+
		"\7\30\2\2\u016a\u016b\5J&\2\u016bI\3\2\2\2\u016c\u016d\7\65\2\2\u016d"+
		"\u016e\5L\'\2\u016e\u016f\7\66\2\2\u016fK\3\2\2\2\u0170\u0171\b\'\1\2"+
		"\u0171\u017b\5N(\2\u0172\u0173\7\25\2\2\u0173\u017b\5L\'\t\u0174\u0175"+
		"\7&\2\2\u0175\u017b\5L\'\5\u0176\u0177\7\'\2\2\u0177\u017b\5L\'\4\u0178"+
		"\u0179\7(\2\2\u0179\u017b\5L\'\3\u017a\u0170\3\2\2\2\u017a\u0172\3\2\2"+
		"\2\u017a\u0174\3\2\2\2\u017a\u0176\3\2\2\2\u017a\u0178\3\2\2\2\u017b\u0187"+
		"\3\2\2\2\u017c\u017d\f\b\2\2\u017d\u017e\7\34\2\2\u017e\u0186\5L\'\t\u017f"+
		"\u0180\f\7\2\2\u0180\u0181\7\35\2\2\u0181\u0186\5L\'\b\u0182\u0183\f\6"+
		"\2\2\u0183\u0184\7)\2\2\u0184\u0186\5L\'\7\u0185\u017c\3\2\2\2\u0185\u017f"+
		"\3\2\2\2\u0185\u0182\3\2\2\2\u0186\u0189\3\2\2\2\u0187\u0185\3\2\2\2\u0187"+
		"\u0188\3\2\2\2\u0188M\3\2\2\2\u0189\u0187\3\2\2\2\u018a\u018b\7\63\2\2"+
		"\u018b\u018c\5L\'\2\u018c\u018d\7\64\2\2\u018d\u0190\3\2\2\2\u018e\u0190"+
		"\5F$\2\u018f\u018a\3\2\2\2\u018f\u018e\3\2\2\2\u0190O\3\2\2\2\u0191\u0192"+
		"\5R*\2\u0192\u0193\5T+\2\u0193Q\3\2\2\2\u0194\u0195\7\7\2\2\u0195\u0196"+
		"\5Z.\2\u0196S\3\2\2\2\u0197\u0198\7\65\2\2\u0198\u0199\5V,\2\u0199\u019a"+
		"\7\66\2\2\u019aU\3\2\2\2\u019b\u01a0\5X-\2\u019c\u019d\7:\2\2\u019d\u019f"+
		"\5X-\2\u019e\u019c\3\2\2\2\u019f\u01a2\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0"+
		"\u01a1\3\2\2\2\u01a1W\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a3\u01a4\5\\/\2\u01a4"+
		"\u01a5\7\21\2\2\u01a5\u01a6\5^\60\2\u01a6Y\3\2\2\2\u01a7\u01a8\7<\2\2"+
		"\u01a8[\3\2\2\2\u01a9\u01aa\7<\2\2\u01aa]\3\2\2\2\u01ab\u01ac\t\6\2\2"+
		"\u01ac_\3\2\2\2\u01ad\u01b2\5b\62\2\u01ae\u01b2\5d\63\2\u01af\u01b2\5"+
		"f\64\2\u01b0\u01b2\5h\65\2\u01b1\u01ad\3\2\2\2\u01b1\u01ae\3\2\2\2\u01b1"+
		"\u01af\3\2\2\2\u01b1\u01b0\3\2\2\2\u01b2a\3\2\2\2\u01b3\u01b5\t\2\2\2"+
		"\u01b4\u01b3\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01bc"+
		"\5j\66\2\u01b7\u01b9\t\2\2\2\u01b8\u01b7\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9"+
		"\u01ba\3\2\2\2\u01ba\u01bc\5l\67\2\u01bb\u01b4\3\2\2\2\u01bb\u01b8\3\2"+
		"\2\2\u01bcc\3\2\2\2\u01bd\u01be\7\61\2\2\u01bee\3\2\2\2\u01bf\u01c0\7"+
		"*\2\2\u01c0g\3\2\2\2\u01c1\u01c2\7\62\2\2\u01c2i\3\2\2\2\u01c3\u01c4\t"+
		"\7\2\2\u01c4k\3\2\2\2\u01c5\u01c6\t\b\2\2\u01c6m\3\2\2\2\u01c7\u01cc\7"+
		"<\2\2\u01c8\u01c9\7;\2\2\u01c9\u01cb\7<\2\2\u01ca\u01c8\3\2\2\2\u01cb"+
		"\u01ce\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cdo\3\2\2\2"+
		"\u01ce\u01cc\3\2\2\2.swz\u0089\u008d\u0090\u0093\u00a4\u00a8\u00ad\u00b0"+
		"\u00b5\u00ba\u00c1\u00c7\u00cc\u00dd\u00e6\u00f4\u0102\u0104\u0109\u010c"+
		"\u0111\u0116\u011e\u0127\u0133\u013b\u014a\u0152\u0154\u0160\u0163\u017a"+
		"\u0185\u0187\u018f\u01a0\u01b1\u01b4\u01b8\u01bb\u01cc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}