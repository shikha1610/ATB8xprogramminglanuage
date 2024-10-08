package sept.ex_27092024;

public class Lab116_do_while {
    public static void main(String[] args) {
        // while -> int -> condition -> body -> increment/decrement
        // do while -> int -> body -> condition -> increment/decrement
        int a = 0;
        do{
            System.out.println("Print" +a);
            a++;
        }while (a<10);
    }
}
