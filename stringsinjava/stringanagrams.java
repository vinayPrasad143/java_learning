package stringsinjava;

import java.util.Arrays;

public class stringanagrams {

    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";

        if (areAnagrams(str1,str2)){
            System.out.println("The strings are Anagrams");
        }
        else {
            System.out.println("The Strings are not Anagrams");
        }
    }

        public static boolean areAnagrams(String str1, String str2)
        {
            str1 = str1.replaceAll("\\s", "").toLowerCase();
            str2 = str2.replaceAll("\\s", "").toLowerCase();

            if(str1.length()!=str2.length())
            {
                return false;
            }
            char[] chararray1 = str1.toCharArray();
            char[] chararray2 = str2.toCharArray();

            Arrays.sort(chararray1);
            Arrays.sort(chararray2);

            System.out.println(chararray1);
            System.out.println(chararray2);

            return Arrays.equals(chararray1,chararray2);

        }

}
