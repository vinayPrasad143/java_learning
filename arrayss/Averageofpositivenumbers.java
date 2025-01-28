package arrayss;

public class Averageofpositivenumbers {

    public static void main(String[] args) {

        int [] arr = {-2,-3, 0, 12, 20, -11};
        int sum = 0;
        int count =0;

        for (int i =0; i<=arr.length-1; i++)
        {
            if (arr[i]>0)
            {
                sum += arr[i];
                count++;
            }

        }
        System.out.println("sum of positive values "+ sum);
        System.out.println("positive values count " + count);
        if(count>0){
            double average = (double) sum/count;
            System.out.println("Average of positive values is " + average);
        }

    }
}
