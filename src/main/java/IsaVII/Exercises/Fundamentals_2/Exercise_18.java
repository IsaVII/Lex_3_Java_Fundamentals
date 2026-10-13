package IsaVII.Exercises.Fundamentals_2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exercise_18 extends Exercise {
    /*
    Ask the user to enter a start date and an end date in 
    yyyy-MM-dd format. Print every date from start to end (inclusive),
     one per line, formatted as "dd/MM/yyyy (eeee)".
    
    Example interaction:
    
    Enter start date (yyyy-MM-dd): 2026-06-08
    Enter end date   (yyyy-MM-dd): 2026-06-12
    08/06/2026 (Monday)
    09/06/2026 (Tuesday)
    10/06/2026 (Wednesday)
    11/06/2026 (Thursday)
    12/06/2026 (Friday)
     */

    @Override
    public void run() {
        exerciseNumber = 18;
        super.run();

        String startDateStr = IO.readln("Enter start date (yyyy-MM-dd): ");
        String endDateStr = IO.readln("Enter end date   (yyyy-MM-dd): ");
        
        LocalDateTime startDate = LocalDateTime.parse(startDateStr + "T00:00:00");
        LocalDateTime endDate = LocalDateTime.parse(endDateStr + "T00:00:00");
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy (EEEE)");
        
        formatter = formatter.withLocale(java.util.Locale.ENGLISH);
        
        
        while (!startDate.isAfter(endDate)) {
            IO.println(startDate.format(formatter));
            startDate = startDate.plusDays(1);
        }
       
    }

    
}
