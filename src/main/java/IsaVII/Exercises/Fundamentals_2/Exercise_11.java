package IsaVII.Exercises.Fundamentals_2;

import java.util.Locale;

public class Exercise_11 extends Exercise {
    /*
    Ask the user how many times to roll two six-sided dice. Roll them 
    that many times, print each individual roll, and at the end 
    print how many times the result was a double (both dice show 
    the same value).
    
    Example interaction:
    
    How many rolls? 5
    Roll 1: 3 + 3 = 6  DOUBLE!
    Roll 2: 5 + 2 = 7
    Roll 3: 1 + 4 = 5
    Roll 4: 6 + 6 = 12 DOUBLE!
    Roll 5: 2 + 3 = 5
    Doubles rolled: 2 out of 5
     */

    @Override
    public void run() {
        exerciseNumber = 11;
        super.run();
        
        int rolls = Integer.parseInt(IO.readln("How many rolls? "));
        int doubles = 0;
        
        for (int i = 1; i <= rolls; i++) {
            int die1 = (int) (Math.random() * 6) + 1;
            int die2 = (int) (Math.random() * 6) + 1;
            int sum = die1 + die2;
            if (die1 == die2) {
                IO.println("Roll " + i + ": " + die1 + " + " + die2 + " = " + sum + " DOUBLE!");
                doubles++;
            } else {
                IO.println("Roll " + i + ": " + die1 + " + " + die2 + " = " + sum);
            }
        }
        
        IO.println("Doubles rolled: " + doubles + " out of " + rolls);
    }
    
    
    
}
