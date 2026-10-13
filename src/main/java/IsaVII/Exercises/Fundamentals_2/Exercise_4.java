package IsaVII.Exercises.Fundamentals_2;

public class Exercise_4 extends Exercise {
    /*
      Ask the user to enter their full name (first, optional middle, last — separated by spaces). Print the initials in dot notation, all uppercase.
    
    Example interaction:
    
    Enter full name: mehrdad javan
    Initials: M.J.
     */

    @Override
    public void run() {
        exerciseNumber = 4;
        super.run();

        String fullName = IO.readln("Enter full name: ");
        int splitIndex = fullName.indexOf(' ');
        

        String initials = "";
        if (splitIndex != -1) {
            String firstName = fullName.substring(0, splitIndex);
            String lastName = fullName.substring(splitIndex + 1);
            initials = firstName.substring(0, 1).toUpperCase() + "." + lastName.substring(0, 1).toUpperCase() + ".";
        } else {
            initials = fullName.substring(0, 1).toUpperCase() + ".";
        }

        IO.println("Initials: " + initials);
    }
}
