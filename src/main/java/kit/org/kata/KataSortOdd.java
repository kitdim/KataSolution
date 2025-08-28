package kit.org.kata;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 You have to sort the odd numbers in ascending order while leaving the even numbers at their original positions.

 Examples
 * <pre>
 * [7, 1]  =>  [1, 7]
 * [5, 8, 6, 3, 4]  =>  [3, 8, 6, 5, 4]
 * [9, 8, 7, 6, 5, 4, 3, 2, 1, 0]  =>  [1, 8, 3, 6, 5, 4, 7, 2, 9, 0]
 * </pre>
 */
public class KataSortOdd {
    /**
     * Default constructor for KataSortOdd.
     */
    public KataSortOdd() {

    }

    /**
     *  You need return the even numbers at their original positions.
     *
     * @param array the random array.
     * @return the even numbers at their original positions.
     */
    public static int[] sortArray(int[] array) {
        List<Integer> oddArray = new LinkedList<>();
        for (int j : array) {
            if (j % 2 != 0) {
                oddArray.add(j);
            }
        }
        Collections.sort(oddArray);

        int[] result = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            boolean maybeOdd = array[i] % 2 != 0;

            if (maybeOdd) {
                result[i] = oddArray.remove(0);
            } else {
                result[i] = array[i];
            }
        }

        return result;
    }
}
