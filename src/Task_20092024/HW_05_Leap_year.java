package Task_20092024;

import java.util.Scanner;

public class HW_05_Leap_year {
    public static void main(String[] args) {
        // Leap year programme 2024
        // check if the year is a leap year
        // step1
        // year - 2024
        // output - string

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = sc.nextInt();

        if (year%4 == 0 && year%100 != 0 || year%400 == 0){
            System.out.println("is a leap year");
        }else {
            System.out.println("is not a leap year");
        }
    }
}
