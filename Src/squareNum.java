


/**
 *
 * @author Sudip
 */

// Create an Array of "int" data type and put the first 10 square numbers into it.

public class squareNum {
    
    public static void main(String...args){
        int sqrNum[] = new int[10];
        
        System.out.println("[INFO] Injecting first 10 square numbers into \"sqrNum\" array.");
        for(int i = 0; i < sqrNum.length; i++){
           sqrNum[i] = (i + 1) * (i + 1);
        }
        System.out.println("[DEBUG]Extract first 10 square numbers from \"sqrNum\" array.");
        
        for (int i : sqrNum){
            System.out.print(i + " ");
        }
        
    }
}
