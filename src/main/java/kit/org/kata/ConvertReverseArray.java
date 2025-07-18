package kit.org.kata;

/**
 * Convert number to reversed array of digits.
 * <p>
 * Given a random non-negative number, you have to return the digits of this number within an array in reverse order.
 *
 * <pre>
 * Example usage:
 * 35231 => [1,3,2,5,3]
 * 0     => [0]
 * </pre>
 */
public class ConvertReverseArray {
    /**
     * Default constructor for ConvertReverseArray.
     */
    public ConvertReverseArray() {

    }

    /**
     * Convert number to reversed array of digits.
     *
     * @param n the random non-negative number.
     * @return the digits of this number within an array in reverse order.
     */
    public static int[] digitize(long n) {
        if (n == 0) {
            return new int[]{0};
        }

        long num = Math.abs(n);
        int sizeInN = 0;
        long copyN = num;

        while (copyN != 0) {
            copyN /= 10;
            sizeInN++;
        }

        int[] res = new int[sizeInN];
        for (int i = 0; i < res.length; i++) {
            int elem = (int) (num % 10);
            res[i] = elem;
            num /= 10;
        }

        return res;
    }
}
