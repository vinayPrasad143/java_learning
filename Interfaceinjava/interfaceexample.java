package Interfaceinjava;

public class interfaceexample implements printable{

    @Override
    public void print() {
        System.out.println("override the interface method");
    }

    public static void main(String[] args) {

        interfaceexample obj = new interfaceexample();

        obj.print();
    }
}
