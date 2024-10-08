package Task_27092024;

public class HW_02_5_even_numbers_while_using_modulus {
    public static void main(String[] args) {
        int count = 0;
        int num = 2;
        while(count<=5){
            if(num%2 ==0) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
}
