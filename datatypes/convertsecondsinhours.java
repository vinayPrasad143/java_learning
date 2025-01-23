package datatypes;

public class convertsecondsinhours {

    public static void main(String[] args) {

        int time;

        timeconversion d1 = new timeconversion();
        d1.timeConversionToDaysHoursandSeconds(86399);

    }

}

class timeconversion{

    public void timeConversionToDaysHoursandSeconds (int time)
    {
        int hours = time/3600;
        //System.out.println(hours);
        int remainingsecs = time%3600;
        int minutes = remainingsecs/60;
       // System.out.println(minutes);
        int secs = remainingsecs%60;
       // System.out.println(secs);

        System.out.println(hours + "hours " + minutes + "minutes " + secs + "seconds");
    }
}
