package kit.org.kata;

/**
 * Given a string, you have to return a string in which each character (case-sensitive) is repeated once.
 * <pre>
 * "String"      -> "SSttrriinngg"
 * "Hello World" -> "HHeelllloo  WWoorrlldd"
 * "1234!_ "     -> "11223344!!__  "
 * </pre>
 */
public class DoubleChar {
    /**
     * Default constructor for DoubleChar.
     */
    public DoubleChar() {

    }

    /**
     * Given a string, you have to return a string in which each character (case-sensitive) is repeated once.
     *
     * @param s the random string.
     * @return of result after this method.
     */
    public static String doubleChar(String s) {
        StringBuilder result = new StringBuilder(s.length() * 2);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            result.append(c).append(c);
        }
        return result.toString();
    }
}
