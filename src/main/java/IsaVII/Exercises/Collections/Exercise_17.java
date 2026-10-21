package IsaVII.Exercises.Collections;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Exercise_17 extends Exercise {
    /*
     Given a list of words:
    
    java, python, java, c++, python, java, ruby, c++, python, ruby, java
    Find the 3 most frequently occurring words
    Print them in order from most to least frequent
     */
    
    @Override
    public void run() {
        exerciseNumber = 17;
        super.run();

        List<String> words = List.of("java", "python", "java", "c++", "python", "java", "ruby", "c++", "python", "ruby", "java");

        //counting
        HashMap<String, Integer> wordCounts = new HashMap<>();
        for (String word : words) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }

        
        // Finding the top 3 most frequent words
        List<String> topWords = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            String mostFrequentWord = null;
            int maxCount = 0;
            for (String word : wordCounts.keySet()) {
                int count = wordCounts.get(word);
                if (count > maxCount && !topWords.contains(word)) {
                    maxCount = count;
                    mostFrequentWord = word;
                }
            }
            if (mostFrequentWord != null) {
                topWords.add(mostFrequentWord);
            }
        }
        IO.println("Top 3 most frequent words: " + topWords);
    }
}
