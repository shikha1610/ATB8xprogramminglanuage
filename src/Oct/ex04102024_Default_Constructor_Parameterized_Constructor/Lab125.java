package Oct.ex04102024_Default_Constructor_Parameterized_Constructor;

public class Lab125 {
    public static void main(String[] args) {
        AHuman amit = new AHuman();
        AHuman pramod = new AHuman("Pramod");
        AHuman vijay = new AHuman("Vijay");
        System.out.println(amit.planet);
        System.out.println(pramod.planet);



        System.out.println(amit.name);
        System.out.println(pramod.name); // Pramod
        System.out.println(vijay.name); // Vijay

    }
}