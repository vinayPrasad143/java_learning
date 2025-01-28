package arrayss;

public class sumOfPositiveNumbers {

    public static void main(String[] args) {

        int[] arr = {-3, -2, 0, -7, 25, 12, -11};
        int sum =0;

        for (int num : arr)
        {
            if (num>0){
                sum += num;
            }
        }
        System.out.println("sum of positive numbers = " + sum);
    }
}
