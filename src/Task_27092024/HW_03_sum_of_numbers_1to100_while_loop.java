package Task_27092024;

public class HW_03_sum_of_numbers_1to100_while_loop {
    public static void main(String[] args) {
        // calculate the sum of numbers 1 to 100
        int sum = 0;
        int i = 1;
        while (i<=100){
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}
