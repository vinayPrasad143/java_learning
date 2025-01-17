package arrayss;

public class Largestandsmallestnumber {

    public static void main(String[] args) {

        int [] arr = {5,50,20,30,40,70,100,15,25};

        int smallest = arr[0];
        int largest = arr[0];

        for (int num : arr)
        {
            if (num > largest) largest = num;
            if (num < smallest) smallest = num;
        }

        System.out.println("largest :" + largest);
        System.out.println("smallest :" + smallest);
    }
}
