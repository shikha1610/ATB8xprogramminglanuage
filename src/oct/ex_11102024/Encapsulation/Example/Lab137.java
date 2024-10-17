package oct.ex_11102024.Encapsulation.Example;

public class Lab137 {
    public static void main(String[] args) {
        ICICIBank amit = new ICICIBank("Amit", 100);
        //amit.bal = 10000; private name
        //amit.setBal(10000000);

        //This should allowed to only admin

        //Write a code to connect with mySQL
        //admin
        boolean are_you_admin = true;
        ICICIBank admin = new ICICIBank("Amit", 1000);
        admin.setBal(50000, true);
        System.out.println(admin.getName());
    }
}
