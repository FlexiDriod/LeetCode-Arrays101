import java.util.Scanner;

/*
 * Naive Recursive Approach
 */
public class FiboNacci {
    public static void main(String args[]) {
        final int f1 = 1, f0 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the final term: ");

        int num = sc.nextInt();
        sc.close();

        System.out.println("Fibonacci of " + num + " is " + Cal_Fibonacci(num, f0, f1));
    }

    private static int Cal_Fibonacci(int num, int... args) {

        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        }

        /*
         * " args.length > 0 " → Checks if args "has at least one" element.
         * ^ If true, it means args has at least one value, so args[0] exists.
         * ! If false, args is empty, so we use 0 instead.
         */
        int f0 = args.length > 0 ? args[0] : 0;
        int f1 = args.length > 1 ? args[1] : 1;

        for (int i = 2; i <= num; i++) {
            int n = f1 + f0; // * Calculate next number
            f0 = f1;
            f1 = n;
        }

        return f1;
    }

}