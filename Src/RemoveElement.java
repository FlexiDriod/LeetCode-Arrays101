import java.util.Arrays;

public class RemoveElement {
    public int removeElement(int val, int...nums) {
        int k = 0;
            for(int i = 0; i < nums.length; i++){
                    if(nums[i] != val){
                            nums[k] = nums[i];
                            k += 1;
                    }
            }
        return k;
    }

    public static void main(String[] args) {
        RemoveElement obj = new RemoveElement();
        int[] nums = {1, 2, 5, 2, 8, 7, 15, 2};
       int k = obj.removeElement(2, nums);

       System.out.println("New array length: " + k);
        System.out.println("Modified array: " + Arrays.toString(Arrays.copyOf(nums, k)));
    
    }
}
