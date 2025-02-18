import java.util.Scanner;

public class addNum {
    public static void main(String...args) {
        int num1=0, num2=0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        num2 = sc.nextInt();
        sc.close();
        System.out.println("Addition of "+num1+" + "+num2+" is: "+ (num1+num2));
    }
}