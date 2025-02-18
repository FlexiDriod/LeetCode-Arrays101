/*
 * Given an integer array nums sorted in non-decreasing order, 
 * return an array of the squares of each number sorted in non-decreasing order.
 */


import java.util.Arrays;

/**
 *
 * @author Sudip
 */
public class SquaresSortedArr {

    public static int[] sortedSquares(int... nums) {
        int[] capacity = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            capacity[i] = nums[i] * nums[i];
        }
        Arrays.sort(capacity);
        return capacity;
    }

    public static void main(String... args) {
        int[] out = sortedSquares(-4, -1, 0, 3, 10);
        for (int item : out) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
