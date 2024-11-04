package oct.ex_28102024_Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class Lab198_List_ArrayList {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        System.out.println(list);// [1,2,3]
        System.out.println(list.size());//3
        System.out.println(list.isEmpty()); //false
        //System.out.println(list.contains(1));// false coz we are for interger but above is string"1"
        System.out.println(list.contains("1")); //true
        System.out.println(list.indexOf("3"));
        System.out.println(list.lastIndexOf("3"));
    }
}
