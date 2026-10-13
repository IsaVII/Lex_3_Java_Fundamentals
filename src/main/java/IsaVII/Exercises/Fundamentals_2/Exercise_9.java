package IsaVII.Exercises.Fundamentals_2;

public class Exercise_9 extends Exercise {
    /*
    Ask the user to enter the lengths of three sides of a triangle. Check whether it is a 
    right triangle using the Pythagorean theorem. Also print the length of the longest side.

    Example interaction:
    
    Enter side a: 3
    Enter side b: 4
    Enter side c: 5
    Longest side: 5.0
    This IS a right triangle.
    Enter side a: 3
    Enter side b: 4
    Enter side c: 6
    Longest side: 6.0
    This is NOT a right triangle.
     */

    @Override
    public void run() {
        exerciseNumber = 9;
        super.run();
        
        //Pythagorean theorem: a^2 + b^2 = c^2
        
        double a = Double.parseDouble(IO.readln("Enter side a: "));
        double b = Double.parseDouble(IO.readln("Enter side b: "));
        double c = Double.parseDouble(IO.readln("Enter side c: "));
        
        double longest = Math.max(a, Math.max(b, c));
        IO.println("Longest side: " + longest);
        
        boolean isRightTriangle = (longest == a && a * a == b * b + c * c) ||
                                  (longest == b && b * b == a * a + c * c) ||
                                  (longest == c && c * c == a * a + b * b);
        
        /*      
        ---- Slower: ----
        boolean isRightTriangle = (longest == a && Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)) ||
                                  (longest == b && Math.pow(b, 2) == Math.pow(a, 2) + Math.pow(c, 2)) ||
                                  (longest == c && Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2));
        */
        
        if (isRightTriangle) {
            IO.println("This IS a right triangle.");
        } else {
            IO.println("This is NOT a right triangle.");
        }
    }
}
