package objectcreation;

public class Callbyvalue2 {

    void math(int a){

        a +=50;
    }

    public static void main(String[] args) {

        int a =30;
        System.out.println("Before change : " + a);
        Callbyvalue2 c1 = new Callbyvalue2();
        c1.math(a);
        System.out.println("After change : " + a);

    }
}

