package arrayss;

public class findthesecondlargestofanArray {

    public static void main(String[] args) {

        int [] arr = {10, 20, 30, 40, 70, 50, 200, 150, 60, 200};

        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        for( int num : arr)
        {
            if(num>largest)
            {
                secondlargest = largest;
                largest = num;

            }

            else if(num>secondlargest && num!=largest)
            {
                secondlargest = num;
            }
        }
        System.out.println("second largest number in an aaray is " + secondlargest);
    }
}
