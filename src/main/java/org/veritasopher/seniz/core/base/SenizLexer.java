// Generated from /Users/michaeltei/Projects/ResearchProjects/FDD/Seniz/project/Seniz/src/main/resources/SenizLexer.g4 by ANTLR 4.9.2
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IMPORT", "MAIN", "CONTROL", "SYSTEM", "VARSET", "CHANSET", "OVER", "INIT", 
			"AS", "SYNC", "ASYNC", "ARGS", "PROP", "LTL", "BOOLEAN", "INT", "FLOAT", 
			"STRING", "INTERNAL", "EXTERNAL", "VALUEOF", "TYPEOF", "TO", "GT", "LT", 
			"BANG", "TILDE", "QUESTION", "EQ", "LE", "GE", "NEQ", "AND", "OR", "LAND", 
			"LOR", "ADD", "SUB", "MUL", "DIV", "CARET", "MOD", "GLOBAL", "ALWAYS", 
			"EVENTUALLY", "NEXT", "UNTIL", "BOOL_LITERAL", "DECIMAL_LITERAL", "HEX_LITERAL", 
			"OCT_LITERAL", "BINARY_LITERAL", "FLOAT_LITERAL", "HEX_FLOAT_LITERAL", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2G\u0246\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3"+
		"$\3$\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-"+
		"\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5"+
		"\61\u0157\n\61\3\62\3\62\3\62\5\62\u015c\n\62\3\62\6\62\u015f\n\62\r\62"+
		"\16\62\u0160\3\62\5\62\u0164\n\62\5\62\u0166\n\62\3\62\5\62\u0169\n\62"+
		"\3\63\3\63\3\63\3\63\7\63\u016f\n\63\f\63\16\63\u0172\13\63\3\63\5\63"+
		"\u0175\n\63\3\63\5\63\u0178\n\63\3\64\3\64\7\64\u017c\n\64\f\64\16\64"+
		"\u017f\13\64\3\64\3\64\7\64\u0183\n\64\f\64\16\64\u0186\13\64\3\64\5\64"+
		"\u0189\n\64\3\64\5\64\u018c\n\64\3\65\3\65\3\65\3\65\7\65\u0192\n\65\f"+
		"\65\16\65\u0195\13\65\3\65\5\65\u0198\n\65\3\65\5\65\u019b\n\65\3\66\3"+
		"\66\3\66\5\66\u01a0\n\66\3\66\3\66\5\66\u01a4\n\66\3\66\5\66\u01a7\n\66"+
		"\3\66\5\66\u01aa\n\66\3\66\3\66\3\66\5\66\u01af\n\66\3\66\5\66\u01b2\n"+
		"\66\5\66\u01b4\n\66\3\67\3\67\3\67\3\67\5\67\u01ba\n\67\3\67\5\67\u01bd"+
		"\n\67\3\67\3\67\5\67\u01c1\n\67\3\67\3\67\5\67\u01c5\n\67\3\67\3\67\5"+
		"\67\u01c9\n\67\38\38\38\78\u01ce\n8\f8\168\u01d1\138\38\38\39\39\39\3"+
		"9\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\7C\u01ee"+
		"\nC\fC\16C\u01f1\13C\3D\6D\u01f4\nD\rD\16D\u01f5\3D\3D\3E\3E\3E\3E\7E"+
		"\u01fe\nE\fE\16E\u0201\13E\3E\3E\3E\3E\3E\3F\3F\3F\3F\7F\u020c\nF\fF\16"+
		"F\u020f\13F\3F\3F\3G\3G\5G\u0215\nG\3G\3G\3H\3H\3H\3H\5H\u021d\nH\3H\5"+
		"H\u0220\nH\3H\3H\3H\6H\u0225\nH\rH\16H\u0226\3H\3H\3H\3H\3H\5H\u022e\n"+
		"H\3I\3I\3I\7I\u0233\nI\fI\16I\u0236\13I\3I\5I\u0239\nI\3J\3J\3K\3K\7K"+
		"\u023f\nK\fK\16K\u0242\13K\3K\5K\u0245\nK\3\u01ff\2L\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177"+
		"A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008d\2\u008f\2\u0091\2\u0093"+
		"\2\u0095\2\3\2\31\3\2\63;\4\2NNnn\4\2ZZzz\5\2\62;CHch\6\2\62;CHaach\3"+
		"\2\629\4\2\629aa\4\2DDdd\3\2\62\63\4\2\62\63aa\6\2FFHHffhh\4\2RRrr\4\2"+
		"--//\6\2\f\f\17\17$$^^\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\16\17\"\"\4"+
		"\2\f\f\17\17\4\2GGgg\n\2$$))^^ddhhppttvv\3\2\62\65\3\2\62;\4\2\62;aa\2"+
		"\u026d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2"+
		"\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2"+
		"m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3"+
		"\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2"+
		"\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\3"+
		"\u0097\3\2\2\2\5\u009e\3\2\2\2\7\u00a3\3\2\2\2\t\u00ab\3\2\2\2\13\u00b2"+
		"\3\2\2\2\r\u00b9\3\2\2\2\17\u00c1\3\2\2\2\21\u00c6\3\2\2\2\23\u00cb\3"+
		"\2\2\2\25\u00ce\3\2\2\2\27\u00d3\3\2\2\2\31\u00d9\3\2\2\2\33\u00de\3\2"+
		"\2\2\35\u00e3\3\2\2\2\37\u00e7\3\2\2\2!\u00ec\3\2\2\2#\u00f0\3\2\2\2%"+
		"\u00f6\3\2\2\2\'\u00fd\3\2\2\2)\u0106\3\2\2\2+\u010f\3\2\2\2-\u0111\3"+
		"\2\2\2/\u0114\3\2\2\2\61\u0117\3\2\2\2\63\u0119\3\2\2\2\65\u011b\3\2\2"+
		"\2\67\u011d\3\2\2\29\u011f\3\2\2\2;\u0121\3\2\2\2=\u0123\3\2\2\2?\u0126"+
		"\3\2\2\2A\u0129\3\2\2\2C\u012c\3\2\2\2E\u012e\3\2\2\2G\u0130\3\2\2\2I"+
		"\u0134\3\2\2\2K\u0137\3\2\2\2M\u0139\3\2\2\2O\u013b\3\2\2\2Q\u013d\3\2"+
		"\2\2S\u013f\3\2\2\2U\u0141\3\2\2\2W\u0143\3\2\2\2Y\u0145\3\2\2\2[\u0147"+
		"\3\2\2\2]\u0149\3\2\2\2_\u014b\3\2\2\2a\u0156\3\2\2\2c\u0165\3\2\2\2e"+
		"\u016a\3\2\2\2g\u0179\3\2\2\2i\u018d\3\2\2\2k\u01b3\3\2\2\2m\u01b5\3\2"+
		"\2\2o\u01ca\3\2\2\2q\u01d4\3\2\2\2s\u01d9\3\2\2\2u\u01db\3\2\2\2w\u01dd"+
		"\3\2\2\2y\u01df\3\2\2\2{\u01e1\3\2\2\2}\u01e3\3\2\2\2\177\u01e5\3\2\2"+
		"\2\u0081\u01e7\3\2\2\2\u0083\u01e9\3\2\2\2\u0085\u01eb\3\2\2\2\u0087\u01f3"+
		"\3\2\2\2\u0089\u01f9\3\2\2\2\u008b\u0207\3\2\2\2\u008d\u0212\3\2\2\2\u008f"+
		"\u022d\3\2\2\2\u0091\u022f\3\2\2\2\u0093\u023a\3\2\2\2\u0095\u023c\3\2"+
		"\2\2\u0097\u0098\7k\2\2\u0098\u0099\7o\2\2\u0099\u009a\7r\2\2\u009a\u009b"+
		"\7q\2\2\u009b\u009c\7t\2\2\u009c\u009d\7v\2\2\u009d\4\3\2\2\2\u009e\u009f"+
		"\7o\2\2\u009f\u00a0\7c\2\2\u00a0\u00a1\7k\2\2\u00a1\u00a2\7p\2\2\u00a2"+
		"\6\3\2\2\2\u00a3\u00a4\7e\2\2\u00a4\u00a5\7q\2\2\u00a5\u00a6\7p\2\2\u00a6"+
		"\u00a7\7v\2\2\u00a7\u00a8\7t\2\2\u00a8\u00a9\7q\2\2\u00a9\u00aa\7n\2\2"+
		"\u00aa\b\3\2\2\2\u00ab\u00ac\7u\2\2\u00ac\u00ad\7{\2\2\u00ad\u00ae\7u"+
		"\2\2\u00ae\u00af\7v\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7o\2\2\u00b1\n"+
		"\3\2\2\2\u00b2\u00b3\7x\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5\7t\2\2\u00b5"+
		"\u00b6\7u\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8\7v\2\2\u00b8\f\3\2\2\2\u00b9"+
		"\u00ba\7e\2\2\u00ba\u00bb\7j\2\2\u00bb\u00bc\7c\2\2\u00bc\u00bd\7p\2\2"+
		"\u00bd\u00be\7u\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7v\2\2\u00c0\16\3\2"+
		"\2\2\u00c1\u00c2\7q\2\2\u00c2\u00c3\7x\2\2\u00c3\u00c4\7g\2\2\u00c4\u00c5"+
		"\7t\2\2\u00c5\20\3\2\2\2\u00c6\u00c7\7k\2\2\u00c7\u00c8\7p\2\2\u00c8\u00c9"+
		"\7k\2\2\u00c9\u00ca\7v\2\2\u00ca\22\3\2\2\2\u00cb\u00cc\7c\2\2\u00cc\u00cd"+
		"\7u\2\2\u00cd\24\3\2\2\2\u00ce\u00cf\7u\2\2\u00cf\u00d0\7{\2\2\u00d0\u00d1"+
		"\7p\2\2\u00d1\u00d2\7e\2\2\u00d2\26\3\2\2\2\u00d3\u00d4\7c\2\2\u00d4\u00d5"+
		"\7u\2\2\u00d5\u00d6\7{\2\2\u00d6\u00d7\7p\2\2\u00d7\u00d8\7e\2\2\u00d8"+
		"\30\3\2\2\2\u00d9\u00da\7c\2\2\u00da\u00db\7t\2\2\u00db\u00dc\7i\2\2\u00dc"+
		"\u00dd\7u\2\2\u00dd\32\3\2\2\2\u00de\u00df\7r\2\2\u00df\u00e0\7t\2\2\u00e0"+
		"\u00e1\7q\2\2\u00e1\u00e2\7r\2\2\u00e2\34\3\2\2\2\u00e3\u00e4\7n\2\2\u00e4"+
		"\u00e5\7v\2\2\u00e5\u00e6\7n\2\2\u00e6\36\3\2\2\2\u00e7\u00e8\7d\2\2\u00e8"+
		"\u00e9\7q\2\2\u00e9\u00ea\7q\2\2\u00ea\u00eb\7n\2\2\u00eb \3\2\2\2\u00ec"+
		"\u00ed\7k\2\2\u00ed\u00ee\7p\2\2\u00ee\u00ef\7v\2\2\u00ef\"\3\2\2\2\u00f0"+
		"\u00f1\7h\2\2\u00f1\u00f2\7n\2\2\u00f2\u00f3\7q\2\2\u00f3\u00f4\7c\2\2"+
		"\u00f4\u00f5\7v\2\2\u00f5$\3\2\2\2\u00f6\u00f7\7u\2\2\u00f7\u00f8\7v\2"+
		"\2\u00f8\u00f9\7t\2\2\u00f9\u00fa\7k\2\2\u00fa\u00fb\7p\2\2\u00fb\u00fc"+
		"\7i\2\2\u00fc&\3\2\2\2\u00fd\u00fe\7k\2\2\u00fe\u00ff\7p\2\2\u00ff\u0100"+
		"\7v\2\2\u0100\u0101\7g\2\2\u0101\u0102\7t\2\2\u0102\u0103\7p\2\2\u0103"+
		"\u0104\7c\2\2\u0104\u0105\7n\2\2\u0105(\3\2\2\2\u0106\u0107\7g\2\2\u0107"+
		"\u0108\7z\2\2\u0108\u0109\7v\2\2\u0109\u010a\7g\2\2\u010a\u010b\7t\2\2"+
		"\u010b\u010c\7p\2\2\u010c\u010d\7c\2\2\u010d\u010e\7n\2\2\u010e*\3\2\2"+
		"\2\u010f\u0110\7<\2\2\u0110,\3\2\2\2\u0111\u0112\7<\2\2\u0112\u0113\7"+
		"<\2\2\u0113.\3\2\2\2\u0114\u0115\7/\2\2\u0115\u0116\7@\2\2\u0116\60\3"+
		"\2\2\2\u0117\u0118\7@\2\2\u0118\62\3\2\2\2\u0119\u011a\7>\2\2\u011a\64"+
		"\3\2\2\2\u011b\u011c\7#\2\2\u011c\66\3\2\2\2\u011d\u011e\7\u0080\2\2\u011e"+
		"8\3\2\2\2\u011f\u0120\7A\2\2\u0120:\3\2\2\2\u0121\u0122\7?\2\2\u0122<"+
		"\3\2\2\2\u0123\u0124\7>\2\2\u0124\u0125\7?\2\2\u0125>\3\2\2\2\u0126\u0127"+
		"\7@\2\2\u0127\u0128\7?\2\2\u0128@\3\2\2\2\u0129\u012a\7\61\2\2\u012a\u012b"+
		"\7?\2\2\u012bB\3\2\2\2\u012c\u012d\7(\2\2\u012dD\3\2\2\2\u012e\u012f\7"+
		"~\2\2\u012fF\3\2\2\2\u0130\u0131\7c\2\2\u0131\u0132\7p\2\2\u0132\u0133"+
		"\7f\2\2\u0133H\3\2\2\2\u0134\u0135\7q\2\2\u0135\u0136\7t\2\2\u0136J\3"+
		"\2\2\2\u0137\u0138\7-\2\2\u0138L\3\2\2\2\u0139\u013a\7/\2\2\u013aN\3\2"+
		"\2\2\u013b\u013c\7,\2\2\u013cP\3\2\2\2\u013d\u013e\7\61\2\2\u013eR\3\2"+
		"\2\2\u013f\u0140\7`\2\2\u0140T\3\2\2\2\u0141\u0142\7\'\2\2\u0142V\3\2"+
		"\2\2\u0143\u0144\7B\2\2\u0144X\3\2\2\2\u0145\u0146\7I\2\2\u0146Z\3\2\2"+
		"\2\u0147\u0148\7H\2\2\u0148\\\3\2\2\2\u0149\u014a\7Z\2\2\u014a^\3\2\2"+
		"\2\u014b\u014c\7W\2\2\u014c`\3\2\2\2\u014d\u014e\7v\2\2\u014e\u014f\7"+
		"t\2\2\u014f\u0150\7w\2\2\u0150\u0157\7g\2\2\u0151\u0152\7h\2\2\u0152\u0153"+
		"\7c\2\2\u0153\u0154\7n\2\2\u0154\u0155\7u\2\2\u0155\u0157\7g\2\2\u0156"+
		"\u014d\3\2\2\2\u0156\u0151\3\2\2\2\u0157b\3\2\2\2\u0158\u0166\7\62\2\2"+
		"\u0159\u0163\t\2\2\2\u015a\u015c\5\u0095K\2\u015b\u015a\3\2\2\2\u015b"+
		"\u015c\3\2\2\2\u015c\u0164\3\2\2\2\u015d\u015f\7a\2\2\u015e\u015d\3\2"+
		"\2\2\u015f\u0160\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161"+
		"\u0162\3\2\2\2\u0162\u0164\5\u0095K\2\u0163\u015b\3\2\2\2\u0163\u015e"+
		"\3\2\2\2\u0164\u0166\3\2\2\2\u0165\u0158\3\2\2\2\u0165\u0159\3\2\2\2\u0166"+
		"\u0168\3\2\2\2\u0167\u0169\t\3\2\2\u0168\u0167\3\2\2\2\u0168\u0169\3\2"+
		"\2\2\u0169d\3\2\2\2\u016a\u016b\7\62\2\2\u016b\u016c\t\4\2\2\u016c\u0174"+
		"\t\5\2\2\u016d\u016f\t\6\2\2\u016e\u016d\3\2\2\2\u016f\u0172\3\2\2\2\u0170"+
		"\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0173\3\2\2\2\u0172\u0170\3\2"+
		"\2\2\u0173\u0175\t\5\2\2\u0174\u0170\3\2\2\2\u0174\u0175\3\2\2\2\u0175"+
		"\u0177\3\2\2\2\u0176\u0178\t\3\2\2\u0177\u0176\3\2\2\2\u0177\u0178\3\2"+
		"\2\2\u0178f\3\2\2\2\u0179\u017d\7\62\2\2\u017a\u017c\7a\2\2\u017b\u017a"+
		"\3\2\2\2\u017c\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e"+
		"\u0180\3\2\2\2\u017f\u017d\3\2\2\2\u0180\u0188\t\7\2\2\u0181\u0183\t\b"+
		"\2\2\u0182\u0181\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0184"+
		"\u0185\3\2\2\2\u0185\u0187\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u0189\t\7"+
		"\2\2\u0188\u0184\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018b\3\2\2\2\u018a"+
		"\u018c\t\3\2\2\u018b\u018a\3\2\2\2\u018b\u018c\3\2\2\2\u018ch\3\2\2\2"+
		"\u018d\u018e\7\62\2\2\u018e\u018f\t\t\2\2\u018f\u0197\t\n\2\2\u0190\u0192"+
		"\t\13\2\2\u0191\u0190\3\2\2\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2\2\2"+
		"\u0193\u0194\3\2\2\2\u0194\u0196\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u0198"+
		"\t\n\2\2\u0197\u0193\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u019a\3\2\2\2\u0199"+
		"\u019b\t\3\2\2\u019a\u0199\3\2\2\2\u019a\u019b\3\2\2\2\u019bj\3\2\2\2"+
		"\u019c\u019d\5\u0095K\2\u019d\u019f\7\60\2\2\u019e\u01a0\5\u0095K\2\u019f"+
		"\u019e\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a4\3\2\2\2\u01a1\u01a2\7\60"+
		"\2\2\u01a2\u01a4\5\u0095K\2\u01a3\u019c\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4"+
		"\u01a6\3\2\2\2\u01a5\u01a7\5\u008dG\2\u01a6\u01a5\3\2\2\2\u01a6\u01a7"+
		"\3\2\2\2\u01a7\u01a9\3\2\2\2\u01a8\u01aa\t\f\2\2\u01a9\u01a8\3\2\2\2\u01a9"+
		"\u01aa\3\2\2\2\u01aa\u01b4\3\2\2\2\u01ab\u01b1\5\u0095K\2\u01ac\u01ae"+
		"\5\u008dG\2\u01ad\u01af\t\f\2\2\u01ae\u01ad\3\2\2\2\u01ae\u01af\3\2\2"+
		"\2\u01af\u01b2\3\2\2\2\u01b0\u01b2\t\f\2\2\u01b1\u01ac\3\2\2\2\u01b1\u01b0"+
		"\3\2\2\2\u01b2\u01b4\3\2\2\2\u01b3\u01a3\3\2\2\2\u01b3\u01ab\3\2\2\2\u01b4"+
		"l\3\2\2\2\u01b5\u01b6\7\62\2\2\u01b6\u01c0\t\4\2\2\u01b7\u01b9\5\u0091"+
		"I\2\u01b8\u01ba\7\60\2\2\u01b9\u01b8\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba"+
		"\u01c1\3\2\2\2\u01bb\u01bd\5\u0091I\2\u01bc\u01bb\3\2\2\2\u01bc\u01bd"+
		"\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01bf\7\60\2\2\u01bf\u01c1\5\u0091"+
		"I\2\u01c0\u01b7\3\2\2\2\u01c0\u01bc\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2"+
		"\u01c4\t\r\2\2\u01c3\u01c5\t\16\2\2\u01c4\u01c3\3\2\2\2\u01c4\u01c5\3"+
		"\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c8\5\u0095K\2\u01c7\u01c9\t\f\2\2"+
		"\u01c8\u01c7\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9n\3\2\2\2\u01ca\u01cf\7"+
		"$\2\2\u01cb\u01ce\n\17\2\2\u01cc\u01ce\5\u008fH\2\u01cd\u01cb\3\2\2\2"+
		"\u01cd\u01cc\3\2\2\2\u01ce\u01d1\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0"+
		"\3\2\2\2\u01d0\u01d2\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d2\u01d3\7$\2\2\u01d3"+
		"p\3\2\2\2\u01d4\u01d5\7p\2\2\u01d5\u01d6\7w\2\2\u01d6\u01d7\7n\2\2\u01d7"+
		"\u01d8\7n\2\2\u01d8r\3\2\2\2\u01d9\u01da\7*\2\2\u01dat\3\2\2\2\u01db\u01dc"+
		"\7+\2\2\u01dcv\3\2\2\2\u01dd\u01de\7}\2\2\u01dex\3\2\2\2\u01df\u01e0\7"+
		"\177\2\2\u01e0z\3\2\2\2\u01e1\u01e2\7]\2\2\u01e2|\3\2\2\2\u01e3\u01e4"+
		"\7_\2\2\u01e4~\3\2\2\2\u01e5\u01e6\7=\2\2\u01e6\u0080\3\2\2\2\u01e7\u01e8"+
		"\7.\2\2\u01e8\u0082\3\2\2\2\u01e9\u01ea\7\60\2\2\u01ea\u0084\3\2\2\2\u01eb"+
		"\u01ef\t\20\2\2\u01ec\u01ee\t\21\2\2\u01ed\u01ec\3\2\2\2\u01ee\u01f1\3"+
		"\2\2\2\u01ef\u01ed\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u0086\3\2\2\2\u01f1"+
		"\u01ef\3\2\2\2\u01f2\u01f4\t\22\2\2\u01f3\u01f2\3\2\2\2\u01f4\u01f5\3"+
		"\2\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7"+
		"\u01f8\bD\2\2\u01f8\u0088\3\2\2\2\u01f9\u01fa\7\61\2\2\u01fa\u01fb\7,"+
		"\2\2\u01fb\u01ff\3\2\2\2\u01fc\u01fe\13\2\2\2\u01fd\u01fc\3\2\2\2\u01fe"+
		"\u0201\3\2\2\2\u01ff\u0200\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200\u0202\3\2"+
		"\2\2\u0201\u01ff\3\2\2\2\u0202\u0203\7,\2\2\u0203\u0204\7\61\2\2\u0204"+
		"\u0205\3\2\2\2\u0205\u0206\bE\2\2\u0206\u008a\3\2\2\2\u0207\u0208\7\61"+
		"\2\2\u0208\u0209\7\61\2\2\u0209\u020d\3\2\2\2\u020a\u020c\n\23\2\2\u020b"+
		"\u020a\3\2\2\2\u020c\u020f\3\2\2\2\u020d\u020b\3\2\2\2\u020d\u020e\3\2"+
		"\2\2\u020e\u0210\3\2\2\2\u020f\u020d\3\2\2\2\u0210\u0211\bF\2\2\u0211"+
		"\u008c\3\2\2\2\u0212\u0214\t\24\2\2\u0213\u0215\t\16\2\2\u0214\u0213\3"+
		"\2\2\2\u0214\u0215\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0217\5\u0095K\2"+
		"\u0217\u008e\3\2\2\2\u0218\u0219\7^\2\2\u0219\u022e\t\25\2\2\u021a\u021f"+
		"\7^\2\2\u021b\u021d\t\26\2\2\u021c\u021b\3\2\2\2\u021c\u021d\3\2\2\2\u021d"+
		"\u021e\3\2\2\2\u021e\u0220\t\7\2\2\u021f\u021c\3\2\2\2\u021f\u0220\3\2"+
		"\2\2\u0220\u0221\3\2\2\2\u0221\u022e\t\7\2\2\u0222\u0224\7^\2\2\u0223"+
		"\u0225\7w\2\2\u0224\u0223\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0224\3\2"+
		"\2\2\u0226\u0227\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u0229\5\u0093J\2\u0229"+
		"\u022a\5\u0093J\2\u022a\u022b\5\u0093J\2\u022b\u022c\5\u0093J\2\u022c"+
		"\u022e\3\2\2\2\u022d\u0218\3\2\2\2\u022d\u021a\3\2\2\2\u022d\u0222\3\2"+
		"\2\2\u022e\u0090\3\2\2\2\u022f\u0238\5\u0093J\2\u0230\u0233\5\u0093J\2"+
		"\u0231\u0233\7a\2\2\u0232\u0230\3\2\2\2\u0232\u0231\3\2\2\2\u0233\u0236"+
		"\3\2\2\2\u0234\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0237\3\2\2\2\u0236"+
		"\u0234\3\2\2\2\u0237\u0239\5\u0093J\2\u0238\u0234\3\2\2\2\u0238\u0239"+
		"\3\2\2\2\u0239\u0092\3\2\2\2\u023a\u023b\t\5\2\2\u023b\u0094\3\2\2\2\u023c"+
		"\u0244\t\27\2\2\u023d\u023f\t\30\2\2\u023e\u023d\3\2\2\2\u023f\u0242\3"+
		"\2\2\2\u0240\u023e\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0243\3\2\2\2\u0242"+
		"\u0240\3\2\2\2\u0243\u0245\t\27\2\2\u0244\u0240\3\2\2\2\u0244\u0245\3"+
		"\2\2\2\u0245\u0096\3\2\2\2/\2\u0156\u015b\u0160\u0163\u0165\u0168\u0170"+
		"\u0174\u0177\u017d\u0184\u0188\u018b\u0193\u0197\u019a\u019f\u01a3\u01a6"+
		"\u01a9\u01ae\u01b1\u01b3\u01b9\u01bc\u01c0\u01c4\u01c8\u01cd\u01cf\u01ef"+
		"\u01f5\u01ff\u020d\u0214\u021c\u021f\u0226\u022d\u0232\u0234\u0238\u0240"+
		"\u0244\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}