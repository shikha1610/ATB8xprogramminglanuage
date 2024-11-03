package oct.ex_23102024_exception;

public class lab181_Interview_Exception {
    public static void main(String[] args) {
        final double pi = 3.14F;
        int a = 0;
        try{
            int x = 10/a;
        }catch(Exception e){
            System.out.println("div by zero");
        }finally{
            System.out.println("I will be executed anyHow!!");
        }
    }
}
