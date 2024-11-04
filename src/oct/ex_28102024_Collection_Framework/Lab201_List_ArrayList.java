package oct.ex_28102024_Collection_Framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab201_List_ArrayList {
    public static void main(String[] args) {
        List marks = new ArrayList();
        marks.add(91);
        marks.add(95);
        marks.add(56);
        marks.add(89);
        System.out.println(marks); // [91, 95, 56, 89]

        //sorting
        //Collections.sort(marks);
        Collections.sort(marks,Collections.reverseOrder());// [95, 91, 89, 56]
        System.out.println(marks);//[56, 89, 91, 95]



    }
}
