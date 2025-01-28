package objectcreation;

import javax.naming.Name;
import java.sql.SQLOutput;

public class Object1 {

    String Name;
    int age;
    float height;
    String content;

    static String country;

    void talk(String content){
        System.out.println(Name + " age[" + age + "] "+ "Height["+ height + "] " + content);
    }
}

class Objectcreation{

    public static void main(String[] args) {

        Object1 obj = new Object1();

        obj.Name = "vinay";
        obj.age = 29;
        obj.height = 5.6f;
        obj.talk("hello...... java");
        obj.country = "India";

        Object1 obj1 = new Object1();

        obj1.Name = "chandana vinayprasad";
        obj1.age = 24;
        obj1.height = 5.7f;
        obj1.content = "chandana is vinay's wife";
        obj1.country = "Australia";

        obj1.talk(obj1.content);

        System.out.println(obj1.country);
        System.out.println(obj.country);
        System.out.println(Object1.country);

    }
}
