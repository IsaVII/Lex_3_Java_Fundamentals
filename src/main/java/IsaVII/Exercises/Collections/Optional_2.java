package IsaVII.Exercises.Collections;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Optional_2 extends Exercise {
    /*
    Given an unsorted list of integers, find the length of the longest consecutive sequence.
    
    Input:  [100, 4, 200, 1, 3, 2]
    Output: 4    (sequence: 1, 2, 3, 4)
    Think about it: Sorting works but costs O(n log n). Can you do it in O(n) using a Set?
     */

    @Override
    public void run() {
        exerciseNumber = 19;
        super.run();

        List<Integer> nums = new ArrayList<>(List.of(100, 4, 200, 1, 3, 2, 201, 202, 203, 204));
        int longestStreak = 0;
        int sequenceStart = 0;

        HashSet<Integer> numSet = new HashSet<>(nums);
        for (int num : numSet) {
            if (numSet.contains(num - 1)) {
                continue; // Skip if it's not the start of a sequence
            }

            int currentNum = num;
            int currentStreak = 1;

            while (numSet.contains(currentNum + 1)) {
                currentNum++;
                currentStreak++;
            }
            if (currentStreak > longestStreak) {
                longestStreak = currentStreak;
                sequenceStart = num;
            }
        }

        IO.println("Input list: " + nums);
        IO.println("Longest consecutive sequence length is: " + longestStreak);
        IO.print("The sequence is: ");
        for (int i = sequenceStart; i < sequenceStart + longestStreak; i++) {
            IO.print((i) + (i < sequenceStart + longestStreak - 1 ? ", " : ""));
        }
    }
}
