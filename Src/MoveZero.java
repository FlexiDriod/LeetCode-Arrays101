/*
 * Given an integer array nums,
 * move all 0's to the end of it 
 * while maintaining the relative order of the non-zero elements.
*/

public class MoveZero {

    public void moveZeroes(int...nums) {
        int len = nums.length;
        int nonZeroIndex = 0;

        for (int i = 0; i < len; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex += 1;
            }
        }

        while (nonZeroIndex < len) {
            nums[nonZeroIndex] = 0;
            nonZeroIndex++;
        }

        System.out.print("[DEBUG] After moving zeros: \n");
        for (int i : nums) {
            System.out.print(i + " ");
        }

    }

    public static void main(String[] args) {
        new MoveZero().moveZeroes(0, 1, 0, 2, 3, 5);
    }
}
