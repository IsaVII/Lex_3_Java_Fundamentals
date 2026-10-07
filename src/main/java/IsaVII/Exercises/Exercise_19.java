package IsaVII.Exercises;

public class Exercise_19  extends Exercise{
    
    /*
     Write a static method countVowels(String s) that returns the number of vowels (a, e, i, o, u, case-insensitive) 
     in the string. Call it from main and test it.
    
    Examples:
    
    countVowels("Hello World") → 3
    countVowels("Java")        → 2
    countVowels("rhythm")      → 0
    Think about it: Convert the whole string to lowercase once before the loop. Use s.charAt(i) to access each character. 
    How do you compare a char to multiple values without a long chain of || conditions?
     */
    
    @Override
    public void run() {
        exerciseNumber = 19;
        super.run();
        
         countVowels("Hello World");
         countVowels("Java");
         countVowels("rhythm");
    }
    
    static void countVowels(String input) {
        String s = input.toLowerCase();
        int count = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ("aeiou".indexOf(ch) != -1) { // Check if the character is a vowel
                count++;
            }
        }
        
        IO.println("Number of vowels in \"" + input + "\": " + count);
    }
    
  
}
