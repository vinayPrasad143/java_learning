package encapsulation;

public class Encape1 {

    // group of data and methods in particular class and not allowing other classes to access the data directly
    // but only possibly by methods of the class.
    // we have to define the setter and getter methods to initialize and to get a data

    private String name;

    public void setName(String myName){
        name = myName;
    }

    public String getName(){
        return name;
    }
}

class Run
{
    public static void main(String[] args) {
        Encape1 obj = new Encape1();
        obj.setName("vinayprasad"); // setting the value by set method which is present in Encape1 class
        String name = obj.getName(); // get the name by getter method which is present in Encape1 class
        System.out.println(" my name is : " + name);
    }
}