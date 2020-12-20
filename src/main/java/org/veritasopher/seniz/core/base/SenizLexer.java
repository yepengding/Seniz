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
		IMPORT=1, MAIN=2, CONTROL=3, SYSTEM=4, VARSET=5, OVER=6, INIT=7, BOOLEAN=8, 
		INT=9, FLOAT=10, STRING=11, VALUEOF=12, TYPEOF=13, TO=14, GT=15, LT=16, 
		BANG=17, TILDE=18, QUESTION=19, EQ=20, LE=21, GE=22, NEQ=23, AND=24, OR=25, 
		ADD=26, SUB=27, MUL=28, DIV=29, CARET=30, MOD=31, PAR=32, INTERLEAVE=33, 
		BOOL_LITERAL=34, DECIMAL_LITERAL=35, HEX_LITERAL=36, OCT_LITERAL=37, BINARY_LITERAL=38, 
		FLOAT_LITERAL=39, HEX_FLOAT_LITERAL=40, STRING_LITERAL=41, NULL_LITERAL=42, 
		LPAREN=43, RPAREN=44, LBRACE=45, RBRACE=46, LBRACK=47, RBRACK=48, SEMI=49, 
		COMMA=50, DOT=51, IDENTIFIER=52, WS=53, COMMENT=54, LINE_COMMENT=55;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IMPORT", "MAIN", "CONTROL", "SYSTEM", "VARSET", "OVER", "INIT", "BOOLEAN", 
			"INT", "FLOAT", "STRING", "VALUEOF", "TYPEOF", "TO", "GT", "LT", "BANG", 
			"TILDE", "QUESTION", "EQ", "LE", "GE", "NEQ", "AND", "OR", "ADD", "SUB", 
			"MUL", "DIV", "CARET", "MOD", "PAR", "INTERLEAVE", "BOOL_LITERAL", "DECIMAL_LITERAL", 
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
			null, "'import'", "'main'", "'control'", "'system'", "'varset'", "'over'", 
			"'init'", "'bool'", "'int'", "'float'", "'string'", "':'", "'::'", "'->'", 
			"'>'", "'<'", "'!'", "'~'", "'?'", "'='", "'<='", "'>='", "'/='", "'&'", 
			"'|'", "'+'", "'-'", "'*'", "'/'", "'^'", "'%'", "'||'", "'|||'", null, 
			null, null, null, null, null, null, null, "'null'", "'('", "')'", "'{'", 
			"'}'", "'['", "']'", "';'", "','", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IMPORT", "MAIN", "CONTROL", "SYSTEM", "VARSET", "OVER", "INIT", 
			"BOOLEAN", "INT", "FLOAT", "STRING", "VALUEOF", "TYPEOF", "TO", "GT", 
			"LT", "BANG", "TILDE", "QUESTION", "EQ", "LE", "GE", "NEQ", "AND", "OR", 
			"ADD", "SUB", "MUL", "DIV", "CARET", "MOD", "PAR", "INTERLEAVE", "BOOL_LITERAL", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\29\u01ea\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3"+
		"\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3"+
		"\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 "+
		"\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u00fb\n#\3$\3"+
		"$\3$\5$\u0100\n$\3$\6$\u0103\n$\r$\16$\u0104\3$\5$\u0108\n$\5$\u010a\n"+
		"$\3$\5$\u010d\n$\3%\3%\3%\3%\7%\u0113\n%\f%\16%\u0116\13%\3%\5%\u0119"+
		"\n%\3%\5%\u011c\n%\3&\3&\7&\u0120\n&\f&\16&\u0123\13&\3&\3&\7&\u0127\n"+
		"&\f&\16&\u012a\13&\3&\5&\u012d\n&\3&\5&\u0130\n&\3\'\3\'\3\'\3\'\7\'\u0136"+
		"\n\'\f\'\16\'\u0139\13\'\3\'\5\'\u013c\n\'\3\'\5\'\u013f\n\'\3(\3(\3("+
		"\5(\u0144\n(\3(\3(\5(\u0148\n(\3(\5(\u014b\n(\3(\5(\u014e\n(\3(\3(\3("+
		"\5(\u0153\n(\3(\5(\u0156\n(\5(\u0158\n(\3)\3)\3)\3)\5)\u015e\n)\3)\5)"+
		"\u0161\n)\3)\3)\5)\u0165\n)\3)\3)\5)\u0169\n)\3)\3)\5)\u016d\n)\3*\3*"+
		"\3*\7*\u0172\n*\f*\16*\u0175\13*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3-\3-\3.\3"+
		".\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\7"+
		"\65\u0192\n\65\f\65\16\65\u0195\13\65\3\66\6\66\u0198\n\66\r\66\16\66"+
		"\u0199\3\66\3\66\3\67\3\67\3\67\3\67\7\67\u01a2\n\67\f\67\16\67\u01a5"+
		"\13\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\78\u01b0\n8\f8\168\u01b3\13"+
		"8\38\38\39\39\59\u01b9\n9\39\39\3:\3:\3:\3:\5:\u01c1\n:\3:\5:\u01c4\n"+
		":\3:\3:\3:\6:\u01c9\n:\r:\16:\u01ca\3:\3:\3:\3:\3:\5:\u01d2\n:\3;\3;\3"+
		";\7;\u01d7\n;\f;\16;\u01da\13;\3;\5;\u01dd\n;\3<\3<\3=\3=\7=\u01e3\n="+
		"\f=\16=\u01e6\13=\3=\5=\u01e9\n=\3\u01a3\2>\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+"+
		"U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q\2s\2u\2w\2y\2\3\2\31\3\2"+
		"\63;\4\2NNnn\4\2ZZzz\5\2\62;CHch\6\2\62;CHaach\3\2\629\4\2\629aa\4\2D"+
		"Ddd\3\2\62\63\4\2\62\63aa\6\2FFHHffhh\4\2RRrr\4\2--//\6\2\f\f\17\17$$"+
		"^^\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\4\2GGgg"+
		"\n\2$$))^^ddhhppttvv\3\2\62\65\3\2\62;\4\2\62;aa\2\u0211\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2"+
		"\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\3"+
		"{\3\2\2\2\5\u0082\3\2\2\2\7\u0087\3\2\2\2\t\u008f\3\2\2\2\13\u0096\3\2"+
		"\2\2\r\u009d\3\2\2\2\17\u00a2\3\2\2\2\21\u00a7\3\2\2\2\23\u00ac\3\2\2"+
		"\2\25\u00b0\3\2\2\2\27\u00b6\3\2\2\2\31\u00bd\3\2\2\2\33\u00bf\3\2\2\2"+
		"\35\u00c2\3\2\2\2\37\u00c5\3\2\2\2!\u00c7\3\2\2\2#\u00c9\3\2\2\2%\u00cb"+
		"\3\2\2\2\'\u00cd\3\2\2\2)\u00cf\3\2\2\2+\u00d1\3\2\2\2-\u00d4\3\2\2\2"+
		"/\u00d7\3\2\2\2\61\u00da\3\2\2\2\63\u00dc\3\2\2\2\65\u00de\3\2\2\2\67"+
		"\u00e0\3\2\2\29\u00e2\3\2\2\2;\u00e4\3\2\2\2=\u00e6\3\2\2\2?\u00e8\3\2"+
		"\2\2A\u00ea\3\2\2\2C\u00ed\3\2\2\2E\u00fa\3\2\2\2G\u0109\3\2\2\2I\u010e"+
		"\3\2\2\2K\u011d\3\2\2\2M\u0131\3\2\2\2O\u0157\3\2\2\2Q\u0159\3\2\2\2S"+
		"\u016e\3\2\2\2U\u0178\3\2\2\2W\u017d\3\2\2\2Y\u017f\3\2\2\2[\u0181\3\2"+
		"\2\2]\u0183\3\2\2\2_\u0185\3\2\2\2a\u0187\3\2\2\2c\u0189\3\2\2\2e\u018b"+
		"\3\2\2\2g\u018d\3\2\2\2i\u018f\3\2\2\2k\u0197\3\2\2\2m\u019d\3\2\2\2o"+
		"\u01ab\3\2\2\2q\u01b6\3\2\2\2s\u01d1\3\2\2\2u\u01d3\3\2\2\2w\u01de\3\2"+
		"\2\2y\u01e0\3\2\2\2{|\7k\2\2|}\7o\2\2}~\7r\2\2~\177\7q\2\2\177\u0080\7"+
		"t\2\2\u0080\u0081\7v\2\2\u0081\4\3\2\2\2\u0082\u0083\7o\2\2\u0083\u0084"+
		"\7c\2\2\u0084\u0085\7k\2\2\u0085\u0086\7p\2\2\u0086\6\3\2\2\2\u0087\u0088"+
		"\7e\2\2\u0088\u0089\7q\2\2\u0089\u008a\7p\2\2\u008a\u008b\7v\2\2\u008b"+
		"\u008c\7t\2\2\u008c\u008d\7q\2\2\u008d\u008e\7n\2\2\u008e\b\3\2\2\2\u008f"+
		"\u0090\7u\2\2\u0090\u0091\7{\2\2\u0091\u0092\7u\2\2\u0092\u0093\7v\2\2"+
		"\u0093\u0094\7g\2\2\u0094\u0095\7o\2\2\u0095\n\3\2\2\2\u0096\u0097\7x"+
		"\2\2\u0097\u0098\7c\2\2\u0098\u0099\7t\2\2\u0099\u009a\7u\2\2\u009a\u009b"+
		"\7g\2\2\u009b\u009c\7v\2\2\u009c\f\3\2\2\2\u009d\u009e\7q\2\2\u009e\u009f"+
		"\7x\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1\7t\2\2\u00a1\16\3\2\2\2\u00a2\u00a3"+
		"\7k\2\2\u00a3\u00a4\7p\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6\7v\2\2\u00a6"+
		"\20\3\2\2\2\u00a7\u00a8\7d\2\2\u00a8\u00a9\7q\2\2\u00a9\u00aa\7q\2\2\u00aa"+
		"\u00ab\7n\2\2\u00ab\22\3\2\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7p\2\2\u00ae"+
		"\u00af\7v\2\2\u00af\24\3\2\2\2\u00b0\u00b1\7h\2\2\u00b1\u00b2\7n\2\2\u00b2"+
		"\u00b3\7q\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5\7v\2\2\u00b5\26\3\2\2\2\u00b6"+
		"\u00b7\7u\2\2\u00b7\u00b8\7v\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba\7k\2\2"+
		"\u00ba\u00bb\7p\2\2\u00bb\u00bc\7i\2\2\u00bc\30\3\2\2\2\u00bd\u00be\7"+
		"<\2\2\u00be\32\3\2\2\2\u00bf\u00c0\7<\2\2\u00c0\u00c1\7<\2\2\u00c1\34"+
		"\3\2\2\2\u00c2\u00c3\7/\2\2\u00c3\u00c4\7@\2\2\u00c4\36\3\2\2\2\u00c5"+
		"\u00c6\7@\2\2\u00c6 \3\2\2\2\u00c7\u00c8\7>\2\2\u00c8\"\3\2\2\2\u00c9"+
		"\u00ca\7#\2\2\u00ca$\3\2\2\2\u00cb\u00cc\7\u0080\2\2\u00cc&\3\2\2\2\u00cd"+
		"\u00ce\7A\2\2\u00ce(\3\2\2\2\u00cf\u00d0\7?\2\2\u00d0*\3\2\2\2\u00d1\u00d2"+
		"\7>\2\2\u00d2\u00d3\7?\2\2\u00d3,\3\2\2\2\u00d4\u00d5\7@\2\2\u00d5\u00d6"+
		"\7?\2\2\u00d6.\3\2\2\2\u00d7\u00d8\7\61\2\2\u00d8\u00d9\7?\2\2\u00d9\60"+
		"\3\2\2\2\u00da\u00db\7(\2\2\u00db\62\3\2\2\2\u00dc\u00dd\7~\2\2\u00dd"+
		"\64\3\2\2\2\u00de\u00df\7-\2\2\u00df\66\3\2\2\2\u00e0\u00e1\7/\2\2\u00e1"+
		"8\3\2\2\2\u00e2\u00e3\7,\2\2\u00e3:\3\2\2\2\u00e4\u00e5\7\61\2\2\u00e5"+
		"<\3\2\2\2\u00e6\u00e7\7`\2\2\u00e7>\3\2\2\2\u00e8\u00e9\7\'\2\2\u00e9"+
		"@\3\2\2\2\u00ea\u00eb\7~\2\2\u00eb\u00ec\7~\2\2\u00ecB\3\2\2\2\u00ed\u00ee"+
		"\7~\2\2\u00ee\u00ef\7~\2\2\u00ef\u00f0\7~\2\2\u00f0D\3\2\2\2\u00f1\u00f2"+
		"\7v\2\2\u00f2\u00f3\7t\2\2\u00f3\u00f4\7w\2\2\u00f4\u00fb\7g\2\2\u00f5"+
		"\u00f6\7h\2\2\u00f6\u00f7\7c\2\2\u00f7\u00f8\7n\2\2\u00f8\u00f9\7u\2\2"+
		"\u00f9\u00fb\7g\2\2\u00fa\u00f1\3\2\2\2\u00fa\u00f5\3\2\2\2\u00fbF\3\2"+
		"\2\2\u00fc\u010a\7\62\2\2\u00fd\u0107\t\2\2\2\u00fe\u0100\5y=\2\u00ff"+
		"\u00fe\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0108\3\2\2\2\u0101\u0103\7a"+
		"\2\2\u0102\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0102\3\2\2\2\u0104"+
		"\u0105\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\5y=\2\u0107\u00ff\3\2\2"+
		"\2\u0107\u0102\3\2\2\2\u0108\u010a\3\2\2\2\u0109\u00fc\3\2\2\2\u0109\u00fd"+
		"\3\2\2\2\u010a\u010c\3\2\2\2\u010b\u010d\t\3\2\2\u010c\u010b\3\2\2\2\u010c"+
		"\u010d\3\2\2\2\u010dH\3\2\2\2\u010e\u010f\7\62\2\2\u010f\u0110\t\4\2\2"+
		"\u0110\u0118\t\5\2\2\u0111\u0113\t\6\2\2\u0112\u0111\3\2\2\2\u0113\u0116"+
		"\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117\3\2\2\2\u0116"+
		"\u0114\3\2\2\2\u0117\u0119\t\5\2\2\u0118\u0114\3\2\2\2\u0118\u0119\3\2"+
		"\2\2\u0119\u011b\3\2\2\2\u011a\u011c\t\3\2\2\u011b\u011a\3\2\2\2\u011b"+
		"\u011c\3\2\2\2\u011cJ\3\2\2\2\u011d\u0121\7\62\2\2\u011e\u0120\7a\2\2"+
		"\u011f\u011e\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122"+
		"\3\2\2\2\u0122\u0124\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u012c\t\7\2\2\u0125"+
		"\u0127\t\b\2\2\u0126\u0125\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2"+
		"\2\2\u0128\u0129\3\2\2\2\u0129\u012b\3\2\2\2\u012a\u0128\3\2\2\2\u012b"+
		"\u012d\t\7\2\2\u012c\u0128\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012f\3\2"+
		"\2\2\u012e\u0130\t\3\2\2\u012f\u012e\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"L\3\2\2\2\u0131\u0132\7\62\2\2\u0132\u0133\t\t\2\2\u0133\u013b\t\n\2\2"+
		"\u0134\u0136\t\13\2\2\u0135\u0134\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135"+
		"\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013a\3\2\2\2\u0139\u0137\3\2\2\2\u013a"+
		"\u013c\t\n\2\2\u013b\u0137\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013e\3\2"+
		"\2\2\u013d\u013f\t\3\2\2\u013e\u013d\3\2\2\2\u013e\u013f\3\2\2\2\u013f"+
		"N\3\2\2\2\u0140\u0141\5y=\2\u0141\u0143\7\60\2\2\u0142\u0144\5y=\2\u0143"+
		"\u0142\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0148\3\2\2\2\u0145\u0146\7\60"+
		"\2\2\u0146\u0148\5y=\2\u0147\u0140\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u014a"+
		"\3\2\2\2\u0149\u014b\5q9\2\u014a\u0149\3\2\2\2\u014a\u014b\3\2\2\2\u014b"+
		"\u014d\3\2\2\2\u014c\u014e\t\f\2\2\u014d\u014c\3\2\2\2\u014d\u014e\3\2"+
		"\2\2\u014e\u0158\3\2\2\2\u014f\u0155\5y=\2\u0150\u0152\5q9\2\u0151\u0153"+
		"\t\f\2\2\u0152\u0151\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0156\3\2\2\2\u0154"+
		"\u0156\t\f\2\2\u0155\u0150\3\2\2\2\u0155\u0154\3\2\2\2\u0156\u0158\3\2"+
		"\2\2\u0157\u0147\3\2\2\2\u0157\u014f\3\2\2\2\u0158P\3\2\2\2\u0159\u015a"+
		"\7\62\2\2\u015a\u0164\t\4\2\2\u015b\u015d\5u;\2\u015c\u015e\7\60\2\2\u015d"+
		"\u015c\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0165\3\2\2\2\u015f\u0161\5u"+
		";\2\u0160\u015f\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0162\3\2\2\2\u0162"+
		"\u0163\7\60\2\2\u0163\u0165\5u;\2\u0164\u015b\3\2\2\2\u0164\u0160\3\2"+
		"\2\2\u0165\u0166\3\2\2\2\u0166\u0168\t\r\2\2\u0167\u0169\t\16\2\2\u0168"+
		"\u0167\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016c\5y"+
		"=\2\u016b\u016d\t\f\2\2\u016c\u016b\3\2\2\2\u016c\u016d\3\2\2\2\u016d"+
		"R\3\2\2\2\u016e\u0173\7$\2\2\u016f\u0172\n\17\2\2\u0170\u0172\5s:\2\u0171"+
		"\u016f\3\2\2\2\u0171\u0170\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0171\3\2"+
		"\2\2\u0173\u0174\3\2\2\2\u0174\u0176\3\2\2\2\u0175\u0173\3\2\2\2\u0176"+
		"\u0177\7$\2\2\u0177T\3\2\2\2\u0178\u0179\7p\2\2\u0179\u017a\7w\2\2\u017a"+
		"\u017b\7n\2\2\u017b\u017c\7n\2\2\u017cV\3\2\2\2\u017d\u017e\7*\2\2\u017e"+
		"X\3\2\2\2\u017f\u0180\7+\2\2\u0180Z\3\2\2\2\u0181\u0182\7}\2\2\u0182\\"+
		"\3\2\2\2\u0183\u0184\7\177\2\2\u0184^\3\2\2\2\u0185\u0186\7]\2\2\u0186"+
		"`\3\2\2\2\u0187\u0188\7_\2\2\u0188b\3\2\2\2\u0189\u018a\7=\2\2\u018ad"+
		"\3\2\2\2\u018b\u018c\7.\2\2\u018cf\3\2\2\2\u018d\u018e\7\60\2\2\u018e"+
		"h\3\2\2\2\u018f\u0193\t\20\2\2\u0190\u0192\t\21\2\2\u0191\u0190\3\2\2"+
		"\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194j"+
		"\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u0198\t\22\2\2\u0197\u0196\3\2\2\2"+
		"\u0198\u0199\3\2\2\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019b"+
		"\3\2\2\2\u019b\u019c\b\66\2\2\u019cl\3\2\2\2\u019d\u019e\7\61\2\2\u019e"+
		"\u019f\7,\2\2\u019f\u01a3\3\2\2\2\u01a0\u01a2\13\2\2\2\u01a1\u01a0\3\2"+
		"\2\2\u01a2\u01a5\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4"+
		"\u01a6\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a6\u01a7\7,\2\2\u01a7\u01a8\7\61"+
		"\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa\b\67\2\2\u01aan\3\2\2\2\u01ab\u01ac"+
		"\7\61\2\2\u01ac\u01ad\7\61\2\2\u01ad\u01b1\3\2\2\2\u01ae\u01b0\n\23\2"+
		"\2\u01af\u01ae\3\2\2\2\u01b0\u01b3\3\2\2\2\u01b1\u01af\3\2\2\2\u01b1\u01b2"+
		"\3\2\2\2\u01b2\u01b4\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b4\u01b5\b8\2\2\u01b5"+
		"p\3\2\2\2\u01b6\u01b8\t\24\2\2\u01b7\u01b9\t\16\2\2\u01b8\u01b7\3\2\2"+
		"\2\u01b8\u01b9\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb\5y=\2\u01bbr\3"+
		"\2\2\2\u01bc\u01bd\7^\2\2\u01bd\u01d2\t\25\2\2\u01be\u01c3\7^\2\2\u01bf"+
		"\u01c1\t\26\2\2\u01c0\u01bf\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2\3"+
		"\2\2\2\u01c2\u01c4\t\7\2\2\u01c3\u01c0\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4"+
		"\u01c5\3\2\2\2\u01c5\u01d2\t\7\2\2\u01c6\u01c8\7^\2\2\u01c7\u01c9\7w\2"+
		"\2\u01c8\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01cb"+
		"\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cd\5w<\2\u01cd\u01ce\5w<\2\u01ce"+
		"\u01cf\5w<\2\u01cf\u01d0\5w<\2\u01d0\u01d2\3\2\2\2\u01d1\u01bc\3\2\2\2"+
		"\u01d1\u01be\3\2\2\2\u01d1\u01c6\3\2\2\2\u01d2t\3\2\2\2\u01d3\u01dc\5"+
		"w<\2\u01d4\u01d7\5w<\2\u01d5\u01d7\7a\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d5"+
		"\3\2\2\2\u01d7\u01da\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9"+
		"\u01db\3\2\2\2\u01da\u01d8\3\2\2\2\u01db\u01dd\5w<\2\u01dc\u01d8\3\2\2"+
		"\2\u01dc\u01dd\3\2\2\2\u01ddv\3\2\2\2\u01de\u01df\t\5\2\2\u01dfx\3\2\2"+
		"\2\u01e0\u01e8\t\27\2\2\u01e1\u01e3\t\30\2\2\u01e2\u01e1\3\2\2\2\u01e3"+
		"\u01e6\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e7\3\2"+
		"\2\2\u01e6\u01e4\3\2\2\2\u01e7\u01e9\t\27\2\2\u01e8\u01e4\3\2\2\2\u01e8"+
		"\u01e9\3\2\2\2\u01e9z\3\2\2\2/\2\u00fa\u00ff\u0104\u0107\u0109\u010c\u0114"+
		"\u0118\u011b\u0121\u0128\u012c\u012f\u0137\u013b\u013e\u0143\u0147\u014a"+
		"\u014d\u0152\u0155\u0157\u015d\u0160\u0164\u0168\u016c\u0171\u0173\u0193"+
		"\u0199\u01a3\u01b1\u01b8\u01c0\u01c3\u01ca\u01d1\u01d6\u01d8\u01dc\u01e4"+
		"\u01e8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}