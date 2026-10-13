package IsaVII.Exercises.Fundamentals_2;

public class Exercise_3 extends Exercise {
    /*
    Ask the user to enter a sentence. Loop through every character and count how many are vowels, consonants, digits, and spaces. Print the summary.
    
    Example interaction:
    
    Enter a sentence: Java 101 is fun
    Vowels    : 5
    Consonants: 5
    Digits    : 3
    Spaces    : 3
     */

    @Override
    public void run() {
        exerciseNumber = 3;
        super.run();
        
        String sentence = IO.readln("Enter a sentence: ");
        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int spaces = 0;
        
        for (char c : sentence.toCharArray()) {
            if ("AEIOUaeiou".indexOf(c) != -1) {
                vowels++;
            } else if (Character.isLetter(c)) {
                consonants++;
            } else if (Character.isDigit(c)) {
                digits++;
            } else if (Character.isWhitespace(c)) {
                spaces++;
            }
        }
        
        IO.println("Vowels    : " + vowels);
        IO.println("Consonants: " + consonants);
        IO.println("Digits    : " + digits);
        IO.println("Spaces    : " + spaces);
    }
}
