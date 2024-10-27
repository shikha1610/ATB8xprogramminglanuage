package oct.ex_18102024_string_wrapper;

public class Lab161_String_Functions {
    public static void main(String[] args) {

        String str = " Hello World "; // indexes - 0 to 12, length is 13 coz will count from 1
        // Length of the string
        System.out.println("Length: " + str.length());

        // Substring
        System.out.println("Substring: " + str.substring(0,2));

        // Trim
        System.out.println("Trimmed: '" + str.trim() + "'");

        // convert to uppercase
        System.out.println("Uppercase: " + str.toUpperCase()); //
        System.out.println("LowerCase: " + str.toLowerCase());

        System.out.println(str.charAt(2));

        System.out.println(str.equals("Hello"));
        System.out.println(str.indexOf("H"));
        System.out.println(str.contains("l"));
        System.out.println(str.contains("p"));
        System.out.println(str.isEmpty());
        System.out.println(str.split(" "));

        String name = "Pramod";
        String name2 = "PramoD";
        System.out.println(name.compareTo(name2));
        // CompareTo -> 0 - both of them are same
        // return Number - ASCII value diff - between the Strings
        //Ascii d - 100, Ascii D -> 68 - 100-68 =32
        // d -> D - lexicographically comparison

        name = name.strip();
        System.out.println(name.strip()); // white spaces removed

    }
}
