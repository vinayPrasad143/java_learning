package stringsinjava;

public class stringpolindrome {

    public static void main(String[] args) {

        String s1 = "madam";

        String reversed = new StringBuilder(s1).reverse().toString();

        System.out.println("Reversed String : " + reversed);

        if (s1.equals(reversed)){
            System.out.println("The string is polindrome");
        }
        else {
            System.out.println("The number is not a polindrome");
        }
    }
}
