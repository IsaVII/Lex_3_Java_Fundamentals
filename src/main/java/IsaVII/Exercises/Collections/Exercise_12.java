package IsaVII.Exercises.Collections;

import java.util.HashMap;

public class Exercise_12 extends Exercise {
    /*
    Given a list of names:

    Alice, Bob, Anna, Charlie, Brian, Amanda, Carl
    Group the names by their first letter
    Print each group
     */
    
    @Override
    public void run() {
        exerciseNumber = 12;
        super.run();

        String[] names = {"Alice", "Bob", "Anna", "Charlie", "Brian", "Amanda", "Carl"};
        
        HashMap<Character, String> groupedNames = new HashMap<>();
        for (String name : names) {
            char firstLetter = name.charAt(0);
            groupedNames.put(firstLetter, groupedNames.getOrDefault(firstLetter, "") + name + " ");
        }

        for (Character firstLetter : groupedNames.keySet()) {
            IO.println(firstLetter + ": " + groupedNames.get(firstLetter));
        }
    }
    
     
}
