package arrayss;

import java.util.Scanner;

public class rotateanarray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};

       // int n= 3;
        System.out.println("Enter the number : ");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int length = arr.length;
        System.out.println("length of an array is " + length);

        System.out.print("original array : ");

        for (int num: arr){
            System.out.print(num + " ");
        }

        System.out.print("\nRotated array : ");

        for (int i=n; i<n+length; i++)
        {
            System.out.print(arr[i%length] + " ");
        }
    }
}
