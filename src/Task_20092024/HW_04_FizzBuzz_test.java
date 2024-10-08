package Task_20092024;

import java.util.Scanner;

public class HW_04_FizzBuzz_test {
    public static void main(String[] args) {
        // FizzBuzz Problem
        // Write a program that prints numbers from 1 to n.(100)
        // However, for multiples of 3, print "Fizz" instead of the number,
        // and for multiples of 5, print "Buzz."
        // For numbers that are multiples of both 3 and 5,
        // print "FizzBuzz."

        // Logic Building

        // Step 1 -
        // input - int - n=100, - scanner class
        // output - string - Fizz, Buzz and Fizz Buzz


        // Step 2-
        // Rough Logic
        // for - int = 1 to i<=100 (n)
        // i - multiples of 3 - modulus - i%3 == 0 - Fizz
        // i - multiples of 5 - modulus - i%5 == 0 - Buzz
        // i - multiples of 3&5 - modulus - i%3 && i%5 == 0 - Fizz Buzz
        // if nothing matches - i


        // Step 3- Real Logic

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number n = 100");
        int num = sc.nextInt();

        for (int i = 1; i <= 100; i++){
                if (i % 3 == 0 && i % 5 == 0){
                    System.out.println("FizzBuzz");
                }else if (i % 3 == 0){
                    System.out.println("Fizz");
                }else if (i % 5 == 0){
                    System.out.println("Buzz");
                }else {
                    System.out.println(i);
                }
        }
    }


}