/* 
 *  Reverse a string without using built-in functions.
*/

import java.util.*;

public class reverseString {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the sentence: ");
        String usrString = sc.nextLine();
        sc.close();

        String revStr = "";

        for (int i = usrString.length()-1; i>=0; i--) {
            revStr += usrString.charAt(i);
        }
        System.out.println("\nAfter Reversing: " + revStr);

    }
}
