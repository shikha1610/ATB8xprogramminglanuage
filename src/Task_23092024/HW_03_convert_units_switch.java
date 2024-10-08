package Task_23092024;

public class HW_03_convert_units_switch {
    public static void main(String[] args) {
        /*
        Write a program that converts between different units
        (e.g., kilometers to miles, Celsius to Fahrenheit)
        based on user selection using a switch statement.
        Input. -
        choice - 1 - km → m, km → 1km
        choice - 2 - f → c, f → c
         */

        double km=100.8; // assume - it could be any digit
        double mile;
        double fahrenheit;
        double celsius=103.9; // assume - it could be anything

        int choice=2; //
        switch(choice) {

            case 1:
                mile=km*0.6214;
                System.out.println(km +" converted in miles is "+ mile);
                break;
            case 2:
                fahrenheit=(celsius)*9/5+32;
                System.out.println(celsius +" celsius converted to fahrenheit value is " +fahrenheit +"f");
                break;
            default:
                System.out.println("nothing matches/ invalid value");
                break;

        }


    }
}
