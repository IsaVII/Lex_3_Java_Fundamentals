package IsaVII.Exercises;

public class Exercise_11 extends Exercise{
    /*
    Print every integer from 1 to 30, one per line, applying these rules:

    Divisible by 3 → print Fizz
    Divisible by 5 → print Buzz
    Divisible by both 3 and 5 → print FizzBuzz
    Otherwise → print the number
    Expected output (first 15 lines):
    
    1
    2
    Fizz
    4
    Buzz
    Fizz
    7
    8
    Fizz
    Buzz
    11
    Fizz
    13
    14
    FizzBuzz
    Think about it: If you check divisibility by 3 first, what happens when the number is 15?
     Why must the combined check come before the individual ones?
     */
    
    @Override
    public void run() {
        exerciseNumber = 11;
        super.run();
        
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                IO.println("FizzBuzz");
            } else if (i % 3 == 0) {
                IO.println("Fizz");
            } else if (i % 5 == 0) {
                IO.println("Buzz");
            } else {
                IO.println(i);
            }
        }
        
        IO.println("If divisibility by 3 is checked first, then for numbers like 15, which are divisible by both 3 and 5, \n" +
                "the program would print 'Fizz' instead of 'FizzBuzz' because the first statement would directly be true. \n" +
                "Therefore, the combined check must come before the individual ones to ensure correct output.");
    }
}
