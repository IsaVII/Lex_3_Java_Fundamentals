package IsaVII.Exercises.Fundamentals_2;

import java.time.LocalDate;
import java.util.Locale;

public class Exercise_15 extends Exercise {
    /*
    Ask the user to enter their birth year, birth month (1–12), and birth day. 
    Print their current age in full years and how many days remain until their next birthday.
    
    Example interaction:
    
    Enter birth year : 2000
    Enter birth month: 3
    Enter birth day  : 15
    Your age            : 26 years
    Days until birthday : 277
     */

    @Override
    public void run() {
        exerciseNumber = 15;
        super.run();
        
        int birthYear = Integer.parseInt(IO.readln("Enter birth year : "));
        int birthMonth = Integer.parseInt(IO.readln("Enter birth month: "));
        int birthDay = Integer.parseInt(IO.readln("Enter birth day  : "));
        
        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
        
        int age = today.getYear() - birthDate.getYear();
        if (today.isBefore(birthDate.withYear(today.getYear()))) {
            age--;
        }
        
        int daysTillBirthday = (int) java.time.temporal.ChronoUnit.DAYS.between(today, birthDate.withYear(today.getYear() + (today.isAfter(birthDate.withYear(today.getYear())) ? 1 : 0)));
        
        IO.println("Your age            : " + age + " years");
        IO.println("Days until birthday : " + daysTillBirthday);
    }
}
