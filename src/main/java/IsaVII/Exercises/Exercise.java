package IsaVII.Exercises;

public abstract class Exercise {

    protected int exerciseNumber;
    
    public void run() {
        IO.println("***** Exercise " + exerciseNumber + " *****");
        
    }
}
