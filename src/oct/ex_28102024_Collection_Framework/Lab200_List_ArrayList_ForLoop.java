package oct.ex_28102024_Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class Lab200_List_ArrayList_ForLoop {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("bread");
        list.add("milk");
        list.add("butter");
        list.add("paneer");
        list.add("jam");
        list.add("cheeze");
        //System.out.println(list);// [bread, milk, butter, paneer, jam, cheeze]
        System.out.println(list.size());//6
        System.out.println(list.isEmpty()); //false
        //System.out.println(list.contains(bread));// false coz we are for interger but above is string"1"
        System.out.println(list.contains("jam")); //true
        System.out.println(list.indexOf("paneer"));//3
        System.out.println(list.lastIndexOf("cheeze"));//5


        System.out.println("-------Default for Loop");

        for(int i = 0; i< list.size(); i++){
            System.out.println(list.get(i));
        }

        System.out.println("------for each Loop");

        for(Object o: list){
            System.out.println(o);
        }

    }
}