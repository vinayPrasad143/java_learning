package arrayss;

import java.sql.SQLOutput;
import java.util.LinkedHashSet;

public class removeduplicatesfromanarray {

    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50,40,30,20,10};

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (int num: arr){

            set.add(num);
        }
        System.out.println("Array without duplicates :" + set);
    }
}
