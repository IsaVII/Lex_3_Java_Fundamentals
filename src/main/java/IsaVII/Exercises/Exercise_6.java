package IsaVII.Exercises;

public class Exercise_6 extends Exercise {
    /*
    Ask the user to enter two integers. Print the result of all four basic operations: addition, subtraction,
     multiplication, and division.

    Example interaction:

    Enter first number:  20
    Enter second number: 6
            20 + 6 = 26
            20 - 6 = 14
            20 * 6 = 120
            20 / 6 = 3
    Think about it: Why does 20 / 6 print 3 and not 3.33? How would you change the code to get the decimal result?
     */
    
    @Override
    public void run() {
        exerciseNumber = 6;
        super.run();
        
        int A = Integer.parseInt(IO.readln("Enter first number: "));
        int B = Integer.parseInt(IO.readln("Enter second number: "));
        
        IO.println("            " + A + " + " + B + " = " + (A + B));
        IO.println("            " + A + " - " + B + " = " + (A - B));
        IO.println("            " + A + " * " + B + " = " + (A * B));
        IO.println("            " + A + " / " + B + " = " + (A / B));
        
        IO.println("Decimal result of division -> change one int to a double for the calculation: " + (A / (double) B));
    }
}
