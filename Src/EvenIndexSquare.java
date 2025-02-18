/*
 * Given an Array of integers, 
 * return an Array where every element 
 * at an even-indexed position is squared.
*/

/*
 * Input: array = [9, -2, -9, 11, 56, -12, -3]
 * Output: [81, -2, 81, 11, 3136, -12, 9]
*/

public class EvenIndexSquare {
    
    public int[] evenSquare(int...arr){
        if (arr == null) {
            return null;
        }

        // for (int i = 0; i < arr.length; i+=2)
        for (int i = 0; i < arr.length; i++) {

            // arr[i] *= arr[i];  -- If previous for loop use then

            if(i%2 == 0){
                arr[i] *= arr[i];
            }
        }
        return arr;
    } 

    public static void main(String[] args) {
        EvenIndexSquare es = new EvenIndexSquare();
        int[] output = es.evenSquare(9,-2, -9, 11, 56, -12, -3);
        for (int i : output) {
            System.out.print(i + " ");
        }
    }
}
