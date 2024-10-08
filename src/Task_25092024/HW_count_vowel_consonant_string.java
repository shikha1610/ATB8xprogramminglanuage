package Task_25092024;

public class HW_count_vowel_consonant_string {
    public static void main(String[] args) {
        //Count vowels and consonants in a String. (pramod) -
        // v = 2 , c =. 4

        int vcount =0;
        int cCount =0;
        String str ="pramod";

        for(int i=0; i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' ||  str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
                vcount++;
            else {
                cCount++;
            }
        }
        System.out.println("Count of vowels in Pramod is :" +vcount);
        System.out.println("Count of consonant in Pramod is :" +cCount);


    }
}
