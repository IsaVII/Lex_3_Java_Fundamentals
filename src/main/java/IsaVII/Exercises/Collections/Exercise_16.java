package IsaVII.Exercises.Collections;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Exercise_16 extends Exercise {
    /*
   Given a list of numbers:

    34, 78, 23, 78, 91, 56, 91, 12
    Find the second largest unique value
    Do not sort the list
     */
    
    @Override
    public void run() {
        exerciseNumber = 16;
        super.run();
        
        ArrayList<Integer> numbers = new ArrayList<>(List.of(34, 78, 23, 78, 91, 56, 91, 12));
       
        HashSet<Integer> uniqueNumbers = new HashSet<>(numbers);
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for (Integer number : uniqueNumbers) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest) {
                secondLargest = number;
            }
        }
        
        IO.println("The second largest unique value is: " + secondLargest);     
    }
}
