package stringsinjava;

public class reversestringusingstringbuilder {

    public static void main(String[] args) {

        String str = "channapattanataluk";

        StringBuilder reverse = new StringBuilder();

        for (int i=str.length()-1 ; i>=0; i--)
        {
            reverse.append(str.charAt(i));
        }
        System.out.println("Reversed String : " + reverse.toString());
    }
}
