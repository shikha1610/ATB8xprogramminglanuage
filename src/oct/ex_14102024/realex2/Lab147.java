package oct.ex_14102024.realex2;

public class Lab147 {
    public static void main(String[] args) {
        P p = new P();
        p.f1();

        // I i = new I();
    }
}

    class P implements I{

        @Override
        public void f1() {
            System.out.println("P");
        }
    }

    interface I{
        void f1();
    }

