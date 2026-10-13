package IsaVII.Exercises.Fundamentals_2;

public class Exercise_8 extends Exercise {
    /*
    Ask the user to enter a base number. Print its powers from 1 to 10 using Math.pow.
    
    Example interaction:
    
    Enter base: 3
    3 ^ 1  =       3.0
    3 ^ 2  =       9.0
    3 ^ 3  =      27.0
    3 ^ 4  =      81.0
    3 ^ 5  =     243.0
    3 ^ 6  =     729.0
    3 ^ 7  =    2187.0
    3 ^ 8  =    6561.0
    3 ^ 9  =   19683.0
    3 ^ 10 =   59049.0
     */

    @Override
    public void run() {
        exerciseNumber = 8;
        super.run();
        
        int base = Integer.parseInt(IO.readln("Enter base: "));
        IO.println("Powers of " + base + ":");
        
        for (int exponent = 1; exponent <= 10; exponent++) {
            double result = Math.pow(base, exponent);
            IO.println(base + " ^ " + exponent + " = " + result);
        }
    }
}
