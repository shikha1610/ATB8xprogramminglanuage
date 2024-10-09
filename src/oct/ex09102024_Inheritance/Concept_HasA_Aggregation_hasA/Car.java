package oct.ex09102024_Inheritance.Concept_HasA_Aggregation_hasA;

public class Car {
    // Car Has-A engine and tyre
    protected void startCar(){
        new Engine().start();
        new Tyre().rolling();
    }

}
