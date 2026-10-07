package IsaVII.Exercises;

public class Exercise_8  extends Exercise{

    /*
    Generate a random number between 1 and 500 using the Random class. Let the user keep guessing until they get it right.
     After each wrong guess, print whether it was too small or too big. When the user guesses correctly, print a 
     congratulation message that includes how many guesses they made.

    Example interaction:
    
    Enter your guess: 250
    Too big!
    Enter your guess: 125
    Too small!
    Enter your guess: 180
    Correct! You got it in 3 guesses.
    
    Think about it: What kind of loop keeps running until an unknown condition is met — a for loop or a while loop? 
    Where do you increment the guess counter?
     */

    @Override
    public void run() {
        exerciseNumber = 8;
        super.run();
        
        int randomNumber = (int) (Math.random() * 500) + 1;
        int guess = 0;
        int guessCounter = 0;
        
        IO.println("Guess the number between 1 and 500!");
        while (guess != randomNumber) {
            guess = Integer.parseInt(IO.readln("Enter your guess: "));
            guessCounter++;
            
            if (guess < randomNumber) {
                IO.println("Too small!");
            } else if (guess > randomNumber) {
                IO.println("Too big!");
            } else {
                IO.println("Correct! You got it in " + guessCounter + " guesses.");
            }
        }
    }
}
