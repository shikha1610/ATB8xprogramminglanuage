package oct.ex_28102024_Collection_Framework;

import java.util.List;

public class Lab198_List {
    public static void main(String[] args) {
        //List list = new List();
        List list = List.of("banana","apple","grapes","orange");
        System.out.println(list);// output - [banana, apple, grapes, orange]
        System.out.println(list.size());// output - 4
        //list.add("guava"); // unsupportedOperationException
    }
}
