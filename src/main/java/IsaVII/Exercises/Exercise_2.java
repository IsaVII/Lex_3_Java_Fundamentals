package IsaVII.Exercises;

public class Exercise_2  extends Exercise {
    /*
    Ask the user to enter a year. Print whether it is a leap year or not.
    
    Example interaction:
    
    Enter a year: 2024
    2024 is a leap year.
    Enter a year: 1900
    1900 is NOT a leap year.
    Think about it: This has three conditions that depend on each other. What is the correct order to check them, and 
    which logical operators (&&, ||) do you need?
     */
    
    @Override
    public void run() {
        exerciseNumber = 2;
        super.run();
        
        /* Wikipedia: 
        • Divisible by 4: If a year can be divided by 4 with no remainder, it is a candidate for a leap year.
        • The Century Exception: If the year ends in two zeros (a century year like 1900 or 2000), it is not a leap year—unless the next rule applies.
        • The 400 Rule: Century years are only leap years if they are also evenly divisible by 400 (like 2000 or 2400)
         */
        
        IO.println("Enter a year: ");
        int year =  Integer.parseInt(IO.readln());
        
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        
        if (isLeapYear) {
            IO.println(year + " is a leap year.");
        } else {
            IO.println(year + " is NOT a leap year.");
        }
    }
}
