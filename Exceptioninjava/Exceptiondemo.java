package Exceptioninjava;

public class Exceptiondemo {

    public static void main(String[] args) {

        try {
            int result = 10/0;
            System.out.println("result:" +result);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("Finally block will execute even there is a failure in the code");
        }
    }
}
