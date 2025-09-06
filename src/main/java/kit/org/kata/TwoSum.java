package kit.org.kata;

import java.util.HashMap;
import java.util.Map;

/**
 For the purposes of this kata, some tests may have multiple answers; any valid solutions will be accepted.

 * The input will always be valid (numbers will be an array of length 2 or greater, and all of the items will be numbers;
 * target will always be the sum of two different items from that array).

 *  Based on: https://leetcode.com/problems/two-sum/
 * <pre>
 * two_sum([1, 2, 3], 4) == {0, 2}
 * two_sum([3, 2, 4], 6) == {1, 2}
 * </pre>
 */
public class TwoSum {
    /**
     * Default constructor for TwoSum.
     */
    public TwoSum() {

    }

    /**
     * Write a function that takes an array of numbers (integers for the tests) and a target number.
     * It should find two different items in the array that, when added together, give the target value.
     * The indexes of these items should then be returned in a tuple / list (depending on your language) like so: (index1, index2).
     *
     * @param numbers the random array int.
     * @return the random array int.
     */
    public static int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> entities = new HashMap<>();
        for (int i = 0; i < numbers.length; i ++) {
            int diff = target - numbers[i];
            if (entities.containsKey(diff)) {
                return new int[] {entities.get(diff), i};
            }
            entities.put(numbers[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
