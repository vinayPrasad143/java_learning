package arrayss;

public class missingnumberinanarray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};
        int n = 7;

        int expectedsum = n*(n+1)/2;
        int actualsum = 0;

        for(int num : arr)
        {
            actualsum += num;
        }
        System.out.println("Missing number :" + (expectedsum-actualsum));
    }
}
