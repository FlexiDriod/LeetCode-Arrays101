import java.util.*;

public class palindrome {
    public static void main(String args[]) {
        Integer originalNum;
        String originalString;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        originalNum = sc.nextInt();
        sc.nextLine();  //? Consume the newline
        System.out.println("Enter the string: ");
        originalString = sc.nextLine();
        sc.close();

        //^ Integer palindrome Check
        Is_NUmber_Palindrome(originalNum);

        //^ String palindrome Check
        Is_String_Palindrome(originalString);

    }

    private static void Is_String_Palindrome(String originalString) {
        String reverse = new StringBuilder(originalString).reverse().toString();
        if (originalString.equals(reverse)) {
            System.out.println("String is palindrome..");
        }
    }

    private static void Is_NUmber_Palindrome(Integer num) {
        String original = num.toString();
        String reverse = new StringBuilder(original).reverse().toString();

        if (original.equals(reverse)) {
            System.out.println("Number is palindrome..");
            System.out.println();
        }
    }
}
