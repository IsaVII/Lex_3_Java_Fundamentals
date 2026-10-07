package IsaVII.Exercises;

public class Exercise_17  extends Exercise {
    
    /*
    Ask the user to enter a password. Loop through every character and check three rules:
    
    Length is at least 8 characters.
    Contains at least one uppercase letter (A–Z).
    Contains at least one digit (0–9).
    Print how many rules are met and a rating.
    
    Rules met	Rating
    3	Strong
    2	Medium
    0 or 1	Weak
    Example interaction:
    
    Enter password: Hello7
    Rules met: 2/3
    Rating: Medium
    Think about it: You can compare a char directly without importing anything: ch >= 'A' && ch <= 'Z' checks for uppercase.
     Use password.charAt(i) to get each character inside the loop.
    */
    
    @Override
    public void run() {
        exerciseNumber = 17;
        super.run();
        
        String password = IO.readln("Enter password: ");
        
        int rulesMet = 0;
        
        //min 8 characters? 
        if (password.length() >= 8) {
            rulesMet++;
        }
        
        boolean hasUppercase = false;
        boolean hasDigit = false;
        
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            
            //Has uppercase letter? 
            if (ch >= 'A' && ch <= 'Z') {
                hasUppercase = true;
            }
            
            //Has digit? 
            if (ch >= '0' && ch <= '9') {
                hasDigit = true;
            }
        }
        
        if (hasUppercase) {
            rulesMet++;
        }
        if (hasDigit) {
            rulesMet++;
        }
        
        IO.println("Rules met: " + rulesMet + "/3");
        String rating;
        if (rulesMet == 3) {
            rating = "Strong";
        } else if (rulesMet == 2) {
            rating = "Medium";
        } else {
            rating = "Weak";
        }
        IO.println("Rating: " + rating);
    }
}
