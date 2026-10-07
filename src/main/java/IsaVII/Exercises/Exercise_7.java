package IsaVII.Exercises;

public class Exercise_7 extends Exercise{

    /*
    Ask the user to enter a number of seconds. Convert and print it as hours, minutes, and 
    remaining seconds in HH:MM:SS format.

    Example interaction:
    
    Enter seconds: 86399
    23:59:59
    Think about it: Which operator gives you the whole hours from a total number of seconds? Which operator gives 
    you the leftover seconds after removing the hours? Work it out step by step before writing any code.
     */


    @Override
    public void run() {
        exerciseNumber = 7;
        super.run();

        int totalSeconds = Integer.parseInt(IO.readln("Enter seconds: "));
        //hah! did that often enough in game development for the game-time 
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        IO.println(String.format("%02d:%02d:%02d", hours, minutes, seconds));
    }
}
