import java.util.Arrays;

public class CheckHeight {
     public int heightChecker(int...heights) {
         int[] cloned = Arrays.copyOf(heights, heights.length); // Clone the array
                Arrays.sort(cloned); // Sort the cloned array
            int count = 0;
            for(int i = 0; i < heights.length; i++){
                    if(heights[i] != cloned[i]){
                                   count++;
                     }  
            }
       return count;
    }

    public static void main(String[] args) {
        CheckHeight obj = new CheckHeight();

        int output = obj.heightChecker(1,1,4,2,1,3);
    
        System.out.println(output);
    }
}
