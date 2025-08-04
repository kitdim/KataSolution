package kit.org.kata;

/**
 * Changes all but the last four characters into '#'.
 * <p>
 * Usually when you buy something, you're asked whether your credit card number, phone number or answer to your most secret question is still correct. However, since someone could look over your shoulder, you don't want that shown on your screen. Instead, we mask it.
 *
 * <pre>
 * Example usage:
 * "4556364607935616" --> "############5616"
 * "64607935616" -->      "#######5616"
 * "1" -->                "1"
 * "" -->                 ""
 * </pre>
 */
public class CreditCardMask {
    /**
     * Default constructor for CreditCardMask.
     */
    public CreditCardMask() {

    }

    /**
     * Changes all but the last four characters into '#'.
     *
     * @param str the random string.
     * @return the changes all but the last four characters into '#'.
     */
    public static String maskify(String str) {
        if (str.length() <= 4) {
            return str;
        }
        StringBuilder result = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            result.append(i < str.length() - 4 ? '#' : str.charAt(i));
        }

        return result.toString();
    }
}
