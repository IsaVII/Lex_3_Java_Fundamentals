package IsaVII.Exercises.Collections;

import java.util.HashMap;

public class Exercise_13 extends Exercise {
    /*
  Given a list of words:

    cat, dog, cat, bird, dog, cat, fish, dog, dog
    Find the word that appears most often
    Print it and its count
     */
    
    @Override
    public void run() {
        exerciseNumber = 13;
        super.run();

        String[] words = {"cat", "dog", "cat", "bird", "dog", "cat", "fish", "dog", "dog"};
        
        HashMap<String, Integer> wordCounts = new HashMap<>();
         
        // Count occurrences of each word
        for (String word : words) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }   
        
        // Find the word with the maximum count
        String mostFrequentWord = null;
        int maxCount = 0;
        for (String word : wordCounts.keySet()) {
            int count = wordCounts.get(word);
            if (count > maxCount) {
                maxCount = count;
                mostFrequentWord = word;    
            }
        }

        IO.println("Most frequent word: " + mostFrequentWord + " (count: " + maxCount + ")");
    }
}
