package arrayss;

public class reversearray {

    public static void main(String[] args) {

        int [] arr = {10,20,30,40,50,60,70,80};

       System.out.print("Original Array :");
        for(int num : arr){

            System.out.print(num + " ");
        }
        System.out.print("\nReversed Array :");

        for(int i= arr.length-1; i>=0; i--){

            System.out.print(arr[i] + " ");
        }
    }
}
