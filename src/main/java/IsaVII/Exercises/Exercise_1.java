package IsaVII.Exercises;

public class Exercise_1 extends Exercise {
    /*
    Store your name, age, and city in variables. Then use those variables to print a formatted profile card.
     Do not hardcode the values directly inside println — they must come from variables.
    
    Expected output:

    ====================
         My Profile
    ====================
    Name : Sofia
    Age  : 22
    City : Stockholm
    ====================
    Think about it: What data type is right for each piece of information? If you later want to change the city,
     how many lines of code need to change?
     */
    
    @Override
    public void run() {
        exerciseNumber = 1;
        super.run();
        
        String name = "Isa";
        int age = 37;
        String city = "Ramsjö";

        IO.println("====================");
        IO.println("     My Profile");
        IO.println("====================");
        IO.println("Name : " + name);
        IO.println("Age  : " + age);
        IO.println("City : " + city);
        IO.println("====================");
    }
}
