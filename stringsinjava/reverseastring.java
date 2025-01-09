package stringsinjava;

public class reverseastring {

    public static void main(String[] args) {

        String s1 = "vinay prasad";
        String reverse = " ";
        int length = s1.length();

        System.out.println(length);

        for(int i=length-1; i>=0; i--)
        {
            //reverse += s1.charAt(i);
            reverse = reverse + s1.charAt(i);
        }
        System.out.println( "Reversed String :" + reverse);

    }
}
