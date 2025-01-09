package stringsinjava;

public class reversesstringusingstringbuilder1 {

    public static void main(String[] args) {

        String str1 = "vihaanVprasad";

        String reversed = new StringBuilder(str1).reverse().toString();

        System.out.println(reversed);
    }
}
