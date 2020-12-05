// Generated from C:/Project/ResearchProject/FDD/Seniz/project/Seniz/src/main/resources\SenizLexer.g4 by ANTLR 4.9
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IMPORT", "SYSTEM", "VARIABLE", "OVER", "INIT", "BOOLEAN", "INT", "FLOAT", 
			"STRING", "VALUEOF", "TYPEOF", "EQ", "TO", "POS", "NEG", "BOOL_LITERAL", 
			"DECIMAL_LITERAL", "HEX_LITERAL", "OCT_LITERAL", "BINARY_LITERAL", "FLOAT_LITERAL", 
			"HEX_FLOAT_LITERAL", "STRING_LITERAL", "NULL_LITERAL", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "IDENTIFIER", 
			"WS", "COMMENT", "LINE_COMMENT", "ExponentPart", "EscapeSequence", "HexDigits", 
			"HexDigit", "Digits"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u0195\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00a6\n\21\3\22"+
		"\3\22\3\22\5\22\u00ab\n\22\3\22\6\22\u00ae\n\22\r\22\16\22\u00af\3\22"+
		"\5\22\u00b3\n\22\5\22\u00b5\n\22\3\22\5\22\u00b8\n\22\3\23\3\23\3\23\3"+
		"\23\7\23\u00be\n\23\f\23\16\23\u00c1\13\23\3\23\5\23\u00c4\n\23\3\23\5"+
		"\23\u00c7\n\23\3\24\3\24\7\24\u00cb\n\24\f\24\16\24\u00ce\13\24\3\24\3"+
		"\24\7\24\u00d2\n\24\f\24\16\24\u00d5\13\24\3\24\5\24\u00d8\n\24\3\24\5"+
		"\24\u00db\n\24\3\25\3\25\3\25\3\25\7\25\u00e1\n\25\f\25\16\25\u00e4\13"+
		"\25\3\25\5\25\u00e7\n\25\3\25\5\25\u00ea\n\25\3\26\3\26\3\26\5\26\u00ef"+
		"\n\26\3\26\3\26\5\26\u00f3\n\26\3\26\5\26\u00f6\n\26\3\26\5\26\u00f9\n"+
		"\26\3\26\3\26\3\26\5\26\u00fe\n\26\3\26\5\26\u0101\n\26\5\26\u0103\n\26"+
		"\3\27\3\27\3\27\3\27\5\27\u0109\n\27\3\27\5\27\u010c\n\27\3\27\3\27\5"+
		"\27\u0110\n\27\3\27\3\27\5\27\u0114\n\27\3\27\3\27\5\27\u0118\n\27\3\30"+
		"\3\30\3\30\7\30\u011d\n\30\f\30\16\30\u0120\13\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\7#\u013d\n#\f#\16#\u0140\13#\3$\6$\u0143"+
		"\n$\r$\16$\u0144\3$\3$\3%\3%\3%\3%\7%\u014d\n%\f%\16%\u0150\13%\3%\3%"+
		"\3%\3%\3%\3&\3&\3&\3&\7&\u015b\n&\f&\16&\u015e\13&\3&\3&\3\'\3\'\5\'\u0164"+
		"\n\'\3\'\3\'\3(\3(\3(\3(\5(\u016c\n(\3(\5(\u016f\n(\3(\3(\3(\6(\u0174"+
		"\n(\r(\16(\u0175\3(\3(\3(\3(\3(\5(\u017d\n(\3)\3)\3)\7)\u0182\n)\f)\16"+
		")\u0185\13)\3)\5)\u0188\n)\3*\3*\3+\3+\7+\u018e\n+\f+\16+\u0191\13+\3"+
		"+\5+\u0194\n+\3\u014e\2,\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M\2O\2Q\2S\2U\2\3\2\31\3\2\63"+
		";\4\2NNnn\4\2ZZzz\5\2\62;CHch\6\2\62;CHaach\3\2\629\4\2\629aa\4\2DDdd"+
		"\3\2\62\63\4\2\62\63aa\6\2FFHHffhh\4\2RRrr\4\2--//\6\2\f\f\17\17$$^^\5"+
		"\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\4\2GGgg\n\2"+
		"$$))^^ddhhppttvv\3\2\62\65\3\2\62;\4\2\62;aa\2\u01bc\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\3W\3\2\2\2\5^\3\2\2\2\7e\3\2\2\2\tn\3\2\2\2\13s\3\2\2\2\rx\3\2"+
		"\2\2\17}\3\2\2\2\21\u0081\3\2\2\2\23\u0087\3\2\2\2\25\u008e\3\2\2\2\27"+
		"\u0090\3\2\2\2\31\u0093\3\2\2\2\33\u0095\3\2\2\2\35\u0098\3\2\2\2\37\u009a"+
		"\3\2\2\2!\u00a5\3\2\2\2#\u00b4\3\2\2\2%\u00b9\3\2\2\2\'\u00c8\3\2\2\2"+
		")\u00dc\3\2\2\2+\u0102\3\2\2\2-\u0104\3\2\2\2/\u0119\3\2\2\2\61\u0123"+
		"\3\2\2\2\63\u0128\3\2\2\2\65\u012a\3\2\2\2\67\u012c\3\2\2\29\u012e\3\2"+
		"\2\2;\u0130\3\2\2\2=\u0132\3\2\2\2?\u0134\3\2\2\2A\u0136\3\2\2\2C\u0138"+
		"\3\2\2\2E\u013a\3\2\2\2G\u0142\3\2\2\2I\u0148\3\2\2\2K\u0156\3\2\2\2M"+
		"\u0161\3\2\2\2O\u017c\3\2\2\2Q\u017e\3\2\2\2S\u0189\3\2\2\2U\u018b\3\2"+
		"\2\2WX\7k\2\2XY\7o\2\2YZ\7r\2\2Z[\7q\2\2[\\\7t\2\2\\]\7v\2\2]\4\3\2\2"+
		"\2^_\7u\2\2_`\7{\2\2`a\7u\2\2ab\7v\2\2bc\7g\2\2cd\7o\2\2d\6\3\2\2\2ef"+
		"\7x\2\2fg\7c\2\2gh\7t\2\2hi\7k\2\2ij\7c\2\2jk\7d\2\2kl\7n\2\2lm\7g\2\2"+
		"m\b\3\2\2\2no\7q\2\2op\7x\2\2pq\7g\2\2qr\7t\2\2r\n\3\2\2\2st\7k\2\2tu"+
		"\7p\2\2uv\7k\2\2vw\7v\2\2w\f\3\2\2\2xy\7d\2\2yz\7q\2\2z{\7q\2\2{|\7n\2"+
		"\2|\16\3\2\2\2}~\7k\2\2~\177\7p\2\2\177\u0080\7v\2\2\u0080\20\3\2\2\2"+
		"\u0081\u0082\7h\2\2\u0082\u0083\7n\2\2\u0083\u0084\7q\2\2\u0084\u0085"+
		"\7c\2\2\u0085\u0086\7v\2\2\u0086\22\3\2\2\2\u0087\u0088\7u\2\2\u0088\u0089"+
		"\7v\2\2\u0089\u008a\7t\2\2\u008a\u008b\7k\2\2\u008b\u008c\7p\2\2\u008c"+
		"\u008d\7i\2\2\u008d\24\3\2\2\2\u008e\u008f\7<\2\2\u008f\26\3\2\2\2\u0090"+
		"\u0091\7<\2\2\u0091\u0092\7<\2\2\u0092\30\3\2\2\2\u0093\u0094\7?\2\2\u0094"+
		"\32\3\2\2\2\u0095\u0096\7/\2\2\u0096\u0097\7@\2\2\u0097\34\3\2\2\2\u0098"+
		"\u0099\7-\2\2\u0099\36\3\2\2\2\u009a\u009b\7/\2\2\u009b \3\2\2\2\u009c"+
		"\u009d\7v\2\2\u009d\u009e\7t\2\2\u009e\u009f\7w\2\2\u009f\u00a6\7g\2\2"+
		"\u00a0\u00a1\7h\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3\7n\2\2\u00a3\u00a4"+
		"\7u\2\2\u00a4\u00a6\7g\2\2\u00a5\u009c\3\2\2\2\u00a5\u00a0\3\2\2\2\u00a6"+
		"\"\3\2\2\2\u00a7\u00b5\7\62\2\2\u00a8\u00b2\t\2\2\2\u00a9\u00ab\5U+\2"+
		"\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00b3\3\2\2\2\u00ac\u00ae"+
		"\7a\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\5U+\2\u00b2\u00aa\3\2\2"+
		"\2\u00b2\u00ad\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00a7\3\2\2\2\u00b4\u00a8"+
		"\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b8\t\3\2\2\u00b7\u00b6\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8$\3\2\2\2\u00b9\u00ba\7\62\2\2\u00ba\u00bb\t\4\2\2"+
		"\u00bb\u00c3\t\5\2\2\u00bc\u00be\t\6\2\2\u00bd\u00bc\3\2\2\2\u00be\u00c1"+
		"\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1"+
		"\u00bf\3\2\2\2\u00c2\u00c4\t\5\2\2\u00c3\u00bf\3\2\2\2\u00c3\u00c4\3\2"+
		"\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c7\t\3\2\2\u00c6\u00c5\3\2\2\2\u00c6"+
		"\u00c7\3\2\2\2\u00c7&\3\2\2\2\u00c8\u00cc\7\62\2\2\u00c9\u00cb\7a\2\2"+
		"\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd"+
		"\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d7\t\7\2\2\u00d0"+
		"\u00d2\t\b\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2"+
		"\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6"+
		"\u00d8\t\7\2\2\u00d7\u00d3\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da\3\2"+
		"\2\2\u00d9\u00db\t\3\2\2\u00da\u00d9\3\2\2\2\u00da\u00db\3\2\2\2\u00db"+
		"(\3\2\2\2\u00dc\u00dd\7\62\2\2\u00dd\u00de\t\t\2\2\u00de\u00e6\t\n\2\2"+
		"\u00df\u00e1\t\13\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0"+
		"\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5"+
		"\u00e7\t\n\2\2\u00e6\u00e2\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9\3\2"+
		"\2\2\u00e8\u00ea\t\3\2\2\u00e9\u00e8\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"*\3\2\2\2\u00eb\u00ec\5U+\2\u00ec\u00ee\7\60\2\2\u00ed\u00ef\5U+\2\u00ee"+
		"\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f3\3\2\2\2\u00f0\u00f1\7\60"+
		"\2\2\u00f1\u00f3\5U+\2\u00f2\u00eb\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f5"+
		"\3\2\2\2\u00f4\u00f6\5M\'\2\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6"+
		"\u00f8\3\2\2\2\u00f7\u00f9\t\f\2\2\u00f8\u00f7\3\2\2\2\u00f8\u00f9\3\2"+
		"\2\2\u00f9\u0103\3\2\2\2\u00fa\u0100\5U+\2\u00fb\u00fd\5M\'\2\u00fc\u00fe"+
		"\t\f\2\2\u00fd\u00fc\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff"+
		"\u0101\t\f\2\2\u0100\u00fb\3\2\2\2\u0100\u00ff\3\2\2\2\u0101\u0103\3\2"+
		"\2\2\u0102\u00f2\3\2\2\2\u0102\u00fa\3\2\2\2\u0103,\3\2\2\2\u0104\u0105"+
		"\7\62\2\2\u0105\u010f\t\4\2\2\u0106\u0108\5Q)\2\u0107\u0109\7\60\2\2\u0108"+
		"\u0107\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u0110\3\2\2\2\u010a\u010c\5Q"+
		")\2\u010b\u010a\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\u010e\7\60\2\2\u010e\u0110\5Q)\2\u010f\u0106\3\2\2\2\u010f\u010b\3\2"+
		"\2\2\u0110\u0111\3\2\2\2\u0111\u0113\t\r\2\2\u0112\u0114\t\16\2\2\u0113"+
		"\u0112\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117\5U"+
		"+\2\u0116\u0118\t\f\2\2\u0117\u0116\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		".\3\2\2\2\u0119\u011e\7$\2\2\u011a\u011d\n\17\2\2\u011b\u011d\5O(\2\u011c"+
		"\u011a\3\2\2\2\u011c\u011b\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2"+
		"\2\2\u011e\u011f\3\2\2\2\u011f\u0121\3\2\2\2\u0120\u011e\3\2\2\2\u0121"+
		"\u0122\7$\2\2\u0122\60\3\2\2\2\u0123\u0124\7p\2\2\u0124\u0125\7w\2\2\u0125"+
		"\u0126\7n\2\2\u0126\u0127\7n\2\2\u0127\62\3\2\2\2\u0128\u0129\7*\2\2\u0129"+
		"\64\3\2\2\2\u012a\u012b\7+\2\2\u012b\66\3\2\2\2\u012c\u012d\7}\2\2\u012d"+
		"8\3\2\2\2\u012e\u012f\7\177\2\2\u012f:\3\2\2\2\u0130\u0131\7]\2\2\u0131"+
		"<\3\2\2\2\u0132\u0133\7_\2\2\u0133>\3\2\2\2\u0134\u0135\7=\2\2\u0135@"+
		"\3\2\2\2\u0136\u0137\7.\2\2\u0137B\3\2\2\2\u0138\u0139\7\60\2\2\u0139"+
		"D\3\2\2\2\u013a\u013e\t\20\2\2\u013b\u013d\t\21\2\2\u013c\u013b\3\2\2"+
		"\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013fF"+
		"\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0143\t\22\2\2\u0142\u0141\3\2\2\2"+
		"\u0143\u0144\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146"+
		"\3\2\2\2\u0146\u0147\b$\2\2\u0147H\3\2\2\2\u0148\u0149\7\61\2\2\u0149"+
		"\u014a\7,\2\2\u014a\u014e\3\2\2\2\u014b\u014d\13\2\2\2\u014c\u014b\3\2"+
		"\2\2\u014d\u0150\3\2\2\2\u014e\u014f\3\2\2\2\u014e\u014c\3\2\2\2\u014f"+
		"\u0151\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0152\7,\2\2\u0152\u0153\7\61"+
		"\2\2\u0153\u0154\3\2\2\2\u0154\u0155\b%\2\2\u0155J\3\2\2\2\u0156\u0157"+
		"\7\61\2\2\u0157\u0158\7\61\2\2\u0158\u015c\3\2\2\2\u0159\u015b\n\23\2"+
		"\2\u015a\u0159\3\2\2\2\u015b\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d"+
		"\3\2\2\2\u015d\u015f\3\2\2\2\u015e\u015c\3\2\2\2\u015f\u0160\b&\2\2\u0160"+
		"L\3\2\2\2\u0161\u0163\t\24\2\2\u0162\u0164\t\16\2\2\u0163\u0162\3\2\2"+
		"\2\u0163\u0164\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166\5U+\2\u0166N\3"+
		"\2\2\2\u0167\u0168\7^\2\2\u0168\u017d\t\25\2\2\u0169\u016e\7^\2\2\u016a"+
		"\u016c\t\26\2\2\u016b\u016a\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\3"+
		"\2\2\2\u016d\u016f\t\7\2\2\u016e\u016b\3\2\2\2\u016e\u016f\3\2\2\2\u016f"+
		"\u0170\3\2\2\2\u0170\u017d\t\7\2\2\u0171\u0173\7^\2\2\u0172\u0174\7w\2"+
		"\2\u0173\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176"+
		"\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0178\5S*\2\u0178\u0179\5S*\2\u0179"+
		"\u017a\5S*\2\u017a\u017b\5S*\2\u017b\u017d\3\2\2\2\u017c\u0167\3\2\2\2"+
		"\u017c\u0169\3\2\2\2\u017c\u0171\3\2\2\2\u017dP\3\2\2\2\u017e\u0187\5"+
		"S*\2\u017f\u0182\5S*\2\u0180\u0182\7a\2\2\u0181\u017f\3\2\2\2\u0181\u0180"+
		"\3\2\2\2\u0182\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184"+
		"\u0186\3\2\2\2\u0185\u0183\3\2\2\2\u0186\u0188\5S*\2\u0187\u0183\3\2\2"+
		"\2\u0187\u0188\3\2\2\2\u0188R\3\2\2\2\u0189\u018a\t\5\2\2\u018aT\3\2\2"+
		"\2\u018b\u0193\t\27\2\2\u018c\u018e\t\30\2\2\u018d\u018c\3\2\2\2\u018e"+
		"\u0191\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0192\3\2"+
		"\2\2\u0191\u018f\3\2\2\2\u0192\u0194\t\27\2\2\u0193\u018f\3\2\2\2\u0193"+
		"\u0194\3\2\2\2\u0194V\3\2\2\2/\2\u00a5\u00aa\u00af\u00b2\u00b4\u00b7\u00bf"+
		"\u00c3\u00c6\u00cc\u00d3\u00d7\u00da\u00e2\u00e6\u00e9\u00ee\u00f2\u00f5"+
		"\u00f8\u00fd\u0100\u0102\u0108\u010b\u010f\u0113\u0117\u011c\u011e\u013e"+
		"\u0144\u014e\u015c\u0163\u016b\u016e\u0175\u017c\u0181\u0183\u0187\u018f"+
		"\u0193\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}