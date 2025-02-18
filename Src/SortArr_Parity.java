/*
 * Given an integer array nums, move all the even integers
 * at the beginning of the array followed by all the odd integers.
*/
/*
 * Input: nums = [3,1,2,4]
 * Output: [2,4,3,1]
^ Explanation: Acceptable outputs are [4,2,3,1], [2,4,1,3], [2,4,3,1] and [4,2,1,3]
*/

public class SortArr_Parity {

    public int[] sortArrayByParity(int[] nums) {
        int evenIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) { 
                // Swap nums[i] (even) with nums[evenIndex]
                int temp = nums[i];
                nums[i] = nums[evenIndex];
                nums[evenIndex] = temp;

                evenIndex++;  // Move evenIndex forward
            }
        }
        return nums; // Return the sorted array
    }

    public static void main(String[] args) {
        
    }
}
