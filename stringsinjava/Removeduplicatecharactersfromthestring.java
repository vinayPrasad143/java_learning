package stringsinjava;

import java.util.LinkedHashSet;

public class Removeduplicatecharactersfromthestring {


    public static void main(String[] args) {

        String str1 = "chandanvinayprasad";
        String result = removeduplicates(str1);
        System.out.println("String after removing duplicates :" + result);

    }
    public static String removeduplicates(String str1)
    {
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (char c: str1.toCharArray())
        {
            set.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for (char c : set)
        {
            sb.append(c);
        }
        return sb.toString();
    }
}
