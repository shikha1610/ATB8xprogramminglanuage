package oct.ex_21102024_wrapper_exception;

public class Lab167 {
    public static void main(String[] args) {
        // Primitive to wrapper class
        int a = 10;
        Integer b = a; // Boxing means (small) integer converting into (small) integer
        System.out.println((b)); // output -> 10
        System.out.println(Integer.MAX_VALUE); // output - 2147483647
        System.out.println(Integer.MIN_VALUE); // output - -2147483648

        Integer a2 = 42;
        int value = a2; // Unboxing means (Big)Integer converting into (small) integer
        System.out.println(value);
    }
}
