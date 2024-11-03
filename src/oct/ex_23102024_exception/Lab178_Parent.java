package oct.ex_23102024_exception;

public class Lab178_Parent {
    public static void main(String[] args) {
        int b = 0; // ArithmeticException
        try{
            String ip = args[0]; // ArrayIndexOutOfBoundsException
            int a = Integer.parseInt(ip); // NumberFormatException
            b = 1000/a;
        } catch (Exception e){  // can use it's a bigger one than previous example
            System.out.println(e.getMessage());
        }
        catch(Throwable e) {
            System.out.println(e.getMessage());
        }
//        catch(Object e){ // can't use coz object is allowed
//            System.out.println(e.getMessage());
//        }
    }
}
