package IsaVII.Exercises.Fundamentals_2;

import javax.swing.plaf.synth.Region;
import java.util.Locale;

public class Exercise_10 extends Exercise {
    /*
    Write three static methods: findMax(int a, int b, int c), 
    findMin(int a, int b, int c), 
    and average(int a, int b, int c). 
    Ask the user to enter three integers, then print the maximum, 
    minimum, and average using those methods.

    Example interaction:
    
    Enter first number : 42
    Enter second number: 7
    Enter third number : 19
    Maximum : 42
    Minimum : 7
    Average : 22.67
     */

    @Override
    public void run() {
        exerciseNumber = 10;
        super.run();
        
        int a = Integer.parseInt(IO.readln("Enter first number: "));
        int b = Integer.parseInt(IO.readln("Enter second number: "));
        int c = Integer.parseInt(IO.readln("Enter third number: "));
        
        findMax(a, b, c);
        findMin(a, b, c);
        average(a, b, c);
    }
    
    
    private static void findMax(int a, int b, int c) {
        int max = Math.max(a, Math.max(b, c));
        IO.println("Maximum : " + max);
    }
    
    private static void findMin(int a, int b, int c) {
        int min = Math.min(a, Math.min(b, c));
        IO.println("Minimum : " + min);
    }
    
    private static void average(int a, int b, int c) {
        double avg = (a + b + c) / 3.0;
        IO.println(String.format(Locale.ENGLISH, "Average : %.2f", avg));
    }
    
    
}
