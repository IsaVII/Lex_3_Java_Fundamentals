package IsaVII.Exercises.Collections;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Optional_1 extends Exercise {
    /*
    Given a list and a number k, rotate the list to the right by k positions.

    Input:  [1, 2, 3, 4, 5],  k = 2
    Output: [4, 5, 1, 2, 3]
    Think about it: What happens when k is larger than the list size?
     */
    
    @Override
    public void run() {
        exerciseNumber = 18;
        super.run();

        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        int k = 2;
        int listSize = list.size();
        
        // Normalize k to be within the bounds of the list size
        k = k % listSize;    
        
        List<Integer> rotatedList = new ArrayList<>(listSize);
        for (int i = 0; i < listSize; i++) {
            rotatedList.add(list.get((i - k + listSize) % listSize)); 
        }
        
        IO.println("Original list: " + list + ", k = " + k);
        IO.println("Rotated list: " + rotatedList);
    }
}
