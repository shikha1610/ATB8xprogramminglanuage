package Task_27092024;

public class HW_02_5_even_numbers_do_while_using_modulus {
    public static void main(String[] args) {
        int count = 0; // to keep track of how many even numbers we've printed
        int num = 2; // start from the first even number

        do{
            if (num%2 ==0) { // check if the number is even
                System.out.println(num); // print the current even number
                count++;   // Increment the count of even numbers printed
            }
            num++;        // move to the next number
        }while(count<5); // continue until we've printed 5 even numbers
    }
}
