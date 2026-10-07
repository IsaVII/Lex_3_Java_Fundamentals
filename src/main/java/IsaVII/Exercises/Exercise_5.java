package IsaVII.Exercises;

public class Exercise_5  extends Exercise {
    /*
    Ask the user to enter their first name and last name separately. Then print a personalised greeting that 
    includes the full name.

    Example interaction:
    
    Enter first name: Sofia
    Enter last name:  Karlsson
    Hello, Sofia Karlsson! Welcome aboard.
    Think about it: How do you join two separate String variables into one output line? 
    What operator or method do you use?
     */
    
    
    @Override
    public void run() {
        exerciseNumber = 5;
        super.run();
        
        String firstName = IO.readln("Enter first name: ");
        String lastName = IO.readln("Enter last name: ");
        
        IO.println("Hello, " + firstName + " " + lastName + "! Welcome aboard.");
    }
}
