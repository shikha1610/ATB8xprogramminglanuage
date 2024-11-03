package oct.ex_25102024_Arrays;

import java.util.Arrays;

public class Lab190_Arrays_Functions {
    public static void main(String[] args) {
        int[] marks = {51, 100, 91, 87, 90};
        // Index    =   0,  1,   2,  3,  4
        System.out.println(marks.length); // length always starts from 1
        System.out.println(marks[0]); // First - Index = 0 (Index starts from 0)
        System.out.println(marks[1]); // Index = 1

        Arrays.sort(marks);
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        System.out.println(marks[3]);
//        System.out.println(marks[4]);

        System.out.println("-----");

 //       for (int i = 0; i < marks.length; i++) {
   //         System.out.println(marks[i]);
     //   }

        Arrays.sort(marks);

        int item = Arrays.binarySearch(marks,100);
        System.out.println(item);


    }
}
