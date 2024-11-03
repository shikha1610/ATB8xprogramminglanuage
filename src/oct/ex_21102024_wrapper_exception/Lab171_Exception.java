package oct.ex_21102024_wrapper_exception;

import java.io.FileInputStream;

public class Lab171_Exception {
    public static void main(String[] args) {

        //Checked - JVM knows
        //FileInputStream file = new FileInputStream("C://a.txt");
        //JVM knows this that file may not exist


        //Unchecked Exception - ArithmeticException
        int a = 10;
        int c = a/0;
        System.out.println(c);


    }
}
