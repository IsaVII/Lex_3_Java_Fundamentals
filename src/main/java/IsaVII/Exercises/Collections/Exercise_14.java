package IsaVII.Exercises.Collections;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Exercise_14 extends Exercise {
    /*
    Given two lists:
    
    List A: 1, 3, 5, 7, 9, 11
    List B: 3, 6, 9, 12, 15
    Find all elements that appear in both lists
    Each element should appear only once in the result
    Print the common elements
     */
    
    @Override
    public void run() {
        exerciseNumber = 14;
        super.run();
        
        // Create two lists
        ArrayList<Integer> listA = new ArrayList<>(List.of(1, 3, 5, 7, 9, 11));
        ArrayList<Integer> listB = new ArrayList<>(List.of(3, 6, 9, 12, 15));
        
        // Find common elements
        HashSet<Integer> commonElements = new HashSet<>();
        for (Integer element : listA) {
            if (listB.contains(element)) {
                commonElements.add(element);
            }
        }
        // Print common elements
        IO.println("Common elements: " + commonElements);
    }
}
