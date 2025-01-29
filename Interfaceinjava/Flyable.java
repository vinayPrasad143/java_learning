package Interfaceinjava;

public interface Flyable {

    void fly();
}

interface Drivable {

    void drive();

}

class Flyingcar implements Flyable, Drivable{

    @Override
    public void fly() {
        System.out.println("Flying car is flying");
    }

    @Override
    public void drive() {
        System.out.println("Flying car is driving");
    }
}

class Multipleinterfacesexample {

    public static void main(String[] args) {

        Flyingcar fc =  new Flyingcar();
        fc.drive();
        fc.fly();
    }
}

