package Oppsconcept;

public class Methoddemo {

    public static void main(String[] args) {

        int x= calculator.sub(30, 20);
        System.out.println("subtraction of two numbers is " + x);

       int y= calculator.mul(10, 20);
        System.out.println("multiplication of two numbers is " + y);

        double z= calculator.div(50,11);
        System.out.println("division of two numbers is " + z);

    }
}

class calculator{

    static int sub(int a , int b){

        int c = a-b;
        return c;

    }

    static int mul(int a, int b){

        int d = a*b;
        return d;

    }

    static double div(int a, int b){

        double e = a/b;
        return e;

    }
}