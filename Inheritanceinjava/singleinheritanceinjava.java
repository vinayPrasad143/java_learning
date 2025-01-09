package Inheritanceinjava;

public class singleinheritanceinjava {

    public static void main(String[] args) {

        dog d1 = new dog();
        d1.bark();
        d1.sleep();
        d1.Drink();
        d1.eat();
        d1.sit();

        Animal a1 = new Animal();
        a1.sit();
    }
}
