package Task_25092024;
import java.util.Scanner;

public class HW_03_prime_number {
    public static void main(String[] args) {
        //Prime Number from 1 to 100. (for loop)
        // A prime number is a number that can only be
        // divided by itself and 1 without remainders.

        boolean isprime = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int num = sc.nextInt();
        if (num<=1){
            System.out.println("Invalid number");
            return;
        }
        for (int i = 2;i<num;i++){
            if(num%1==0){
                isprime = false;
                break;
            }
        }

            if(isprime){
                System.out.println("number " + num + " is prime");
            }else{
                System.out.println("number " + num + " is not prime");
            }

                }
            }
