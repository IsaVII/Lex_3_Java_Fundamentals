package IsaVII.Exercises;

public class Exercise_4 extends Exercise {
    /*
   Ask the user to enter three integers. Calculate and print their average. Make sure the result
   shows the decimal part.

    Example interaction:
    
    Enter first number:  23
    Enter second number: 11
    Enter third number:  77
    Average: 37.0
    Think about it: If all three variables are int, what happens when you divide their sum by 3? How do you make sure 
    the result is a decimal number?
     */
    
    @Override
    public void run() {
        exerciseNumber = 4;
        super.run();
        
        int firstNumber = Integer.parseInt(IO.readln("Enter first number: "));
        int secondNumber = Integer.parseInt(IO.readln("Enter second number: "));
        int thirdNumber = Integer.parseInt(IO.readln("Enter third number: "));
        
        double average = (firstNumber + secondNumber + thirdNumber) / 3.0;
        IO.println("Average: " + average);
    }
}
