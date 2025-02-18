


/**
 *
 * @author Sudip
 */
public class findMaxConsecutiveOne {
    
    /**
     * When an Array is given as a parameter, 
     * without any additional information, 
     * we can safely assume that "length == capacity". 
    */
    
    /**
     * The capacity/length is a 
     * number of items, not a highest index. 
     * Highest index is (.length - 1) 
    */
    
    /**
     * @param nums
    */
    private static void longest_Consecutive_Squence(int...nums) {
        int maxCount = 0; int currentCount = 0;
        for(int i : nums){
            currentCount = (i == 1) ? currentCount+1 : 0;
            maxCount = Math.max(maxCount, currentCount);
        }
        System.out.println("Longest consecutive numbers: "+maxCount);
    }
    
    public static void main(String...args){
       longest_Consecutive_Squence(1, 0, 1, 1, 0, 1, 1, 1);
 
    }
}
