package IsaVII.Exercises.Fundamentals_2;

import java.time.LocalDate;
import java.util.Locale;

public class Exercise_14 extends Exercise {
    /*
    Print today's date using LocalDate.now(). Display the full day name, the day number, 
    the full month name, and the year. Also print whether it is a weekday or a weekend.

    Expected output (example):
    
    Today is: Wednesday, 11 June 2026
    It is a Weekday.
     */

    @Override
    public void run() {
        exerciseNumber = 14;
        super.run();
        
        LocalDate today = LocalDate.now();
        String dayName = today.getDayOfWeek().getDisplayName( java.time.format.TextStyle.FULL, java.util.Locale.ENGLISH);
       
        String monthName = today.getMonth().getDisplayName(java.time.format.TextStyle.FULL, java.util.Locale.ENGLISH);
        int dayOfMonth = today.getDayOfMonth();
        int year = today.getYear(); 
        
        IO.println("Today is: " + dayName + ", " + dayOfMonth + " " + monthName + " " + year);
        if (today.getDayOfWeek().getValue() >= 6) {
            IO.println("It is a Weekend.");
        } else {
            IO.println("It is a Weekday.");
        }
    }
}
