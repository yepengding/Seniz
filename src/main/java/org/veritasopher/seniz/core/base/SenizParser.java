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
		IMPORT=1, MAIN=2, CONTROL=3, SYSTEM=4, VARSET=5, OVER=6, INIT=7, BOOLEAN=8, 
		INT=9, FLOAT=10, STRING=11, VALUEOF=12, TYPEOF=13, TO=14, GT=15, LT=16, 
		BANG=17, TILDE=18, QUESTION=19, EQ=20, LE=21, GE=22, NEQ=23, AND=24, OR=25, 
		ADD=26, SUB=27, MUL=28, DIV=29, CARET=30, MOD=31, PAR=32, BOOL_LITERAL=33, 
		DECIMAL_LITERAL=34, HEX_LITERAL=35, OCT_LITERAL=36, BINARY_LITERAL=37, 
		FLOAT_LITERAL=38, HEX_FLOAT_LITERAL=39, STRING_LITERAL=40, NULL_LITERAL=41, 
		LPAREN=42, RPAREN=43, LBRACE=44, RBRACE=45, LBRACK=46, RBRACK=47, SEMI=48, 
		COMMA=49, DOT=50, IDENTIFIER=51, WS=52, COMMENT=53, LINE_COMMENT=54;
	public static final int
		RULE_compilationUnit = 0, RULE_importDeclaration = 1, RULE_systemDeclaration = 2, 
		RULE_systemHeader = 3, RULE_systemModifier = 4, RULE_systemParameter = 5, 
		RULE_systemBody = 6, RULE_systemBodyDeclaration = 7, RULE_controlSystemDeclaration = 8, 
		RULE_controlStatement = 9, RULE_systemIdentifier = 10, RULE_stateNaming = 11, 
		RULE_stateBody = 12, RULE_stateDeclarator = 13, RULE_stateExpression = 14, 
		RULE_stateIdentifier = 15, RULE_stateNameIdentifier = 16, RULE_expression = 17, 
		RULE_primary = 18, RULE_transitionStatement = 19, RULE_initIdentifier = 20, 
		RULE_actionDeclaration = 21, RULE_formalParameterList = 22, RULE_formalParameter = 23, 
		RULE_variableIdentifier = 24, RULE_propositionStatement = 25, RULE_propositionBody = 26, 
		RULE_propositionExpression = 27, RULE_propositionPrimary = 28, RULE_propositionIdentifer = 29, 
		RULE_stateVarSetDeclaration = 30, RULE_stateVarSetHeader = 31, RULE_stateVarSetBody = 32, 
		RULE_stateVarSetDeclarator = 33, RULE_stateVarExpression = 34, RULE_stateVarSetIdentifer = 35, 
		RULE_stateVarIdentifier = 36, RULE_primitiveType = 37, RULE_literal = 38, 
		RULE_numberLiteral = 39, RULE_stringLiteral = 40, RULE_booleanLiteral = 41, 
		RULE_otherLiteral = 42, RULE_integerLiteral = 43, RULE_floatLiteral = 44, 
		RULE_qualifiedName = 45;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "importDeclaration", "systemDeclaration", "systemHeader", 
			"systemModifier", "systemParameter", "systemBody", "systemBodyDeclaration", 
			"controlSystemDeclaration", "controlStatement", "systemIdentifier", "stateNaming", 
			"stateBody", "stateDeclarator", "stateExpression", "stateIdentifier", 
			"stateNameIdentifier", "expression", "primary", "transitionStatement", 
			"initIdentifier", "actionDeclaration", "formalParameterList", "formalParameter", 
			"variableIdentifier", "propositionStatement", "propositionBody", "propositionExpression", 
			"propositionPrimary", "propositionIdentifer", "stateVarSetDeclaration", 
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
			"'init'", "'bool'", "'int'", "'float'", "'string'", "':'", "'::'", "'->'", 
			"'>'", "'<'", "'!'", "'~'", "'?'", "'='", "'<='", "'>='", "'/='", "'&'", 
			"'|'", "'+'", "'-'", "'*'", "'/'", "'^'", "'%'", "'||'", null, null, 
			null, null, null, null, null, null, "'null'", "'('", "')'", "'{'", "'}'", 
			"'['", "']'", "';'", "','", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IMPORT", "MAIN", "CONTROL", "SYSTEM", "VARSET", "OVER", "INIT", 
			"BOOLEAN", "INT", "FLOAT", "STRING", "VALUEOF", "TYPEOF", "TO", "GT", 
			"LT", "BANG", "TILDE", "QUESTION", "EQ", "LE", "GE", "NEQ", "AND", "OR", 
			"ADD", "SUB", "MUL", "DIV", "CARET", "MOD", "PAR", "BOOL_LITERAL", "DECIMAL_LITERAL", 
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
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(92);
				importDeclaration();
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MAIN || _la==SYSTEM) {
				{
				setState(98);
				systemDeclaration();
				}
			}

			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARSET) {
				{
				setState(101);
				stateVarSetDeclaration();
				}
			}

			setState(104);
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
			setState(106);
			match(IMPORT);
			setState(107);
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
			setState(109);
			systemHeader();
			setState(110);
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
		public TerminalNode LPAREN() { return getToken(SenizParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SenizParser.RPAREN, 0); }
		public SystemModifierContext systemModifier() {
			return getRuleContext(SystemModifierContext.class,0);
		}
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
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MAIN) {
				{
				setState(112);
				systemModifier();
				}
			}

			setState(115);
			match(SYSTEM);
			setState(116);
			systemIdentifier();
			setState(117);
			match(LPAREN);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(118);
				formalParameterList();
				}
			}

			setState(121);
			match(RPAREN);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OVER) {
				{
				setState(122);
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

	public static class SystemModifierContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(SenizParser.MAIN, 0); }
		public SystemModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_systemModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).enterSystemModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenizParserListener ) ((SenizParserListener)listener).exitSystemModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenizParserVisitor ) return ((SenizParserVisitor<? extends T>)visitor).visitSystemModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SystemModifierContext systemModifier() throws RecognitionException {
		SystemModifierContext _localctx = new SystemModifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_systemModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
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
		enterRule(_localctx, 10, RULE_systemParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(OVER);
			setState(128);
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
		enterRule(_localctx, 12, RULE_systemBody);
		int _la;
		try {
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(LBRACE);
				setState(131);
				controlSystemDeclaration();
				setState(132);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(LBRACE);
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INIT) | (1L << LBRACE) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(135);
					systemBodyDeclaration();
					}
					}
					setState(140);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(141);
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
		public PropositionStatementContext propositionStatement() {
			return getRuleContext(PropositionStatementContext.class,0);
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
		enterRule(_localctx, 14, RULE_systemBodyDeclaration);
		try {
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				stateNaming();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				transitionStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				propositionStatement();
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
		public List<PropositionStatementContext> propositionStatement() {
			return getRuleContexts(PropositionStatementContext.class);
		}
		public PropositionStatementContext propositionStatement(int i) {
			return getRuleContext(PropositionStatementContext.class,i);
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
		enterRule(_localctx, 16, RULE_controlSystemDeclaration);
		int _la;
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				controlStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(150);
					propositionStatement();
					}
					}
					setState(155);
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

	public static class ControlStatementContext extends ParserRuleContext {
		public List<SystemIdentifierContext> systemIdentifier() {
			return getRuleContexts(SystemIdentifierContext.class);
		}
		public SystemIdentifierContext systemIdentifier(int i) {
			return getRuleContext(SystemIdentifierContext.class,i);
		}
		public List<TerminalNode> PAR() { return getTokens(SenizParser.PAR); }
		public TerminalNode PAR(int i) {
			return getToken(SenizParser.PAR, i);
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
		enterRule(_localctx, 18, RULE_controlStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			systemIdentifier();
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PAR) {
				{
				{
				setState(159);
				match(PAR);
				setState(160);
				systemIdentifier();
				}
				}
				setState(165);
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
		enterRule(_localctx, 20, RULE_systemIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
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
		enterRule(_localctx, 22, RULE_stateNaming);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			stateNameIdentifier();
			setState(169);
			((StateNamingContext)_localctx).bop = match(EQ);
			setState(170);
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
		enterRule(_localctx, 24, RULE_stateBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(LBRACE);
			setState(173);
			stateDeclarator();
			setState(174);
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
		enterRule(_localctx, 26, RULE_stateDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			stateExpression();
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(177);
				match(COMMA);
				setState(178);
				stateExpression();
				}
				}
				setState(183);
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
		enterRule(_localctx, 28, RULE_stateExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			stateVarIdentifier();
			setState(185);
			((StateExpressionContext)_localctx).bop = match(VALUEOF);
			setState(186);
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
		enterRule(_localctx, 30, RULE_stateIdentifier);
		try {
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				stateNameIdentifier();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
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
			setState(192);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesesExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(195);
				match(LPAREN);
				setState(196);
				((ParenthesesExpressionContext)_localctx).inner = expression(0);
				setState(197);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new PrimaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(199);
				primary();
				}
				break;
			case 3:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(200);
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
				setState(201);
				expression(6);
				}
				break;
			case 4:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(202);
				((NotExpressionContext)_localctx).prefix = match(BANG);
				setState(203);
				expression(5);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(220);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(218);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(206);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(207);
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
						setState(208);
						expression(5);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(209);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(210);
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
						setState(211);
						expression(4);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(212);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(213);
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
						setState(214);
						expression(3);
						}
						break;
					case 4:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(215);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(216);
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
						setState(217);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(222);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		enterRule(_localctx, 36, RULE_primary);
		try {
			setState(225);
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
				setState(223);
				literal();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
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
		enterRule(_localctx, 38, RULE_transitionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INIT) {
				{
				setState(227);
				initIdentifier();
				}
			}

			setState(230);
			stateIdentifier();
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TO) {
				{
				{
				setState(231);
				match(TO);
				setState(233);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(232);
					actionDeclaration();
					}
					break;
				}
				setState(235);
				stateIdentifier();
				}
				}
				setState(240);
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
		enterRule(_localctx, 40, RULE_initIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
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
		enterRule(_localctx, 42, RULE_actionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(IDENTIFIER);
			setState(244);
			match(LPAREN);
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(245);
				formalParameterList();
				}
			}

			setState(248);
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
		enterRule(_localctx, 44, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			formalParameter();
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(251);
				match(COMMA);
				setState(252);
				formalParameter();
				}
				}
				setState(257);
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
		enterRule(_localctx, 46, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			variableIdentifier();
			setState(259);
			((FormalParameterContext)_localctx).bop = match(TYPEOF);
			setState(260);
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
		public TerminalNode IDENTIFIER() { return getToken(SenizParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 48, RULE_variableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
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
		enterRule(_localctx, 50, RULE_propositionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			propositionIdentifer();
			setState(265);
			((PropositionStatementContext)_localctx).bop = match(EQ);
			setState(266);
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
		enterRule(_localctx, 52, RULE_propositionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(LBRACE);
			setState(269);
			propositionExpression(0);
			setState(270);
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
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_propositionExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
			case IDENTIFIER:
				{
				_localctx = new PropPrimaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(273);
				propositionPrimary();
				}
				break;
			case BANG:
				{
				_localctx = new PropNotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(274);
				((PropNotExpressionContext)_localctx).prefix = match(BANG);
				setState(275);
				propositionExpression(3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(286);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(284);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new PropConditionalAndExpressionContext(new PropositionExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_propositionExpression);
						setState(278);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(279);
						((PropConditionalAndExpressionContext)_localctx).bop = match(AND);
						setState(280);
						propositionExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new PropConditionalOrExpressionContext(new PropositionExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_propositionExpression);
						setState(281);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(282);
						((PropConditionalOrExpressionContext)_localctx).bop = match(OR);
						setState(283);
						propositionExpression(2);
						}
						break;
					}
					} 
				}
				setState(288);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
		public StateNameIdentifierContext stateNameIdentifier() {
			return getRuleContext(StateNameIdentifierContext.class,0);
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
		enterRule(_localctx, 56, RULE_propositionPrimary);
		try {
			setState(294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				match(LPAREN);
				setState(290);
				propositionExpression(0);
				setState(291);
				match(RPAREN);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				stateNameIdentifier();
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
		enterRule(_localctx, 58, RULE_propositionIdentifer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
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
		enterRule(_localctx, 60, RULE_stateVarSetDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			stateVarSetHeader();
			setState(299);
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
		enterRule(_localctx, 62, RULE_stateVarSetHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(VARSET);
			setState(302);
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
		enterRule(_localctx, 64, RULE_stateVarSetBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(LBRACE);
			setState(305);
			stateVarSetDeclarator();
			setState(306);
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
		enterRule(_localctx, 66, RULE_stateVarSetDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			stateVarExpression();
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(309);
				match(COMMA);
				setState(310);
				stateVarExpression();
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
		enterRule(_localctx, 68, RULE_stateVarExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			stateVarIdentifier();
			setState(317);
			((StateVarExpressionContext)_localctx).bop = match(TYPEOF);
			setState(318);
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
		enterRule(_localctx, 70, RULE_stateVarSetIdentifer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
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
		enterRule(_localctx, 72, RULE_stateVarIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
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
		enterRule(_localctx, 74, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
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
		enterRule(_localctx, 76, RULE_literal);
		try {
			setState(330);
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
				setState(326);
				numberLiteral();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				stringLiteral();
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(328);
				booleanLiteral();
				}
				break;
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(329);
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
		enterRule(_localctx, 78, RULE_numberLiteral);
		int _la;
		try {
			setState(340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ADD || _la==SUB) {
					{
					setState(332);
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

				setState(335);
				integerLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ADD || _la==SUB) {
					{
					setState(336);
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

				setState(339);
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
		enterRule(_localctx, 80, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
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
		enterRule(_localctx, 82, RULE_booleanLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
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
		enterRule(_localctx, 84, RULE_otherLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
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
		enterRule(_localctx, 86, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
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
		enterRule(_localctx, 88, RULE_floatLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
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
		enterRule(_localctx, 90, RULE_qualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(IDENTIFIER);
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(353);
				match(DOT);
				setState(354);
				match(IDENTIFIER);
				}
				}
				setState(359);
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
		case 17:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 27:
			return propositionExpression_sempred((PropositionExpressionContext)_localctx, predIndex);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u016b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\7\2`\n\2\f\2\16\2c\13\2\3\2\5\2f\n\2\3\2\5"+
		"\2i\n\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\5\5t\n\5\3\5\3\5\3\5\3\5\5"+
		"\5z\n\5\3\5\3\5\5\5~\n\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\7"+
		"\b\u008b\n\b\f\b\16\b\u008e\13\b\3\b\5\b\u0091\n\b\3\t\3\t\3\t\5\t\u0096"+
		"\n\t\3\n\3\n\7\n\u009a\n\n\f\n\16\n\u009d\13\n\5\n\u009f\n\n\3\13\3\13"+
		"\3\13\7\13\u00a4\n\13\f\13\16\13\u00a7\13\13\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\7\17\u00b6\n\17\f\17\16\17\u00b9\13"+
		"\17\3\20\3\20\3\20\3\20\3\21\3\21\5\21\u00c1\n\21\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00cf\n\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00dd\n\23\f\23\16"+
		"\23\u00e0\13\23\3\24\3\24\5\24\u00e4\n\24\3\25\5\25\u00e7\n\25\3\25\3"+
		"\25\3\25\5\25\u00ec\n\25\3\25\7\25\u00ef\n\25\f\25\16\25\u00f2\13\25\3"+
		"\26\3\26\3\27\3\27\3\27\5\27\u00f9\n\27\3\27\3\27\3\30\3\30\3\30\7\30"+
		"\u0100\n\30\f\30\16\30\u0103\13\30\3\31\3\31\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\5\35\u0117\n\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u011f\n\35\f\35\16\35\u0122\13\35"+
		"\3\36\3\36\3\36\3\36\3\36\5\36\u0129\n\36\3\37\3\37\3 \3 \3 \3!\3!\3!"+
		"\3\"\3\"\3\"\3\"\3#\3#\3#\7#\u013a\n#\f#\16#\u013d\13#\3$\3$\3$\3$\3%"+
		"\3%\3&\3&\3\'\3\'\3(\3(\3(\3(\5(\u014d\n(\3)\5)\u0150\n)\3)\3)\5)\u0154"+
		"\n)\3)\5)\u0157\n)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3/\7/\u0166\n/"+
		"\f/\16/\u0169\13/\3/\2\4$8\60\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\\2\t\3\2\34\35\3\2\36!\4\2\21"+
		"\22\26\31\3\2\32\33\3\2\n\r\3\2$\'\3\2()\2\u0164\2a\3\2\2\2\4l\3\2\2\2"+
		"\6o\3\2\2\2\bs\3\2\2\2\n\177\3\2\2\2\f\u0081\3\2\2\2\16\u0090\3\2\2\2"+
		"\20\u0095\3\2\2\2\22\u009e\3\2\2\2\24\u00a0\3\2\2\2\26\u00a8\3\2\2\2\30"+
		"\u00aa\3\2\2\2\32\u00ae\3\2\2\2\34\u00b2\3\2\2\2\36\u00ba\3\2\2\2 \u00c0"+
		"\3\2\2\2\"\u00c2\3\2\2\2$\u00ce\3\2\2\2&\u00e3\3\2\2\2(\u00e6\3\2\2\2"+
		"*\u00f3\3\2\2\2,\u00f5\3\2\2\2.\u00fc\3\2\2\2\60\u0104\3\2\2\2\62\u0108"+
		"\3\2\2\2\64\u010a\3\2\2\2\66\u010e\3\2\2\28\u0116\3\2\2\2:\u0128\3\2\2"+
		"\2<\u012a\3\2\2\2>\u012c\3\2\2\2@\u012f\3\2\2\2B\u0132\3\2\2\2D\u0136"+
		"\3\2\2\2F\u013e\3\2\2\2H\u0142\3\2\2\2J\u0144\3\2\2\2L\u0146\3\2\2\2N"+
		"\u014c\3\2\2\2P\u0156\3\2\2\2R\u0158\3\2\2\2T\u015a\3\2\2\2V\u015c\3\2"+
		"\2\2X\u015e\3\2\2\2Z\u0160\3\2\2\2\\\u0162\3\2\2\2^`\5\4\3\2_^\3\2\2\2"+
		"`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2be\3\2\2\2ca\3\2\2\2df\5\6\4\2ed\3\2\2\2"+
		"ef\3\2\2\2fh\3\2\2\2gi\5> \2hg\3\2\2\2hi\3\2\2\2ij\3\2\2\2jk\7\2\2\3k"+
		"\3\3\2\2\2lm\7\3\2\2mn\5\\/\2n\5\3\2\2\2op\5\b\5\2pq\5\16\b\2q\7\3\2\2"+
		"\2rt\5\n\6\2sr\3\2\2\2st\3\2\2\2tu\3\2\2\2uv\7\6\2\2vw\5\26\f\2wy\7,\2"+
		"\2xz\5.\30\2yx\3\2\2\2yz\3\2\2\2z{\3\2\2\2{}\7-\2\2|~\5\f\7\2}|\3\2\2"+
		"\2}~\3\2\2\2~\t\3\2\2\2\177\u0080\7\4\2\2\u0080\13\3\2\2\2\u0081\u0082"+
		"\7\b\2\2\u0082\u0083\5H%\2\u0083\r\3\2\2\2\u0084\u0085\7.\2\2\u0085\u0086"+
		"\5\22\n\2\u0086\u0087\7/\2\2\u0087\u0091\3\2\2\2\u0088\u008c\7.\2\2\u0089"+
		"\u008b\5\20\t\2\u008a\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3"+
		"\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f"+
		"\u0091\7/\2\2\u0090\u0084\3\2\2\2\u0090\u0088\3\2\2\2\u0091\17\3\2\2\2"+
		"\u0092\u0096\5\30\r\2\u0093\u0096\5(\25\2\u0094\u0096\5\64\33\2\u0095"+
		"\u0092\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0094\3\2\2\2\u0096\21\3\2\2"+
		"\2\u0097\u009f\5\24\13\2\u0098\u009a\5\64\33\2\u0099\u0098\3\2\2\2\u009a"+
		"\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009f\3\2"+
		"\2\2\u009d\u009b\3\2\2\2\u009e\u0097\3\2\2\2\u009e\u009b\3\2\2\2\u009f"+
		"\23\3\2\2\2\u00a0\u00a5\5\26\f\2\u00a1\u00a2\7\"\2\2\u00a2\u00a4\5\26"+
		"\f\2\u00a3\u00a1\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\25\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\7\65\2"+
		"\2\u00a9\27\3\2\2\2\u00aa\u00ab\5\"\22\2\u00ab\u00ac\7\26\2\2\u00ac\u00ad"+
		"\5\32\16\2\u00ad\31\3\2\2\2\u00ae\u00af\7.\2\2\u00af\u00b0\5\34\17\2\u00b0"+
		"\u00b1\7/\2\2\u00b1\33\3\2\2\2\u00b2\u00b7\5\36\20\2\u00b3\u00b4\7\63"+
		"\2\2\u00b4\u00b6\5\36\20\2\u00b5\u00b3\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\35\3\2\2\2\u00b9\u00b7\3\2\2"+
		"\2\u00ba\u00bb\5J&\2\u00bb\u00bc\7\16\2\2\u00bc\u00bd\5$\23\2\u00bd\37"+
		"\3\2\2\2\u00be\u00c1\5\"\22\2\u00bf\u00c1\5\32\16\2\u00c0\u00be\3\2\2"+
		"\2\u00c0\u00bf\3\2\2\2\u00c1!\3\2\2\2\u00c2\u00c3\7\65\2\2\u00c3#\3\2"+
		"\2\2\u00c4\u00c5\b\23\1\2\u00c5\u00c6\7,\2\2\u00c6\u00c7\5$\23\2\u00c7"+
		"\u00c8\7-\2\2\u00c8\u00cf\3\2\2\2\u00c9\u00cf\5&\24\2\u00ca\u00cb\t\2"+
		"\2\2\u00cb\u00cf\5$\23\b\u00cc\u00cd\7\23\2\2\u00cd\u00cf\5$\23\7\u00ce"+
		"\u00c4\3\2\2\2\u00ce\u00c9\3\2\2\2\u00ce\u00ca\3\2\2\2\u00ce\u00cc\3\2"+
		"\2\2\u00cf\u00de\3\2\2\2\u00d0\u00d1\f\6\2\2\u00d1\u00d2\t\3\2\2\u00d2"+
		"\u00dd\5$\23\7\u00d3\u00d4\f\5\2\2\u00d4\u00d5\t\2\2\2\u00d5\u00dd\5$"+
		"\23\6\u00d6\u00d7\f\4\2\2\u00d7\u00d8\t\4\2\2\u00d8\u00dd\5$\23\5\u00d9"+
		"\u00da\f\3\2\2\u00da\u00db\t\5\2\2\u00db\u00dd\5$\23\4\u00dc\u00d0\3\2"+
		"\2\2\u00dc\u00d3\3\2\2\2\u00dc\u00d6\3\2\2\2\u00dc\u00d9\3\2\2\2\u00dd"+
		"\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df%\3\2\2\2"+
		"\u00e0\u00de\3\2\2\2\u00e1\u00e4\5N(\2\u00e2\u00e4\5\62\32\2\u00e3\u00e1"+
		"\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4\'\3\2\2\2\u00e5\u00e7\5*\26\2\u00e6"+
		"\u00e5\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00f0\5 "+
		"\21\2\u00e9\u00eb\7\20\2\2\u00ea\u00ec\5,\27\2\u00eb\u00ea\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\5 \21\2\u00ee\u00e9\3\2"+
		"\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		")\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f4\7\t\2\2\u00f4+\3\2\2\2\u00f5"+
		"\u00f6\7\65\2\2\u00f6\u00f8\7,\2\2\u00f7\u00f9\5.\30\2\u00f8\u00f7\3\2"+
		"\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\7-\2\2\u00fb"+
		"-\3\2\2\2\u00fc\u0101\5\60\31\2\u00fd\u00fe\7\63\2\2\u00fe\u0100\5\60"+
		"\31\2\u00ff\u00fd\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101"+
		"\u0102\3\2\2\2\u0102/\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0105\5\62\32"+
		"\2\u0105\u0106\7\17\2\2\u0106\u0107\5L\'\2\u0107\61\3\2\2\2\u0108\u0109"+
		"\7\65\2\2\u0109\63\3\2\2\2\u010a\u010b\5<\37\2\u010b\u010c\7\26\2\2\u010c"+
		"\u010d\5\66\34\2\u010d\65\3\2\2\2\u010e\u010f\7.\2\2\u010f\u0110\58\35"+
		"\2\u0110\u0111\7/\2\2\u0111\67\3\2\2\2\u0112\u0113\b\35\1\2\u0113\u0117"+
		"\5:\36\2\u0114\u0115\7\23\2\2\u0115\u0117\58\35\5\u0116\u0112\3\2\2\2"+
		"\u0116\u0114\3\2\2\2\u0117\u0120\3\2\2\2\u0118\u0119\f\4\2\2\u0119\u011a"+
		"\7\32\2\2\u011a\u011f\58\35\5\u011b\u011c\f\3\2\2\u011c\u011d\7\33\2\2"+
		"\u011d\u011f\58\35\4\u011e\u0118\3\2\2\2\u011e\u011b\3\2\2\2\u011f\u0122"+
		"\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u01219\3\2\2\2\u0122"+
		"\u0120\3\2\2\2\u0123\u0124\7,\2\2\u0124\u0125\58\35\2\u0125\u0126\7-\2"+
		"\2\u0126\u0129\3\2\2\2\u0127\u0129\5\"\22\2\u0128\u0123\3\2\2\2\u0128"+
		"\u0127\3\2\2\2\u0129;\3\2\2\2\u012a\u012b\7\65\2\2\u012b=\3\2\2\2\u012c"+
		"\u012d\5@!\2\u012d\u012e\5B\"\2\u012e?\3\2\2\2\u012f\u0130\7\7\2\2\u0130"+
		"\u0131\5H%\2\u0131A\3\2\2\2\u0132\u0133\7.\2\2\u0133\u0134\5D#\2\u0134"+
		"\u0135\7/\2\2\u0135C\3\2\2\2\u0136\u013b\5F$\2\u0137\u0138\7\63\2\2\u0138"+
		"\u013a\5F$\2\u0139\u0137\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2"+
		"\2\u013b\u013c\3\2\2\2\u013cE\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u013f"+
		"\5J&\2\u013f\u0140\7\17\2\2\u0140\u0141\5L\'\2\u0141G\3\2\2\2\u0142\u0143"+
		"\7\65\2\2\u0143I\3\2\2\2\u0144\u0145\7\65\2\2\u0145K\3\2\2\2\u0146\u0147"+
		"\t\6\2\2\u0147M\3\2\2\2\u0148\u014d\5P)\2\u0149\u014d\5R*\2\u014a\u014d"+
		"\5T+\2\u014b\u014d\5V,\2\u014c\u0148\3\2\2\2\u014c\u0149\3\2\2\2\u014c"+
		"\u014a\3\2\2\2\u014c\u014b\3\2\2\2\u014dO\3\2\2\2\u014e\u0150\t\2\2\2"+
		"\u014f\u014e\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0157"+
		"\5X-\2\u0152\u0154\t\2\2\2\u0153\u0152\3\2\2\2\u0153\u0154\3\2\2\2\u0154"+
		"\u0155\3\2\2\2\u0155\u0157\5Z.\2\u0156\u014f\3\2\2\2\u0156\u0153\3\2\2"+
		"\2\u0157Q\3\2\2\2\u0158\u0159\7*\2\2\u0159S\3\2\2\2\u015a\u015b\7#\2\2"+
		"\u015bU\3\2\2\2\u015c\u015d\7+\2\2\u015dW\3\2\2\2\u015e\u015f\t\7\2\2"+
		"\u015fY\3\2\2\2\u0160\u0161\t\b\2\2\u0161[\3\2\2\2\u0162\u0167\7\65\2"+
		"\2\u0163\u0164\7\64\2\2\u0164\u0166\7\65\2\2\u0165\u0163\3\2\2\2\u0166"+
		"\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168]\3\2\2\2"+
		"\u0169\u0167\3\2\2\2#aehsy}\u008c\u0090\u0095\u009b\u009e\u00a5\u00b7"+
		"\u00c0\u00ce\u00dc\u00de\u00e3\u00e6\u00eb\u00f0\u00f8\u0101\u0116\u011e"+
		"\u0120\u0128\u013b\u014c\u014f\u0153\u0156\u0167";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}