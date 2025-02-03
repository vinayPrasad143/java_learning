package objectcreation;

public class Callbyrefer1 {

    public static void main(String[] args) {

        call c1 = new call(20,30);

        System.out.println("Before swapping : a = " + c1.a + " b = " + c1.b);

        swap(c1);

        System.out.println("Before swapping : a = " + c1.a + " b = " + c1.b);


    }

    public static void swap(call obj){

       // System.out.println("Before swapping(method) : a = " + obj.a + " b = " + obj.b);

        int temp = obj.a;
        obj.a = obj.b;
        obj.b =temp;
      //  System.out.println("After swapping(method) : a = " + obj.a + " b = " + obj.b);

    }
}

class call
{
    int a,b ;
    call(int a , int b){

        this.a = a;
        this.b = b;
    }
}

