package oct.ex_21102024_wrapper_exception;

public class Lab173_Exception {
    public static void main(String[] args) {

// Unchecked - java.lang.NullPointerException
        //JVM - at the runtime -> terminated the program
        String s1 = null;
        System.out.println(s1.trim()); // Lab173_Exception.java:10
        System.out.println("END");
    }
}
