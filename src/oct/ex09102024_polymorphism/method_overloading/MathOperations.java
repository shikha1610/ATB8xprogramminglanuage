package oct.ex09102024_polymorphism.method_overloading;

public class MathOperations {

    // Method Overloading
    int add(int a, int b){
        return a+b;
    }

    String add (String a, String b){
        return a+b;
    }

    void add(int a, int b, int c) {
        System.out.println("Hello");
    }

    double add(double a, double b) {
        return a + b;
    }

    double add(double a, double b, float f) {
        return a + b + f;
    }



}
