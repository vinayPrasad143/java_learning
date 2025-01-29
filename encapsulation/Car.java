package encapsulation;

public class Car {

    //this is the real world scenario of the encapsulation

    private String brand;
    private double speed;

    public void setBrand(String brand){
        this.brand=brand;
    }

    public String getBrand(){
        return brand;
    }

    public void setSpeed(double speed){
        if (speed>=0){
            this.speed = speed;
        }
        else {
            System.out.println("speed should not be a negative value");
        }
    }
    public double getSpeed(){
        return speed;
    }
}

class Carexample{

    public static void main(String[] args) {

        Car c = new Car();
        c.setBrand("maruti");
        c.setSpeed(120.5);
        System.out.println(c.getBrand() + " travel's at the maximum speed of " + c.getSpeed() + " km/h");

        Car c1 = new Car();
        c1.setBrand("Ambasador");
        c1.setSpeed(-120.5);
        System.out.println(c1.getBrand() + " travel's at the maximum speed of " + c1.getSpeed() + " km/h");

//        Data Security:
//        Encapsulation restricts access to sensitive data by making fields private.
//        Control Over Data:
//        Getters and setters allow controlled access to data, enabling validation.
//                Modularity:
//        Changes to the internal implementation of a class do not affect other classes.
//        Improved Maintenance:
//        Encapsulation simplifies code maintenance by keeping related methods and fields in one class.
    }
}
