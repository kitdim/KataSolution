package kit.org.kata;

/**
 Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case-insensitive.
 The string can contain any char.

 Examples
 * <pre>
 * XO("ooxx") => true
 * XO("xooxx") => false
 * XO("ooxXm") => true
 * XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
 * XO("zzoo") => false
 * </pre>
 */
public class XO {
    /**
     * Default constructor for XO.
     */
    public XO() {

    }

    /**
     * Given an array of integers, find the one that appears an odd number of times.
     *
     * @param str the random string, the string can contain any char.
     * @return the method must return a boolean.
     */
    public static boolean getXO(String str) {
        char[] chars = str.toLowerCase().toCharArray();
        int countX = 0;
        int countO = 0;

        for (char someVal : chars) {
            switch (someVal) {
                case 'x':
                    countX++;
                    break;
                case 'o':
                    countO++;
                    break;
                default:
                    break;
            }
        }

        return countO == countX;
    }
}
