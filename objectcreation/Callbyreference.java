package objectcreation;

import java.sql.SQLOutput;

public class Callbyreference {

    public static void main(String[] args) {

        J1 obj = new J1();
        obj.i = 50;
        System.out.println("Before calling :" + obj.i);
        Math.callByRef(obj);
        System.out.println("After calling : " + obj.i);


    }
}

class J1{
    int i;
}

class Math{

    public static void callByRef(J1 j){
        j.i=100;

    }
}

