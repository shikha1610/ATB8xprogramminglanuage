package oct.ex_14102024;

public class Lab143 {
}

// Abstract Class
abstract class Loan{
    abstract void loan50k();// incomplete information

    void loan1L(){// complete information // both complete & incomplete information can happen
        System.out.println("1L Loan is there");
    }
}
// Concrete Class
class Person{}
class Student1{}
class student2{}
class Student3{}
