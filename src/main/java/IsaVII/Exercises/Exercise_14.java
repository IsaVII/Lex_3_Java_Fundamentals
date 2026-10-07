package IsaVII.Exercises;

public class Exercise_14  extends Exercise {
    /*
    Ask the user for a number. Print its multiplication table from 1 to 10 using a for loop.

    Example interaction:
    
    Enter a number: 7
    7 x 1  = 7
    7 x 2  = 14
    7 x 3  = 21
    7 x 4  = 28
    7 x 5  = 35
    7 x 6  = 42
    7 x 7  = 49
    7 x 8  = 56
    7 x 9  = 63
    7 x 10 = 70
    Bonus: Use a nested for loop to print the full 10 × 10 multiplication grid for all numbers from 1 to 10.
     */
    
    @Override
    public void run() {
        exerciseNumber = 14;
        super.run();
        
        int number = Integer.parseInt(IO.readln("Enter a number: "));
        IO.println("Multiplication table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            IO.println(number + " x " + i + " = " + (number * i));
        }
        
       
    }
}
