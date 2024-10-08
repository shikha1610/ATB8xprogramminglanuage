package Task_23092024;

public class HW_01_simple_calculator_switch_statement {
    public static void main(String[] args) {
        /*
Create a simple calculator that performs addition, subtraction, multiplication,
and division, modulus based on user input using switch statements.
Inputs :   num 1, num 2, +
Output :  num1+num2 → print information.
 */
        // switch condition

        int num1 = 160;
        int num2 = 20;
        int result = 1; //result-case no 1 to 5 //if enter 6/7/100/67 then default will print

        switch (result) {
            case 1:
                int add = num1 + num2;
                System.out.println("Addition is " + add);
                break;
            case 2:
                int sub = num1 - num2;
                System.out.println("Subtraction is " + sub);
                break;
            case 3:
                int multiply = num1 * num2;
                System.out.println("Multiplication is " + multiply);
                break;
            case 4:
                int divide = num1 / num2;
                System.out.println("Division is " + divide);
                break;
            case 5:
                int percentage = num1 % num2;
                System.out.println("Modulus is " + percentage);
                break;

            default:
                System.out.println("out of syllabus");
                break;
        }
        System.out.println("End of the loop");
    }
}
