package IsaVII.Exercises.Collections;

import java.util.*;

public class Exercise_7 extends Exercise {
    /*
    Given this list of numbers:

    4, 7, 2, 7, 9, 4, 1, 9, 3
    Produce a new list with duplicates removed, preserving the original order
    Print the result
    Think about it: Which collection can help you track what you have already seen?
     */
    
    @Override
    public void run() {
        exerciseNumber = 7;
        super.run();

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(4, 7, 2, 7, 9, 4, 1, 9, 3));
        ArrayList<Integer> uniqueNumbers = new ArrayList<>();
        HashSet<Integer> seen = new HashSet<>();
       
        for (Integer number : numbers) {
            if (!seen.contains(number)) {
                uniqueNumbers.add(number);
                seen.add(number);
            }
        }
        IO.println(uniqueNumbers);
        
    }
    
}
