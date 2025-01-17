package arrayss;

public class sumofarray {

    public static void main(String[] args) {

        int [] arr = {10, 20, 30, 40, 70, 50, 200, 150, 60, 200};

        int sum = 0;

        for (int num : arr)
        {
            sum += num;
        }
        System.out.println("sum: " + sum);
    }
}
