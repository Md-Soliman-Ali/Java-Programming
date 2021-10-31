package datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Date_Time {

    public static void main(String[] args) throws ParseException {

        // Get To days Date Time
        Date date = new Date();
        System.out.println(date);
        System.out.println();

        // Format Date Time
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-y HH:mm:ss aa");
        String d1 = sdf.format(date);
        System.out.println(d1);
        System.out.println();

        // Getting Time Stamp
        long timestamp = date.getTime();
        System.out.println(timestamp);

        String d3 = sdf.format(timestamp);
        System.out.println("Current time: " + d3);
        System.out.println();

        // Parse Date Time
        String d4 = "01-08-2021 00:00:00 PM";
        Date thatDay = sdf.parse(d4);
        System.out.println(thatDay);
        System.out.println(sdf.format(thatDay));
        System.out.println("That day timestamp: " + thatDay.getTime());
        System.out.println();

        // Add OR Subtract Date
        Calendar calendar = Calendar.getInstance();
        //calendar.setTime(thatDay);
        calendar.setTime(date);
        calendar.add(Calendar.DATE, -7);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.HOUR, 2);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.YEAR, 1);
        System.out.println(calendar.getTime());
    }
}
