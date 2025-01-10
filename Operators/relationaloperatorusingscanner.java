package Operators;

import java.util.Scanner;

public class relationaloperatorusingscanner {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstnumber = scn.nextInt();
        System.out.println("Enter the second number: ");
        int secondnumber = scn.nextInt();

        if(firstnumber>secondnumber )
        {
            System.out.println("firstnumber is greater than secondnumber");
        }

        else if(firstnumber<secondnumber )
        {
            System.out.println("secondnumber is greater than firstnumber");
        }
      else
        {
            System.out.println("firstnumber is equals to secondnumber");
        }
    }
}
