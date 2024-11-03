package oct.ex_21102024_wrapper_exception;

public class Lab170_1_Exception {
    public static void main(String[] args) {
        System.out.println("Start of the program");
        String ip = args[0]; // 10 // ArrayIndexOutOfBoundsException
        int a = Integer.parseInt(ip); // 10 // NumberFormatException
        int b = 1000/a; // 100 // (0)ArithmeticException: / by zero
        System.out.println(b);// 100
        System.out.println("End of the Program");

        // JVM will be initialized (From RAM)
        //Creates and starts the main thread - Main Called
        //1) Collects the Command Line Arguments - 10
        // String[] args = {10} ->
        //2) Lab170_Exception.main()
        // Now control will be transferred from main thread to main method

        // when problem comes in main -> JVM
        // If you don't handle the exception JVM will handle it
        // Always terminate the program.

        //In case of string output will be different (means it will show error)
        // it cannt run in case of string
        // String ip = args[0]; // 10 // ArrayIndexOutOfBoundsException
        // int a = Integer.parseInt(ip); // 10
        // int b = 1000/a; // 100

    }
}
