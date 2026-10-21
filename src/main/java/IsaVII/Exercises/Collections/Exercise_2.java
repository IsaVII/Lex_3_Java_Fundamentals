package IsaVII.Exercises.Collections;

import java.util.ArrayList;
import java.util.HashSet;

import static java.util.Arrays.asList;

public class Exercise_2 extends Exercise {
    /*
    You are given the following list of cities — some appear more than once:
    
    Stockholm, Gothenburg, Malmö, Stockholm, Uppsala, Gothenburg, Lund
    Store them in a collection that automatically handles duplicates
    Print all unique cities and the total count
     */
    
    @Override
    public void run() {
        exerciseNumber = 2;
        super.run();
        
        ArrayList<String> cities = new ArrayList<>(asList("Stockholm", "Gothenburg", "Malmö", "Stockholm", "Uppsala", "Gothenburg", "Lund"));
        
        HashSet<String> uniqueCities = new HashSet<>(cities);
        IO.println("Unique cities: " + uniqueCities);
        IO.println("Total count: " + uniqueCities.size());
 
    }
    
}
