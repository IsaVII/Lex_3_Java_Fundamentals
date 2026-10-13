package IsaVII.Exercises.Fundamentals_2;

public class Exercise_7 extends Exercise {
    /*
    Ask the user to enter the radius of a circle. Calculate and print the area and the circumference. Round both results to two decimal places.
    
    Formulas:
    
    Area: π × r²
    Circumference: 2 × π × r
    Example interaction:
    
    Enter radius: 7
    Area         : 153.94
    Circumference: 43.98
     */

    @Override
    public void run() {
        exerciseNumber = 7;
        super.run();
    
        double radius = Double.parseDouble(IO.readln("Enter radius: "));
        double area = Math.PI * Math.pow(radius, 2);
        double circumference = 2 * Math.PI * radius;
        IO.println("Area         : " + String.format("%.2f", area));
        IO.println("Circumference: " + String.format("%.2f", circumference));
    }
}
