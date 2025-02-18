/*
 ! Sieve of Eratosthenes --> To find all prime numbers up to a certain number N

 * Create a boolean array of size N + 1 where each index represents a number.
 
 * Mark all numbers as prime initially, except 0 and 1.

 * Starting from 2, mark all multiples of each number as non-prime.

 * The remaining numbers in the array are prime.
*/

import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        // Check if the number is prime
        if (isPrime(num)) {
                    System.out.println("\n"+ num + " is a prime number.");
                } else {
                    System.out.println("\n"+ num + " is not a prime number.");
                }
                
                System.out.print("\nPrime numbers up to " + num + ": ");
                Sieve_of_Eratosthenes(num);
            }
        
            private static boolean isPrime(int num) {
                if (num <= 1) {
                    return false; //* 0 and 1 are not prime numbers
                }
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        return false; //* Divisible by any number other than 1 and itself
                    }
                }
                return true; // The number is prime
            }
        
            private static void Sieve_of_Eratosthenes(int num) {
        //^ Boolean array of size N + 1
        Boolean prime[] = new Boolean[num+1];

        //^ Mark all numbers as prime initially
        for(int i = 0; i<=num; i++){
            prime[i] = true;
        }
        //^ Except 0 and 1
        prime[0] = prime[1] = false;


        for(int mult=2; (mult*mult) <= num; mult++){
            if (prime[mult]) {
                /*
                 ^  Mark all multiplies of "mult" as non-prime
                 */
                for(int i = mult*mult; i<=num; i=mult+i){
                    prime[i] = false;
                }
            }
        }

        //^ To print prime numbers upto specific number
        for(int i = 2; i<=num; i++){
            if (prime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}