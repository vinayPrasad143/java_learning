package arrayss;

public class findthenumberinanarray {

    public static void main(String[] args) {

        int [] arr = {30, 40, 70, 50, 200, 150, 60, 200, 10, 20};

        int elementvalue = 150;

        boolean found = true;

        for (int num : arr)
        {
            if (num == elementvalue)
            {
                found = true;
                break;
            }
        }
        System.out.println("Contains " + elementvalue + ": " + found);
    }
}
