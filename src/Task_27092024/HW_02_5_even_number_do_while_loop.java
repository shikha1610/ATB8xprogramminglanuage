package Task_27092024;

public class HW_02_5_even_number_do_while_loop {
    public static void main(String[] args) {
        // print the first 5even numbers
        int count = 1;
        int number = 2;

        do{
            System.out.println(number);
            number +=2;
            count++;
        }while (count<5);
    }
}
