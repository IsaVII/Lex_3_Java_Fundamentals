package IsaVII.Exercises.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Exercise_4 extends Exercise {
    /*
      Given this list of numbers:

    14, 3, 78, 45, 22, 91, 7, 56
    Find and print the largest number
    Do not use Collections.max() — use a loop
     */
    
    @Override
    public void run() {
        exerciseNumber = 4;
        super.run();

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(14, 3, 78, 45, 22, 91, 7, 56));
        
        int largest = numbers.get(0);
        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            }
        }
        
        IO.println("The largest number is: " + largest);
        IO.println("Collection.max check: " + Collections.max(numbers));
    }
    
    
    
}
