package Operators;

import java.util.Scanner;

public class tofindthelastnumberinthevalueentered {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the value :");
        int i = scn.nextInt();

        int result = i%10;
        System.out.println("last digi of the entered value is " + result);
    }
}
