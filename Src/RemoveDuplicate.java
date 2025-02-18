import java.util.Arrays;

public class RemoveDuplicate {
    
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0 || nums == null) {
            return 0; // Handle empty array case
        }

        int k = 1; // First element is always unique, so start from index 1

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i]; // Place the unique element at the next position
                k++; // Increment the count of unique elements
            }
        }
        return k;
    }

    public static void main(String[] args) {
        RemoveDuplicate obj = new RemoveDuplicate();
        
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5}; // Example input
        
        int k = obj.removeDuplicates(nums); // Call the method
        
        // Print the unique elements
        System.out.println("Unique elements: " + Arrays.toString(Arrays.copyOf(nums, k)));
        System.out.println("Number of unique elements: " + k);
    }
}
