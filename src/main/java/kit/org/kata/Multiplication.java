package kit.org.kata;

/**
 Your task, is to create N×N multiplication table, of size provided in parameter.

 For example, when given size is 3:
 * <pre>
 * 1 2 3
 * 2 4 6
 * 3 6 9
 * </pre>
 *
 For the given example, the return value should be:
 * [[1,2,3],[2,4,6],[3,6,9]]
 */
public class Multiplication {
    /**
     * Default constructor for Multiplication.
     */
    public Multiplication() {

    }
    /**
     * Given an array of integers, find the one that appears an odd number of times.
     *
     * @param n the random int.
     * @return the method must return int [][].
     */
    public static int [][] multiplicationTable(int n){
        int[][] result = new int[n][n];

        for(int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++){
                result[i][j] = (i + 1) * (j + 1);
            }
        }
        return result;
    }
}
