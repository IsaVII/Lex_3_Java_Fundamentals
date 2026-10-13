package IsaVII.Exercises.Fundamentals_2;

public class Exercise_6 extends Exercise {
    /*
    Ask the user to enter a sentence. Count how many words it contains and how many times a specific word appears in it. The search should be case-insensitive.

    Example interaction:
    
    Enter a sentence  : To be or not to be that is the question
    Enter word to find: be
    Total words : 10
    "be" appears: 2 times
     */

    @Override
    public void run() {
        exerciseNumber = 6;
        super.run();

        String sentence = IO.readln("Enter a sentence: ");
        String wordToFind = IO.readln("Enter word to find: ");
        
        String[] words = sentence.split(" ");
        int totalWords = words.length;
        int count = 0;
        for (String word : words) {
            if (word.equalsIgnoreCase(wordToFind)) {
                count++;
            }
        }
        IO.println("Total words: " + totalWords);
        IO.println("\"" + wordToFind + "\" appears: " + count + " times");
        
        
    }
}
