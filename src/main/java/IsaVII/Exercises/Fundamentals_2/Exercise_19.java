package IsaVII.Exercises.Fundamentals_2;

import java.security.PrivateKey;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exercise_19 extends Exercise {
    /*
   Create a class UnitConverter with three pairs of overloaded convert methods:

    convert(double km) → converts kilometres to miles
    convert(double kg, String unit) where unit = "lbs" → converts kilograms to pounds
    convert(double celsius, boolean toFahrenheit) → converts Celsius to Fahrenheit (if true) or Kelvin (if false)
    Ask the user to choose a conversion, enter the value, and print the result rounded to two decimal places.
    
    Example interaction:
    
    Choose conversion:
    1. km → miles
    2. kg → lbs
    3. °C → °F / K
    Enter choice: 1
    Enter value in km: 100
    100.0 km = 62.14 miles
     */

    @Override
    public void run() {
        exerciseNumber = 19;
        super.run();

        IO.println("Choose conversion:");
        IO.println("1. km → miles");
        IO.println("2. kg → lbs");
        IO.println("3. °C → °F / K");
        int choice = Integer.parseInt(IO.readln("Enter choice: "));

        switch (choice) {
            case 1:
                double km = Double.parseDouble(IO.readln("Enter value in km: "));
                double miles = convertKmToMiles(km);
                IO.println(String.format("%.2f km = %.2f miles", km, miles));
                break;

            case 2:
                double kg = Double.parseDouble(IO.readln("Enter value in kg: "));
                double lbs = convertKgToLbs(kg);
                IO.println(String.format("%.2f kg = %.2f lbs", kg, lbs));
                break;

            case 3:
                double celsius = Double.parseDouble(IO.readln("Enter value in °C: "));
                double fahrenheit = convertCelsiusToFahrenheit(celsius);
                double kelvin = convertCelsiusToKelvin(celsius);
                IO.println(String.format("%.2f °C = %.2f °F = %.2f K", celsius, fahrenheit, kelvin));
                break;

            default:
                IO.println("Invalid choice.");
        }
    }

    private double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    private double convertKgToLbs(double kg) {
        return kg * 2.20462;
    }

    private double convertCelsiusToFahrenheit(double celsius) {
        return celsius * 9.0 / 5 + 32;
    }

    private double convertCelsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }
}
