package IsaVII.Exercises.Collections;

import java.util.HashMap;
import java.util.List;

public class Optional_5 extends Exercise {
    /*
    Given a list of integers and a target sum, find all contiguous sublists that add up to the target.
    
    Input:  [1, 2, 3, 4, 2, 1, 5],  target = 6
    Output:
      Index 0–2: [1, 2, 3]
      Index 2–4: [3, 4, 2, 1]  ← wait, does this sum to 6? Check your logic.
      Index 4–5: [2, 1, 5]     ← and this?
    Print the start index, end index, and the matching sublist for each match.
     */

    @Override
    public void run() {
        exerciseNumber = 22;
        super.run();

        List<Integer> numbers = List.of(1, 2, 3, 4, 2, 1, 5);
        int target = 6;
        int numberSize = numbers.size();
        
        for (int start = 0; start < numberSize; start++) {
            int sum = 0;
            for (int end = start; end < numberSize; end++) {
                sum += numbers.get(end);
                if (sum == target) {
                    IO.println("Index " + start + "–" + end + ": " + numbers.subList(start, end + 1));
                }
            }
        }
 
    }
    
  
}
