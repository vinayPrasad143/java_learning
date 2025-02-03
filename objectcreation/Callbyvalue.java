package objectcreation;

public class Callbyvalue {

    public static void main(String[] args) {
         int i = 50;
        System.out.println("Before calling: " + i);
        math.callby(i);
        System.out.println("Before calling: " + i);

    }
}
class math{
    public static void callby(int i){
        i=100;
    }
}

