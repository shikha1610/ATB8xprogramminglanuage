package oct.ex_18102024_string_wrapper;

public class Lab163_stringBuffer_StringBuilder {
    public static void main(String[] args) {
//        String name = "Pramod";
//        name = "Aramod";

        //final class StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Pramod");
        StringBuffer stringBuffer1 = new StringBuffer("Dutta");
        stringBuffer.append("Dutta");
        stringBuffer1.append("Pramod");
        System.out.println(stringBuffer); //  output: PramodDutta
        System.out.println(stringBuffer1); //  output: DuttaPramod

        // C1, C2 -> Toy
        // C1 - toy 2 -> C2 Toy -> 2 - syn - tread safety - slow

        // Appending to StringBuilder
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb); // Hello World

        // Inserting into StringBuilder
        sb.insert(5, ",");
        System.out.println(sb); // output: Hello, World

        // Deleting from StringBuilder
        sb.delete(5,6);
        System.out.println(sb); // output: Hello world

        //Reversing stringBuilder
        sb.reverse();
        System.out.println(sb); // output: dlroW olleH

    }
}
