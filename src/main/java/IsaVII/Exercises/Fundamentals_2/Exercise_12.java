package IsaVII.Exercises.Fundamentals_2;

public class Exercise_12 extends Exercise {
    /*
     Ask the user for a desired password length. Generate a random password of 
     exactly that length using characters from the set: lowercase letters (a–z), 
     uppercase letters (A–Z), and digits (0–9). Use Math.random() and StringBuilder 
     to build the result.
    
    Example interaction:
    
    Enter password length: 10
    Generated password: gR4kXp1QzA
     */

    @Override
    public void run() {
        exerciseNumber = 12;
        super.run();
        
        int length = Integer.parseInt(IO.readln("Enter password length: "));
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * characters.length());
            password.append(characters.charAt(index));
        }

        IO.println("Generated password: " + password.toString());
    }
}
