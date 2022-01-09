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
		LTL=9, BOOLEAN=10, INT=11, FLOAT=12, STRING=13, VALUEOF=14, TYPEOF=15, 
		TO=16, GT=17, LT=18, BANG=19, TILDE=20, QUESTION=21, EQ=22, LE=23, GE=24, 
		NEQ=25, AND=26, OR=27, ADD=28, SUB=29, MUL=30, DIV=31, CARET=32, MOD=33, 
		PAR=34, INTERLEAVE=35, ALWAYS=36, EVENTUALLY=37, NEXT=38, UNTIL=39, BOOL_LITERAL=40, 
		DECIMAL_LITERAL=41, HEX_LITERAL=42, OCT_LITERAL=43, BINARY_LITERAL=44, 
		FLOAT_LITERAL=45, HEX_FLOAT_LITERAL=46, STRING_LITERAL=47, NULL_LITERAL=48, 
		LPAREN=49, RPAREN=50, LBRACE=51, RBRACE=52, LBRACK=53, RBRACK=54, SEMI=55, 
		COMMA=56, DOT=57, IDENTIFIER=58, WS=59, COMMENT=60, LINE_COMMENT=61;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IMPORT", "MAIN", "CONTROL", "SYSTEM", "VARSET", "OVER", "INIT", "AS", 
			"LTL", "BOOLEAN", "INT", "FLOAT", "STRING", "VALUEOF", "TYPEOF", "TO", 
			"GT", "LT", "BANG", "TILDE", "QUESTION", "EQ", "LE", "GE", "NEQ", "AND", 
			"OR", "ADD", "SUB", "MUL", "DIV", "CARET", "MOD", "PAR", "INTERLEAVE", 
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
			"'init'", "'as'", "'ltl'", "'bool'", "'int'", "'float'", "'string'", 
			"':'", "'::'", "'->'", "'>'", "'<'", "'!'", "'~'", "'?'", "'='", "'<='", 
			"'>='", "'/='", "'&'", "'|'", "'+'", "'-'", "'*'", "'/'", "'^'", "'%'", 
			"'||'", "'|||'", "'always'", "'eventually'", "'next'", "'until'", null, 
			null, null, null, null, null, null, null, "'null'", "'('", "')'", "'{'", 
			"'}'", "'['", "']'", "';'", "','", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IMPORT", "MAIN", "CONTROL", "SYSTEM", "VARSET", "OVER", "INIT", 
			"AS", "LTL", "BOOLEAN", "INT", "FLOAT", "STRING", "VALUEOF", "TYPEOF", 
			"TO", "GT", "LT", "BANG", "TILDE", "QUESTION", "EQ", "LE", "GE", "NEQ", 
			"AND", "OR", "ADD", "SUB", "MUL", "DIV", "CARET", "MOD", "PAR", "INTERLEAVE", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2?\u021a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3"+
		"#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)"+
		"\u012b\n)\3*\3*\3*\5*\u0130\n*\3*\6*\u0133\n*\r*\16*\u0134\3*\5*\u0138"+
		"\n*\5*\u013a\n*\3*\5*\u013d\n*\3+\3+\3+\3+\7+\u0143\n+\f+\16+\u0146\13"+
		"+\3+\5+\u0149\n+\3+\5+\u014c\n+\3,\3,\7,\u0150\n,\f,\16,\u0153\13,\3,"+
		"\3,\7,\u0157\n,\f,\16,\u015a\13,\3,\5,\u015d\n,\3,\5,\u0160\n,\3-\3-\3"+
		"-\3-\7-\u0166\n-\f-\16-\u0169\13-\3-\5-\u016c\n-\3-\5-\u016f\n-\3.\3."+
		"\3.\5.\u0174\n.\3.\3.\5.\u0178\n.\3.\5.\u017b\n.\3.\5.\u017e\n.\3.\3."+
		"\3.\5.\u0183\n.\3.\5.\u0186\n.\5.\u0188\n.\3/\3/\3/\3/\5/\u018e\n/\3/"+
		"\5/\u0191\n/\3/\3/\5/\u0195\n/\3/\3/\5/\u0199\n/\3/\3/\5/\u019d\n/\3\60"+
		"\3\60\3\60\7\60\u01a2\n\60\f\60\16\60\u01a5\13\60\3\60\3\60\3\61\3\61"+
		"\3\61\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67"+
		"\3\67\38\38\39\39\3:\3:\3;\3;\7;\u01c2\n;\f;\16;\u01c5\13;\3<\6<\u01c8"+
		"\n<\r<\16<\u01c9\3<\3<\3=\3=\3=\3=\7=\u01d2\n=\f=\16=\u01d5\13=\3=\3="+
		"\3=\3=\3=\3>\3>\3>\3>\7>\u01e0\n>\f>\16>\u01e3\13>\3>\3>\3?\3?\5?\u01e9"+
		"\n?\3?\3?\3@\3@\3@\3@\5@\u01f1\n@\3@\5@\u01f4\n@\3@\3@\3@\6@\u01f9\n@"+
		"\r@\16@\u01fa\3@\3@\3@\3@\3@\5@\u0202\n@\3A\3A\3A\7A\u0207\nA\fA\16A\u020a"+
		"\13A\3A\5A\u020d\nA\3B\3B\3C\3C\7C\u0213\nC\fC\16C\u0216\13C\3C\5C\u0219"+
		"\nC\3\u01d3\2D\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g"+
		"\65i\66k\67m8o9q:s;u<w=y>{?}\2\177\2\u0081\2\u0083\2\u0085\2\3\2\31\3"+
		"\2\63;\4\2NNnn\4\2ZZzz\5\2\62;CHch\6\2\62;CHaach\3\2\629\4\2\629aa\4\2"+
		"DDdd\3\2\62\63\4\2\62\63aa\6\2FFHHffhh\4\2RRrr\4\2--//\6\2\f\f\17\17$"+
		"$^^\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\4\2GGg"+
		"g\n\2$$))^^ddhhppttvv\3\2\62\65\3\2\62;\4\2\62;aa\2\u0241\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W"+
		"\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2"+
		"\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2"+
		"\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\3\u0087"+
		"\3\2\2\2\5\u008e\3\2\2\2\7\u0093\3\2\2\2\t\u009b\3\2\2\2\13\u00a2\3\2"+
		"\2\2\r\u00a9\3\2\2\2\17\u00ae\3\2\2\2\21\u00b3\3\2\2\2\23\u00b6\3\2\2"+
		"\2\25\u00ba\3\2\2\2\27\u00bf\3\2\2\2\31\u00c3\3\2\2\2\33\u00c9\3\2\2\2"+
		"\35\u00d0\3\2\2\2\37\u00d2\3\2\2\2!\u00d5\3\2\2\2#\u00d8\3\2\2\2%\u00da"+
		"\3\2\2\2\'\u00dc\3\2\2\2)\u00de\3\2\2\2+\u00e0\3\2\2\2-\u00e2\3\2\2\2"+
		"/\u00e4\3\2\2\2\61\u00e7\3\2\2\2\63\u00ea\3\2\2\2\65\u00ed\3\2\2\2\67"+
		"\u00ef\3\2\2\29\u00f1\3\2\2\2;\u00f3\3\2\2\2=\u00f5\3\2\2\2?\u00f7\3\2"+
		"\2\2A\u00f9\3\2\2\2C\u00fb\3\2\2\2E\u00fd\3\2\2\2G\u0100\3\2\2\2I\u0104"+
		"\3\2\2\2K\u010b\3\2\2\2M\u0116\3\2\2\2O\u011b\3\2\2\2Q\u012a\3\2\2\2S"+
		"\u0139\3\2\2\2U\u013e\3\2\2\2W\u014d\3\2\2\2Y\u0161\3\2\2\2[\u0187\3\2"+
		"\2\2]\u0189\3\2\2\2_\u019e\3\2\2\2a\u01a8\3\2\2\2c\u01ad\3\2\2\2e\u01af"+
		"\3\2\2\2g\u01b1\3\2\2\2i\u01b3\3\2\2\2k\u01b5\3\2\2\2m\u01b7\3\2\2\2o"+
		"\u01b9\3\2\2\2q\u01bb\3\2\2\2s\u01bd\3\2\2\2u\u01bf\3\2\2\2w\u01c7\3\2"+
		"\2\2y\u01cd\3\2\2\2{\u01db\3\2\2\2}\u01e6\3\2\2\2\177\u0201\3\2\2\2\u0081"+
		"\u0203\3\2\2\2\u0083\u020e\3\2\2\2\u0085\u0210\3\2\2\2\u0087\u0088\7k"+
		"\2\2\u0088\u0089\7o\2\2\u0089\u008a\7r\2\2\u008a\u008b\7q\2\2\u008b\u008c"+
		"\7t\2\2\u008c\u008d\7v\2\2\u008d\4\3\2\2\2\u008e\u008f\7o\2\2\u008f\u0090"+
		"\7c\2\2\u0090\u0091\7k\2\2\u0091\u0092\7p\2\2\u0092\6\3\2\2\2\u0093\u0094"+
		"\7e\2\2\u0094\u0095\7q\2\2\u0095\u0096\7p\2\2\u0096\u0097\7v\2\2\u0097"+
		"\u0098\7t\2\2\u0098\u0099\7q\2\2\u0099\u009a\7n\2\2\u009a\b\3\2\2\2\u009b"+
		"\u009c\7u\2\2\u009c\u009d\7{\2\2\u009d\u009e\7u\2\2\u009e\u009f\7v\2\2"+
		"\u009f\u00a0\7g\2\2\u00a0\u00a1\7o\2\2\u00a1\n\3\2\2\2\u00a2\u00a3\7x"+
		"\2\2\u00a3\u00a4\7c\2\2\u00a4\u00a5\7t\2\2\u00a5\u00a6\7u\2\2\u00a6\u00a7"+
		"\7g\2\2\u00a7\u00a8\7v\2\2\u00a8\f\3\2\2\2\u00a9\u00aa\7q\2\2\u00aa\u00ab"+
		"\7x\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad\7t\2\2\u00ad\16\3\2\2\2\u00ae\u00af"+
		"\7k\2\2\u00af\u00b0\7p\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b2\7v\2\2\u00b2"+
		"\20\3\2\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5\7u\2\2\u00b5\22\3\2\2\2\u00b6"+
		"\u00b7\7n\2\2\u00b7\u00b8\7v\2\2\u00b8\u00b9\7n\2\2\u00b9\24\3\2\2\2\u00ba"+
		"\u00bb\7d\2\2\u00bb\u00bc\7q\2\2\u00bc\u00bd\7q\2\2\u00bd\u00be\7n\2\2"+
		"\u00be\26\3\2\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7p\2\2\u00c1\u00c2\7"+
		"v\2\2\u00c2\30\3\2\2\2\u00c3\u00c4\7h\2\2\u00c4\u00c5\7n\2\2\u00c5\u00c6"+
		"\7q\2\2\u00c6\u00c7\7c\2\2\u00c7\u00c8\7v\2\2\u00c8\32\3\2\2\2\u00c9\u00ca"+
		"\7u\2\2\u00ca\u00cb\7v\2\2\u00cb\u00cc\7t\2\2\u00cc\u00cd\7k\2\2\u00cd"+
		"\u00ce\7p\2\2\u00ce\u00cf\7i\2\2\u00cf\34\3\2\2\2\u00d0\u00d1\7<\2\2\u00d1"+
		"\36\3\2\2\2\u00d2\u00d3\7<\2\2\u00d3\u00d4\7<\2\2\u00d4 \3\2\2\2\u00d5"+
		"\u00d6\7/\2\2\u00d6\u00d7\7@\2\2\u00d7\"\3\2\2\2\u00d8\u00d9\7@\2\2\u00d9"+
		"$\3\2\2\2\u00da\u00db\7>\2\2\u00db&\3\2\2\2\u00dc\u00dd\7#\2\2\u00dd("+
		"\3\2\2\2\u00de\u00df\7\u0080\2\2\u00df*\3\2\2\2\u00e0\u00e1\7A\2\2\u00e1"+
		",\3\2\2\2\u00e2\u00e3\7?\2\2\u00e3.\3\2\2\2\u00e4\u00e5\7>\2\2\u00e5\u00e6"+
		"\7?\2\2\u00e6\60\3\2\2\2\u00e7\u00e8\7@\2\2\u00e8\u00e9\7?\2\2\u00e9\62"+
		"\3\2\2\2\u00ea\u00eb\7\61\2\2\u00eb\u00ec\7?\2\2\u00ec\64\3\2\2\2\u00ed"+
		"\u00ee\7(\2\2\u00ee\66\3\2\2\2\u00ef\u00f0\7~\2\2\u00f08\3\2\2\2\u00f1"+
		"\u00f2\7-\2\2\u00f2:\3\2\2\2\u00f3\u00f4\7/\2\2\u00f4<\3\2\2\2\u00f5\u00f6"+
		"\7,\2\2\u00f6>\3\2\2\2\u00f7\u00f8\7\61\2\2\u00f8@\3\2\2\2\u00f9\u00fa"+
		"\7`\2\2\u00faB\3\2\2\2\u00fb\u00fc\7\'\2\2\u00fcD\3\2\2\2\u00fd\u00fe"+
		"\7~\2\2\u00fe\u00ff\7~\2\2\u00ffF\3\2\2\2\u0100\u0101\7~\2\2\u0101\u0102"+
		"\7~\2\2\u0102\u0103\7~\2\2\u0103H\3\2\2\2\u0104\u0105\7c\2\2\u0105\u0106"+
		"\7n\2\2\u0106\u0107\7y\2\2\u0107\u0108\7c\2\2\u0108\u0109\7{\2\2\u0109"+
		"\u010a\7u\2\2\u010aJ\3\2\2\2\u010b\u010c\7g\2\2\u010c\u010d\7x\2\2\u010d"+
		"\u010e\7g\2\2\u010e\u010f\7p\2\2\u010f\u0110\7v\2\2\u0110\u0111\7w\2\2"+
		"\u0111\u0112\7c\2\2\u0112\u0113\7n\2\2\u0113\u0114\7n\2\2\u0114\u0115"+
		"\7{\2\2\u0115L\3\2\2\2\u0116\u0117\7p\2\2\u0117\u0118\7g\2\2\u0118\u0119"+
		"\7z\2\2\u0119\u011a\7v\2\2\u011aN\3\2\2\2\u011b\u011c\7w\2\2\u011c\u011d"+
		"\7p\2\2\u011d\u011e\7v\2\2\u011e\u011f\7k\2\2\u011f\u0120\7n\2\2\u0120"+
		"P\3\2\2\2\u0121\u0122\7v\2\2\u0122\u0123\7t\2\2\u0123\u0124\7w\2\2\u0124"+
		"\u012b\7g\2\2\u0125\u0126\7h\2\2\u0126\u0127\7c\2\2\u0127\u0128\7n\2\2"+
		"\u0128\u0129\7u\2\2\u0129\u012b\7g\2\2\u012a\u0121\3\2\2\2\u012a\u0125"+
		"\3\2\2\2\u012bR\3\2\2\2\u012c\u013a\7\62\2\2\u012d\u0137\t\2\2\2\u012e"+
		"\u0130\5\u0085C\2\u012f\u012e\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0138"+
		"\3\2\2\2\u0131\u0133\7a\2\2\u0132\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134"+
		"\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0138\5\u0085"+
		"C\2\u0137\u012f\3\2\2\2\u0137\u0132\3\2\2\2\u0138\u013a\3\2\2\2\u0139"+
		"\u012c\3\2\2\2\u0139\u012d\3\2\2\2\u013a\u013c\3\2\2\2\u013b\u013d\t\3"+
		"\2\2\u013c\u013b\3\2\2\2\u013c\u013d\3\2\2\2\u013dT\3\2\2\2\u013e\u013f"+
		"\7\62\2\2\u013f\u0140\t\4\2\2\u0140\u0148\t\5\2\2\u0141\u0143\t\6\2\2"+
		"\u0142\u0141\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145"+
		"\3\2\2\2\u0145\u0147\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0149\t\5\2\2\u0148"+
		"\u0144\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014b\3\2\2\2\u014a\u014c\t\3"+
		"\2\2\u014b\u014a\3\2\2\2\u014b\u014c\3\2\2\2\u014cV\3\2\2\2\u014d\u0151"+
		"\7\62\2\2\u014e\u0150\7a\2\2\u014f\u014e\3\2\2\2\u0150\u0153\3\2\2\2\u0151"+
		"\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0154\3\2\2\2\u0153\u0151\3\2"+
		"\2\2\u0154\u015c\t\7\2\2\u0155\u0157\t\b\2\2\u0156\u0155\3\2\2\2\u0157"+
		"\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015b\3\2"+
		"\2\2\u015a\u0158\3\2\2\2\u015b\u015d\t\7\2\2\u015c\u0158\3\2\2\2\u015c"+
		"\u015d\3\2\2\2\u015d\u015f\3\2\2\2\u015e\u0160\t\3\2\2\u015f\u015e\3\2"+
		"\2\2\u015f\u0160\3\2\2\2\u0160X\3\2\2\2\u0161\u0162\7\62\2\2\u0162\u0163"+
		"\t\t\2\2\u0163\u016b\t\n\2\2\u0164\u0166\t\13\2\2\u0165\u0164\3\2\2\2"+
		"\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u016a"+
		"\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u016c\t\n\2\2\u016b\u0167\3\2\2\2\u016b"+
		"\u016c\3\2\2\2\u016c\u016e\3\2\2\2\u016d\u016f\t\3\2\2\u016e\u016d\3\2"+
		"\2\2\u016e\u016f\3\2\2\2\u016fZ\3\2\2\2\u0170\u0171\5\u0085C\2\u0171\u0173"+
		"\7\60\2\2\u0172\u0174\5\u0085C\2\u0173\u0172\3\2\2\2\u0173\u0174\3\2\2"+
		"\2\u0174\u0178\3\2\2\2\u0175\u0176\7\60\2\2\u0176\u0178\5\u0085C\2\u0177"+
		"\u0170\3\2\2\2\u0177\u0175\3\2\2\2\u0178\u017a\3\2\2\2\u0179\u017b\5}"+
		"?\2\u017a\u0179\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017d\3\2\2\2\u017c"+
		"\u017e\t\f\2\2\u017d\u017c\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u0188\3\2"+
		"\2\2\u017f\u0185\5\u0085C\2\u0180\u0182\5}?\2\u0181\u0183\t\f\2\2\u0182"+
		"\u0181\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0186\t\f"+
		"\2\2\u0185\u0180\3\2\2\2\u0185\u0184\3\2\2\2\u0186\u0188\3\2\2\2\u0187"+
		"\u0177\3\2\2\2\u0187\u017f\3\2\2\2\u0188\\\3\2\2\2\u0189\u018a\7\62\2"+
		"\2\u018a\u0194\t\4\2\2\u018b\u018d\5\u0081A\2\u018c\u018e\7\60\2\2\u018d"+
		"\u018c\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u0195\3\2\2\2\u018f\u0191\5\u0081"+
		"A\2\u0190\u018f\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\3\2\2\2\u0192"+
		"\u0193\7\60\2\2\u0193\u0195\5\u0081A\2\u0194\u018b\3\2\2\2\u0194\u0190"+
		"\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0198\t\r\2\2\u0197\u0199\t\16\2\2"+
		"\u0198\u0197\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019c"+
		"\5\u0085C\2\u019b\u019d\t\f\2\2\u019c\u019b\3\2\2\2\u019c\u019d\3\2\2"+
		"\2\u019d^\3\2\2\2\u019e\u01a3\7$\2\2\u019f\u01a2\n\17\2\2\u01a0\u01a2"+
		"\5\177@\2\u01a1\u019f\3\2\2\2\u01a1\u01a0\3\2\2\2\u01a2\u01a5\3\2\2\2"+
		"\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a6\3\2\2\2\u01a5\u01a3"+
		"\3\2\2\2\u01a6\u01a7\7$\2\2\u01a7`\3\2\2\2\u01a8\u01a9\7p\2\2\u01a9\u01aa"+
		"\7w\2\2\u01aa\u01ab\7n\2\2\u01ab\u01ac\7n\2\2\u01acb\3\2\2\2\u01ad\u01ae"+
		"\7*\2\2\u01aed\3\2\2\2\u01af\u01b0\7+\2\2\u01b0f\3\2\2\2\u01b1\u01b2\7"+
		"}\2\2\u01b2h\3\2\2\2\u01b3\u01b4\7\177\2\2\u01b4j\3\2\2\2\u01b5\u01b6"+
		"\7]\2\2\u01b6l\3\2\2\2\u01b7\u01b8\7_\2\2\u01b8n\3\2\2\2\u01b9\u01ba\7"+
		"=\2\2\u01bap\3\2\2\2\u01bb\u01bc\7.\2\2\u01bcr\3\2\2\2\u01bd\u01be\7\60"+
		"\2\2\u01bet\3\2\2\2\u01bf\u01c3\t\20\2\2\u01c0\u01c2\t\21\2\2\u01c1\u01c0"+
		"\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4"+
		"v\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c6\u01c8\t\22\2\2\u01c7\u01c6\3\2\2\2"+
		"\u01c8\u01c9\3\2\2\2\u01c9\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cb"+
		"\3\2\2\2\u01cb\u01cc\b<\2\2\u01ccx\3\2\2\2\u01cd\u01ce\7\61\2\2\u01ce"+
		"\u01cf\7,\2\2\u01cf\u01d3\3\2\2\2\u01d0\u01d2\13\2\2\2\u01d1\u01d0\3\2"+
		"\2\2\u01d2\u01d5\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d4"+
		"\u01d6\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d6\u01d7\7,\2\2\u01d7\u01d8\7\61"+
		"\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01da\b=\2\2\u01daz\3\2\2\2\u01db\u01dc"+
		"\7\61\2\2\u01dc\u01dd\7\61\2\2\u01dd\u01e1\3\2\2\2\u01de\u01e0\n\23\2"+
		"\2\u01df\u01de\3\2\2\2\u01e0\u01e3\3\2\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2"+
		"\3\2\2\2\u01e2\u01e4\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e4\u01e5\b>\2\2\u01e5"+
		"|\3\2\2\2\u01e6\u01e8\t\24\2\2\u01e7\u01e9\t\16\2\2\u01e8\u01e7\3\2\2"+
		"\2\u01e8\u01e9\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01eb\5\u0085C\2\u01eb"+
		"~\3\2\2\2\u01ec\u01ed\7^\2\2\u01ed\u0202\t\25\2\2\u01ee\u01f3\7^\2\2\u01ef"+
		"\u01f1\t\26\2\2\u01f0\u01ef\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f2\3"+
		"\2\2\2\u01f2\u01f4\t\7\2\2\u01f3\u01f0\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4"+
		"\u01f5\3\2\2\2\u01f5\u0202\t\7\2\2\u01f6\u01f8\7^\2\2\u01f7\u01f9\7w\2"+
		"\2\u01f8\u01f7\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fa\u01fb"+
		"\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fd\5\u0083B\2\u01fd\u01fe\5\u0083"+
		"B\2\u01fe\u01ff\5\u0083B\2\u01ff\u0200\5\u0083B\2\u0200\u0202\3\2\2\2"+
		"\u0201\u01ec\3\2\2\2\u0201\u01ee\3\2\2\2\u0201\u01f6\3\2\2\2\u0202\u0080"+
		"\3\2\2\2\u0203\u020c\5\u0083B\2\u0204\u0207\5\u0083B\2\u0205\u0207\7a"+
		"\2\2\u0206\u0204\3\2\2\2\u0206\u0205\3\2\2\2\u0207\u020a\3\2\2\2\u0208"+
		"\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020b\3\2\2\2\u020a\u0208\3\2"+
		"\2\2\u020b\u020d\5\u0083B\2\u020c\u0208\3\2\2\2\u020c\u020d\3\2\2\2\u020d"+
		"\u0082\3\2\2\2\u020e\u020f\t\5\2\2\u020f\u0084\3\2\2\2\u0210\u0218\t\27"+
		"\2\2\u0211\u0213\t\30\2\2\u0212\u0211\3\2\2\2\u0213\u0216\3\2\2\2\u0214"+
		"\u0212\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0217\3\2\2\2\u0216\u0214\3\2"+
		"\2\2\u0217\u0219\t\27\2\2\u0218\u0214\3\2\2\2\u0218\u0219\3\2\2\2\u0219"+
		"\u0086\3\2\2\2/\2\u012a\u012f\u0134\u0137\u0139\u013c\u0144\u0148\u014b"+
		"\u0151\u0158\u015c\u015f\u0167\u016b\u016e\u0173\u0177\u017a\u017d\u0182"+
		"\u0185\u0187\u018d\u0190\u0194\u0198\u019c\u01a1\u01a3\u01c3\u01c9\u01d3"+
		"\u01e1\u01e8\u01f0\u01f3\u01fa\u0201\u0206\u0208\u020c\u0214\u0218\3\b"+
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