package Inheritanceinjava;

public class inheritDemo {

    public void display()
    {
        System.out.println("Parent class display");
    }
}

class child extends inheritDemo{

    @Override
    public void display() {
        System.out.println("child class display");
    }

    public static void main(String[] args) {

        inheritDemo d1 = new child();
        d1.display();
    }
}
