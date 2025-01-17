package interviewprograms;

import java.util.Locale;

public class demo1switch {

    public static void main(String[] args) {

        String day = "MONDAY";

        switch (day)
        {
            case "MONDAY":
            //case "monday".toUpperCase(): // method calls are not allowed at the case level, each case muct be compile time constant
                // method calls are not constant
                System.out.println("day 1 of week");
                break;
            default:
                System.out.println("other than monday");
        }
    }
}
