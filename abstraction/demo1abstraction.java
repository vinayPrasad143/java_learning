package abstraction;

abstract class demo1abstraction {

    // hiding the complex implementation and showing only the functionality to the user is known as Abstractio....
    // example consider TV remote we don't the how complex the implementation.
    // but its easy and simple to use by the user by hiding the implementation.

    abstract void method1();
    abstract void method2();
}

class Normalclass extends demo1abstraction{

    @Override
    void method1() {
        System.out.println("method1 executed");
    }

    @Override
    void method2() {
        System.out.println("method2 executed");
    }
}

class executer{

    public static void main(String[] args) {

        Normalclass n1 = new Normalclass();
        n1.method1();
        n1.method2();

    }
}
