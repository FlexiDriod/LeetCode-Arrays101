import java.util.*;
public class FindDiesappearedNum {
    public List<Integer> findDisappearedNumbers(int...nums) {
        List<Integer> result = new ArrayList<>();
        
        // Step 1: Mark numbers by making them negative
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1; // Get index (1-based to 0-based)
            if (nums[index] > 0) {
                nums[index] = -nums[index]; // Mark as visited (negative)
            }
        }

        // Step 2: Find the missing numbers (positive values indicate missing indices)
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) { // If still positive, index+1 is missing
                result.add(i + 1);
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        List<Integer> output = new FindDiesappearedNum().findDisappearedNumbers(4,3,2,7,8,2,3,1);

        for (Integer i : output) {
            System.out.print(i + " ");
        }
    }
}
