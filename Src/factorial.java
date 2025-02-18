import java.util.*;
public class factorial {
    public static void main(String[] args) {
        int number=0; long factorial=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        number = sc.nextInt();
        sc.close();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }

        while (number!=0) {
            factorial *=number;
            --number;
        }
        System.out.println("Factorial: " + factorial);
    }
}
