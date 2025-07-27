package kit.org.kata;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/**
 Given an array of integers, find the one that appears an odd number of times.

 There will always be only one integer that appears an odd number of times.

 Examples
 * <pre>
 * [7] should return 7, because it occurs 1 time (which is odd).
 * [0] should return 0, because it occurs 1 time (which is odd).
 * [1,1,2] should return 2, because it occurs 1 time (which is odd).
 * [0,1,0,1,0] should return 0, because it occurs 3 times (which is odd).
 * [1,2,2,3,3,3,4,3,3,3,2,2,1] should return 4, because it appears 1 time (which is odd).
 * </pre>
 */
public class FindOdd {
    /**
     * Default constructor for FindOdd.
     */
    public FindOdd() {

    }

    /**
     * Given an array of integers, find the one that appears an odd number of times.
     *
     * @param a the random array.
     * @return the one that appears an odd number of times.
     */
    public static int findIt(int[] a) {
        return Arrays.stream(a)
                .boxed()
                .collect(Collectors.groupingBy(
                        num -> num,
                        Collectors.counting()
                ))
                .entrySet().stream()
                .filter(entry -> entry.getValue() % 2 != 0)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElseThrow();

    }
}
