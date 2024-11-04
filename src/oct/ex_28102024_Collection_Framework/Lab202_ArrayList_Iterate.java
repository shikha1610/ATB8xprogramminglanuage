package oct.ex_28102024_Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab202_ArrayList_Iterate {
    public static void main(String[] args) {

        List<String> mylist = new ArrayList<>();
        mylist.add("Pramod");
        mylist.add("Amit");
        mylist.add("Dutta");

        System.out.println("- To Print ArrayList - 1");

        for (String str : mylist) {
            System.out.println(str); // output - Pramod Amit Dutta

        }

        System.out.println("- To Print ArrayList - 2");

        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(mylist.get(i)); // output - Pramod Amit Dutta
        }

        System.out.println("- To Print ArrayList - 3");

        //Iterator
        Iterator<String> iterator = mylist.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next()); // output - Pramod Amit Dutta

        }
    }
}