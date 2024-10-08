package Task_27092024;

public class HW_03_sum_of_numbers_1to100_do_while_loop {
    public static void main(String[] args) {
        int sum = 0; // Variable to hold the sum
        int i = 1;   // starting point

        do{
            sum+=i; // add i to sum
            i++;    // increment
        }while (i<=100); // continue until i is gretaer than 100

        System.out.println("The sum of numbers from 1 to 100 is: " + sum);
    }
}
