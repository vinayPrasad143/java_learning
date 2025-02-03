package stringbufferbuilderinjava;

public class Stringdemo {

    public static void main(String[] args) {

        StringBuilder strbuilder = new StringBuilder("Hello ");
        System.out.println(strbuilder);
        strbuilder.append(" World");
        System.out.println("After Append: " + strbuilder);
        strbuilder.insert(6, "JAVA");
        System.out.println(strbuilder);
        strbuilder.replace(6,10, "C++");
        System.out.println(strbuilder);
        strbuilder.delete(3,5);
        System.out.println(strbuilder);
        strbuilder.reverse();
        System.out.println(strbuilder);
    }
}
