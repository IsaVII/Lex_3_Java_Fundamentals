package IsaVII.Exercises.Fundamentals_2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exercise_17 extends Exercise {
    /*
Ask the user to enter three appointment names and their date-times in yyyy-MM-dd HH:mm format.
 Store them and print a formatted schedule, sorted by date, using the pattern
  "eeee, dd MMMM yyyy 'at' HH:mm".

    Example interaction:
    
    Enter appointment 1 name: Dentist
    Enter appointment 1 date-time (yyyy-MM-dd HH:mm): 2026-06-15 09:00
    Enter appointment 2 name: Team Meeting
    Enter appointment 2 date-time (yyyy-MM-dd HH:mm): 2026-06-12 14:30
    Enter appointment 3 name: Gym
    Enter appointment 3 date-time (yyyy-MM-dd HH:mm): 2026-06-11 17:00
    
    --- Your Schedule ---
    1. Gym          – Thursday, 11 June 2026 at 17:00
    2. Team Meeting – Friday, 12 June 2026 at 14:30
    3. Dentist      – Monday, 15 June 2026 at 09:00
     */

    @Override
    public void run() {
        exerciseNumber = 17;
        super.run();

        Event[] events = new Event[3];

        // enter 3 events
        for (int i = 0; i < events.length; i++) {
            String eventName = IO.readln("Enter event name: ");
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            LocalDateTime eventDate = LocalDateTime.parse(
                    IO.readln("Enter event date (yyyy-MM-dd HH:mm): "),
                    formatter
            );
            events[i] = new Event(eventName, eventDate);
        }

        // print schedule 
        IO.println("\n--- Your Schedule ---");
        for (int i = 0; i < events.length; i++) {
            IO.println((i + 1) + ". " + events[i].getEventString());
        }
    }


    public class Event {
        private String name;
        private LocalDateTime date;

        public Event(String name, LocalDateTime date) {
            this.name = name;
            this.date = date;
        }

        public String getEventString(){
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("eeee, dd MMMM yyyy 'at' HH:mm");

            //to have the first day written in capital letter
            String formattedDate = date.format(formatter);
            formattedDate = formattedDate.substring(0, 1).toUpperCase() + formattedDate.substring(1);
            
            return String.format("%-20s - %s", name, formattedDate);
        }
    }
}
