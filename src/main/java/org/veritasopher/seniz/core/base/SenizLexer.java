// Generated from C:/Project/ResearchProject/FDD/Seniz/project/Seniz/src/main/resources\SenizLexer.g4 by ANTLR 4.8
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IMPORT", "SYSTEM", "VARIABLE", "OVER", "BOOLEAN", "INT", "FLOAT", "STRING", 
			"VALUEOF", "TYPEOF", "EQ", "TO", "POS", "NEG", "BOOL_LITERAL", "DECIMAL_LITERAL", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u018e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u009f\n\20\3\21\3\21\3\21\5\21\u00a4\n\21\3"+
		"\21\6\21\u00a7\n\21\r\21\16\21\u00a8\3\21\5\21\u00ac\n\21\5\21\u00ae\n"+
		"\21\3\21\5\21\u00b1\n\21\3\22\3\22\3\22\3\22\7\22\u00b7\n\22\f\22\16\22"+
		"\u00ba\13\22\3\22\5\22\u00bd\n\22\3\22\5\22\u00c0\n\22\3\23\3\23\7\23"+
		"\u00c4\n\23\f\23\16\23\u00c7\13\23\3\23\3\23\7\23\u00cb\n\23\f\23\16\23"+
		"\u00ce\13\23\3\23\5\23\u00d1\n\23\3\23\5\23\u00d4\n\23\3\24\3\24\3\24"+
		"\3\24\7\24\u00da\n\24\f\24\16\24\u00dd\13\24\3\24\5\24\u00e0\n\24\3\24"+
		"\5\24\u00e3\n\24\3\25\3\25\3\25\5\25\u00e8\n\25\3\25\3\25\5\25\u00ec\n"+
		"\25\3\25\5\25\u00ef\n\25\3\25\5\25\u00f2\n\25\3\25\3\25\3\25\5\25\u00f7"+
		"\n\25\3\25\5\25\u00fa\n\25\5\25\u00fc\n\25\3\26\3\26\3\26\3\26\5\26\u0102"+
		"\n\26\3\26\5\26\u0105\n\26\3\26\3\26\5\26\u0109\n\26\3\26\3\26\5\26\u010d"+
		"\n\26\3\26\3\26\5\26\u0111\n\26\3\27\3\27\3\27\7\27\u0116\n\27\f\27\16"+
		"\27\u0119\13\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\""+
		"\7\"\u0136\n\"\f\"\16\"\u0139\13\"\3#\6#\u013c\n#\r#\16#\u013d\3#\3#\3"+
		"$\3$\3$\3$\7$\u0146\n$\f$\16$\u0149\13$\3$\3$\3$\3$\3$\3%\3%\3%\3%\7%"+
		"\u0154\n%\f%\16%\u0157\13%\3%\3%\3&\3&\5&\u015d\n&\3&\3&\3\'\3\'\3\'\3"+
		"\'\5\'\u0165\n\'\3\'\5\'\u0168\n\'\3\'\3\'\3\'\6\'\u016d\n\'\r\'\16\'"+
		"\u016e\3\'\3\'\3\'\3\'\3\'\5\'\u0176\n\'\3(\3(\3(\7(\u017b\n(\f(\16(\u017e"+
		"\13(\3(\5(\u0181\n(\3)\3)\3*\3*\7*\u0187\n*\f*\16*\u018a\13*\3*\5*\u018d"+
		"\n*\3\u0147\2+\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#E$G%I&K\2M\2O\2Q\2S\2\3\2\31\3\2\63;\4\2NNnn\4"+
		"\2ZZzz\5\2\62;CHch\6\2\62;CHaach\3\2\629\4\2\629aa\4\2DDdd\3\2\62\63\4"+
		"\2\62\63aa\6\2FFHHffhh\4\2RRrr\4\2--//\6\2\f\f\17\17$$^^\5\2C\\aac|\6"+
		"\2\62;C\\aac|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\4\2GGgg\n\2$$))^^ddhhp"+
		"pttvv\3\2\62\65\3\2\62;\4\2\62;aa\2\u01b5\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\3U\3\2\2\2\5\\"+
		"\3\2\2\2\7c\3\2\2\2\tl\3\2\2\2\13q\3\2\2\2\rv\3\2\2\2\17z\3\2\2\2\21\u0080"+
		"\3\2\2\2\23\u0087\3\2\2\2\25\u0089\3\2\2\2\27\u008c\3\2\2\2\31\u008e\3"+
		"\2\2\2\33\u0091\3\2\2\2\35\u0093\3\2\2\2\37\u009e\3\2\2\2!\u00ad\3\2\2"+
		"\2#\u00b2\3\2\2\2%\u00c1\3\2\2\2\'\u00d5\3\2\2\2)\u00fb\3\2\2\2+\u00fd"+
		"\3\2\2\2-\u0112\3\2\2\2/\u011c\3\2\2\2\61\u0121\3\2\2\2\63\u0123\3\2\2"+
		"\2\65\u0125\3\2\2\2\67\u0127\3\2\2\29\u0129\3\2\2\2;\u012b\3\2\2\2=\u012d"+
		"\3\2\2\2?\u012f\3\2\2\2A\u0131\3\2\2\2C\u0133\3\2\2\2E\u013b\3\2\2\2G"+
		"\u0141\3\2\2\2I\u014f\3\2\2\2K\u015a\3\2\2\2M\u0175\3\2\2\2O\u0177\3\2"+
		"\2\2Q\u0182\3\2\2\2S\u0184\3\2\2\2UV\7k\2\2VW\7o\2\2WX\7r\2\2XY\7q\2\2"+
		"YZ\7t\2\2Z[\7v\2\2[\4\3\2\2\2\\]\7u\2\2]^\7{\2\2^_\7u\2\2_`\7v\2\2`a\7"+
		"g\2\2ab\7o\2\2b\6\3\2\2\2cd\7x\2\2de\7c\2\2ef\7t\2\2fg\7k\2\2gh\7c\2\2"+
		"hi\7d\2\2ij\7n\2\2jk\7g\2\2k\b\3\2\2\2lm\7q\2\2mn\7x\2\2no\7g\2\2op\7"+
		"t\2\2p\n\3\2\2\2qr\7d\2\2rs\7q\2\2st\7q\2\2tu\7n\2\2u\f\3\2\2\2vw\7k\2"+
		"\2wx\7p\2\2xy\7v\2\2y\16\3\2\2\2z{\7h\2\2{|\7n\2\2|}\7q\2\2}~\7c\2\2~"+
		"\177\7v\2\2\177\20\3\2\2\2\u0080\u0081\7u\2\2\u0081\u0082\7v\2\2\u0082"+
		"\u0083\7t\2\2\u0083\u0084\7k\2\2\u0084\u0085\7p\2\2\u0085\u0086\7i\2\2"+
		"\u0086\22\3\2\2\2\u0087\u0088\7<\2\2\u0088\24\3\2\2\2\u0089\u008a\7<\2"+
		"\2\u008a\u008b\7<\2\2\u008b\26\3\2\2\2\u008c\u008d\7?\2\2\u008d\30\3\2"+
		"\2\2\u008e\u008f\7/\2\2\u008f\u0090\7@\2\2\u0090\32\3\2\2\2\u0091\u0092"+
		"\7-\2\2\u0092\34\3\2\2\2\u0093\u0094\7/\2\2\u0094\36\3\2\2\2\u0095\u0096"+
		"\7v\2\2\u0096\u0097\7t\2\2\u0097\u0098\7w\2\2\u0098\u009f\7g\2\2\u0099"+
		"\u009a\7h\2\2\u009a\u009b\7c\2\2\u009b\u009c\7n\2\2\u009c\u009d\7u\2\2"+
		"\u009d\u009f\7g\2\2\u009e\u0095\3\2\2\2\u009e\u0099\3\2\2\2\u009f \3\2"+
		"\2\2\u00a0\u00ae\7\62\2\2\u00a1\u00ab\t\2\2\2\u00a2\u00a4\5S*\2\u00a3"+
		"\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00ac\3\2\2\2\u00a5\u00a7\7a"+
		"\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\5S*\2\u00ab\u00a3\3\2\2"+
		"\2\u00ab\u00a6\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00a0\3\2\2\2\u00ad\u00a1"+
		"\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af\u00b1\t\3\2\2\u00b0\u00af\3\2\2\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1\"\3\2\2\2\u00b2\u00b3\7\62\2\2\u00b3\u00b4\t\4\2"+
		"\2\u00b4\u00bc\t\5\2\2\u00b5\u00b7\t\6\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba"+
		"\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00bb\u00bd\t\5\2\2\u00bc\u00b8\3\2\2\2\u00bc\u00bd\3\2"+
		"\2\2\u00bd\u00bf\3\2\2\2\u00be\u00c0\t\3\2\2\u00bf\u00be\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0$\3\2\2\2\u00c1\u00c5\7\62\2\2\u00c2\u00c4\7a\2\2"+
		"\u00c3\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6"+
		"\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00d0\t\7\2\2\u00c9"+
		"\u00cb\t\b\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2"+
		"\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf"+
		"\u00d1\t\7\2\2\u00d0\u00cc\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\3\2"+
		"\2\2\u00d2\u00d4\t\3\2\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"&\3\2\2\2\u00d5\u00d6\7\62\2\2\u00d6\u00d7\t\t\2\2\u00d7\u00df\t\n\2\2"+
		"\u00d8\u00da\t\13\2\2\u00d9\u00d8\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9"+
		"\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd\u00db\3\2\2\2\u00de"+
		"\u00e0\t\n\2\2\u00df\u00db\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2\3\2"+
		"\2\2\u00e1\u00e3\t\3\2\2\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
		"(\3\2\2\2\u00e4\u00e5\5S*\2\u00e5\u00e7\7\60\2\2\u00e6\u00e8\5S*\2\u00e7"+
		"\u00e6\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ec\3\2\2\2\u00e9\u00ea\7\60"+
		"\2\2\u00ea\u00ec\5S*\2\u00eb\u00e4\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ee"+
		"\3\2\2\2\u00ed\u00ef\5K&\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef"+
		"\u00f1\3\2\2\2\u00f0\u00f2\t\f\2\2\u00f1\u00f0\3\2\2\2\u00f1\u00f2\3\2"+
		"\2\2\u00f2\u00fc\3\2\2\2\u00f3\u00f9\5S*\2\u00f4\u00f6\5K&\2\u00f5\u00f7"+
		"\t\f\2\2\u00f6\u00f5\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8"+
		"\u00fa\t\f\2\2\u00f9\u00f4\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fc\3\2"+
		"\2\2\u00fb\u00eb\3\2\2\2\u00fb\u00f3\3\2\2\2\u00fc*\3\2\2\2\u00fd\u00fe"+
		"\7\62\2\2\u00fe\u0108\t\4\2\2\u00ff\u0101\5O(\2\u0100\u0102\7\60\2\2\u0101"+
		"\u0100\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0109\3\2\2\2\u0103\u0105\5O"+
		"(\2\u0104\u0103\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\3\2\2\2\u0106"+
		"\u0107\7\60\2\2\u0107\u0109\5O(\2\u0108\u00ff\3\2\2\2\u0108\u0104\3\2"+
		"\2\2\u0109\u010a\3\2\2\2\u010a\u010c\t\r\2\2\u010b\u010d\t\16\2\2\u010c"+
		"\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0110\5S"+
		"*\2\u010f\u0111\t\f\2\2\u0110\u010f\3\2\2\2\u0110\u0111\3\2\2\2\u0111"+
		",\3\2\2\2\u0112\u0117\7$\2\2\u0113\u0116\n\17\2\2\u0114\u0116\5M\'\2\u0115"+
		"\u0113\3\2\2\2\u0115\u0114\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2"+
		"\2\2\u0117\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119\u0117\3\2\2\2\u011a"+
		"\u011b\7$\2\2\u011b.\3\2\2\2\u011c\u011d\7p\2\2\u011d\u011e\7w\2\2\u011e"+
		"\u011f\7n\2\2\u011f\u0120\7n\2\2\u0120\60\3\2\2\2\u0121\u0122\7*\2\2\u0122"+
		"\62\3\2\2\2\u0123\u0124\7+\2\2\u0124\64\3\2\2\2\u0125\u0126\7}\2\2\u0126"+
		"\66\3\2\2\2\u0127\u0128\7\177\2\2\u01288\3\2\2\2\u0129\u012a\7]\2\2\u012a"+
		":\3\2\2\2\u012b\u012c\7_\2\2\u012c<\3\2\2\2\u012d\u012e\7=\2\2\u012e>"+
		"\3\2\2\2\u012f\u0130\7.\2\2\u0130@\3\2\2\2\u0131\u0132\7\60\2\2\u0132"+
		"B\3\2\2\2\u0133\u0137\t\20\2\2\u0134\u0136\t\21\2\2\u0135\u0134\3\2\2"+
		"\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138D"+
		"\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013c\t\22\2\2\u013b\u013a\3\2\2\2"+
		"\u013c\u013d\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f"+
		"\3\2\2\2\u013f\u0140\b#\2\2\u0140F\3\2\2\2\u0141\u0142\7\61\2\2\u0142"+
		"\u0143\7,\2\2\u0143\u0147\3\2\2\2\u0144\u0146\13\2\2\2\u0145\u0144\3\2"+
		"\2\2\u0146\u0149\3\2\2\2\u0147\u0148\3\2\2\2\u0147\u0145\3\2\2\2\u0148"+
		"\u014a\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u014b\7,\2\2\u014b\u014c\7\61"+
		"\2\2\u014c\u014d\3\2\2\2\u014d\u014e\b$\2\2\u014eH\3\2\2\2\u014f\u0150"+
		"\7\61\2\2\u0150\u0151\7\61\2\2\u0151\u0155\3\2\2\2\u0152\u0154\n\23\2"+
		"\2\u0153\u0152\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156"+
		"\3\2\2\2\u0156\u0158\3\2\2\2\u0157\u0155\3\2\2\2\u0158\u0159\b%\2\2\u0159"+
		"J\3\2\2\2\u015a\u015c\t\24\2\2\u015b\u015d\t\16\2\2\u015c\u015b\3\2\2"+
		"\2\u015c\u015d\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f\5S*\2\u015fL\3"+
		"\2\2\2\u0160\u0161\7^\2\2\u0161\u0176\t\25\2\2\u0162\u0167\7^\2\2\u0163"+
		"\u0165\t\26\2\2\u0164\u0163\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166\3"+
		"\2\2\2\u0166\u0168\t\7\2\2\u0167\u0164\3\2\2\2\u0167\u0168\3\2\2\2\u0168"+
		"\u0169\3\2\2\2\u0169\u0176\t\7\2\2\u016a\u016c\7^\2\2\u016b\u016d\7w\2"+
		"\2\u016c\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f"+
		"\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\5Q)\2\u0171\u0172\5Q)\2\u0172"+
		"\u0173\5Q)\2\u0173\u0174\5Q)\2\u0174\u0176\3\2\2\2\u0175\u0160\3\2\2\2"+
		"\u0175\u0162\3\2\2\2\u0175\u016a\3\2\2\2\u0176N\3\2\2\2\u0177\u0180\5"+
		"Q)\2\u0178\u017b\5Q)\2\u0179\u017b\7a\2\2\u017a\u0178\3\2\2\2\u017a\u0179"+
		"\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d"+
		"\u017f\3\2\2\2\u017e\u017c\3\2\2\2\u017f\u0181\5Q)\2\u0180\u017c\3\2\2"+
		"\2\u0180\u0181\3\2\2\2\u0181P\3\2\2\2\u0182\u0183\t\5\2\2\u0183R\3\2\2"+
		"\2\u0184\u018c\t\27\2\2\u0185\u0187\t\30\2\2\u0186\u0185\3\2\2\2\u0187"+
		"\u018a\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018b\3\2"+
		"\2\2\u018a\u0188\3\2\2\2\u018b\u018d\t\27\2\2\u018c\u0188\3\2\2\2\u018c"+
		"\u018d\3\2\2\2\u018dT\3\2\2\2/\2\u009e\u00a3\u00a8\u00ab\u00ad\u00b0\u00b8"+
		"\u00bc\u00bf\u00c5\u00cc\u00d0\u00d3\u00db\u00df\u00e2\u00e7\u00eb\u00ee"+
		"\u00f1\u00f6\u00f9\u00fb\u0101\u0104\u0108\u010c\u0110\u0115\u0117\u0137"+
		"\u013d\u0147\u0155\u015c\u0164\u0167\u016e\u0175\u017a\u017c\u0180\u0188"+
		"\u018c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}