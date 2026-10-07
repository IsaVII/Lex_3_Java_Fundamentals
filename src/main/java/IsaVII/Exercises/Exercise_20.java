package IsaVII.Exercises;

public class Exercise_20 extends Exercise {
    
    /*
     Write a static method isPrime(int n) that returns true if n is a prime number. Use it inside a loop in main 
     to print all prime numbers from 2 to 50 on a single line.
    
    Expected output:

    2 3 5 7 11 13 17 19 23 29 31 37 41 43 47
    Think about it: Your divisor loop inside isPrime only needs to go up to the square root of n.
     Why? If n has no divisor up to that point, what can you conclude? Also handle n <= 1 as a special 
     case that always returns false.
     */

    @Override
    public void run() {
        exerciseNumber = 20;
        super.run();

        IO.println("Prime numbers from 2 to 50:");
        for (int i = 2; i <= 50; i++) {
            if (isPrime(i)) {
                IO.print(i + " ");
            }
        }
        
    }
    
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        
        return true;
    }

}
