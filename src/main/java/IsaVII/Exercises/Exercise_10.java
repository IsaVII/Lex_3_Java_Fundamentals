package IsaVII.Exercises;

public class Exercise_10 extends Exercise{
    /*
    You have two variables:
    
    int a = 15;
    int b = 42;
    Swap their values so that a ends up with 42 and b ends up with 15. You are not allowed to declare a third variable.
    
    Expected output:
    Before: a = 15, b = 42
    After:  a = 42, b = 15
    
    Think about it: You can solve this using only addition and subtraction. What happens if you set a = a + b? What does a 
    now contain, and how can you use that to recover the original values?
     */
    
    @Override
    public void run() {
        exerciseNumber = 10;
        super.run();

        int a = 15;
        int b = 42;
        
        IO.println("Before: a = " + a + ", b = " + b);
        IO.println("Swap values, step by step.");
        IO.println("a = a + b => a = " + a + " + " + b);
        
        a = a + b; // a now contains the sum of a and b
        IO.println("b = a - b => b = " + a + " - " + b);
        
        b = a - b; // b now contains the original value of a
        IO.println("a = a - b => a = " + a + " - " + b);
        
        a = a - b; // a now contains the original value of b
        IO.println("After: a = " + a + ", b = " + b);   
        
        
    }
}
