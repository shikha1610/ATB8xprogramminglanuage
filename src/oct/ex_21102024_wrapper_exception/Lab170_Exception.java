package oct.ex_21102024_wrapper_exception;

public class Lab170_Exception {
    public static void main(String[] args) {
        System.out.println("Start of the program");
        String ip = args[0];//output ->10
        String ip1 = args[1]; //11
        String ip2 = args[2]; //12
        String ip3 = args[3]; // ArrayIndexOutOfBoundsException
        System.out.println(ip);
        System.out.println(ip1);
        System.out.println(ip2);

    }
}
