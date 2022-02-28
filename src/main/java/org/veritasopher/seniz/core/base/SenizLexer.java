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
		PROP=9, LTL=10, BOOLEAN=11, INT=12, FLOAT=13, STRING=14, VALUEOF=15, TYPEOF=16, 
		TO=17, GT=18, LT=19, BANG=20, TILDE=21, QUESTION=22, EQ=23, LE=24, GE=25, 
		NEQ=26, AND=27, OR=28, ADD=29, SUB=30, MUL=31, DIV=32, CARET=33, MOD=34, 
		PAR=35, INTERLEAVE=36, ALWAYS=37, EVENTUALLY=38, NEXT=39, UNTIL=40, BOOL_LITERAL=41, 
		DECIMAL_LITERAL=42, HEX_LITERAL=43, OCT_LITERAL=44, BINARY_LITERAL=45, 
		FLOAT_LITERAL=46, HEX_FLOAT_LITERAL=47, STRING_LITERAL=48, NULL_LITERAL=49, 
		LPAREN=50, RPAREN=51, LBRACE=52, RBRACE=53, LBRACK=54, RBRACK=55, SEMI=56, 
		COMMA=57, DOT=58, IDENTIFIER=59, WS=60, COMMENT=61, LINE_COMMENT=62;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IMPORT", "MAIN", "CONTROL", "SYSTEM", "VARSET", "OVER", "INIT", "AS", 
			"PROP", "LTL", "BOOLEAN", "INT", "FLOAT", "STRING", "VALUEOF", "TYPEOF", 
			"TO", "GT", "LT", "BANG", "TILDE", "QUESTION", "EQ", "LE", "GE", "NEQ", 
			"AND", "OR", "ADD", "SUB", "MUL", "DIV", "CARET", "MOD", "PAR", "INTERLEAVE", 
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
			null, "'import'", "'main'", "'control'", "'system'", "'varset'", "'over'", 
			"'init'", "'as'", "'prop'", "'ltl'", "'bool'", "'int'", "'float'", "'string'", 
			"':'", "'::'", "'->'", "'>'", "'<'", "'!'", "'~'", "'?'", "'='", "'<='", 
			"'>='", "'/='", "'&'", "'|'", "'+'", "'-'", "'*'", "'/'", "'^'", "'%'", 
			"'||'", "'|||'", "'G'", "'F'", "'X'", "'U'", null, null, null, null, 
			null, null, null, null, "'null'", "'('", "')'", "'{'", "'}'", "'['", 
			"']'", "';'", "','", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IMPORT", "MAIN", "CONTROL", "SYSTEM", "VARSET", "OVER", "INIT", 
			"AS", "PROP", "LTL", "BOOLEAN", "INT", "FLOAT", "STRING", "VALUEOF", 
			"TYPEOF", "TO", "GT", "LT", "BANG", "TILDE", "QUESTION", "EQ", "LE", 
			"GE", "NEQ", "AND", "OR", "ADD", "SUB", "MUL", "DIV", "CARET", "MOD", 
			"PAR", "INTERLEAVE", "ALWAYS", "EVENTUALLY", "NEXT", "UNTIL", "BOOL_LITERAL", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2@\u020c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3"+
		" \3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u011d\n*\3+\3+\3+\5+\u0122\n+\3+\6+\u0125"+
		"\n+\r+\16+\u0126\3+\5+\u012a\n+\5+\u012c\n+\3+\5+\u012f\n+\3,\3,\3,\3"+
		",\7,\u0135\n,\f,\16,\u0138\13,\3,\5,\u013b\n,\3,\5,\u013e\n,\3-\3-\7-"+
		"\u0142\n-\f-\16-\u0145\13-\3-\3-\7-\u0149\n-\f-\16-\u014c\13-\3-\5-\u014f"+
		"\n-\3-\5-\u0152\n-\3.\3.\3.\3.\7.\u0158\n.\f.\16.\u015b\13.\3.\5.\u015e"+
		"\n.\3.\5.\u0161\n.\3/\3/\3/\5/\u0166\n/\3/\3/\5/\u016a\n/\3/\5/\u016d"+
		"\n/\3/\5/\u0170\n/\3/\3/\3/\5/\u0175\n/\3/\5/\u0178\n/\5/\u017a\n/\3\60"+
		"\3\60\3\60\3\60\5\60\u0180\n\60\3\60\5\60\u0183\n\60\3\60\3\60\5\60\u0187"+
		"\n\60\3\60\3\60\5\60\u018b\n\60\3\60\3\60\5\60\u018f\n\60\3\61\3\61\3"+
		"\61\7\61\u0194\n\61\f\61\16\61\u0197\13\61\3\61\3\61\3\62\3\62\3\62\3"+
		"\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\3"+
		"9\3:\3:\3;\3;\3<\3<\7<\u01b4\n<\f<\16<\u01b7\13<\3=\6=\u01ba\n=\r=\16"+
		"=\u01bb\3=\3=\3>\3>\3>\3>\7>\u01c4\n>\f>\16>\u01c7\13>\3>\3>\3>\3>\3>"+
		"\3?\3?\3?\3?\7?\u01d2\n?\f?\16?\u01d5\13?\3?\3?\3@\3@\5@\u01db\n@\3@\3"+
		"@\3A\3A\3A\3A\5A\u01e3\nA\3A\5A\u01e6\nA\3A\3A\3A\6A\u01eb\nA\rA\16A\u01ec"+
		"\3A\3A\3A\3A\3A\5A\u01f4\nA\3B\3B\3B\7B\u01f9\nB\fB\16B\u01fc\13B\3B\5"+
		"B\u01ff\nB\3C\3C\3D\3D\7D\u0205\nD\fD\16D\u0208\13D\3D\5D\u020b\nD\3\u01c5"+
		"\2E\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67"+
		"m8o9q:s;u<w=y>{?}@\177\2\u0081\2\u0083\2\u0085\2\u0087\2\3\2\31\3\2\63"+
		";\4\2NNnn\4\2ZZzz\5\2\62;CHch\6\2\62;CHaach\3\2\629\4\2\629aa\4\2DDdd"+
		"\3\2\62\63\4\2\62\63aa\6\2FFHHffhh\4\2RRrr\4\2--//\6\2\f\f\17\17$$^^\5"+
		"\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\4\2GGgg\n\2"+
		"$$))^^ddhhppttvv\3\2\62\65\3\2\62;\4\2\62;aa\2\u0233\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2"+
		"e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3"+
		"\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2"+
		"\2\3\u0089\3\2\2\2\5\u0090\3\2\2\2\7\u0095\3\2\2\2\t\u009d\3\2\2\2\13"+
		"\u00a4\3\2\2\2\r\u00ab\3\2\2\2\17\u00b0\3\2\2\2\21\u00b5\3\2\2\2\23\u00b8"+
		"\3\2\2\2\25\u00bd\3\2\2\2\27\u00c1\3\2\2\2\31\u00c6\3\2\2\2\33\u00ca\3"+
		"\2\2\2\35\u00d0\3\2\2\2\37\u00d7\3\2\2\2!\u00d9\3\2\2\2#\u00dc\3\2\2\2"+
		"%\u00df\3\2\2\2\'\u00e1\3\2\2\2)\u00e3\3\2\2\2+\u00e5\3\2\2\2-\u00e7\3"+
		"\2\2\2/\u00e9\3\2\2\2\61\u00eb\3\2\2\2\63\u00ee\3\2\2\2\65\u00f1\3\2\2"+
		"\2\67\u00f4\3\2\2\29\u00f6\3\2\2\2;\u00f8\3\2\2\2=\u00fa\3\2\2\2?\u00fc"+
		"\3\2\2\2A\u00fe\3\2\2\2C\u0100\3\2\2\2E\u0102\3\2\2\2G\u0104\3\2\2\2I"+
		"\u0107\3\2\2\2K\u010b\3\2\2\2M\u010d\3\2\2\2O\u010f\3\2\2\2Q\u0111\3\2"+
		"\2\2S\u011c\3\2\2\2U\u012b\3\2\2\2W\u0130\3\2\2\2Y\u013f\3\2\2\2[\u0153"+
		"\3\2\2\2]\u0179\3\2\2\2_\u017b\3\2\2\2a\u0190\3\2\2\2c\u019a\3\2\2\2e"+
		"\u019f\3\2\2\2g\u01a1\3\2\2\2i\u01a3\3\2\2\2k\u01a5\3\2\2\2m\u01a7\3\2"+
		"\2\2o\u01a9\3\2\2\2q\u01ab\3\2\2\2s\u01ad\3\2\2\2u\u01af\3\2\2\2w\u01b1"+
		"\3\2\2\2y\u01b9\3\2\2\2{\u01bf\3\2\2\2}\u01cd\3\2\2\2\177\u01d8\3\2\2"+
		"\2\u0081\u01f3\3\2\2\2\u0083\u01f5\3\2\2\2\u0085\u0200\3\2\2\2\u0087\u0202"+
		"\3\2\2\2\u0089\u008a\7k\2\2\u008a\u008b\7o\2\2\u008b\u008c\7r\2\2\u008c"+
		"\u008d\7q\2\2\u008d\u008e\7t\2\2\u008e\u008f\7v\2\2\u008f\4\3\2\2\2\u0090"+
		"\u0091\7o\2\2\u0091\u0092\7c\2\2\u0092\u0093\7k\2\2\u0093\u0094\7p\2\2"+
		"\u0094\6\3\2\2\2\u0095\u0096\7e\2\2\u0096\u0097\7q\2\2\u0097\u0098\7p"+
		"\2\2\u0098\u0099\7v\2\2\u0099\u009a\7t\2\2\u009a\u009b\7q\2\2\u009b\u009c"+
		"\7n\2\2\u009c\b\3\2\2\2\u009d\u009e\7u\2\2\u009e\u009f\7{\2\2\u009f\u00a0"+
		"\7u\2\2\u00a0\u00a1\7v\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7o\2\2\u00a3"+
		"\n\3\2\2\2\u00a4\u00a5\7x\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7t\2\2\u00a7"+
		"\u00a8\7u\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa\7v\2\2\u00aa\f\3\2\2\2\u00ab"+
		"\u00ac\7q\2\2\u00ac\u00ad\7x\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7t\2\2"+
		"\u00af\16\3\2\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b3\7"+
		"k\2\2\u00b3\u00b4\7v\2\2\u00b4\20\3\2\2\2\u00b5\u00b6\7c\2\2\u00b6\u00b7"+
		"\7u\2\2\u00b7\22\3\2\2\2\u00b8\u00b9\7r\2\2\u00b9\u00ba\7t\2\2\u00ba\u00bb"+
		"\7q\2\2\u00bb\u00bc\7r\2\2\u00bc\24\3\2\2\2\u00bd\u00be\7n\2\2\u00be\u00bf"+
		"\7v\2\2\u00bf\u00c0\7n\2\2\u00c0\26\3\2\2\2\u00c1\u00c2\7d\2\2\u00c2\u00c3"+
		"\7q\2\2\u00c3\u00c4\7q\2\2\u00c4\u00c5\7n\2\2\u00c5\30\3\2\2\2\u00c6\u00c7"+
		"\7k\2\2\u00c7\u00c8\7p\2\2\u00c8\u00c9\7v\2\2\u00c9\32\3\2\2\2\u00ca\u00cb"+
		"\7h\2\2\u00cb\u00cc\7n\2\2\u00cc\u00cd\7q\2\2\u00cd\u00ce\7c\2\2\u00ce"+
		"\u00cf\7v\2\2\u00cf\34\3\2\2\2\u00d0\u00d1\7u\2\2\u00d1\u00d2\7v\2\2\u00d2"+
		"\u00d3\7t\2\2\u00d3\u00d4\7k\2\2\u00d4\u00d5\7p\2\2\u00d5\u00d6\7i\2\2"+
		"\u00d6\36\3\2\2\2\u00d7\u00d8\7<\2\2\u00d8 \3\2\2\2\u00d9\u00da\7<\2\2"+
		"\u00da\u00db\7<\2\2\u00db\"\3\2\2\2\u00dc\u00dd\7/\2\2\u00dd\u00de\7@"+
		"\2\2\u00de$\3\2\2\2\u00df\u00e0\7@\2\2\u00e0&\3\2\2\2\u00e1\u00e2\7>\2"+
		"\2\u00e2(\3\2\2\2\u00e3\u00e4\7#\2\2\u00e4*\3\2\2\2\u00e5\u00e6\7\u0080"+
		"\2\2\u00e6,\3\2\2\2\u00e7\u00e8\7A\2\2\u00e8.\3\2\2\2\u00e9\u00ea\7?\2"+
		"\2\u00ea\60\3\2\2\2\u00eb\u00ec\7>\2\2\u00ec\u00ed\7?\2\2\u00ed\62\3\2"+
		"\2\2\u00ee\u00ef\7@\2\2\u00ef\u00f0\7?\2\2\u00f0\64\3\2\2\2\u00f1\u00f2"+
		"\7\61\2\2\u00f2\u00f3\7?\2\2\u00f3\66\3\2\2\2\u00f4\u00f5\7(\2\2\u00f5"+
		"8\3\2\2\2\u00f6\u00f7\7~\2\2\u00f7:\3\2\2\2\u00f8\u00f9\7-\2\2\u00f9<"+
		"\3\2\2\2\u00fa\u00fb\7/\2\2\u00fb>\3\2\2\2\u00fc\u00fd\7,\2\2\u00fd@\3"+
		"\2\2\2\u00fe\u00ff\7\61\2\2\u00ffB\3\2\2\2\u0100\u0101\7`\2\2\u0101D\3"+
		"\2\2\2\u0102\u0103\7\'\2\2\u0103F\3\2\2\2\u0104\u0105\7~\2\2\u0105\u0106"+
		"\7~\2\2\u0106H\3\2\2\2\u0107\u0108\7~\2\2\u0108\u0109\7~\2\2\u0109\u010a"+
		"\7~\2\2\u010aJ\3\2\2\2\u010b\u010c\7I\2\2\u010cL\3\2\2\2\u010d\u010e\7"+
		"H\2\2\u010eN\3\2\2\2\u010f\u0110\7Z\2\2\u0110P\3\2\2\2\u0111\u0112\7W"+
		"\2\2\u0112R\3\2\2\2\u0113\u0114\7v\2\2\u0114\u0115\7t\2\2\u0115\u0116"+
		"\7w\2\2\u0116\u011d\7g\2\2\u0117\u0118\7h\2\2\u0118\u0119\7c\2\2\u0119"+
		"\u011a\7n\2\2\u011a\u011b\7u\2\2\u011b\u011d\7g\2\2\u011c\u0113\3\2\2"+
		"\2\u011c\u0117\3\2\2\2\u011dT\3\2\2\2\u011e\u012c\7\62\2\2\u011f\u0129"+
		"\t\2\2\2\u0120\u0122\5\u0087D\2\u0121\u0120\3\2\2\2\u0121\u0122\3\2\2"+
		"\2\u0122\u012a\3\2\2\2\u0123\u0125\7a\2\2\u0124\u0123\3\2\2\2\u0125\u0126"+
		"\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\3\2\2\2\u0128"+
		"\u012a\5\u0087D\2\u0129\u0121\3\2\2\2\u0129\u0124\3\2\2\2\u012a\u012c"+
		"\3\2\2\2\u012b\u011e\3\2\2\2\u012b\u011f\3\2\2\2\u012c\u012e\3\2\2\2\u012d"+
		"\u012f\t\3\2\2\u012e\u012d\3\2\2\2\u012e\u012f\3\2\2\2\u012fV\3\2\2\2"+
		"\u0130\u0131\7\62\2\2\u0131\u0132\t\4\2\2\u0132\u013a\t\5\2\2\u0133\u0135"+
		"\t\6\2\2\u0134\u0133\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136"+
		"\u0137\3\2\2\2\u0137\u0139\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013b\t\5"+
		"\2\2\u013a\u0136\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013d\3\2\2\2\u013c"+
		"\u013e\t\3\2\2\u013d\u013c\3\2\2\2\u013d\u013e\3\2\2\2\u013eX\3\2\2\2"+
		"\u013f\u0143\7\62\2\2\u0140\u0142\7a\2\2\u0141\u0140\3\2\2\2\u0142\u0145"+
		"\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0146\3\2\2\2\u0145"+
		"\u0143\3\2\2\2\u0146\u014e\t\7\2\2\u0147\u0149\t\b\2\2\u0148\u0147\3\2"+
		"\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b"+
		"\u014d\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u014f\t\7\2\2\u014e\u014a\3\2"+
		"\2\2\u014e\u014f\3\2\2\2\u014f\u0151\3\2\2\2\u0150\u0152\t\3\2\2\u0151"+
		"\u0150\3\2\2\2\u0151\u0152\3\2\2\2\u0152Z\3\2\2\2\u0153\u0154\7\62\2\2"+
		"\u0154\u0155\t\t\2\2\u0155\u015d\t\n\2\2\u0156\u0158\t\13\2\2\u0157\u0156"+
		"\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a"+
		"\u015c\3\2\2\2\u015b\u0159\3\2\2\2\u015c\u015e\t\n\2\2\u015d\u0159\3\2"+
		"\2\2\u015d\u015e\3\2\2\2\u015e\u0160\3\2\2\2\u015f\u0161\t\3\2\2\u0160"+
		"\u015f\3\2\2\2\u0160\u0161\3\2\2\2\u0161\\\3\2\2\2\u0162\u0163\5\u0087"+
		"D\2\u0163\u0165\7\60\2\2\u0164\u0166\5\u0087D\2\u0165\u0164\3\2\2\2\u0165"+
		"\u0166\3\2\2\2\u0166\u016a\3\2\2\2\u0167\u0168\7\60\2\2\u0168\u016a\5"+
		"\u0087D\2\u0169\u0162\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u016c\3\2\2\2"+
		"\u016b\u016d\5\177@\2\u016c\u016b\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016f"+
		"\3\2\2\2\u016e\u0170\t\f\2\2\u016f\u016e\3\2\2\2\u016f\u0170\3\2\2\2\u0170"+
		"\u017a\3\2\2\2\u0171\u0177\5\u0087D\2\u0172\u0174\5\177@\2\u0173\u0175"+
		"\t\f\2\2\u0174\u0173\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0178\3\2\2\2\u0176"+
		"\u0178\t\f\2\2\u0177\u0172\3\2\2\2\u0177\u0176\3\2\2\2\u0178\u017a\3\2"+
		"\2\2\u0179\u0169\3\2\2\2\u0179\u0171\3\2\2\2\u017a^\3\2\2\2\u017b\u017c"+
		"\7\62\2\2\u017c\u0186\t\4\2\2\u017d\u017f\5\u0083B\2\u017e\u0180\7\60"+
		"\2\2\u017f\u017e\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0187\3\2\2\2\u0181"+
		"\u0183\5\u0083B\2\u0182\u0181\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0184"+
		"\3\2\2\2\u0184\u0185\7\60\2\2\u0185\u0187\5\u0083B\2\u0186\u017d\3\2\2"+
		"\2\u0186\u0182\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u018a\t\r\2\2\u0189\u018b"+
		"\t\16\2\2\u018a\u0189\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018c\3\2\2\2"+
		"\u018c\u018e\5\u0087D\2\u018d\u018f\t\f\2\2\u018e\u018d\3\2\2\2\u018e"+
		"\u018f\3\2\2\2\u018f`\3\2\2\2\u0190\u0195\7$\2\2\u0191\u0194\n\17\2\2"+
		"\u0192\u0194\5\u0081A\2\u0193\u0191\3\2\2\2\u0193\u0192\3\2\2\2\u0194"+
		"\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0198\3\2"+
		"\2\2\u0197\u0195\3\2\2\2\u0198\u0199\7$\2\2\u0199b\3\2\2\2\u019a\u019b"+
		"\7p\2\2\u019b\u019c\7w\2\2\u019c\u019d\7n\2\2\u019d\u019e\7n\2\2\u019e"+
		"d\3\2\2\2\u019f\u01a0\7*\2\2\u01a0f\3\2\2\2\u01a1\u01a2\7+\2\2\u01a2h"+
		"\3\2\2\2\u01a3\u01a4\7}\2\2\u01a4j\3\2\2\2\u01a5\u01a6\7\177\2\2\u01a6"+
		"l\3\2\2\2\u01a7\u01a8\7]\2\2\u01a8n\3\2\2\2\u01a9\u01aa\7_\2\2\u01aap"+
		"\3\2\2\2\u01ab\u01ac\7=\2\2\u01acr\3\2\2\2\u01ad\u01ae\7.\2\2\u01aet\3"+
		"\2\2\2\u01af\u01b0\7\60\2\2\u01b0v\3\2\2\2\u01b1\u01b5\t\20\2\2\u01b2"+
		"\u01b4\t\21\2\2\u01b3\u01b2\3\2\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b3\3"+
		"\2\2\2\u01b5\u01b6\3\2\2\2\u01b6x\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01ba"+
		"\t\22\2\2\u01b9\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01b9\3\2\2\2"+
		"\u01bb\u01bc\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be\b=\2\2\u01bez\3\2"+
		"\2\2\u01bf\u01c0\7\61\2\2\u01c0\u01c1\7,\2\2\u01c1\u01c5\3\2\2\2\u01c2"+
		"\u01c4\13\2\2\2\u01c3\u01c2\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c6\3"+
		"\2\2\2\u01c5\u01c3\3\2\2\2\u01c6\u01c8\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8"+
		"\u01c9\7,\2\2\u01c9\u01ca\7\61\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cc\b>"+
		"\2\2\u01cc|\3\2\2\2\u01cd\u01ce\7\61\2\2\u01ce\u01cf\7\61\2\2\u01cf\u01d3"+
		"\3\2\2\2\u01d0\u01d2\n\23\2\2\u01d1\u01d0\3\2\2\2\u01d2\u01d5\3\2\2\2"+
		"\u01d3\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d6\3\2\2\2\u01d5\u01d3"+
		"\3\2\2\2\u01d6\u01d7\b?\2\2\u01d7~\3\2\2\2\u01d8\u01da\t\24\2\2\u01d9"+
		"\u01db\t\16\2\2\u01da\u01d9\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dc\3"+
		"\2\2\2\u01dc\u01dd\5\u0087D\2\u01dd\u0080\3\2\2\2\u01de\u01df\7^\2\2\u01df"+
		"\u01f4\t\25\2\2\u01e0\u01e5\7^\2\2\u01e1\u01e3\t\26\2\2\u01e2\u01e1\3"+
		"\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e6\t\7\2\2\u01e5"+
		"\u01e2\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01f4\t\7"+
		"\2\2\u01e8\u01ea\7^\2\2\u01e9\u01eb\7w\2\2\u01ea\u01e9\3\2\2\2\u01eb\u01ec"+
		"\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee"+
		"\u01ef\5\u0085C\2\u01ef\u01f0\5\u0085C\2\u01f0\u01f1\5\u0085C\2\u01f1"+
		"\u01f2\5\u0085C\2\u01f2\u01f4\3\2\2\2\u01f3\u01de\3\2\2\2\u01f3\u01e0"+
		"\3\2\2\2\u01f3\u01e8\3\2\2\2\u01f4\u0082\3\2\2\2\u01f5\u01fe\5\u0085C"+
		"\2\u01f6\u01f9\5\u0085C\2\u01f7\u01f9\7a\2\2\u01f8\u01f6\3\2\2\2\u01f8"+
		"\u01f7\3\2\2\2\u01f9\u01fc\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fa\u01fb\3\2"+
		"\2\2\u01fb\u01fd\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fd\u01ff\5\u0085C\2\u01fe"+
		"\u01fa\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0084\3\2\2\2\u0200\u0201\t\5"+
		"\2\2\u0201\u0086\3\2\2\2\u0202\u020a\t\27\2\2\u0203\u0205\t\30\2\2\u0204"+
		"\u0203\3\2\2\2\u0205\u0208\3\2\2\2\u0206\u0204\3\2\2\2\u0206\u0207\3\2"+
		"\2\2\u0207\u0209\3\2\2\2\u0208\u0206\3\2\2\2\u0209\u020b\t\27\2\2\u020a"+
		"\u0206\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u0088\3\2\2\2/\2\u011c\u0121"+
		"\u0126\u0129\u012b\u012e\u0136\u013a\u013d\u0143\u014a\u014e\u0151\u0159"+
		"\u015d\u0160\u0165\u0169\u016c\u016f\u0174\u0177\u0179\u017f\u0182\u0186"+
		"\u018a\u018e\u0193\u0195\u01b5\u01bb\u01c5\u01d3\u01da\u01e2\u01e5\u01ec"+
		"\u01f3\u01f8\u01fa\u01fe\u0206\u020a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}