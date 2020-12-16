// Generated from D:/Project/ResearchProject/FDD/Seniz/project/Seniz/src/main/resources\SenizLexer.g4 by ANTLR 4.9
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
		IMPORT=1, SYSTEM=2, VARSET=3, OVER=4, INIT=5, BOOLEAN=6, INT=7, FLOAT=8, 
		STRING=9, VALUEOF=10, TYPEOF=11, TO=12, GT=13, LT=14, BANG=15, TILDE=16, 
		QUESTION=17, EQ=18, LE=19, GE=20, NEQ=21, AND=22, OR=23, INC=24, DEC=25, 
		ADD=26, SUB=27, MUL=28, DIV=29, CARET=30, MOD=31, BOOL_LITERAL=32, DECIMAL_LITERAL=33, 
		HEX_LITERAL=34, OCT_LITERAL=35, BINARY_LITERAL=36, FLOAT_LITERAL=37, HEX_FLOAT_LITERAL=38, 
		STRING_LITERAL=39, NULL_LITERAL=40, LPAREN=41, RPAREN=42, LBRACE=43, RBRACE=44, 
		LBRACK=45, RBRACK=46, SEMI=47, COMMA=48, DOT=49, IDENTIFIER=50, WS=51, 
		COMMENT=52, LINE_COMMENT=53;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IMPORT", "SYSTEM", "VARSET", "OVER", "INIT", "BOOLEAN", "INT", "FLOAT", 
			"STRING", "VALUEOF", "TYPEOF", "TO", "GT", "LT", "BANG", "TILDE", "QUESTION", 
			"EQ", "LE", "GE", "NEQ", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", 
			"DIV", "CARET", "MOD", "BOOL_LITERAL", "DECIMAL_LITERAL", "HEX_LITERAL", 
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
			null, "'import'", "'system'", "'varset'", "'over'", "'init'", "'bool'", 
			"'int'", "'float'", "'string'", "':'", "'::'", "'->'", "'>'", "'<'", 
			"'!'", "'~'", "'?'", "'='", "'<='", "'>='", "'/='", "'&'", "'|'", "'++'", 
			"'--'", "'+'", "'-'", "'*'", "'/'", "'^'", "'%'", null, null, null, null, 
			null, null, null, null, "'null'", "'('", "')'", "'{'", "'}'", "'['", 
			"']'", "';'", "','", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IMPORT", "SYSTEM", "VARSET", "OVER", "INIT", "BOOLEAN", "INT", 
			"FLOAT", "STRING", "VALUEOF", "TYPEOF", "TO", "GT", "LT", "BANG", "TILDE", 
			"QUESTION", "EQ", "LE", "GE", "NEQ", "AND", "OR", "INC", "DEC", "ADD", 
			"SUB", "MUL", "DIV", "CARET", "MOD", "BOOL_LITERAL", "DECIMAL_LITERAL", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\67\u01d8\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3"+
		"\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3"+
		"\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3"+
		"\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u00e9\n!\3"+
		"\"\3\"\3\"\5\"\u00ee\n\"\3\"\6\"\u00f1\n\"\r\"\16\"\u00f2\3\"\5\"\u00f6"+
		"\n\"\5\"\u00f8\n\"\3\"\5\"\u00fb\n\"\3#\3#\3#\3#\7#\u0101\n#\f#\16#\u0104"+
		"\13#\3#\5#\u0107\n#\3#\5#\u010a\n#\3$\3$\7$\u010e\n$\f$\16$\u0111\13$"+
		"\3$\3$\7$\u0115\n$\f$\16$\u0118\13$\3$\5$\u011b\n$\3$\5$\u011e\n$\3%\3"+
		"%\3%\3%\7%\u0124\n%\f%\16%\u0127\13%\3%\5%\u012a\n%\3%\5%\u012d\n%\3&"+
		"\3&\3&\5&\u0132\n&\3&\3&\5&\u0136\n&\3&\5&\u0139\n&\3&\5&\u013c\n&\3&"+
		"\3&\3&\5&\u0141\n&\3&\5&\u0144\n&\5&\u0146\n&\3\'\3\'\3\'\3\'\5\'\u014c"+
		"\n\'\3\'\5\'\u014f\n\'\3\'\3\'\5\'\u0153\n\'\3\'\3\'\5\'\u0157\n\'\3\'"+
		"\3\'\5\'\u015b\n\'\3(\3(\3(\7(\u0160\n(\f(\16(\u0163\13(\3(\3(\3)\3)\3"+
		")\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3"+
		"\62\3\63\3\63\7\63\u0180\n\63\f\63\16\63\u0183\13\63\3\64\6\64\u0186\n"+
		"\64\r\64\16\64\u0187\3\64\3\64\3\65\3\65\3\65\3\65\7\65\u0190\n\65\f\65"+
		"\16\65\u0193\13\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\7\66\u019e"+
		"\n\66\f\66\16\66\u01a1\13\66\3\66\3\66\3\67\3\67\5\67\u01a7\n\67\3\67"+
		"\3\67\38\38\38\38\58\u01af\n8\38\58\u01b2\n8\38\38\38\68\u01b7\n8\r8\16"+
		"8\u01b8\38\38\38\38\38\58\u01c0\n8\39\39\39\79\u01c5\n9\f9\169\u01c8\13"+
		"9\39\59\u01cb\n9\3:\3:\3;\3;\7;\u01d1\n;\f;\16;\u01d4\13;\3;\5;\u01d7"+
		"\n;\3\u0191\2<\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g"+
		"\65i\66k\67m\2o\2q\2s\2u\2\3\2\31\3\2\63;\4\2NNnn\4\2ZZzz\5\2\62;CHch"+
		"\6\2\62;CHaach\3\2\629\4\2\629aa\4\2DDdd\3\2\62\63\4\2\62\63aa\6\2FFH"+
		"Hffhh\4\2RRrr\4\2--//\6\2\f\f\17\17$$^^\5\2C\\aac|\6\2\62;C\\aac|\5\2"+
		"\13\f\16\17\"\"\4\2\f\f\17\17\4\2GGgg\n\2$$))^^ddhhppttvv\3\2\62\65\3"+
		"\2\62;\4\2\62;aa\2\u01ff\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2"+
		"\2\2k\3\2\2\2\3w\3\2\2\2\5~\3\2\2\2\7\u0085\3\2\2\2\t\u008c\3\2\2\2\13"+
		"\u0091\3\2\2\2\r\u0096\3\2\2\2\17\u009b\3\2\2\2\21\u009f\3\2\2\2\23\u00a5"+
		"\3\2\2\2\25\u00ac\3\2\2\2\27\u00ae\3\2\2\2\31\u00b1\3\2\2\2\33\u00b4\3"+
		"\2\2\2\35\u00b6\3\2\2\2\37\u00b8\3\2\2\2!\u00ba\3\2\2\2#\u00bc\3\2\2\2"+
		"%\u00be\3\2\2\2\'\u00c0\3\2\2\2)\u00c3\3\2\2\2+\u00c6\3\2\2\2-\u00c9\3"+
		"\2\2\2/\u00cb\3\2\2\2\61\u00cd\3\2\2\2\63\u00d0\3\2\2\2\65\u00d3\3\2\2"+
		"\2\67\u00d5\3\2\2\29\u00d7\3\2\2\2;\u00d9\3\2\2\2=\u00db\3\2\2\2?\u00dd"+
		"\3\2\2\2A\u00e8\3\2\2\2C\u00f7\3\2\2\2E\u00fc\3\2\2\2G\u010b\3\2\2\2I"+
		"\u011f\3\2\2\2K\u0145\3\2\2\2M\u0147\3\2\2\2O\u015c\3\2\2\2Q\u0166\3\2"+
		"\2\2S\u016b\3\2\2\2U\u016d\3\2\2\2W\u016f\3\2\2\2Y\u0171\3\2\2\2[\u0173"+
		"\3\2\2\2]\u0175\3\2\2\2_\u0177\3\2\2\2a\u0179\3\2\2\2c\u017b\3\2\2\2e"+
		"\u017d\3\2\2\2g\u0185\3\2\2\2i\u018b\3\2\2\2k\u0199\3\2\2\2m\u01a4\3\2"+
		"\2\2o\u01bf\3\2\2\2q\u01c1\3\2\2\2s\u01cc\3\2\2\2u\u01ce\3\2\2\2wx\7k"+
		"\2\2xy\7o\2\2yz\7r\2\2z{\7q\2\2{|\7t\2\2|}\7v\2\2}\4\3\2\2\2~\177\7u\2"+
		"\2\177\u0080\7{\2\2\u0080\u0081\7u\2\2\u0081\u0082\7v\2\2\u0082\u0083"+
		"\7g\2\2\u0083\u0084\7o\2\2\u0084\6\3\2\2\2\u0085\u0086\7x\2\2\u0086\u0087"+
		"\7c\2\2\u0087\u0088\7t\2\2\u0088\u0089\7u\2\2\u0089\u008a\7g\2\2\u008a"+
		"\u008b\7v\2\2\u008b\b\3\2\2\2\u008c\u008d\7q\2\2\u008d\u008e\7x\2\2\u008e"+
		"\u008f\7g\2\2\u008f\u0090\7t\2\2\u0090\n\3\2\2\2\u0091\u0092\7k\2\2\u0092"+
		"\u0093\7p\2\2\u0093\u0094\7k\2\2\u0094\u0095\7v\2\2\u0095\f\3\2\2\2\u0096"+
		"\u0097\7d\2\2\u0097\u0098\7q\2\2\u0098\u0099\7q\2\2\u0099\u009a\7n\2\2"+
		"\u009a\16\3\2\2\2\u009b\u009c\7k\2\2\u009c\u009d\7p\2\2\u009d\u009e\7"+
		"v\2\2\u009e\20\3\2\2\2\u009f\u00a0\7h\2\2\u00a0\u00a1\7n\2\2\u00a1\u00a2"+
		"\7q\2\2\u00a2\u00a3\7c\2\2\u00a3\u00a4\7v\2\2\u00a4\22\3\2\2\2\u00a5\u00a6"+
		"\7u\2\2\u00a6\u00a7\7v\2\2\u00a7\u00a8\7t\2\2\u00a8\u00a9\7k\2\2\u00a9"+
		"\u00aa\7p\2\2\u00aa\u00ab\7i\2\2\u00ab\24\3\2\2\2\u00ac\u00ad\7<\2\2\u00ad"+
		"\26\3\2\2\2\u00ae\u00af\7<\2\2\u00af\u00b0\7<\2\2\u00b0\30\3\2\2\2\u00b1"+
		"\u00b2\7/\2\2\u00b2\u00b3\7@\2\2\u00b3\32\3\2\2\2\u00b4\u00b5\7@\2\2\u00b5"+
		"\34\3\2\2\2\u00b6\u00b7\7>\2\2\u00b7\36\3\2\2\2\u00b8\u00b9\7#\2\2\u00b9"+
		" \3\2\2\2\u00ba\u00bb\7\u0080\2\2\u00bb\"\3\2\2\2\u00bc\u00bd\7A\2\2\u00bd"+
		"$\3\2\2\2\u00be\u00bf\7?\2\2\u00bf&\3\2\2\2\u00c0\u00c1\7>\2\2\u00c1\u00c2"+
		"\7?\2\2\u00c2(\3\2\2\2\u00c3\u00c4\7@\2\2\u00c4\u00c5\7?\2\2\u00c5*\3"+
		"\2\2\2\u00c6\u00c7\7\61\2\2\u00c7\u00c8\7?\2\2\u00c8,\3\2\2\2\u00c9\u00ca"+
		"\7(\2\2\u00ca.\3\2\2\2\u00cb\u00cc\7~\2\2\u00cc\60\3\2\2\2\u00cd\u00ce"+
		"\7-\2\2\u00ce\u00cf\7-\2\2\u00cf\62\3\2\2\2\u00d0\u00d1\7/\2\2\u00d1\u00d2"+
		"\7/\2\2\u00d2\64\3\2\2\2\u00d3\u00d4\7-\2\2\u00d4\66\3\2\2\2\u00d5\u00d6"+
		"\7/\2\2\u00d68\3\2\2\2\u00d7\u00d8\7,\2\2\u00d8:\3\2\2\2\u00d9\u00da\7"+
		"\61\2\2\u00da<\3\2\2\2\u00db\u00dc\7`\2\2\u00dc>\3\2\2\2\u00dd\u00de\7"+
		"\'\2\2\u00de@\3\2\2\2\u00df\u00e0\7v\2\2\u00e0\u00e1\7t\2\2\u00e1\u00e2"+
		"\7w\2\2\u00e2\u00e9\7g\2\2\u00e3\u00e4\7h\2\2\u00e4\u00e5\7c\2\2\u00e5"+
		"\u00e6\7n\2\2\u00e6\u00e7\7u\2\2\u00e7\u00e9\7g\2\2\u00e8\u00df\3\2\2"+
		"\2\u00e8\u00e3\3\2\2\2\u00e9B\3\2\2\2\u00ea\u00f8\7\62\2\2\u00eb\u00f5"+
		"\t\2\2\2\u00ec\u00ee\5u;\2\u00ed\u00ec\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\u00f6\3\2\2\2\u00ef\u00f1\7a\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f2\3\2"+
		"\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\u00f6\5u;\2\u00f5\u00ed\3\2\2\2\u00f5\u00f0\3\2\2\2\u00f6\u00f8\3\2\2"+
		"\2\u00f7\u00ea\3\2\2\2\u00f7\u00eb\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00fb"+
		"\t\3\2\2\u00fa\u00f9\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fbD\3\2\2\2\u00fc"+
		"\u00fd\7\62\2\2\u00fd\u00fe\t\4\2\2\u00fe\u0106\t\5\2\2\u00ff\u0101\t"+
		"\6\2\2\u0100\u00ff\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102"+
		"\u0103\3\2\2\2\u0103\u0105\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0107\t\5"+
		"\2\2\u0106\u0102\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0109\3\2\2\2\u0108"+
		"\u010a\t\3\2\2\u0109\u0108\3\2\2\2\u0109\u010a\3\2\2\2\u010aF\3\2\2\2"+
		"\u010b\u010f\7\62\2\2\u010c\u010e\7a\2\2\u010d\u010c\3\2\2\2\u010e\u0111"+
		"\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0112\3\2\2\2\u0111"+
		"\u010f\3\2\2\2\u0112\u011a\t\7\2\2\u0113\u0115\t\b\2\2\u0114\u0113\3\2"+
		"\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"\u0119\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011b\t\7\2\2\u011a\u0116\3\2"+
		"\2\2\u011a\u011b\3\2\2\2\u011b\u011d\3\2\2\2\u011c\u011e\t\3\2\2\u011d"+
		"\u011c\3\2\2\2\u011d\u011e\3\2\2\2\u011eH\3\2\2\2\u011f\u0120\7\62\2\2"+
		"\u0120\u0121\t\t\2\2\u0121\u0129\t\n\2\2\u0122\u0124\t\13\2\2\u0123\u0122"+
		"\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126"+
		"\u0128\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u012a\t\n\2\2\u0129\u0125\3\2"+
		"\2\2\u0129\u012a\3\2\2\2\u012a\u012c\3\2\2\2\u012b\u012d\t\3\2\2\u012c"+
		"\u012b\3\2\2\2\u012c\u012d\3\2\2\2\u012dJ\3\2\2\2\u012e\u012f\5u;\2\u012f"+
		"\u0131\7\60\2\2\u0130\u0132\5u;\2\u0131\u0130\3\2\2\2\u0131\u0132\3\2"+
		"\2\2\u0132\u0136\3\2\2\2\u0133\u0134\7\60\2\2\u0134\u0136\5u;\2\u0135"+
		"\u012e\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0138\3\2\2\2\u0137\u0139\5m"+
		"\67\2\u0138\u0137\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013b\3\2\2\2\u013a"+
		"\u013c\t\f\2\2\u013b\u013a\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u0146\3\2"+
		"\2\2\u013d\u0143\5u;\2\u013e\u0140\5m\67\2\u013f\u0141\t\f\2\2\u0140\u013f"+
		"\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0144\t\f\2\2\u0143"+
		"\u013e\3\2\2\2\u0143\u0142\3\2\2\2\u0144\u0146\3\2\2\2\u0145\u0135\3\2"+
		"\2\2\u0145\u013d\3\2\2\2\u0146L\3\2\2\2\u0147\u0148\7\62\2\2\u0148\u0152"+
		"\t\4\2\2\u0149\u014b\5q9\2\u014a\u014c\7\60\2\2\u014b\u014a\3\2\2\2\u014b"+
		"\u014c\3\2\2\2\u014c\u0153\3\2\2\2\u014d\u014f\5q9\2\u014e\u014d\3\2\2"+
		"\2\u014e\u014f\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\7\60\2\2\u0151"+
		"\u0153\5q9\2\u0152\u0149\3\2\2\2\u0152\u014e\3\2\2\2\u0153\u0154\3\2\2"+
		"\2\u0154\u0156\t\r\2\2\u0155\u0157\t\16\2\2\u0156\u0155\3\2\2\2\u0156"+
		"\u0157\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015a\5u;\2\u0159\u015b\t\f\2"+
		"\2\u015a\u0159\3\2\2\2\u015a\u015b\3\2\2\2\u015bN\3\2\2\2\u015c\u0161"+
		"\7$\2\2\u015d\u0160\n\17\2\2\u015e\u0160\5o8\2\u015f\u015d\3\2\2\2\u015f"+
		"\u015e\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2"+
		"\2\2\u0162\u0164\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0165\7$\2\2\u0165"+
		"P\3\2\2\2\u0166\u0167\7p\2\2\u0167\u0168\7w\2\2\u0168\u0169\7n\2\2\u0169"+
		"\u016a\7n\2\2\u016aR\3\2\2\2\u016b\u016c\7*\2\2\u016cT\3\2\2\2\u016d\u016e"+
		"\7+\2\2\u016eV\3\2\2\2\u016f\u0170\7}\2\2\u0170X\3\2\2\2\u0171\u0172\7"+
		"\177\2\2\u0172Z\3\2\2\2\u0173\u0174\7]\2\2\u0174\\\3\2\2\2\u0175\u0176"+
		"\7_\2\2\u0176^\3\2\2\2\u0177\u0178\7=\2\2\u0178`\3\2\2\2\u0179\u017a\7"+
		".\2\2\u017ab\3\2\2\2\u017b\u017c\7\60\2\2\u017cd\3\2\2\2\u017d\u0181\t"+
		"\20\2\2\u017e\u0180\t\21\2\2\u017f\u017e\3\2\2\2\u0180\u0183\3\2\2\2\u0181"+
		"\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182f\3\2\2\2\u0183\u0181\3\2\2\2"+
		"\u0184\u0186\t\22\2\2\u0185\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0185"+
		"\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018a\b\64\2\2"+
		"\u018ah\3\2\2\2\u018b\u018c\7\61\2\2\u018c\u018d\7,\2\2\u018d\u0191\3"+
		"\2\2\2\u018e\u0190\13\2\2\2\u018f\u018e\3\2\2\2\u0190\u0193\3\2\2\2\u0191"+
		"\u0192\3\2\2\2\u0191\u018f\3\2\2\2\u0192\u0194\3\2\2\2\u0193\u0191\3\2"+
		"\2\2\u0194\u0195\7,\2\2\u0195\u0196\7\61\2\2\u0196\u0197\3\2\2\2\u0197"+
		"\u0198\b\65\2\2\u0198j\3\2\2\2\u0199\u019a\7\61\2\2\u019a\u019b\7\61\2"+
		"\2\u019b\u019f\3\2\2\2\u019c\u019e\n\23\2\2\u019d\u019c\3\2\2\2\u019e"+
		"\u01a1\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a2\3\2"+
		"\2\2\u01a1\u019f\3\2\2\2\u01a2\u01a3\b\66\2\2\u01a3l\3\2\2\2\u01a4\u01a6"+
		"\t\24\2\2\u01a5\u01a7\t\16\2\2\u01a6\u01a5\3\2\2\2\u01a6\u01a7\3\2\2\2"+
		"\u01a7\u01a8\3\2\2\2\u01a8\u01a9\5u;\2\u01a9n\3\2\2\2\u01aa\u01ab\7^\2"+
		"\2\u01ab\u01c0\t\25\2\2\u01ac\u01b1\7^\2\2\u01ad\u01af\t\26\2\2\u01ae"+
		"\u01ad\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b2\t\7"+
		"\2\2\u01b1\u01ae\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3"+
		"\u01c0\t\7\2\2\u01b4\u01b6\7^\2\2\u01b5\u01b7\7w\2\2\u01b6\u01b5\3\2\2"+
		"\2\u01b7\u01b8\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01ba"+
		"\3\2\2\2\u01ba\u01bb\5s:\2\u01bb\u01bc\5s:\2\u01bc\u01bd\5s:\2\u01bd\u01be"+
		"\5s:\2\u01be\u01c0\3\2\2\2\u01bf\u01aa\3\2\2\2\u01bf\u01ac\3\2\2\2\u01bf"+
		"\u01b4\3\2\2\2\u01c0p\3\2\2\2\u01c1\u01ca\5s:\2\u01c2\u01c5\5s:\2\u01c3"+
		"\u01c5\7a\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c3\3\2\2\2\u01c5\u01c8\3\2"+
		"\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c9\3\2\2\2\u01c8"+
		"\u01c6\3\2\2\2\u01c9\u01cb\5s:\2\u01ca\u01c6\3\2\2\2\u01ca\u01cb\3\2\2"+
		"\2\u01cbr\3\2\2\2\u01cc\u01cd\t\5\2\2\u01cdt\3\2\2\2\u01ce\u01d6\t\27"+
		"\2\2\u01cf\u01d1\t\30\2\2\u01d0\u01cf\3\2\2\2\u01d1\u01d4\3\2\2\2\u01d2"+
		"\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d5\3\2\2\2\u01d4\u01d2\3\2"+
		"\2\2\u01d5\u01d7\t\27\2\2\u01d6\u01d2\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7"+
		"v\3\2\2\2/\2\u00e8\u00ed\u00f2\u00f5\u00f7\u00fa\u0102\u0106\u0109\u010f"+
		"\u0116\u011a\u011d\u0125\u0129\u012c\u0131\u0135\u0138\u013b\u0140\u0143"+
		"\u0145\u014b\u014e\u0152\u0156\u015a\u015f\u0161\u0181\u0187\u0191\u019f"+
		"\u01a6\u01ae\u01b1\u01b8\u01bf\u01c4\u01c6\u01ca\u01d2\u01d6\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}