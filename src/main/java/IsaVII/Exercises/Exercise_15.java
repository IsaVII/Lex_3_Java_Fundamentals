package IsaVII.Exercises;

public class Exercise_15 extends Exercise {
    /*
     Ask the user for a positive integer. Reverse its digits using only arithmetic — no converting to a String. 
     Print the reversed number.
    
    Example interaction:
    
    Enter a number: 12345
    Reversed: 54321
    Also test with 1000 — the result should be 1, not 0001.
    
    Think about it: Use a while loop. Each iteration: extract the last digit with % 10, attach it to your result by 
    multiplying the result by 10 and adding that digit, then strip the last digit with / 10. Stop when the number reaches 0.
     */
    
    @Override
    public void run() {
        exerciseNumber = 15;
        super.run();
        
        int number = Integer.parseInt(IO.readln("Enter a number: "));
        
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            // Append the digit to the reversed number
            reversed = reversed * 10 + digit;
            // Strip the last digit from the number
            number /= 10;
        }
        
        IO.println("Reversed: " + reversed);
    }
}
