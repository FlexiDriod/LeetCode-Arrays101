/*
 * Find Numbers with Even Number of Digits
 */


/**
 *
 * @author Sudip
 */
public class findEvenDigitsNum {    
    public static int findNumbers(int...nums) {
        int countEven = 0;
        for(int item : nums){
            int digitCount = 0;
            int temp = item;
            
            while(temp!=0){      
               temp/=10;  // Removes the last digit
               digitCount+=1;
            }
            
            countEven = (digitCount%2 == 0) ? countEven+1 : countEven;
        }
        return countEven;        
    }
    public static void main(String...args){
        int num = findNumbers(4, 45, 897, 2578, 10);
        System.out.println("Even digits numbers: "+num);
    }
}
