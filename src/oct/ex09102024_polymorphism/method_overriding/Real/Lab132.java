package oct.ex09102024_polymorphism.method_overriding.Real;

public class Lab132 {
    public static void main(String[] args) {
//        Pramod p = new Pramod();
//        p.home();
//
//        Father f = new Father();
//        f.home();

        // Dynamic Dispatch
        Father object = new Pramod();
        object.home();

        // WebDriver driver = new ChromeDriver();

        // Pramod object = new Father(); ---- not possible case
    }
}
