package objectcreation;

import com.sun.jdi.Value;

public class Callbyvlaue1 {

    public static void main(String[] args) {

        int a = 20;
        int b = 30;

        System.out.println("Before Swapping : a = " + a + " b = " + b );

        value.swap(20, 30);
        System.out.println("Before Swapping : a = " + a + " b = " + b );
    }
}

class value{

    public static void swap(int a, int b){

        System.out.println("Before Swapping (method) : a = " + a + " b = " + b );

        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping (method) : a = " + a + " b = " + b );
    }
}
