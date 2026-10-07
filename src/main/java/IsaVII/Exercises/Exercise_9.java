package IsaVII.Exercises;

public class Exercise_9 extends Exercise{
    /*
    Ask the user to enter a temperature in Celsius. Convert it to both Fahrenheit and Kelvin and print all three values.

    Formulas:
    
    °F = °C × 9.0 / 5 + 32
    K = °C + 273.15
    Example interaction:
    
    Enter temperature in Celsius: 100
    Celsius:    100.0 °C
    Fahrenheit: 212.0 °F
    Kelvin:     373.15 K
    Think about it: What happens if you write 9 / 5 using two int literals? Try it and observe the result. Why does it go 
    wrong, and how do you fix it?
     */
    
    @Override
    public void run() {
        exerciseNumber = 9;
        super.run();

        double celsius = Double.parseDouble(IO.readln("Enter temperature in Celsius: "));
        double fahrenheit = celsius * 9.0 / 5 + 32;
        double kelvin = celsius + 273.15;

        IO.println("Celsius:    " + celsius + " °C");
        IO.println("Fahrenheit: " + fahrenheit + " °F");
        IO.println("Kelvin:     " + kelvin + " K");
        
        IO.println("Comment: if using  9 / 5 in the calculation instead of 9.0 / 5, the result will be 1 instead of 1.8, because integer " +
                "division truncates the decimal part.");
        
    }
}
