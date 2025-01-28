package abstraction;

abstract class TVremote {

    abstract void switchOnTV();
    abstract void switcjOffTV();
}

class Buttons extends TVremote {

    @Override
    void switchOnTV() {
        System.out.println("Turning on TV.......................");
    }

    @Override
    void switcjOffTV() {
        System.out.println("Turning off TV.......................");
    }
}

class Buttonpress {

    public static void main(String[] args) {

        Buttons remote = new Buttons();
        remote.switchOnTV();
        remote.switcjOffTV();
    }
}
