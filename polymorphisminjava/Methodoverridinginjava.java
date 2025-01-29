package polymorphisminjava;

public class Methodoverridinginjava {

    public void test()
    {
        System.out.println("test method in Methodoverridinginjava");
    }
}

class Overrridinginjava extends Methodoverridinginjava {

    public void test()
    {
        System.out.println("test method in Overrridinginjava");
    }
}

class executeoverride {

    public static void main(String[] args) {

        Overrridinginjava obj =  new Overrridinginjava();
        obj.test();
        Methodoverridinginjava obj1 = new Methodoverridinginjava();
        obj1.test();

        Methodoverridinginjava obj2 = new Overrridinginjava();
        obj2.test();


    }


}
