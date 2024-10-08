package Task_20092024;

import java.util.Scanner;

public class HW_03_Triangluar_classifier {
        // Triangle Classifier
        // // Write a program that classifies a triangle based on its side lengths.
        //
        //// Given three input values representing the lengths of the sides, determine
        //
        //// if the triangle is equilateral (all sides are equal),
        //
        //// isosceles (exactly two sides are equal), or
        //
        //// scalene (no sides are equal).
        //
        //// Use an if-else statement to classify the triangle.
        //
        //// side1, side2, side3 ->

        public static void main(String[] args) {
            // Step 1-
            // Side - double (data type) // ask to the interviewer what will be the data type so that you can find
            // Output - string

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the length of side 1: ");
            double side1 = sc.nextDouble();

            System.out.println("Enter the length of side 2: ");
            double side2 = sc.nextDouble();

            System.out.println("Enter the length of side 3: ");
            double side3 = sc.nextDouble();

            if (side1 == side2 && side2 == side3 && side3 == side1){
                System.out.println("Equal");
            }else if (side1 == side2 || side2 == side3 || side3 == side1){
                System.out.println("Isosceles");
            }else{
                System.out.println("Scalene");
            }


    }
}
