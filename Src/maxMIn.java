import java.util.*;

public class maxMIn {
    public static void main(String[] args) {
        int num1 = 0, num2 = 0, num3 = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");

        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        sc.close();

        int largest = (num1 > num2 && num1 > num3) ? num1 : (num2 > num3) ? num2 : num3;

        int smallest = (num1<num2 && num1<num3)?num1:(num2<num3)?num2:num3;

        System.out.println("Largest no.: " + largest);
        System.out.println("Smallest no.: " + smallest);

    }
}
