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
		IMPORT=1, MAIN=2, CONTROL=3, SYSTEM=4, VARSET=5, OVER=6, INIT=7, AS=8, 
		SYNC=9, ASYNC=10, ARGS=11, PROP=12, LTL=13, BOOLEAN=14, INT=15, FLOAT=16, 
		STRING=17, VALUEOF=18, TYPEOF=19, TO=20, GT=21, LT=22, BANG=23, TILDE=24, 
		QUESTION=25, EQ=26, LE=27, GE=28, NEQ=29, AND=30, OR=31, LAND=32, LOR=33, 
		ADD=34, SUB=35, MUL=36, DIV=37, CARET=38, MOD=39, PAR=40, INTERLEAVE=41, 
		ALWAYS=42, EVENTUALLY=43, NEXT=44, UNTIL=45, BOOL_LITERAL=46, DECIMAL_LITERAL=47, 
		HEX_LITERAL=48, OCT_LITERAL=49, BINARY_LITERAL=50, FLOAT_LITERAL=51, HEX_FLOAT_LITERAL=52, 
		STRING_LITERAL=53, NULL_LITERAL=54, LPAREN=55, RPAREN=56, LBRACE=57, RBRACE=58, 
		LBRACK=59, RBRACK=60, SEMI=61, COMMA=62, DOT=63, IDENTIFIER=64, WS=65, 
		COMMENT=66, LINE_COMMENT=67;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IMPORT", "MAIN", "CONTROL", "SYSTEM", "VARSET", "OVER", "INIT", "AS", 
			"SYNC", "ASYNC", "ARGS", "PROP", "LTL", "BOOLEAN", "INT", "FLOAT", "STRING", 
			"VALUEOF", "TYPEOF", "TO", "GT", "LT", "BANG", "TILDE", "QUESTION", "EQ", 
			"LE", "GE", "NEQ", "AND", "OR", "LAND", "LOR", "ADD", "SUB", "MUL", "DIV", 
			"CARET", "MOD", "PAR", "INTERLEAVE", "ALWAYS", "EVENTUALLY", "NEXT", 
			"UNTIL", "BOOL_LITERAL", "DECIMAL_LITERAL", "HEX_LITERAL", "OCT_LITERAL", 
			"BINARY_LITERAL", "FLOAT_LITERAL", "HEX_FLOAT_LITERAL", "STRING_LITERAL", 
			"NULL_LITERAL", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
			"SEMI", "COMMA", "DOT", "IDENTIFIER", "WS", "COMMENT", "LINE_COMMENT", 
			"ExponentPart", "EscapeSequence", "HexDigits", "HexDigit", "Digits"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'main'", "'control'", "'system'", "'varset'", "'over'", 
			"'init'", "'as'", "'sync'", "'async'", "'args'", "'prop'", "'ltl'", "'bool'", 
			"'int'", "'float'", "'string'", "':'", "'::'", "'->'", "'>'", "'<'", 
			"'!'", "'~'", "'?'", "'='", "'<='", "'>='", "'/='", "'&'", "'|'", "'and'", 
			"'or'", "'+'", "'-'", "'*'", "'/'", "'^'", "'%'", "'||'", "'|||'", "'G'", 
			"'F'", "'X'", "'U'", null, null, null, null, null, null, null, null, 
			"'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IMPORT", "MAIN", "CONTROL", "SYSTEM", "VARSET", "OVER", "INIT", 
			"AS", "SYNC", "ASYNC", "ARGS", "PROP", "LTL", "BOOLEAN", "INT", "FLOAT", 
			"STRING", "VALUEOF", "TYPEOF", "TO", "GT", "LT", "BANG", "TILDE", "QUESTION", 
			"EQ", "LE", "GE", "NEQ", "AND", "OR", "LAND", "LOR", "ADD", "SUB", "MUL", 
			"DIV", "CARET", "MOD", "PAR", "INTERLEAVE", "ALWAYS", "EVENTUALLY", "NEXT", 
			"UNTIL", "BOOL_LITERAL", "DECIMAL_LITERAL", "HEX_LITERAL", "OCT_LITERAL", 
			"BINARY_LITERAL", "FLOAT_LITERAL", "HEX_FLOAT_LITERAL", "STRING_LITERAL", 
			"NULL_LITERAL", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
			"SEMI", "COMMA", "DOT", "IDENTIFIER", "WS", "COMMENT", "LINE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2E\u022d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3"+
		"\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3"+
		"\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3"+
		"\37\3\37\3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'"+
		"\3(\3(\3)\3)\3)\3*\3*\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\3/\5/\u013e\n/\3\60\3\60\3\60\5\60\u0143\n\60\3\60\6\60\u0146\n"+
		"\60\r\60\16\60\u0147\3\60\5\60\u014b\n\60\5\60\u014d\n\60\3\60\5\60\u0150"+
		"\n\60\3\61\3\61\3\61\3\61\7\61\u0156\n\61\f\61\16\61\u0159\13\61\3\61"+
		"\5\61\u015c\n\61\3\61\5\61\u015f\n\61\3\62\3\62\7\62\u0163\n\62\f\62\16"+
		"\62\u0166\13\62\3\62\3\62\7\62\u016a\n\62\f\62\16\62\u016d\13\62\3\62"+
		"\5\62\u0170\n\62\3\62\5\62\u0173\n\62\3\63\3\63\3\63\3\63\7\63\u0179\n"+
		"\63\f\63\16\63\u017c\13\63\3\63\5\63\u017f\n\63\3\63\5\63\u0182\n\63\3"+
		"\64\3\64\3\64\5\64\u0187\n\64\3\64\3\64\5\64\u018b\n\64\3\64\5\64\u018e"+
		"\n\64\3\64\5\64\u0191\n\64\3\64\3\64\3\64\5\64\u0196\n\64\3\64\5\64\u0199"+
		"\n\64\5\64\u019b\n\64\3\65\3\65\3\65\3\65\5\65\u01a1\n\65\3\65\5\65\u01a4"+
		"\n\65\3\65\3\65\5\65\u01a8\n\65\3\65\3\65\5\65\u01ac\n\65\3\65\3\65\5"+
		"\65\u01b0\n\65\3\66\3\66\3\66\7\66\u01b5\n\66\f\66\16\66\u01b8\13\66\3"+
		"\66\3\66\3\67\3\67\3\67\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3="+
		"\3>\3>\3?\3?\3@\3@\3A\3A\7A\u01d5\nA\fA\16A\u01d8\13A\3B\6B\u01db\nB\r"+
		"B\16B\u01dc\3B\3B\3C\3C\3C\3C\7C\u01e5\nC\fC\16C\u01e8\13C\3C\3C\3C\3"+
		"C\3C\3D\3D\3D\3D\7D\u01f3\nD\fD\16D\u01f6\13D\3D\3D\3E\3E\5E\u01fc\nE"+
		"\3E\3E\3F\3F\3F\3F\5F\u0204\nF\3F\5F\u0207\nF\3F\3F\3F\6F\u020c\nF\rF"+
		"\16F\u020d\3F\3F\3F\3F\3F\5F\u0215\nF\3G\3G\3G\7G\u021a\nG\fG\16G\u021d"+
		"\13G\3G\5G\u0220\nG\3H\3H\3I\3I\7I\u0226\nI\fI\16I\u0229\13I\3I\5I\u022c"+
		"\nI\3\u01e6\2J\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g"+
		"\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089\2"+
		"\u008b\2\u008d\2\u008f\2\u0091\2\3\2\31\3\2\63;\4\2NNnn\4\2ZZzz\5\2\62"+
		";CHch\6\2\62;CHaach\3\2\629\4\2\629aa\4\2DDdd\3\2\62\63\4\2\62\63aa\6"+
		"\2FFHHffhh\4\2RRrr\4\2--//\6\2\f\f\17\17$$^^\5\2C\\aac|\6\2\62;C\\aac"+
		"|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\4\2GGgg\n\2$$))^^ddhhppttvv\3\2\62"+
		"\65\3\2\62;\4\2\62;aa\2\u0254\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3"+
		"\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2"+
		"\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2"+
		"i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3"+
		"\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081"+
		"\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\3\u0093\3\2\2"+
		"\2\5\u009a\3\2\2\2\7\u009f\3\2\2\2\t\u00a7\3\2\2\2\13\u00ae\3\2\2\2\r"+
		"\u00b5\3\2\2\2\17\u00ba\3\2\2\2\21\u00bf\3\2\2\2\23\u00c2\3\2\2\2\25\u00c7"+
		"\3\2\2\2\27\u00cd\3\2\2\2\31\u00d2\3\2\2\2\33\u00d7\3\2\2\2\35\u00db\3"+
		"\2\2\2\37\u00e0\3\2\2\2!\u00e4\3\2\2\2#\u00ea\3\2\2\2%\u00f1\3\2\2\2\'"+
		"\u00f3\3\2\2\2)\u00f6\3\2\2\2+\u00f9\3\2\2\2-\u00fb\3\2\2\2/\u00fd\3\2"+
		"\2\2\61\u00ff\3\2\2\2\63\u0101\3\2\2\2\65\u0103\3\2\2\2\67\u0105\3\2\2"+
		"\29\u0108\3\2\2\2;\u010b\3\2\2\2=\u010e\3\2\2\2?\u0110\3\2\2\2A\u0112"+
		"\3\2\2\2C\u0116\3\2\2\2E\u0119\3\2\2\2G\u011b\3\2\2\2I\u011d\3\2\2\2K"+
		"\u011f\3\2\2\2M\u0121\3\2\2\2O\u0123\3\2\2\2Q\u0125\3\2\2\2S\u0128\3\2"+
		"\2\2U\u012c\3\2\2\2W\u012e\3\2\2\2Y\u0130\3\2\2\2[\u0132\3\2\2\2]\u013d"+
		"\3\2\2\2_\u014c\3\2\2\2a\u0151\3\2\2\2c\u0160\3\2\2\2e\u0174\3\2\2\2g"+
		"\u019a\3\2\2\2i\u019c\3\2\2\2k\u01b1\3\2\2\2m\u01bb\3\2\2\2o\u01c0\3\2"+
		"\2\2q\u01c2\3\2\2\2s\u01c4\3\2\2\2u\u01c6\3\2\2\2w\u01c8\3\2\2\2y\u01ca"+
		"\3\2\2\2{\u01cc\3\2\2\2}\u01ce\3\2\2\2\177\u01d0\3\2\2\2\u0081\u01d2\3"+
		"\2\2\2\u0083\u01da\3\2\2\2\u0085\u01e0\3\2\2\2\u0087\u01ee\3\2\2\2\u0089"+
		"\u01f9\3\2\2\2\u008b\u0214\3\2\2\2\u008d\u0216\3\2\2\2\u008f\u0221\3\2"+
		"\2\2\u0091\u0223\3\2\2\2\u0093\u0094\7k\2\2\u0094\u0095\7o\2\2\u0095\u0096"+
		"\7r\2\2\u0096\u0097\7q\2\2\u0097\u0098\7t\2\2\u0098\u0099\7v\2\2\u0099"+
		"\4\3\2\2\2\u009a\u009b\7o\2\2\u009b\u009c\7c\2\2\u009c\u009d\7k\2\2\u009d"+
		"\u009e\7p\2\2\u009e\6\3\2\2\2\u009f\u00a0\7e\2\2\u00a0\u00a1\7q\2\2\u00a1"+
		"\u00a2\7p\2\2\u00a2\u00a3\7v\2\2\u00a3\u00a4\7t\2\2\u00a4\u00a5\7q\2\2"+
		"\u00a5\u00a6\7n\2\2\u00a6\b\3\2\2\2\u00a7\u00a8\7u\2\2\u00a8\u00a9\7{"+
		"\2\2\u00a9\u00aa\7u\2\2\u00aa\u00ab\7v\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad"+
		"\7o\2\2\u00ad\n\3\2\2\2\u00ae\u00af\7x\2\2\u00af\u00b0\7c\2\2\u00b0\u00b1"+
		"\7t\2\2\u00b1\u00b2\7u\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4\7v\2\2\u00b4"+
		"\f\3\2\2\2\u00b5\u00b6\7q\2\2\u00b6\u00b7\7x\2\2\u00b7\u00b8\7g\2\2\u00b8"+
		"\u00b9\7t\2\2\u00b9\16\3\2\2\2\u00ba\u00bb\7k\2\2\u00bb\u00bc\7p\2\2\u00bc"+
		"\u00bd\7k\2\2\u00bd\u00be\7v\2\2\u00be\20\3\2\2\2\u00bf\u00c0\7c\2\2\u00c0"+
		"\u00c1\7u\2\2\u00c1\22\3\2\2\2\u00c2\u00c3\7u\2\2\u00c3\u00c4\7{\2\2\u00c4"+
		"\u00c5\7p\2\2\u00c5\u00c6\7e\2\2\u00c6\24\3\2\2\2\u00c7\u00c8\7c\2\2\u00c8"+
		"\u00c9\7u\2\2\u00c9\u00ca\7{\2\2\u00ca\u00cb\7p\2\2\u00cb\u00cc\7e\2\2"+
		"\u00cc\26\3\2\2\2\u00cd\u00ce\7c\2\2\u00ce\u00cf\7t\2\2\u00cf\u00d0\7"+
		"i\2\2\u00d0\u00d1\7u\2\2\u00d1\30\3\2\2\2\u00d2\u00d3\7r\2\2\u00d3\u00d4"+
		"\7t\2\2\u00d4\u00d5\7q\2\2\u00d5\u00d6\7r\2\2\u00d6\32\3\2\2\2\u00d7\u00d8"+
		"\7n\2\2\u00d8\u00d9\7v\2\2\u00d9\u00da\7n\2\2\u00da\34\3\2\2\2\u00db\u00dc"+
		"\7d\2\2\u00dc\u00dd\7q\2\2\u00dd\u00de\7q\2\2\u00de\u00df\7n\2\2\u00df"+
		"\36\3\2\2\2\u00e0\u00e1\7k\2\2\u00e1\u00e2\7p\2\2\u00e2\u00e3\7v\2\2\u00e3"+
		" \3\2\2\2\u00e4\u00e5\7h\2\2\u00e5\u00e6\7n\2\2\u00e6\u00e7\7q\2\2\u00e7"+
		"\u00e8\7c\2\2\u00e8\u00e9\7v\2\2\u00e9\"\3\2\2\2\u00ea\u00eb\7u\2\2\u00eb"+
		"\u00ec\7v\2\2\u00ec\u00ed\7t\2\2\u00ed\u00ee\7k\2\2\u00ee\u00ef\7p\2\2"+
		"\u00ef\u00f0\7i\2\2\u00f0$\3\2\2\2\u00f1\u00f2\7<\2\2\u00f2&\3\2\2\2\u00f3"+
		"\u00f4\7<\2\2\u00f4\u00f5\7<\2\2\u00f5(\3\2\2\2\u00f6\u00f7\7/\2\2\u00f7"+
		"\u00f8\7@\2\2\u00f8*\3\2\2\2\u00f9\u00fa\7@\2\2\u00fa,\3\2\2\2\u00fb\u00fc"+
		"\7>\2\2\u00fc.\3\2\2\2\u00fd\u00fe\7#\2\2\u00fe\60\3\2\2\2\u00ff\u0100"+
		"\7\u0080\2\2\u0100\62\3\2\2\2\u0101\u0102\7A\2\2\u0102\64\3\2\2\2\u0103"+
		"\u0104\7?\2\2\u0104\66\3\2\2\2\u0105\u0106\7>\2\2\u0106\u0107\7?\2\2\u0107"+
		"8\3\2\2\2\u0108\u0109\7@\2\2\u0109\u010a\7?\2\2\u010a:\3\2\2\2\u010b\u010c"+
		"\7\61\2\2\u010c\u010d\7?\2\2\u010d<\3\2\2\2\u010e\u010f\7(\2\2\u010f>"+
		"\3\2\2\2\u0110\u0111\7~\2\2\u0111@\3\2\2\2\u0112\u0113\7c\2\2\u0113\u0114"+
		"\7p\2\2\u0114\u0115\7f\2\2\u0115B\3\2\2\2\u0116\u0117\7q\2\2\u0117\u0118"+
		"\7t\2\2\u0118D\3\2\2\2\u0119\u011a\7-\2\2\u011aF\3\2\2\2\u011b\u011c\7"+
		"/\2\2\u011cH\3\2\2\2\u011d\u011e\7,\2\2\u011eJ\3\2\2\2\u011f\u0120\7\61"+
		"\2\2\u0120L\3\2\2\2\u0121\u0122\7`\2\2\u0122N\3\2\2\2\u0123\u0124\7\'"+
		"\2\2\u0124P\3\2\2\2\u0125\u0126\7~\2\2\u0126\u0127\7~\2\2\u0127R\3\2\2"+
		"\2\u0128\u0129\7~\2\2\u0129\u012a\7~\2\2\u012a\u012b\7~\2\2\u012bT\3\2"+
		"\2\2\u012c\u012d\7I\2\2\u012dV\3\2\2\2\u012e\u012f\7H\2\2\u012fX\3\2\2"+
		"\2\u0130\u0131\7Z\2\2\u0131Z\3\2\2\2\u0132\u0133\7W\2\2\u0133\\\3\2\2"+
		"\2\u0134\u0135\7v\2\2\u0135\u0136\7t\2\2\u0136\u0137\7w\2\2\u0137\u013e"+
		"\7g\2\2\u0138\u0139\7h\2\2\u0139\u013a\7c\2\2\u013a\u013b\7n\2\2\u013b"+
		"\u013c\7u\2\2\u013c\u013e\7g\2\2\u013d\u0134\3\2\2\2\u013d\u0138\3\2\2"+
		"\2\u013e^\3\2\2\2\u013f\u014d\7\62\2\2\u0140\u014a\t\2\2\2\u0141\u0143"+
		"\5\u0091I\2\u0142\u0141\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u014b\3\2\2"+
		"\2\u0144\u0146\7a\2\2\u0145\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0145"+
		"\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014b\5\u0091I"+
		"\2\u014a\u0142\3\2\2\2\u014a\u0145\3\2\2\2\u014b\u014d\3\2\2\2\u014c\u013f"+
		"\3\2\2\2\u014c\u0140\3\2\2\2\u014d\u014f\3\2\2\2\u014e\u0150\t\3\2\2\u014f"+
		"\u014e\3\2\2\2\u014f\u0150\3\2\2\2\u0150`\3\2\2\2\u0151\u0152\7\62\2\2"+
		"\u0152\u0153\t\4\2\2\u0153\u015b\t\5\2\2\u0154\u0156\t\6\2\2\u0155\u0154"+
		"\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158"+
		"\u015a\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015c\t\5\2\2\u015b\u0157\3\2"+
		"\2\2\u015b\u015c\3\2\2\2\u015c\u015e\3\2\2\2\u015d\u015f\t\3\2\2\u015e"+
		"\u015d\3\2\2\2\u015e\u015f\3\2\2\2\u015fb\3\2\2\2\u0160\u0164\7\62\2\2"+
		"\u0161\u0163\7a\2\2\u0162\u0161\3\2\2\2\u0163\u0166\3\2\2\2\u0164\u0162"+
		"\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0167\3\2\2\2\u0166\u0164\3\2\2\2\u0167"+
		"\u016f\t\7\2\2\u0168\u016a\t\b\2\2\u0169\u0168\3\2\2\2\u016a\u016d\3\2"+
		"\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016e\3\2\2\2\u016d"+
		"\u016b\3\2\2\2\u016e\u0170\t\7\2\2\u016f\u016b\3\2\2\2\u016f\u0170\3\2"+
		"\2\2\u0170\u0172\3\2\2\2\u0171\u0173\t\3\2\2\u0172\u0171\3\2\2\2\u0172"+
		"\u0173\3\2\2\2\u0173d\3\2\2\2\u0174\u0175\7\62\2\2\u0175\u0176\t\t\2\2"+
		"\u0176\u017e\t\n\2\2\u0177\u0179\t\13\2\2\u0178\u0177\3\2\2\2\u0179\u017c"+
		"\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017d\3\2\2\2\u017c"+
		"\u017a\3\2\2\2\u017d\u017f\t\n\2\2\u017e\u017a\3\2\2\2\u017e\u017f\3\2"+
		"\2\2\u017f\u0181\3\2\2\2\u0180\u0182\t\3\2\2\u0181\u0180\3\2\2\2\u0181"+
		"\u0182\3\2\2\2\u0182f\3\2\2\2\u0183\u0184\5\u0091I\2\u0184\u0186\7\60"+
		"\2\2\u0185\u0187\5\u0091I\2\u0186\u0185\3\2\2\2\u0186\u0187\3\2\2\2\u0187"+
		"\u018b\3\2\2\2\u0188\u0189\7\60\2\2\u0189\u018b\5\u0091I\2\u018a\u0183"+
		"\3\2\2\2\u018a\u0188\3\2\2\2\u018b\u018d\3\2\2\2\u018c\u018e\5\u0089E"+
		"\2\u018d\u018c\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u0190\3\2\2\2\u018f\u0191"+
		"\t\f\2\2\u0190\u018f\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u019b\3\2\2\2\u0192"+
		"\u0198\5\u0091I\2\u0193\u0195\5\u0089E\2\u0194\u0196\t\f\2\2\u0195\u0194"+
		"\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0199\3\2\2\2\u0197\u0199\t\f\2\2\u0198"+
		"\u0193\3\2\2\2\u0198\u0197\3\2\2\2\u0199\u019b\3\2\2\2\u019a\u018a\3\2"+
		"\2\2\u019a\u0192\3\2\2\2\u019bh\3\2\2\2\u019c\u019d\7\62\2\2\u019d\u01a7"+
		"\t\4\2\2\u019e\u01a0\5\u008dG\2\u019f\u01a1\7\60\2\2\u01a0\u019f\3\2\2"+
		"\2\u01a0\u01a1\3\2\2\2\u01a1\u01a8\3\2\2\2\u01a2\u01a4\5\u008dG\2\u01a3"+
		"\u01a2\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6\7\60"+
		"\2\2\u01a6\u01a8\5\u008dG\2\u01a7\u019e\3\2\2\2\u01a7\u01a3\3\2\2\2\u01a8"+
		"\u01a9\3\2\2\2\u01a9\u01ab\t\r\2\2\u01aa\u01ac\t\16\2\2\u01ab\u01aa\3"+
		"\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01af\5\u0091I\2"+
		"\u01ae\u01b0\t\f\2\2\u01af\u01ae\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0j\3"+
		"\2\2\2\u01b1\u01b6\7$\2\2\u01b2\u01b5\n\17\2\2\u01b3\u01b5\5\u008bF\2"+
		"\u01b4\u01b2\3\2\2\2\u01b4\u01b3\3\2\2\2\u01b5\u01b8\3\2\2\2\u01b6\u01b4"+
		"\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b9\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b9"+
		"\u01ba\7$\2\2\u01bal\3\2\2\2\u01bb\u01bc\7p\2\2\u01bc\u01bd\7w\2\2\u01bd"+
		"\u01be\7n\2\2\u01be\u01bf\7n\2\2\u01bfn\3\2\2\2\u01c0\u01c1\7*\2\2\u01c1"+
		"p\3\2\2\2\u01c2\u01c3\7+\2\2\u01c3r\3\2\2\2\u01c4\u01c5\7}\2\2\u01c5t"+
		"\3\2\2\2\u01c6\u01c7\7\177\2\2\u01c7v\3\2\2\2\u01c8\u01c9\7]\2\2\u01c9"+
		"x\3\2\2\2\u01ca\u01cb\7_\2\2\u01cbz\3\2\2\2\u01cc\u01cd\7=\2\2\u01cd|"+
		"\3\2\2\2\u01ce\u01cf\7.\2\2\u01cf~\3\2\2\2\u01d0\u01d1\7\60\2\2\u01d1"+
		"\u0080\3\2\2\2\u01d2\u01d6\t\20\2\2\u01d3\u01d5\t\21\2\2\u01d4\u01d3\3"+
		"\2\2\2\u01d5\u01d8\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7"+
		"\u0082\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d9\u01db\t\22\2\2\u01da\u01d9\3"+
		"\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd"+
		"\u01de\3\2\2\2\u01de\u01df\bB\2\2\u01df\u0084\3\2\2\2\u01e0\u01e1\7\61"+
		"\2\2\u01e1\u01e2\7,\2\2\u01e2\u01e6\3\2\2\2\u01e3\u01e5\13\2\2\2\u01e4"+
		"\u01e3\3\2\2\2\u01e5\u01e8\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e6\u01e4\3\2"+
		"\2\2\u01e7\u01e9\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e9\u01ea\7,\2\2\u01ea"+
		"\u01eb\7\61\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed\bC\2\2\u01ed\u0086\3\2"+
		"\2\2\u01ee\u01ef\7\61\2\2\u01ef\u01f0\7\61\2\2\u01f0\u01f4\3\2\2\2\u01f1"+
		"\u01f3\n\23\2\2\u01f2\u01f1\3\2\2\2\u01f3\u01f6\3\2\2\2\u01f4\u01f2\3"+
		"\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f7\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f7"+
		"\u01f8\bD\2\2\u01f8\u0088\3\2\2\2\u01f9\u01fb\t\24\2\2\u01fa\u01fc\t\16"+
		"\2\2\u01fb\u01fa\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd"+
		"\u01fe\5\u0091I\2\u01fe\u008a\3\2\2\2\u01ff\u0200\7^\2\2\u0200\u0215\t"+
		"\25\2\2\u0201\u0206\7^\2\2\u0202\u0204\t\26\2\2\u0203\u0202\3\2\2\2\u0203"+
		"\u0204\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0207\t\7\2\2\u0206\u0203\3\2"+
		"\2\2\u0206\u0207\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u0215\t\7\2\2\u0209"+
		"\u020b\7^\2\2\u020a\u020c\7w\2\2\u020b\u020a\3\2\2\2\u020c\u020d\3\2\2"+
		"\2\u020d\u020b\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0210"+
		"\5\u008fH\2\u0210\u0211\5\u008fH\2\u0211\u0212\5\u008fH\2\u0212\u0213"+
		"\5\u008fH\2\u0213\u0215\3\2\2\2\u0214\u01ff\3\2\2\2\u0214\u0201\3\2\2"+
		"\2\u0214\u0209\3\2\2\2\u0215\u008c\3\2\2\2\u0216\u021f\5\u008fH\2\u0217"+
		"\u021a\5\u008fH\2\u0218\u021a\7a\2\2\u0219\u0217\3\2\2\2\u0219\u0218\3"+
		"\2\2\2\u021a\u021d\3\2\2\2\u021b\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021c"+
		"\u021e\3\2\2\2\u021d\u021b\3\2\2\2\u021e\u0220\5\u008fH\2\u021f\u021b"+
		"\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u008e\3\2\2\2\u0221\u0222\t\5\2\2\u0222"+
		"\u0090\3\2\2\2\u0223\u022b\t\27\2\2\u0224\u0226\t\30\2\2\u0225\u0224\3"+
		"\2\2\2\u0226\u0229\3\2\2\2\u0227\u0225\3\2\2\2\u0227\u0228\3\2\2\2\u0228"+
		"\u022a\3\2\2\2\u0229\u0227\3\2\2\2\u022a\u022c\t\27\2\2\u022b\u0227\3"+
		"\2\2\2\u022b\u022c\3\2\2\2\u022c\u0092\3\2\2\2/\2\u013d\u0142\u0147\u014a"+
		"\u014c\u014f\u0157\u015b\u015e\u0164\u016b\u016f\u0172\u017a\u017e\u0181"+
		"\u0186\u018a\u018d\u0190\u0195\u0198\u019a\u01a0\u01a3\u01a7\u01ab\u01af"+
		"\u01b4\u01b6\u01d6\u01dc\u01e6\u01f4\u01fb\u0203\u0206\u020d\u0214\u0219"+
		"\u021b\u021f\u0227\u022b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}