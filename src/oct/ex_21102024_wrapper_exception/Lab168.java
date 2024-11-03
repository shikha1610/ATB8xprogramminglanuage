package oct.ex_21102024_wrapper_exception;

public class Lab168 {
    public static void main(String[] args) {
        String num = "10";
        //int a = num; // Non primitive cannot convert into primitive
        Integer a = Integer.valueOf(num); // wrapper class
        System.out.println(a); // output - 10
        int a2 = a; // unboxing
        // 3 steps to follow
        //convert string to integer
        //integer wrapper
        //wrapper to unboxing

        //String to Primitive?
        int a3 = Integer.parseInt(num);

        //int a = 10; -> these are not class or object
        //Integer -> Collection Framework (You can use class and object)
    }
}
