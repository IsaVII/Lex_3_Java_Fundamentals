package IsaVII.Exercises;

public class Exercise_13 extends Exercise{
    /*
    Ask the user to enter a day of the week (e.g. Monday). Use a switch statement with arrow syntax to print 
    whether it is a Weekday or a Weekend. If the input does not match any known day, print "Unknown day".

    Example interaction:
    
    Enter day: Saturday
    Weekend
    Enter day: Wednesday
    Weekday
    Think about it: In modern switch syntax, a single case can match multiple values: case "Saturday", 
    "Sunday" ->. How many cases do you actually need to cover all seven days?
     */
    
    @Override
    public void run() {
        exerciseNumber = 13;
        super.run();
        
        String day = IO.readln("Enter day: ");
        
        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> IO.println("Weekday");
            case "Saturday", "Sunday" -> IO.println("Weekend");
            default -> IO.println("Unknown day");
        }
        
        IO.println("You need only 2 cases (+default) to cover all seven days.");
        
    }
}
