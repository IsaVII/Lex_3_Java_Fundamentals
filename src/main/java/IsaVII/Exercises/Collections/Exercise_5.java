package IsaVII.Exercises.Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise_5 extends Exercise {
    /*
     Given a list of names:

    Anna, Bob, Alice, Charlie, Amanda, David, Amy, Brian
    Ask the user to enter a letter
    Count and print how many names start with that letter (case-insensitive)
     */
    
    @Override
    public void run() {
        exerciseNumber = 5;
        super.run();

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Anna", "Bob", "Alice", "Charlie", "Amanda", "David", "Amy", "Brian"));
        
        String letter = IO.readln("Enter a letter: ").toLowerCase();
        int count = 0;
        for (String name : names) {
            if (name.toLowerCase().startsWith(letter)) {
                count++;
            }
        }
        
        IO.println("Number of names starting with " + letter + ": " + count);
    }
    
}
