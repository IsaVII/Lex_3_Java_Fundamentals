package IsaVII.Exercises.Fundamentals_2;

public class Exercise_2 extends Exercise {
    /*
    Ask the user to enter an email address. Use indexOf() and substring() to extract and print the username and the domain separately.
    
    Example interaction:
    
    Enter email: mehrdad.javan@lexicon.se
    Username: mehrdad.javan
    Domain  : lexicon.se
     */

    @Override
    public void run() {
        String email = IO.readln("Enter email: ");
        int atIndex = email.indexOf("@");
        String username = email.substring(0, atIndex);
        String domain = email.substring(atIndex + 1);
        IO.println("Username: " + username);
        IO.println("Domain  : " + domain);
    }
}
