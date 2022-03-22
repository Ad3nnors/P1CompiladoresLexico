// Generated from plexico\PLexer.g4 by ANTLR 4.7.2
package plexico;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PALAVRA_CEAVE=1, NUMREAL=2, NUMINT=3, VARIAVEL=4, CADEIA=5, WS=6, OP_REL=7, 
		OP_ARIT=8, DELIM=9, ABREPAR=10, FECHAPAR=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PALAVRA_CEAVE", "NUMREAL", "NUMINT", "VARIAVEL", "CADEIA", "WS", "OP_REL", 
			"OP_ARIT", "DELIM", "ABREPAR", "FECHAPAR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "':'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PALAVRA_CEAVE", "NUMREAL", "NUMINT", "VARIAVEL", "CADEIA", "WS", 
			"OP_REL", "OP_ARIT", "DELIM", "ABREPAR", "FECHAPAR"
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


	public PLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\r\u009e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2d\n\2\3\3\6\3g\n\3\r\3\16\3h\3\3\3\3"+
		"\6\3m\n\3\r\3\16\3n\5\3q\n\3\3\4\6\4t\n\4\r\4\16\4u\3\5\3\5\7\5z\n\5\f"+
		"\5\16\5}\13\5\3\6\3\6\7\6\u0081\n\6\f\6\16\6\u0084\13\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0095\n\b\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\2\2\r\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\3\2\7\3\2\62;\4\2C\\c|\5\2\62;C\\c|\5\2\13\f\17\17\"\"\5\2"+
		",-//\61\61\2\u00b6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\3c\3\2\2\2\5f\3\2\2\2\7s\3\2\2\2\tw\3\2\2\2\13~\3\2\2"+
		"\2\r\u0087\3\2\2\2\17\u0094\3\2\2\2\21\u0096\3\2\2\2\23\u0098\3\2\2\2"+
		"\25\u009a\3\2\2\2\27\u009c\3\2\2\2\31\32\7F\2\2\32\33\7G\2\2\33\34\7E"+
		"\2\2\34\35\7N\2\2\35\36\7C\2\2\36\37\7T\2\2\37 \7C\2\2 !\7E\2\2!\"\7Q"+
		"\2\2\"#\7G\2\2#d\7U\2\2$%\7C\2\2%&\7N\2\2&\'\7I\2\2\'(\7Q\2\2()\7T\2\2"+
		")*\7K\2\2*+\7V\2\2+,\7O\2\2,d\7Q\2\2-.\7K\2\2./\7P\2\2/d\7V\2\2\60\61"+
		"\7T\2\2\61\62\7G\2\2\62\63\7C\2\2\63d\7N\2\2\64\65\7C\2\2\65\66\7V\2\2"+
		"\66\67\7T\2\2\678\7K\2\289\7D\2\29:\7W\2\2:;\7K\2\2;d\7T\2\2<d\7C\2\2"+
		"=>\7N\2\2>?\7G\2\2?d\7T\2\2@A\7K\2\2AB\7O\2\2BC\7R\2\2CD\7T\2\2DE\7K\2"+
		"\2EF\7O\2\2FG\7K\2\2Gd\7T\2\2HI\7U\2\2Id\7G\2\2JK\7G\2\2KL\7P\2\2LM\7"+
		"V\2\2MN\7C\2\2Nd\7Q\2\2OP\7G\2\2PQ\7P\2\2QR\7S\2\2RS\7W\2\2ST\7C\2\2T"+
		"U\7P\2\2UV\7V\2\2Vd\7Q\2\2WX\7K\2\2XY\7P\2\2YZ\7K\2\2Z[\7E\2\2[\\\7K\2"+
		"\2\\d\7Q\2\2]^\7H\2\2^_\7K\2\2_d\7O\2\2`d\7G\2\2ab\7Q\2\2bd\7W\2\2c\31"+
		"\3\2\2\2c$\3\2\2\2c-\3\2\2\2c\60\3\2\2\2c\64\3\2\2\2c<\3\2\2\2c=\3\2\2"+
		"\2c@\3\2\2\2cH\3\2\2\2cJ\3\2\2\2cO\3\2\2\2cW\3\2\2\2c]\3\2\2\2c`\3\2\2"+
		"\2ca\3\2\2\2d\4\3\2\2\2eg\t\2\2\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2"+
		"\2\2ip\3\2\2\2jl\7\60\2\2km\t\2\2\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3"+
		"\2\2\2oq\3\2\2\2pj\3\2\2\2pq\3\2\2\2q\6\3\2\2\2rt\t\2\2\2sr\3\2\2\2tu"+
		"\3\2\2\2us\3\2\2\2uv\3\2\2\2v\b\3\2\2\2w{\t\3\2\2xz\t\4\2\2yx\3\2\2\2"+
		"z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\n\3\2\2\2}{\3\2\2\2~\u0082\7$\2\2\177"+
		"\u0081\13\2\2\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2"+
		"\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085"+
		"\u0086\7$\2\2\u0086\f\3\2\2\2\u0087\u0088\t\5\2\2\u0088\u0089\3\2\2\2"+
		"\u0089\u008a\b\7\2\2\u008a\16\3\2\2\2\u008b\u0095\7@\2\2\u008c\u008d\7"+
		"@\2\2\u008d\u0095\7?\2\2\u008e\u0095\7>\2\2\u008f\u0090\7>\2\2\u0090\u0095"+
		"\7?\2\2\u0091\u0092\7>\2\2\u0092\u0095\7@\2\2\u0093\u0095\7?\2\2\u0094"+
		"\u008b\3\2\2\2\u0094\u008c\3\2\2\2\u0094\u008e\3\2\2\2\u0094\u008f\3\2"+
		"\2\2\u0094\u0091\3\2\2\2\u0094\u0093\3\2\2\2\u0095\20\3\2\2\2\u0096\u0097"+
		"\t\6\2\2\u0097\22\3\2\2\2\u0098\u0099\7<\2\2\u0099\24\3\2\2\2\u009a\u009b"+
		"\7*\2\2\u009b\26\3\2\2\2\u009c\u009d\7+\2\2\u009d\30\3\2\2\2\13\2chnp"+
		"u{\u0082\u0094\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}