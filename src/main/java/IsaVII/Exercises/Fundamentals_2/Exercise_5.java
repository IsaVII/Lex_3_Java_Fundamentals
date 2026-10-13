package IsaVII.Exercises.Fundamentals_2;

public class Exercise_5 extends Exercise {
    /*
     Ask the user to enter a word. Check whether it is a palindrome — the same forwards and backwards — ignoring case. Print the result.

    Example interaction:
    
    Enter a word: Racecar
    Racecar is a palindrome.
    Enter a word: Java
    Java is NOT a palindrome.
     */

    @Override
    public void run() {
        exerciseNumber = 5;
        super.run();

        String word = IO.readln("Enter a word: ");
        String reversedWord = new StringBuilder(word).reverse().toString();
        boolean isPalindrome = word.equalsIgnoreCase(reversedWord);
        
        IO.println(word + (isPalindrome ? " is a palindrome." : " is NOT a palindrome."));
    }
}
