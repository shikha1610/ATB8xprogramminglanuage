package oct.ex_21102024_wrapper_exception;

public class Lab174_Exception {
    public static void main(String[] args) {

        int c = 10;
        try {
            c = 10/c;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e); // /by zero
        }

        try{
            String s1 = null;
            s1.trim();
        } catch(NullPointerException e){
            throw new RuntimeException(e);
        }
        System.out.println("end");
    }
}
