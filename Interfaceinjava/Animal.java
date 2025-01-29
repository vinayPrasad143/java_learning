package Interfaceinjava;

public interface Animal {

    void makeSound();
    void eat();

}

class Cat implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Cat will meow");
    }

    @Override
    public void eat() {
        System.out.println("Cat will drink milk");
    }
}

class Dog implements Animal {

    @Override
    public void eat() {
        System.out.println("Dog will eat bone");
    }

    @Override
    public void makeSound() {
        System.out.println("Dog will bark");
    }
}

class Interfacexample {

    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();
        dog.eat();

        Animal cat = new Cat();
        cat.makeSound();
        cat.eat();
    }
}
