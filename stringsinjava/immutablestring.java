package stringsinjava;

import com.sun.tools.javac.Main;

import java.util.Locale;

public class immutablestring {

    public static void main(String[] args) {

        String str = "Hello";
        // string created using string literal

        String str1 = new String("World");
        // String created using new keyword

        str.concat("vinay");
        System.out.println(str);
        //String is immutable, once the string object is created its value cannot be changed.
        //The concat method does not modify the original string but creates a new string.

        //length of a string

        int len = str.length();
        System.out.println(len);

        //Concatination in string

        String s1 = str.concat("chandana");
        System.out.println(s1);

        //Substring in java
        String sub = s1.substring(3,8);
        System.out.println(sub);

        //character at

        char c = s1.charAt(5);
        System.out.println(c);

        // CompareTo in string

        System.out.println(str.compareTo(str1));

        //equals in string

        String s10 = "Hello";
        String s11 = "HELLO";
        System.out.println(s10.equals(s11));

        //Lower case and upper case
        System.out.println(s11.toLowerCase());
        System.out.println(s10.toUpperCase());

        //Replace characters

        String replace = s10.replace('o', 'l');
        System.out.println(replace);










    }
}
