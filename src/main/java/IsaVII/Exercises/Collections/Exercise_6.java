package IsaVII.Exercises.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Exercise_6 extends Exercise {
    /*
    Given a list of words:

    apple, banana, apple, orange, banana, apple, grape, orange
    Count how many times each word appears
    Print each word and its count, sorted alphabetically
     */
    
    @Override
    public void run() {
        exerciseNumber = 6;
        super.run();

        ArrayList<String> words = new ArrayList<>(Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple", "grape", "orange"));
        HashMap<String, Integer> wordCount = new HashMap<>();
        
        // Count occurrences of each word
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        
        // Sort the words alphabetically
        ArrayList<String> sortedWords = new ArrayList<>(wordCount.keySet());
        Collections.sort(sortedWords);
       
        // Print each word and its count
        for (String word : sortedWords) {
           IO.println(word + ": " + wordCount.get(word));
        }
        
    }
    
}
