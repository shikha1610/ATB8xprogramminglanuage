package oct.ex04102024_Default_Constructor_Parameterized_Constructor;

public class AHuman {
    String eyes_color;
    String planet = "AHuman";
    String name;
    long aadhar_card_number;

    // Default constructor
    AHuman(){
        System.out.println("I will be called, Object is created");
        // write a code here which will automatically called when object is created
        // read a file txt
        // Read a CSV, Excel here.....
    }

    // Parameterized Constructor
    AHuman(String name){
        System.out.println("Hi, I am Param Constructors");
        this.name = name;
    }
    //Return - void, data-type (any primitive)
    void walk(){
        System.out.println("NRNR"); // no return type no argument
    }

    int talk(){
        System.out.println("RTNA"); // return type with no argument
        return 10;
    }

    String sleep(String name){
        System.out.println("Sleeping");
        System.out.println("RTWA");   // return type with argument
        return "I am sleeping";
    }

    void eat(String name){
        System.out.println("NRWA"); // no return type with argument
        System.out.println("Eat");
    }


}