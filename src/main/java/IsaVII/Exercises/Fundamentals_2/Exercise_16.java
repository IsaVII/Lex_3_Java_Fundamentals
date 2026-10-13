package IsaVII.Exercises.Fundamentals_2;

import java.time.LocalDate;

public class Exercise_16 extends Exercise {
    /*
    Ask the user to enter an event name and its date in yyyy-MM-dd format.
    Use LocalDate.parse() to read the date. If the event is in the future,
     print how many days remain. If it has already passed, print how many days ago it was.
    
    Example interaction:
    
    Enter event name: Midsommar
    Enter event date (yyyy-MM-dd): 2026-06-20
    Midsommar is in 9 days!
    Enter event name: New Year
    Enter event date (yyyy-MM-dd): 2026-01-01
    New Year was 161 days ago.
     */

    @Override
    public void run() {
        exerciseNumber = 16;
        super.run();
        
        String eventName = IO.readln("Enter event name: ");
        String eventDateString = IO.readln("Enter event date (yyyy-MM-dd): ");
            
        LocalDate eventDate = LocalDate.parse(eventDateString);
        LocalDate today = LocalDate.now();
        
        if (eventDate.isAfter(today)) {
            long daysUntilEvent = java.time.temporal.ChronoUnit.DAYS.between(today, eventDate);
            IO.println(eventName + " is in " + daysUntilEvent + " days!");
        } else if (eventDate.isBefore(today)) {
            long daysSinceEvent = java.time.temporal.ChronoUnit.DAYS.between(eventDate, today);
            IO.println(eventName + " was " + daysSinceEvent + " days ago.");
        } else {
            IO.println(eventName + " is today!");
        }
        
    }
}
