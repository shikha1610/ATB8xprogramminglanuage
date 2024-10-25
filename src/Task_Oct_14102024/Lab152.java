package Task_Oct_14102024;

public class Lab152 {
    public static void main(String[] args) {
        //Book book = new Book(); // it cannot happen coz object can't be created for the abstract class
        //Book book = new PrintMyBook("Pramod", "PD", 123);
        PrintMyBook book = new PrintMyBook("Pramod","PD",123);
        book.getDetails();
    }


}
