package IsaVII.Exercises.Collections;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Exercise_15 extends Exercise {
    /*
    Given a list of integers and a target number:

    Numbers: 2, 7, 11, 15, 4, 6
    Target: 13
    Find two numbers in the list that add up to the target and print them
    Think about it: Can you solve this without a nested loop? Which collection lets you check 
    for a value in constant time?
     */
    
    @Override
    public void run() {
        exerciseNumber = 15;
        super.run();
        
        ArrayList<Integer> numbers = new ArrayList<>(List.of(2, 7, 11, 15, 4, 6));
        int target = 13;
        
        HashSet<Integer> seen = new HashSet<>();
        
        for (Integer number : numbers) {
            int complement = target - number;
            if (seen.contains(complement)) {
                IO.println("Numbers that add up to " + target + ": " + number + " and " + complement);
                break;
            }
            seen.add(number);
        }
    }
}
