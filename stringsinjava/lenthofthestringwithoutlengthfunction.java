package stringsinjava;

public class lenthofthestringwithoutlengthfunction {

    public static void main(String[] args) {

        String str = "Bangaloremysorehighway";
        int length = 0;

        for (char c: str.toCharArray())
        {
            length++;
        }
        System.out.println("length of the string : " + length );
    }
}
