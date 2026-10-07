package IsaVII.Exercises;

public class Exercise_18  extends Exercise{
    
    /*
    Write a static method sumOfDigits(int n) that returns the sum of all digits in a positive integer.
     Call it from main and test it with at least three different values.

    Examples:
    
    sumOfDigits(1234) → 10   (1+2+3+4)
    sumOfDigits(9)    → 9
    sumOfDigits(305)  → 8    (3+0+5)
    Think about it: Use n % 10 to extract the last digit and n / 10 to remove it. Repeat inside a while loop until n 
    becomes 0. What should the loop condition be?
     */
    
    @Override
    public void run() {
        exerciseNumber = 18;
        super.run();
        
        sumOfDigits(1234);
        sumOfDigits(9);
        sumOfDigits(305);
        
    }
    
    public static void sumOfDigits(int n) {
        int sum = 0;
        
        while (n > 0) {
            sum += n % 10; // Add the last digit to sum
            n /= 10;       // Remove the last digit
        }
        
        IO.println("Sum of digits(" + n + "): " + sum);
    }
    
}
