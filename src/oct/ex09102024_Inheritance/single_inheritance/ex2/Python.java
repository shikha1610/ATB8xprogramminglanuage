package oct.ex09102024_Inheritance.single_inheritance.ex2;

public class Python extends Programming{
    //Is a programming (whenever there is "is a" relationship then this is single inheritance)

    public Python(){
        System.out.println("DC");
    }

    void print(){
        System.out.println(author);
        System.out.println(version);
    }
}
