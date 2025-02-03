package objectcreation;

public class Callbyrefer2 {

    int a;
    Callbyrefer2(int a )
    {
        this.a = a;
    }

    public void math(Callbyrefer2 obj){

        obj.a += 30;

    }

    public static void main(String[] args) {

       Callbyrefer2 c1 = new Callbyrefer2(20);
        System.out.println("Before change : " +c1.a);
        c1.math(c1);
        System.out.println("After change : " + c1.a);
    }
}
