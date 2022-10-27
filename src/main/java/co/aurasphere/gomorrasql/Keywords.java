package co.aurasphere.gomorrasql;

import java.util.Arrays;
import java.util.List;

/**
 * Keywords used by GomorraSQL.
 * 
 * @author Donato Rimenti
 * Modified By 
 * @Kristian-Buriasco
 * Keywords By
 * @Kristian-Buriasco @Brick178
 */
public class Keywords {

	public final static String SELECT_KEYWORD = "ciapa";
	public final static String UPDATE_KEYWORD = "rifuma";
	public final static String[] INSERT_KEYWORDS = { "campa","'ndrinta"};
	public static final String[] DELETE_KEYWORDS = { "fuma", "'ngran'", "casin" };
	public static final String JOIN_KEYWORD = "taca";
	public static final String[] FROM_KEYWORDS = { "da", "'ndrinta"};
	public final static String WHERE_KEYWORD = "'ndua";
	public final static String BEGIN_TRANSACTION_KEYWORD = "'nduma";
	public final static String COMMIT_KEYWORD = "scuta";
	public final static String[] ROLLBACK_KEYWORDS= { "turnuma", "'ndaré"};
	public final static String AND_KEYWORD = "e";
	public final static String OR_KEYWORD = "o";
	public final static String NULL_KEYWORD = "gnun";
	public final static String IS_KEYWORD = "l'è";
	public final static String VALUES_KEYWORD = "chist"; // da trovare con nome piemontese
	public final static String[] IS_NOT_KEYWORDS = { "l'è", "nen" };
	public final static String SET_KEYWORD = "buta";
	public final static List<String> WHERE_OPERATORS = Arrays.asList(">", "<", "=", "!=", "<>", ">=", "<=",
			Keywords.IS_KEYWORD, Keywords.IS_NOT_KEYWORDS[0]);
			// da vedere se si puo modificare individualmente per ogni operatore
	public final static String SET_EQUAL_KEYWORD = "parèj";
}
