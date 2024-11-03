package oct.ex_25102024_Arrays;

public class Lab188_Arrays {
    public static void main(String[] args) {

        int[] marks = {51, 100, 91, 87, 90};
        // Index    =   0,  1,   2,  3,  4
        System.out.println(marks.length); // length always starts from 1
        System.out.println(marks[0]); // First - Index = 0 (Index starts from 0)
        System.out.println(marks[1]); // Index = 1
        System.out.println(marks[2]); // Index = 2
        //System.out.println(marks[5]);// index = 5 // output - .ArrayIndexOutOfBoundsException


        int[]marks_2 = new int[5];
        // 5 is length
        marks_2[0] = 11;
        marks_2[1] = 12;
        marks_2[2] = 13;
        marks_2[3] = 14;
        marks_2[4] = 15;
        System.out.println(marks_2[0]);
        System.out.println(marks_2[1]);
        System.out.println(marks_2[2]);
        System.out.println(marks_2[4]);
       // System.out.println(marks_2[5]); //ArrayIndexOutOfBoundsException





    }
}
