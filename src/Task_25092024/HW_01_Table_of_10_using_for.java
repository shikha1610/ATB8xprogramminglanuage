package Task_25092024;

    public class HW_01_Table_of_10_using_for {
            public static void main(String[] args) {
    /*
    Table of number n = 10, print table with For or while.
     */
                int num = 10; // You can change this value to any number
                System.out.println("Multiplication Table for " + num + ":");

                for (int i = 1; i <= 10; i++) {
                    System.out.println(num + " * " + i + " = " + (num * i));
                }
            }
        }
