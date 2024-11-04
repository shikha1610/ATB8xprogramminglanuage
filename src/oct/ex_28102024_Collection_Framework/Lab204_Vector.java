package oct.ex_28102024_Collection_Framework;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Lab204_Vector {
    public static void main(String[] args) {
        List mylist1 = new ArrayList(5); // FR - CO
        mylist1.add("Pramod");
        mylist1.add("Anusha");
        mylist1.add("Kiran");
        mylist1.add("Kiran");
        mylist1.add("Kiran");
        mylist1.add("Kiran");
        System.out.println(mylist1); // [Pramod, Anusha, Kiran, Kiran, Kiran, Kiran]



        Vector v = new Vector();
        v.add("Pramod"); // t1
        v.add("Anusha"); // t1
        v.add("Kiran"); // t1
        System.out.println(v); //[Pramod, Anusha, Kiran]
        System.out.println(v.size());//3
        System.out.println(v.isEmpty());//false
        System.out.println(v.indexOf("Kiran"));// 2
        System.out.println(v.lastIndexOf("Kiran"));//2
        System.out.println(v.contains("Kiran"));// true
//        System.out.println(v.replaceAll("Kiran"););



        // Only Problem with the Vector
        // - It is Thread Safe, Synchronised.
        // It will be time consumming
        // One by One - usage
        // Slower








    }
}
