package oct.ex_21102024_wrapper_exception;

public class Lab172_Exception {
    public static void main(String[] args) {

        int a = 10;
        int c = a/0; // java.lang.ArithmeticException - terminated
        System.out.println(c);
        System.out.println("END"); // it will never run the program
    }
}
