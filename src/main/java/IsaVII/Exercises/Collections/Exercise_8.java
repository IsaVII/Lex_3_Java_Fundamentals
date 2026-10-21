package IsaVII.Exercises.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Exercise_8 extends Exercise {
    /*
   Given two lists:

    List A: 1, 2, 3, 4, 5
    List B: 3, 4, 5, 6, 7
    Merge them into a single collection with no duplicates
    Print the result and the total count
     */
    
    @Override
    public void run() {
        exerciseNumber = 8;
        super.run();
 
         ArrayList<Integer> listA = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
         ArrayList<Integer> listB = new ArrayList<>(Arrays.asList(3, 4, 5, 6, 7));
       
         HashSet<Integer> mergedSet = new HashSet<>(listA);
         mergedSet.addAll(listB);
         
         IO.println(mergedSet);
         IO.println("Total count: " + mergedSet.size());
        
    }
    
}
