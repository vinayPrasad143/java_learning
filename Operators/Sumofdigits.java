package Operators;

import java.util.Scanner;

public class Sumofdigits {

    public static void main(String[] args) {

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
