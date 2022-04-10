// Generated from /Users/michaeltei/Projects/ResearchProjects/FDD/Seniz/project/Seniz/Grammar/SenizLexer.g4 by ANTLR 4.9.2
package org.veritasopher.seniz.core.base;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SenizLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IMPORT", "MAIN", "CONTROL", "SYSTEM", "VARSET", "CHANSET", "OVER", "WITH", 
			"INIT", "AS", "SYNC", "ASYNC", "ARGS", "PROP", "LTL", "BOOLEAN", "INT", 
			"FLOAT", "STRING", "INTERNAL", "EXTERNAL", "VALUEOF", "TYPEOF", "TO", 
			"GT", "LT", "BANG", "TILDE", "QUESTION", "EQ", "LE", "GE", "NEQ", "AND", 
			"OR", "LAND", "LOR", "ADD", "SUB", "MUL", "DIV", "CARET", "MOD", "GLOBAL", 
			"ALWAYS", "EVENTUALLY", "NEXT", "UNTIL", "BOOL_LITERAL", "DECIMAL_LITERAL", 
			"HEX_LITERAL", "OCT_LITERAL", "BINARY_LITERAL", "FLOAT_LITERAL", "HEX_FLOAT_LITERAL", 
			"STRING_LITERAL", "NULL_LITERAL", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "IDENTIFIER", "WS", "COMMENT", 
			"LINE_COMMENT", "ExponentPart", "EscapeSequence", "HexDigits", "HexDigit", 
			"Digits"
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


	public SenizLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SenizLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2H\u024d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3"+
		"\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*"+
		"\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\5\62\u015e\n\62\3\63\3\63\3\63\5\63\u0163\n"+
		"\63\3\63\6\63\u0166\n\63\r\63\16\63\u0167\3\63\5\63\u016b\n\63\5\63\u016d"+
		"\n\63\3\63\5\63\u0170\n\63\3\64\3\64\3\64\3\64\7\64\u0176\n\64\f\64\16"+
		"\64\u0179\13\64\3\64\5\64\u017c\n\64\3\64\5\64\u017f\n\64\3\65\3\65\7"+
		"\65\u0183\n\65\f\65\16\65\u0186\13\65\3\65\3\65\7\65\u018a\n\65\f\65\16"+
		"\65\u018d\13\65\3\65\5\65\u0190\n\65\3\65\5\65\u0193\n\65\3\66\3\66\3"+
		"\66\3\66\7\66\u0199\n\66\f\66\16\66\u019c\13\66\3\66\5\66\u019f\n\66\3"+
		"\66\5\66\u01a2\n\66\3\67\3\67\3\67\5\67\u01a7\n\67\3\67\3\67\5\67\u01ab"+
		"\n\67\3\67\5\67\u01ae\n\67\3\67\5\67\u01b1\n\67\3\67\3\67\3\67\5\67\u01b6"+
		"\n\67\3\67\5\67\u01b9\n\67\5\67\u01bb\n\67\38\38\38\38\58\u01c1\n8\38"+
		"\58\u01c4\n8\38\38\58\u01c8\n8\38\38\58\u01cc\n8\38\38\58\u01d0\n8\39"+
		"\39\39\79\u01d5\n9\f9\169\u01d8\139\39\39\3:\3:\3:\3:\3:\3;\3;\3<\3<\3"+
		"=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\7D\u01f5\nD\fD\16D\u01f8"+
		"\13D\3E\6E\u01fb\nE\rE\16E\u01fc\3E\3E\3F\3F\3F\3F\7F\u0205\nF\fF\16F"+
		"\u0208\13F\3F\3F\3F\3F\3F\3G\3G\3G\3G\7G\u0213\nG\fG\16G\u0216\13G\3G"+
		"\3G\3H\3H\5H\u021c\nH\3H\3H\3I\3I\3I\3I\5I\u0224\nI\3I\5I\u0227\nI\3I"+
		"\3I\3I\6I\u022c\nI\rI\16I\u022d\3I\3I\3I\3I\3I\5I\u0235\nI\3J\3J\3J\7"+
		"J\u023a\nJ\fJ\16J\u023d\13J\3J\5J\u0240\nJ\3K\3K\3L\3L\7L\u0246\nL\fL"+
		"\16L\u0249\13L\3L\5L\u024c\nL\3\u0206\2M\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W"+
		"-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083"+
		"C\u0085D\u0087E\u0089F\u008bG\u008dH\u008f\2\u0091\2\u0093\2\u0095\2\u0097"+
		"\2\3\2\31\3\2\63;\4\2NNnn\4\2ZZzz\5\2\62;CHch\6\2\62;CHaach\3\2\629\4"+
		"\2\629aa\4\2DDdd\3\2\62\63\4\2\62\63aa\6\2FFHHffhh\4\2RRrr\4\2--//\6\2"+
		"\f\f\17\17$$^^\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\16\17\"\"\4\2\f\f\17"+
		"\17\4\2GGgg\n\2$$))^^ddhhppttvv\3\2\62\65\3\2\62;\4\2\62;aa\2\u0274\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U"+
		"\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2"+
		"\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2"+
		"\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{"+
		"\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\3\u0099\3\2\2\2\5\u00a0\3\2\2\2\7\u00a5\3\2\2\2\t\u00ad\3\2\2\2\13"+
		"\u00b4\3\2\2\2\r\u00bb\3\2\2\2\17\u00c3\3\2\2\2\21\u00c8\3\2\2\2\23\u00cd"+
		"\3\2\2\2\25\u00d2\3\2\2\2\27\u00d5\3\2\2\2\31\u00da\3\2\2\2\33\u00e0\3"+
		"\2\2\2\35\u00e5\3\2\2\2\37\u00ea\3\2\2\2!\u00ee\3\2\2\2#\u00f3\3\2\2\2"+
		"%\u00f7\3\2\2\2\'\u00fd\3\2\2\2)\u0104\3\2\2\2+\u010d\3\2\2\2-\u0116\3"+
		"\2\2\2/\u0118\3\2\2\2\61\u011b\3\2\2\2\63\u011e\3\2\2\2\65\u0120\3\2\2"+
		"\2\67\u0122\3\2\2\29\u0124\3\2\2\2;\u0126\3\2\2\2=\u0128\3\2\2\2?\u012a"+
		"\3\2\2\2A\u012d\3\2\2\2C\u0130\3\2\2\2E\u0133\3\2\2\2G\u0135\3\2\2\2I"+
		"\u0137\3\2\2\2K\u013b\3\2\2\2M\u013e\3\2\2\2O\u0140\3\2\2\2Q\u0142\3\2"+
		"\2\2S\u0144\3\2\2\2U\u0146\3\2\2\2W\u0148\3\2\2\2Y\u014a\3\2\2\2[\u014c"+
		"\3\2\2\2]\u014e\3\2\2\2_\u0150\3\2\2\2a\u0152\3\2\2\2c\u015d\3\2\2\2e"+
		"\u016c\3\2\2\2g\u0171\3\2\2\2i\u0180\3\2\2\2k\u0194\3\2\2\2m\u01ba\3\2"+
		"\2\2o\u01bc\3\2\2\2q\u01d1\3\2\2\2s\u01db\3\2\2\2u\u01e0\3\2\2\2w\u01e2"+
		"\3\2\2\2y\u01e4\3\2\2\2{\u01e6\3\2\2\2}\u01e8\3\2\2\2\177\u01ea\3\2\2"+
		"\2\u0081\u01ec\3\2\2\2\u0083\u01ee\3\2\2\2\u0085\u01f0\3\2\2\2\u0087\u01f2"+
		"\3\2\2\2\u0089\u01fa\3\2\2\2\u008b\u0200\3\2\2\2\u008d\u020e\3\2\2\2\u008f"+
		"\u0219\3\2\2\2\u0091\u0234\3\2\2\2\u0093\u0236\3\2\2\2\u0095\u0241\3\2"+
		"\2\2\u0097\u0243\3\2\2\2\u0099\u009a\7k\2\2\u009a\u009b\7o\2\2\u009b\u009c"+
		"\7r\2\2\u009c\u009d\7q\2\2\u009d\u009e\7t\2\2\u009e\u009f\7v\2\2\u009f"+
		"\4\3\2\2\2\u00a0\u00a1\7o\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3\7k\2\2\u00a3"+
		"\u00a4\7p\2\2\u00a4\6\3\2\2\2\u00a5\u00a6\7e\2\2\u00a6\u00a7\7q\2\2\u00a7"+
		"\u00a8\7p\2\2\u00a8\u00a9\7v\2\2\u00a9\u00aa\7t\2\2\u00aa\u00ab\7q\2\2"+
		"\u00ab\u00ac\7n\2\2\u00ac\b\3\2\2\2\u00ad\u00ae\7u\2\2\u00ae\u00af\7{"+
		"\2\2\u00af\u00b0\7u\2\2\u00b0\u00b1\7v\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3"+
		"\7o\2\2\u00b3\n\3\2\2\2\u00b4\u00b5\7x\2\2\u00b5\u00b6\7c\2\2\u00b6\u00b7"+
		"\7t\2\2\u00b7\u00b8\7u\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba\7v\2\2\u00ba"+
		"\f\3\2\2\2\u00bb\u00bc\7e\2\2\u00bc\u00bd\7j\2\2\u00bd\u00be\7c\2\2\u00be"+
		"\u00bf\7p\2\2\u00bf\u00c0\7u\2\2\u00c0\u00c1\7g\2\2\u00c1\u00c2\7v\2\2"+
		"\u00c2\16\3\2\2\2\u00c3\u00c4\7q\2\2\u00c4\u00c5\7x\2\2\u00c5\u00c6\7"+
		"g\2\2\u00c6\u00c7\7t\2\2\u00c7\20\3\2\2\2\u00c8\u00c9\7y\2\2\u00c9\u00ca"+
		"\7k\2\2\u00ca\u00cb\7v\2\2\u00cb\u00cc\7j\2\2\u00cc\22\3\2\2\2\u00cd\u00ce"+
		"\7k\2\2\u00ce\u00cf\7p\2\2\u00cf\u00d0\7k\2\2\u00d0\u00d1\7v\2\2\u00d1"+
		"\24\3\2\2\2\u00d2\u00d3\7c\2\2\u00d3\u00d4\7u\2\2\u00d4\26\3\2\2\2\u00d5"+
		"\u00d6\7u\2\2\u00d6\u00d7\7{\2\2\u00d7\u00d8\7p\2\2\u00d8\u00d9\7e\2\2"+
		"\u00d9\30\3\2\2\2\u00da\u00db\7c\2\2\u00db\u00dc\7u\2\2\u00dc\u00dd\7"+
		"{\2\2\u00dd\u00de\7p\2\2\u00de\u00df\7e\2\2\u00df\32\3\2\2\2\u00e0\u00e1"+
		"\7c\2\2\u00e1\u00e2\7t\2\2\u00e2\u00e3\7i\2\2\u00e3\u00e4\7u\2\2\u00e4"+
		"\34\3\2\2\2\u00e5\u00e6\7r\2\2\u00e6\u00e7\7t\2\2\u00e7\u00e8\7q\2\2\u00e8"+
		"\u00e9\7r\2\2\u00e9\36\3\2\2\2\u00ea\u00eb\7n\2\2\u00eb\u00ec\7v\2\2\u00ec"+
		"\u00ed\7n\2\2\u00ed \3\2\2\2\u00ee\u00ef\7d\2\2\u00ef\u00f0\7q\2\2\u00f0"+
		"\u00f1\7q\2\2\u00f1\u00f2\7n\2\2\u00f2\"\3\2\2\2\u00f3\u00f4\7k\2\2\u00f4"+
		"\u00f5\7p\2\2\u00f5\u00f6\7v\2\2\u00f6$\3\2\2\2\u00f7\u00f8\7h\2\2\u00f8"+
		"\u00f9\7n\2\2\u00f9\u00fa\7q\2\2\u00fa\u00fb\7c\2\2\u00fb\u00fc\7v\2\2"+
		"\u00fc&\3\2\2\2\u00fd\u00fe\7u\2\2\u00fe\u00ff\7v\2\2\u00ff\u0100\7t\2"+
		"\2\u0100\u0101\7k\2\2\u0101\u0102\7p\2\2\u0102\u0103\7i\2\2\u0103(\3\2"+
		"\2\2\u0104\u0105\7k\2\2\u0105\u0106\7p\2\2\u0106\u0107\7v\2\2\u0107\u0108"+
		"\7g\2\2\u0108\u0109\7t\2\2\u0109\u010a\7p\2\2\u010a\u010b\7c\2\2\u010b"+
		"\u010c\7n\2\2\u010c*\3\2\2\2\u010d\u010e\7g\2\2\u010e\u010f\7z\2\2\u010f"+
		"\u0110\7v\2\2\u0110\u0111\7g\2\2\u0111\u0112\7t\2\2\u0112\u0113\7p\2\2"+
		"\u0113\u0114\7c\2\2\u0114\u0115\7n\2\2\u0115,\3\2\2\2\u0116\u0117\7<\2"+
		"\2\u0117.\3\2\2\2\u0118\u0119\7<\2\2\u0119\u011a\7<\2\2\u011a\60\3\2\2"+
		"\2\u011b\u011c\7/\2\2\u011c\u011d\7@\2\2\u011d\62\3\2\2\2\u011e\u011f"+
		"\7@\2\2\u011f\64\3\2\2\2\u0120\u0121\7>\2\2\u0121\66\3\2\2\2\u0122\u0123"+
		"\7#\2\2\u01238\3\2\2\2\u0124\u0125\7\u0080\2\2\u0125:\3\2\2\2\u0126\u0127"+
		"\7A\2\2\u0127<\3\2\2\2\u0128\u0129\7?\2\2\u0129>\3\2\2\2\u012a\u012b\7"+
		">\2\2\u012b\u012c\7?\2\2\u012c@\3\2\2\2\u012d\u012e\7@\2\2\u012e\u012f"+
		"\7?\2\2\u012fB\3\2\2\2\u0130\u0131\7\61\2\2\u0131\u0132\7?\2\2\u0132D"+
		"\3\2\2\2\u0133\u0134\7(\2\2\u0134F\3\2\2\2\u0135\u0136\7~\2\2\u0136H\3"+
		"\2\2\2\u0137\u0138\7c\2\2\u0138\u0139\7p\2\2\u0139\u013a\7f\2\2\u013a"+
		"J\3\2\2\2\u013b\u013c\7q\2\2\u013c\u013d\7t\2\2\u013dL\3\2\2\2\u013e\u013f"+
		"\7-\2\2\u013fN\3\2\2\2\u0140\u0141\7/\2\2\u0141P\3\2\2\2\u0142\u0143\7"+
		",\2\2\u0143R\3\2\2\2\u0144\u0145\7\61\2\2\u0145T\3\2\2\2\u0146\u0147\7"+
		"`\2\2\u0147V\3\2\2\2\u0148\u0149\7\'\2\2\u0149X\3\2\2\2\u014a\u014b\7"+
		"B\2\2\u014bZ\3\2\2\2\u014c\u014d\7I\2\2\u014d\\\3\2\2\2\u014e\u014f\7"+
		"H\2\2\u014f^\3\2\2\2\u0150\u0151\7Z\2\2\u0151`\3\2\2\2\u0152\u0153\7W"+
		"\2\2\u0153b\3\2\2\2\u0154\u0155\7v\2\2\u0155\u0156\7t\2\2\u0156\u0157"+
		"\7w\2\2\u0157\u015e\7g\2\2\u0158\u0159\7h\2\2\u0159\u015a\7c\2\2\u015a"+
		"\u015b\7n\2\2\u015b\u015c\7u\2\2\u015c\u015e\7g\2\2\u015d\u0154\3\2\2"+
		"\2\u015d\u0158\3\2\2\2\u015ed\3\2\2\2\u015f\u016d\7\62\2\2\u0160\u016a"+
		"\t\2\2\2\u0161\u0163\5\u0097L\2\u0162\u0161\3\2\2\2\u0162\u0163\3\2\2"+
		"\2\u0163\u016b\3\2\2\2\u0164\u0166\7a\2\2\u0165\u0164\3\2\2\2\u0166\u0167"+
		"\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169\3\2\2\2\u0169"+
		"\u016b\5\u0097L\2\u016a\u0162\3\2\2\2\u016a\u0165\3\2\2\2\u016b\u016d"+
		"\3\2\2\2\u016c\u015f\3\2\2\2\u016c\u0160\3\2\2\2\u016d\u016f\3\2\2\2\u016e"+
		"\u0170\t\3\2\2\u016f\u016e\3\2\2\2\u016f\u0170\3\2\2\2\u0170f\3\2\2\2"+
		"\u0171\u0172\7\62\2\2\u0172\u0173\t\4\2\2\u0173\u017b\t\5\2\2\u0174\u0176"+
		"\t\6\2\2\u0175\u0174\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0177"+
		"\u0178\3\2\2\2\u0178\u017a\3\2\2\2\u0179\u0177\3\2\2\2\u017a\u017c\t\5"+
		"\2\2\u017b\u0177\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017e\3\2\2\2\u017d"+
		"\u017f\t\3\2\2\u017e\u017d\3\2\2\2\u017e\u017f\3\2\2\2\u017fh\3\2\2\2"+
		"\u0180\u0184\7\62\2\2\u0181\u0183\7a\2\2\u0182\u0181\3\2\2\2\u0183\u0186"+
		"\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0187\3\2\2\2\u0186"+
		"\u0184\3\2\2\2\u0187\u018f\t\7\2\2\u0188\u018a\t\b\2\2\u0189\u0188\3\2"+
		"\2\2\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c"+
		"\u018e\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u0190\t\7\2\2\u018f\u018b\3\2"+
		"\2\2\u018f\u0190\3\2\2\2\u0190\u0192\3\2\2\2\u0191\u0193\t\3\2\2\u0192"+
		"\u0191\3\2\2\2\u0192\u0193\3\2\2\2\u0193j\3\2\2\2\u0194\u0195\7\62\2\2"+
		"\u0195\u0196\t\t\2\2\u0196\u019e\t\n\2\2\u0197\u0199\t\13\2\2\u0198\u0197"+
		"\3\2\2\2\u0199\u019c\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b"+
		"\u019d\3\2\2\2\u019c\u019a\3\2\2\2\u019d\u019f\t\n\2\2\u019e\u019a\3\2"+
		"\2\2\u019e\u019f\3\2\2\2\u019f\u01a1\3\2\2\2\u01a0\u01a2\t\3\2\2\u01a1"+
		"\u01a0\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2l\3\2\2\2\u01a3\u01a4\5\u0097"+
		"L\2\u01a4\u01a6\7\60\2\2\u01a5\u01a7\5\u0097L\2\u01a6\u01a5\3\2\2\2\u01a6"+
		"\u01a7\3\2\2\2\u01a7\u01ab\3\2\2\2\u01a8\u01a9\7\60\2\2\u01a9\u01ab\5"+
		"\u0097L\2\u01aa\u01a3\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab\u01ad\3\2\2\2"+
		"\u01ac\u01ae\5\u008fH\2\u01ad\u01ac\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae"+
		"\u01b0\3\2\2\2\u01af\u01b1\t\f\2\2\u01b0\u01af\3\2\2\2\u01b0\u01b1\3\2"+
		"\2\2\u01b1\u01bb\3\2\2\2\u01b2\u01b8\5\u0097L\2\u01b3\u01b5\5\u008fH\2"+
		"\u01b4\u01b6\t\f\2\2\u01b5\u01b4\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b9"+
		"\3\2\2\2\u01b7\u01b9\t\f\2\2\u01b8\u01b3\3\2\2\2\u01b8\u01b7\3\2\2\2\u01b9"+
		"\u01bb\3\2\2\2\u01ba\u01aa\3\2\2\2\u01ba\u01b2\3\2\2\2\u01bbn\3\2\2\2"+
		"\u01bc\u01bd\7\62\2\2\u01bd\u01c7\t\4\2\2\u01be\u01c0\5\u0093J\2\u01bf"+
		"\u01c1\7\60\2\2\u01c0\u01bf\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c8\3"+
		"\2\2\2\u01c2\u01c4\5\u0093J\2\u01c3\u01c2\3\2\2\2\u01c3\u01c4\3\2\2\2"+
		"\u01c4\u01c5\3\2\2\2\u01c5\u01c6\7\60\2\2\u01c6\u01c8\5\u0093J\2\u01c7"+
		"\u01be\3\2\2\2\u01c7\u01c3\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01cb\t\r"+
		"\2\2\u01ca\u01cc\t\16\2\2\u01cb\u01ca\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc"+
		"\u01cd\3\2\2\2\u01cd\u01cf\5\u0097L\2\u01ce\u01d0\t\f\2\2\u01cf\u01ce"+
		"\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0p\3\2\2\2\u01d1\u01d6\7$\2\2\u01d2\u01d5"+
		"\n\17\2\2\u01d3\u01d5\5\u0091I\2\u01d4\u01d2\3\2\2\2\u01d4\u01d3\3\2\2"+
		"\2\u01d5\u01d8\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d9"+
		"\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d9\u01da\7$\2\2\u01dar\3\2\2\2\u01db\u01dc"+
		"\7p\2\2\u01dc\u01dd\7w\2\2\u01dd\u01de\7n\2\2\u01de\u01df\7n\2\2\u01df"+
		"t\3\2\2\2\u01e0\u01e1\7*\2\2\u01e1v\3\2\2\2\u01e2\u01e3\7+\2\2\u01e3x"+
		"\3\2\2\2\u01e4\u01e5\7}\2\2\u01e5z\3\2\2\2\u01e6\u01e7\7\177\2\2\u01e7"+
		"|\3\2\2\2\u01e8\u01e9\7]\2\2\u01e9~\3\2\2\2\u01ea\u01eb\7_\2\2\u01eb\u0080"+
		"\3\2\2\2\u01ec\u01ed\7=\2\2\u01ed\u0082\3\2\2\2\u01ee\u01ef\7.\2\2\u01ef"+
		"\u0084\3\2\2\2\u01f0\u01f1\7\60\2\2\u01f1\u0086\3\2\2\2\u01f2\u01f6\t"+
		"\20\2\2\u01f3\u01f5\t\21\2\2\u01f4\u01f3\3\2\2\2\u01f5\u01f8\3\2\2\2\u01f6"+
		"\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u0088\3\2\2\2\u01f8\u01f6\3\2"+
		"\2\2\u01f9\u01fb\t\22\2\2\u01fa\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc"+
		"\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01ff\bE"+
		"\2\2\u01ff\u008a\3\2\2\2\u0200\u0201\7\61\2\2\u0201\u0202\7,\2\2\u0202"+
		"\u0206\3\2\2\2\u0203\u0205\13\2\2\2\u0204\u0203\3\2\2\2\u0205\u0208\3"+
		"\2\2\2\u0206\u0207\3\2\2\2\u0206\u0204\3\2\2\2\u0207\u0209\3\2\2\2\u0208"+
		"\u0206\3\2\2\2\u0209\u020a\7,\2\2\u020a\u020b\7\61\2\2\u020b\u020c\3\2"+
		"\2\2\u020c\u020d\bF\2\2\u020d\u008c\3\2\2\2\u020e\u020f\7\61\2\2\u020f"+
		"\u0210\7\61\2\2\u0210\u0214\3\2\2\2\u0211\u0213\n\23\2\2\u0212\u0211\3"+
		"\2\2\2\u0213\u0216\3\2\2\2\u0214\u0212\3\2\2\2\u0214\u0215\3\2\2\2\u0215"+
		"\u0217\3\2\2\2\u0216\u0214\3\2\2\2\u0217\u0218\bG\2\2\u0218\u008e\3\2"+
		"\2\2\u0219\u021b\t\24\2\2\u021a\u021c\t\16\2\2\u021b\u021a\3\2\2\2\u021b"+
		"\u021c\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021e\5\u0097L\2\u021e\u0090"+
		"\3\2\2\2\u021f\u0220\7^\2\2\u0220\u0235\t\25\2\2\u0221\u0226\7^\2\2\u0222"+
		"\u0224\t\26\2\2\u0223\u0222\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0225\3"+
		"\2\2\2\u0225\u0227\t\7\2\2\u0226\u0223\3\2\2\2\u0226\u0227\3\2\2\2\u0227"+
		"\u0228\3\2\2\2\u0228\u0235\t\7\2\2\u0229\u022b\7^\2\2\u022a\u022c\7w\2"+
		"\2\u022b\u022a\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022b\3\2\2\2\u022d\u022e"+
		"\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0230\5\u0095K\2\u0230\u0231\5\u0095"+
		"K\2\u0231\u0232\5\u0095K\2\u0232\u0233\5\u0095K\2\u0233\u0235\3\2\2\2"+
		"\u0234\u021f\3\2\2\2\u0234\u0221\3\2\2\2\u0234\u0229\3\2\2\2\u0235\u0092"+
		"\3\2\2\2\u0236\u023f\5\u0095K\2\u0237\u023a\5\u0095K\2\u0238\u023a\7a"+
		"\2\2\u0239\u0237\3\2\2\2\u0239\u0238\3\2\2\2\u023a\u023d\3\2\2\2\u023b"+
		"\u0239\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u023e\3\2\2\2\u023d\u023b\3\2"+
		"\2\2\u023e\u0240\5\u0095K\2\u023f\u023b\3\2\2\2\u023f\u0240\3\2\2\2\u0240"+
		"\u0094\3\2\2\2\u0241\u0242\t\5\2\2\u0242\u0096\3\2\2\2\u0243\u024b\t\27"+
		"\2\2\u0244\u0246\t\30\2\2\u0245\u0244\3\2\2\2\u0246\u0249\3\2\2\2\u0247"+
		"\u0245\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u024a\3\2\2\2\u0249\u0247\3\2"+
		"\2\2\u024a\u024c\t\27\2\2\u024b\u0247\3\2\2\2\u024b\u024c\3\2\2\2\u024c"+
		"\u0098\3\2\2\2/\2\u015d\u0162\u0167\u016a\u016c\u016f\u0177\u017b\u017e"+
		"\u0184\u018b\u018f\u0192\u019a\u019e\u01a1\u01a6\u01aa\u01ad\u01b0\u01b5"+
		"\u01b8\u01ba\u01c0\u01c3\u01c7\u01cb\u01cf\u01d4\u01d6\u01f6\u01fc\u0206"+
		"\u0214\u021b\u0223\u0226\u022d\u0234\u0239\u023b\u023f\u0247\u024b\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}