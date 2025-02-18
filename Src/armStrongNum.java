import java.util.Scanner;

public class armStrongNum {
    /*
     * Check whether a given number is an Armstrong number or not..
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the number: ");
        int num = sc.nextInt();
        sc.close();

        if (num == IsArmstrong(num)) {
            System.out.println("\nThis is an Armstrong number..\n");
        } else {
            System.out.println("This isn't an Armstrong number..\n");
        }

    }

    private static int IsArmstrong(int num) {
        int sum = 0;

        // * Pre-computed cubes from 0 to 9
        int cube0to9[] = new int[10];
        for (int n = 0; n < 10; n++) {
            cube0to9[n] = n * n * n;
        }

        while (num != 0) {
            int digit = num % 10;
            sum += cube0to9[digit];
            num /= 10;
        }
        return sum;
    }
}