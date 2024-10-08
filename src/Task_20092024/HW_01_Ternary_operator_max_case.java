package Task_20092024;

public class HW_01_Ternary_operator_max_case {
    public static void main(String[] args) {
        //By using Ternary Operators max between 3 numbers.
        // Input int - a,b,c - a = 10, b = 20, c = 45
        // Max → a,b,c → c

        //condition ? expression_if_true : expression_if_false

        int a = 10;
        int b = 20;
        int c = 45;
        int max = (a>b) ? (b>c ? b:c) : (a>c ? a:c);
        System.out.println(max);


        // max between 4 numbers
        //int a = 10;
        //int b = 20;
        //int c = 45;
        //int d = 70;
        //int max = (a>b) ? (b>c) ? (a>d ? a:d) : (b>d ? b:d): (c>d ? c:d);
        //System.out.println(max);
    }
}


