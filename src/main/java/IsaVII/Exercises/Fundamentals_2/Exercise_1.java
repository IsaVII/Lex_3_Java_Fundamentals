package IsaVII.Exercises.Fundamentals_2;

public class Exercise_1 extends Exercise {
    /*
    Ask the user to enter a word. Reverse it using StringBuilder and print the result.

    Example interaction:
    
    Enter a word: Stockholm
    Reversed: mlohkcotS
     */
    
    @Override
    public void run() {
            String word = IO.readln("Enter a word: ");
            String reversed = new StringBuilder(word).reverse().toString();
            IO.println("Reversed: " + reversed);
    }
}
