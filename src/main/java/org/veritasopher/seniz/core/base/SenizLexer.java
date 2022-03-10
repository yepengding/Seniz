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
		NEQ=26, AND=27, OR=28, LAND=29, LOR=30, ADD=31, SUB=32, MUL=33, DIV=34, 
		CARET=35, MOD=36, PAR=37, INTERLEAVE=38, ALWAYS=39, EVENTUALLY=40, NEXT=41, 
		UNTIL=42, BOOL_LITERAL=43, DECIMAL_LITERAL=44, HEX_LITERAL=45, OCT_LITERAL=46, 
		BINARY_LITERAL=47, FLOAT_LITERAL=48, HEX_FLOAT_LITERAL=49, STRING_LITERAL=50, 
		NULL_LITERAL=51, LPAREN=52, RPAREN=53, LBRACE=54, RBRACE=55, LBRACK=56, 
		RBRACK=57, SEMI=58, COMMA=59, DOT=60, IDENTIFIER=61, WS=62, COMMENT=63, 
		LINE_COMMENT=64;
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
			"AND", "OR", "LAND", "LOR", "ADD", "SUB", "MUL", "DIV", "CARET", "MOD", 
			"PAR", "INTERLEAVE", "ALWAYS", "EVENTUALLY", "NEXT", "UNTIL", "BOOL_LITERAL", 
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
			null, "'import'", "'main'", "'control'", "'system'", "'varset'", "'over'", 
			"'init'", "'as'", "'prop'", "'ltl'", "'bool'", "'int'", "'float'", "'string'", 
			"':'", "'::'", "'->'", "'>'", "'<'", "'!'", "'~'", "'?'", "'='", "'<='", 
			"'>='", "'/='", "'&'", "'|'", "'and'", "'or'", "'+'", "'-'", "'*'", "'/'", 
			"'^'", "'%'", "'||'", "'|||'", "'G'", "'F'", "'X'", "'U'", null, null, 
			null, null, null, null, null, null, "'null'", "'('", "')'", "'{'", "'}'", 
			"'['", "']'", "';'", "','", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IMPORT", "MAIN", "CONTROL", "SYSTEM", "VARSET", "OVER", "INIT", 
			"AS", "PROP", "LTL", "BOOLEAN", "INT", "FLOAT", "STRING", "VALUEOF", 
			"TYPEOF", "TO", "GT", "LT", "BANG", "TILDE", "QUESTION", "EQ", "LE", 
			"GE", "NEQ", "AND", "OR", "LAND", "LOR", "ADD", "SUB", "MUL", "DIV", 
			"CARET", "MOD", "PAR", "INTERLEAVE", "ALWAYS", "EVENTUALLY", "NEXT", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2B\u0217\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&"+
		"\3&\3\'\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3"+
		",\5,\u0128\n,\3-\3-\3-\5-\u012d\n-\3-\6-\u0130\n-\r-\16-\u0131\3-\5-\u0135"+
		"\n-\5-\u0137\n-\3-\5-\u013a\n-\3.\3.\3.\3.\7.\u0140\n.\f.\16.\u0143\13"+
		".\3.\5.\u0146\n.\3.\5.\u0149\n.\3/\3/\7/\u014d\n/\f/\16/\u0150\13/\3/"+
		"\3/\7/\u0154\n/\f/\16/\u0157\13/\3/\5/\u015a\n/\3/\5/\u015d\n/\3\60\3"+
		"\60\3\60\3\60\7\60\u0163\n\60\f\60\16\60\u0166\13\60\3\60\5\60\u0169\n"+
		"\60\3\60\5\60\u016c\n\60\3\61\3\61\3\61\5\61\u0171\n\61\3\61\3\61\5\61"+
		"\u0175\n\61\3\61\5\61\u0178\n\61\3\61\5\61\u017b\n\61\3\61\3\61\3\61\5"+
		"\61\u0180\n\61\3\61\5\61\u0183\n\61\5\61\u0185\n\61\3\62\3\62\3\62\3\62"+
		"\5\62\u018b\n\62\3\62\5\62\u018e\n\62\3\62\3\62\5\62\u0192\n\62\3\62\3"+
		"\62\5\62\u0196\n\62\3\62\3\62\5\62\u019a\n\62\3\63\3\63\3\63\7\63\u019f"+
		"\n\63\f\63\16\63\u01a2\13\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65\3"+
		"\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\7>\u01bf"+
		"\n>\f>\16>\u01c2\13>\3?\6?\u01c5\n?\r?\16?\u01c6\3?\3?\3@\3@\3@\3@\7@"+
		"\u01cf\n@\f@\16@\u01d2\13@\3@\3@\3@\3@\3@\3A\3A\3A\3A\7A\u01dd\nA\fA\16"+
		"A\u01e0\13A\3A\3A\3B\3B\5B\u01e6\nB\3B\3B\3C\3C\3C\3C\5C\u01ee\nC\3C\5"+
		"C\u01f1\nC\3C\3C\3C\6C\u01f6\nC\rC\16C\u01f7\3C\3C\3C\3C\3C\5C\u01ff\n"+
		"C\3D\3D\3D\7D\u0204\nD\fD\16D\u0207\13D\3D\5D\u020a\nD\3E\3E\3F\3F\7F"+
		"\u0210\nF\fF\16F\u0213\13F\3F\5F\u0216\nF\3\u01d0\2G\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177"+
		"A\u0081B\u0083\2\u0085\2\u0087\2\u0089\2\u008b\2\3\2\31\3\2\63;\4\2NN"+
		"nn\4\2ZZzz\5\2\62;CHch\6\2\62;CHaach\3\2\629\4\2\629aa\4\2DDdd\3\2\62"+
		"\63\4\2\62\63aa\6\2FFHHffhh\4\2RRrr\4\2--//\6\2\f\f\17\17$$^^\5\2C\\a"+
		"ac|\6\2\62;C\\aac|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\4\2GGgg\n\2$$))^^"+
		"ddhhppttvv\3\2\62\65\3\2\62;\4\2\62;aa\2\u023e\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y"+
		"\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2"+
		"\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2"+
		"\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177"+
		"\3\2\2\2\2\u0081\3\2\2\2\3\u008d\3\2\2\2\5\u0094\3\2\2\2\7\u0099\3\2\2"+
		"\2\t\u00a1\3\2\2\2\13\u00a8\3\2\2\2\r\u00af\3\2\2\2\17\u00b4\3\2\2\2\21"+
		"\u00b9\3\2\2\2\23\u00bc\3\2\2\2\25\u00c1\3\2\2\2\27\u00c5\3\2\2\2\31\u00ca"+
		"\3\2\2\2\33\u00ce\3\2\2\2\35\u00d4\3\2\2\2\37\u00db\3\2\2\2!\u00dd\3\2"+
		"\2\2#\u00e0\3\2\2\2%\u00e3\3\2\2\2\'\u00e5\3\2\2\2)\u00e7\3\2\2\2+\u00e9"+
		"\3\2\2\2-\u00eb\3\2\2\2/\u00ed\3\2\2\2\61\u00ef\3\2\2\2\63\u00f2\3\2\2"+
		"\2\65\u00f5\3\2\2\2\67\u00f8\3\2\2\29\u00fa\3\2\2\2;\u00fc\3\2\2\2=\u0100"+
		"\3\2\2\2?\u0103\3\2\2\2A\u0105\3\2\2\2C\u0107\3\2\2\2E\u0109\3\2\2\2G"+
		"\u010b\3\2\2\2I\u010d\3\2\2\2K\u010f\3\2\2\2M\u0112\3\2\2\2O\u0116\3\2"+
		"\2\2Q\u0118\3\2\2\2S\u011a\3\2\2\2U\u011c\3\2\2\2W\u0127\3\2\2\2Y\u0136"+
		"\3\2\2\2[\u013b\3\2\2\2]\u014a\3\2\2\2_\u015e\3\2\2\2a\u0184\3\2\2\2c"+
		"\u0186\3\2\2\2e\u019b\3\2\2\2g\u01a5\3\2\2\2i\u01aa\3\2\2\2k\u01ac\3\2"+
		"\2\2m\u01ae\3\2\2\2o\u01b0\3\2\2\2q\u01b2\3\2\2\2s\u01b4\3\2\2\2u\u01b6"+
		"\3\2\2\2w\u01b8\3\2\2\2y\u01ba\3\2\2\2{\u01bc\3\2\2\2}\u01c4\3\2\2\2\177"+
		"\u01ca\3\2\2\2\u0081\u01d8\3\2\2\2\u0083\u01e3\3\2\2\2\u0085\u01fe\3\2"+
		"\2\2\u0087\u0200\3\2\2\2\u0089\u020b\3\2\2\2\u008b\u020d\3\2\2\2\u008d"+
		"\u008e\7k\2\2\u008e\u008f\7o\2\2\u008f\u0090\7r\2\2\u0090\u0091\7q\2\2"+
		"\u0091\u0092\7t\2\2\u0092\u0093\7v\2\2\u0093\4\3\2\2\2\u0094\u0095\7o"+
		"\2\2\u0095\u0096\7c\2\2\u0096\u0097\7k\2\2\u0097\u0098\7p\2\2\u0098\6"+
		"\3\2\2\2\u0099\u009a\7e\2\2\u009a\u009b\7q\2\2\u009b\u009c\7p\2\2\u009c"+
		"\u009d\7v\2\2\u009d\u009e\7t\2\2\u009e\u009f\7q\2\2\u009f\u00a0\7n\2\2"+
		"\u00a0\b\3\2\2\2\u00a1\u00a2\7u\2\2\u00a2\u00a3\7{\2\2\u00a3\u00a4\7u"+
		"\2\2\u00a4\u00a5\7v\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7o\2\2\u00a7\n"+
		"\3\2\2\2\u00a8\u00a9\7x\2\2\u00a9\u00aa\7c\2\2\u00aa\u00ab\7t\2\2\u00ab"+
		"\u00ac\7u\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7v\2\2\u00ae\f\3\2\2\2\u00af"+
		"\u00b0\7q\2\2\u00b0\u00b1\7x\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7t\2\2"+
		"\u00b3\16\3\2\2\2\u00b4\u00b5\7k\2\2\u00b5\u00b6\7p\2\2\u00b6\u00b7\7"+
		"k\2\2\u00b7\u00b8\7v\2\2\u00b8\20\3\2\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb"+
		"\7u\2\2\u00bb\22\3\2\2\2\u00bc\u00bd\7r\2\2\u00bd\u00be\7t\2\2\u00be\u00bf"+
		"\7q\2\2\u00bf\u00c0\7r\2\2\u00c0\24\3\2\2\2\u00c1\u00c2\7n\2\2\u00c2\u00c3"+
		"\7v\2\2\u00c3\u00c4\7n\2\2\u00c4\26\3\2\2\2\u00c5\u00c6\7d\2\2\u00c6\u00c7"+
		"\7q\2\2\u00c7\u00c8\7q\2\2\u00c8\u00c9\7n\2\2\u00c9\30\3\2\2\2\u00ca\u00cb"+
		"\7k\2\2\u00cb\u00cc\7p\2\2\u00cc\u00cd\7v\2\2\u00cd\32\3\2\2\2\u00ce\u00cf"+
		"\7h\2\2\u00cf\u00d0\7n\2\2\u00d0\u00d1\7q\2\2\u00d1\u00d2\7c\2\2\u00d2"+
		"\u00d3\7v\2\2\u00d3\34\3\2\2\2\u00d4\u00d5\7u\2\2\u00d5\u00d6\7v\2\2\u00d6"+
		"\u00d7\7t\2\2\u00d7\u00d8\7k\2\2\u00d8\u00d9\7p\2\2\u00d9\u00da\7i\2\2"+
		"\u00da\36\3\2\2\2\u00db\u00dc\7<\2\2\u00dc \3\2\2\2\u00dd\u00de\7<\2\2"+
		"\u00de\u00df\7<\2\2\u00df\"\3\2\2\2\u00e0\u00e1\7/\2\2\u00e1\u00e2\7@"+
		"\2\2\u00e2$\3\2\2\2\u00e3\u00e4\7@\2\2\u00e4&\3\2\2\2\u00e5\u00e6\7>\2"+
		"\2\u00e6(\3\2\2\2\u00e7\u00e8\7#\2\2\u00e8*\3\2\2\2\u00e9\u00ea\7\u0080"+
		"\2\2\u00ea,\3\2\2\2\u00eb\u00ec\7A\2\2\u00ec.\3\2\2\2\u00ed\u00ee\7?\2"+
		"\2\u00ee\60\3\2\2\2\u00ef\u00f0\7>\2\2\u00f0\u00f1\7?\2\2\u00f1\62\3\2"+
		"\2\2\u00f2\u00f3\7@\2\2\u00f3\u00f4\7?\2\2\u00f4\64\3\2\2\2\u00f5\u00f6"+
		"\7\61\2\2\u00f6\u00f7\7?\2\2\u00f7\66\3\2\2\2\u00f8\u00f9\7(\2\2\u00f9"+
		"8\3\2\2\2\u00fa\u00fb\7~\2\2\u00fb:\3\2\2\2\u00fc\u00fd\7c\2\2\u00fd\u00fe"+
		"\7p\2\2\u00fe\u00ff\7f\2\2\u00ff<\3\2\2\2\u0100\u0101\7q\2\2\u0101\u0102"+
		"\7t\2\2\u0102>\3\2\2\2\u0103\u0104\7-\2\2\u0104@\3\2\2\2\u0105\u0106\7"+
		"/\2\2\u0106B\3\2\2\2\u0107\u0108\7,\2\2\u0108D\3\2\2\2\u0109\u010a\7\61"+
		"\2\2\u010aF\3\2\2\2\u010b\u010c\7`\2\2\u010cH\3\2\2\2\u010d\u010e\7\'"+
		"\2\2\u010eJ\3\2\2\2\u010f\u0110\7~\2\2\u0110\u0111\7~\2\2\u0111L\3\2\2"+
		"\2\u0112\u0113\7~\2\2\u0113\u0114\7~\2\2\u0114\u0115\7~\2\2\u0115N\3\2"+
		"\2\2\u0116\u0117\7I\2\2\u0117P\3\2\2\2\u0118\u0119\7H\2\2\u0119R\3\2\2"+
		"\2\u011a\u011b\7Z\2\2\u011bT\3\2\2\2\u011c\u011d\7W\2\2\u011dV\3\2\2\2"+
		"\u011e\u011f\7v\2\2\u011f\u0120\7t\2\2\u0120\u0121\7w\2\2\u0121\u0128"+
		"\7g\2\2\u0122\u0123\7h\2\2\u0123\u0124\7c\2\2\u0124\u0125\7n\2\2\u0125"+
		"\u0126\7u\2\2\u0126\u0128\7g\2\2\u0127\u011e\3\2\2\2\u0127\u0122\3\2\2"+
		"\2\u0128X\3\2\2\2\u0129\u0137\7\62\2\2\u012a\u0134\t\2\2\2\u012b\u012d"+
		"\5\u008bF\2\u012c\u012b\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u0135\3\2\2"+
		"\2\u012e\u0130\7a\2\2\u012f\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u012f"+
		"\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0135\5\u008bF"+
		"\2\u0134\u012c\3\2\2\2\u0134\u012f\3\2\2\2\u0135\u0137\3\2\2\2\u0136\u0129"+
		"\3\2\2\2\u0136\u012a\3\2\2\2\u0137\u0139\3\2\2\2\u0138\u013a\t\3\2\2\u0139"+
		"\u0138\3\2\2\2\u0139\u013a\3\2\2\2\u013aZ\3\2\2\2\u013b\u013c\7\62\2\2"+
		"\u013c\u013d\t\4\2\2\u013d\u0145\t\5\2\2\u013e\u0140\t\6\2\2\u013f\u013e"+
		"\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142"+
		"\u0144\3\2\2\2\u0143\u0141\3\2\2\2\u0144\u0146\t\5\2\2\u0145\u0141\3\2"+
		"\2\2\u0145\u0146\3\2\2\2\u0146\u0148\3\2\2\2\u0147\u0149\t\3\2\2\u0148"+
		"\u0147\3\2\2\2\u0148\u0149\3\2\2\2\u0149\\\3\2\2\2\u014a\u014e\7\62\2"+
		"\2\u014b\u014d\7a\2\2\u014c\u014b\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c"+
		"\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0151\3\2\2\2\u0150\u014e\3\2\2\2\u0151"+
		"\u0159\t\7\2\2\u0152\u0154\t\b\2\2\u0153\u0152\3\2\2\2\u0154\u0157\3\2"+
		"\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0158\3\2\2\2\u0157"+
		"\u0155\3\2\2\2\u0158\u015a\t\7\2\2\u0159\u0155\3\2\2\2\u0159\u015a\3\2"+
		"\2\2\u015a\u015c\3\2\2\2\u015b\u015d\t\3\2\2\u015c\u015b\3\2\2\2\u015c"+
		"\u015d\3\2\2\2\u015d^\3\2\2\2\u015e\u015f\7\62\2\2\u015f\u0160\t\t\2\2"+
		"\u0160\u0168\t\n\2\2\u0161\u0163\t\13\2\2\u0162\u0161\3\2\2\2\u0163\u0166"+
		"\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0167\3\2\2\2\u0166"+
		"\u0164\3\2\2\2\u0167\u0169\t\n\2\2\u0168\u0164\3\2\2\2\u0168\u0169\3\2"+
		"\2\2\u0169\u016b\3\2\2\2\u016a\u016c\t\3\2\2\u016b\u016a\3\2\2\2\u016b"+
		"\u016c\3\2\2\2\u016c`\3\2\2\2\u016d\u016e\5\u008bF\2\u016e\u0170\7\60"+
		"\2\2\u016f\u0171\5\u008bF\2\u0170\u016f\3\2\2\2\u0170\u0171\3\2\2\2\u0171"+
		"\u0175\3\2\2\2\u0172\u0173\7\60\2\2\u0173\u0175\5\u008bF\2\u0174\u016d"+
		"\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u0177\3\2\2\2\u0176\u0178\5\u0083B"+
		"\2\u0177\u0176\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u017a\3\2\2\2\u0179\u017b"+
		"\t\f\2\2\u017a\u0179\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u0185\3\2\2\2\u017c"+
		"\u0182\5\u008bF\2\u017d\u017f\5\u0083B\2\u017e\u0180\t\f\2\2\u017f\u017e"+
		"\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u0183\t\f\2\2\u0182"+
		"\u017d\3\2\2\2\u0182\u0181\3\2\2\2\u0183\u0185\3\2\2\2\u0184\u0174\3\2"+
		"\2\2\u0184\u017c\3\2\2\2\u0185b\3\2\2\2\u0186\u0187\7\62\2\2\u0187\u0191"+
		"\t\4\2\2\u0188\u018a\5\u0087D\2\u0189\u018b\7\60\2\2\u018a\u0189\3\2\2"+
		"\2\u018a\u018b\3\2\2\2\u018b\u0192\3\2\2\2\u018c\u018e\5\u0087D\2\u018d"+
		"\u018c\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190\7\60"+
		"\2\2\u0190\u0192\5\u0087D\2\u0191\u0188\3\2\2\2\u0191\u018d\3\2\2\2\u0192"+
		"\u0193\3\2\2\2\u0193\u0195\t\r\2\2\u0194\u0196\t\16\2\2\u0195\u0194\3"+
		"\2\2\2\u0195\u0196\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0199\5\u008bF\2"+
		"\u0198\u019a\t\f\2\2\u0199\u0198\3\2\2\2\u0199\u019a\3\2\2\2\u019ad\3"+
		"\2\2\2\u019b\u01a0\7$\2\2\u019c\u019f\n\17\2\2\u019d\u019f\5\u0085C\2"+
		"\u019e\u019c\3\2\2\2\u019e\u019d\3\2\2\2\u019f\u01a2\3\2\2\2\u01a0\u019e"+
		"\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a3\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a3"+
		"\u01a4\7$\2\2\u01a4f\3\2\2\2\u01a5\u01a6\7p\2\2\u01a6\u01a7\7w\2\2\u01a7"+
		"\u01a8\7n\2\2\u01a8\u01a9\7n\2\2\u01a9h\3\2\2\2\u01aa\u01ab\7*\2\2\u01ab"+
		"j\3\2\2\2\u01ac\u01ad\7+\2\2\u01adl\3\2\2\2\u01ae\u01af\7}\2\2\u01afn"+
		"\3\2\2\2\u01b0\u01b1\7\177\2\2\u01b1p\3\2\2\2\u01b2\u01b3\7]\2\2\u01b3"+
		"r\3\2\2\2\u01b4\u01b5\7_\2\2\u01b5t\3\2\2\2\u01b6\u01b7\7=\2\2\u01b7v"+
		"\3\2\2\2\u01b8\u01b9\7.\2\2\u01b9x\3\2\2\2\u01ba\u01bb\7\60\2\2\u01bb"+
		"z\3\2\2\2\u01bc\u01c0\t\20\2\2\u01bd\u01bf\t\21\2\2\u01be\u01bd\3\2\2"+
		"\2\u01bf\u01c2\3\2\2\2\u01c0\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1|"+
		"\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c3\u01c5\t\22\2\2\u01c4\u01c3\3\2\2\2"+
		"\u01c5\u01c6\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8"+
		"\3\2\2\2\u01c8\u01c9\b?\2\2\u01c9~\3\2\2\2\u01ca\u01cb\7\61\2\2\u01cb"+
		"\u01cc\7,\2\2\u01cc\u01d0\3\2\2\2\u01cd\u01cf\13\2\2\2\u01ce\u01cd\3\2"+
		"\2\2\u01cf\u01d2\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d1"+
		"\u01d3\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d3\u01d4\7,\2\2\u01d4\u01d5\7\61"+
		"\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7\b@\2\2\u01d7\u0080\3\2\2\2\u01d8"+
		"\u01d9\7\61\2\2\u01d9\u01da\7\61\2\2\u01da\u01de\3\2\2\2\u01db\u01dd\n"+
		"\23\2\2\u01dc\u01db\3\2\2\2\u01dd\u01e0\3\2\2\2\u01de\u01dc\3\2\2\2\u01de"+
		"\u01df\3\2\2\2\u01df\u01e1\3\2\2\2\u01e0\u01de\3\2\2\2\u01e1\u01e2\bA"+
		"\2\2\u01e2\u0082\3\2\2\2\u01e3\u01e5\t\24\2\2\u01e4\u01e6\t\16\2\2\u01e5"+
		"\u01e4\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e8\5\u008b"+
		"F\2\u01e8\u0084\3\2\2\2\u01e9\u01ea\7^\2\2\u01ea\u01ff\t\25\2\2\u01eb"+
		"\u01f0\7^\2\2\u01ec\u01ee\t\26\2\2\u01ed\u01ec\3\2\2\2\u01ed\u01ee\3\2"+
		"\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f1\t\7\2\2\u01f0\u01ed\3\2\2\2\u01f0"+
		"\u01f1\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01ff\t\7\2\2\u01f3\u01f5\7^"+
		"\2\2\u01f4\u01f6\7w\2\2\u01f5\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7"+
		"\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fa\5\u0089"+
		"E\2\u01fa\u01fb\5\u0089E\2\u01fb\u01fc\5\u0089E\2\u01fc\u01fd\5\u0089"+
		"E\2\u01fd\u01ff\3\2\2\2\u01fe\u01e9\3\2\2\2\u01fe\u01eb\3\2\2\2\u01fe"+
		"\u01f3\3\2\2\2\u01ff\u0086\3\2\2\2\u0200\u0209\5\u0089E\2\u0201\u0204"+
		"\5\u0089E\2\u0202\u0204\7a\2\2\u0203\u0201\3\2\2\2\u0203\u0202\3\2\2\2"+
		"\u0204\u0207\3\2\2\2\u0205\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0208"+
		"\3\2\2\2\u0207\u0205\3\2\2\2\u0208\u020a\5\u0089E\2\u0209\u0205\3\2\2"+
		"\2\u0209\u020a\3\2\2\2\u020a\u0088\3\2\2\2\u020b\u020c\t\5\2\2\u020c\u008a"+
		"\3\2\2\2\u020d\u0215\t\27\2\2\u020e\u0210\t\30\2\2\u020f\u020e\3\2\2\2"+
		"\u0210\u0213\3\2\2\2\u0211\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0214"+
		"\3\2\2\2\u0213\u0211\3\2\2\2\u0214\u0216\t\27\2\2\u0215\u0211\3\2\2\2"+
		"\u0215\u0216\3\2\2\2\u0216\u008c\3\2\2\2/\2\u0127\u012c\u0131\u0134\u0136"+
		"\u0139\u0141\u0145\u0148\u014e\u0155\u0159\u015c\u0164\u0168\u016b\u0170"+
		"\u0174\u0177\u017a\u017f\u0182\u0184\u018a\u018d\u0191\u0195\u0199\u019e"+
		"\u01a0\u01c0\u01c6\u01d0\u01de\u01e5\u01ed\u01f0\u01f7\u01fe\u0203\u0205"+
		"\u0209\u0211\u0215\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}