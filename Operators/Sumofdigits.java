package Operators;

import java.util.Scanner;

public class Sumofdigits {

    public static void main(String[] args) {

        int i=10;

        int i1 = i++ + i++ + ++i + ++i;
        System.out.println(i1);

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the value :");
        int num = scn.nextInt();
        int sum =0;

        while(num !=0){

            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        System.out.println("sum of values of is : " + sum);
    }
}
