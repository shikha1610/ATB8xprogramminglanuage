package oct.ex_30102024_Collection_Framework_Part2;

import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lab205_LinkedList {
    public static void main(String[] args) {
        //LinkedList mylist = new LinkedList(); // this can use also
        List mylist = new LinkedList(); // this can use also
        mylist.add(1);
        mylist.add(2);
        mylist.add(3);
        mylist.add(4);
        mylist.add(4); // in case of linkedlist, duplicates are allowed
        System.out.println(mylist);

        Integer[] a = new Integer[5];
        String[] names = new String[5];

        List mylist1 = new ArrayList(); //FR - co
        mylist1.add("Pramod");
        mylist1.add("Anusha");
        mylist1.add("Kiran");


        // Selenium -> Store and insertion and deletion
        // API - store, access -> AL
    }
}
