package oct.ex_18102024_string_wrapper;

public class Lab160_String_Equals {
    public static void main(String[] args) {
        String s1 = "Hello"; // SCP
        String s4 = "Hello"; // SCP
        String s2 = new String("Hello"); // Object Area
        String s3 = new String("Hello"); // Object Area
        String s5 = new String("hello"); // Object Area

//        System.out.println(s1 == s2); // false
//        System.out.println(s2 == s3); // false
//        System.out.println(s1 == s4); // true
        // == this is checking reference location but in case of integer it checks the value

        // How can i check the value? equals == value
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equalsIgnoreCase(s5));


    }
}
