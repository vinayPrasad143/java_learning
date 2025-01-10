package Operators;

import java.util.Scanner;

public class oddorevennumber {

    public static void main(String[] args) {

        // to check odd or even number using scanner class

        Scanner scan = new Scanner(System.in);
        // created object of the scanner class

        System.out.println("Enter the number : ");

        int i = scan.nextInt();

        if (i % 2 ==0)
        {
            System.out.println("The number is Even number");
        }
        else
        {
            System.out.println("The number is ODD number");
        }
    }
}
