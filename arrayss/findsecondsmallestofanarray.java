package arrayss;

public class findsecondsmallestofanarray {

    public static void main(String[] args) {

        int [] arr = {30, 40, 70, 50, 200, 150, 60, 200, 10, 20};

        int smallest = Integer.MAX_VALUE;
        int secondsmallest = Integer.MAX_VALUE;

        for(int num : arr)
        {
            if(num<smallest)
            {
                secondsmallest = smallest;
                smallest =num;
            }
            else if(num<secondsmallest && num!=smallest)
            {
                secondsmallest =num;
            }
        }
        System.out.println("Smallest number of an array is " + smallest);
        System.out.println("Second smallest number of an array is " + secondsmallest);
    }
}
