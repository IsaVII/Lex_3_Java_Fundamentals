package IsaVII.Exercises;

public abstract class Exercise {

    protected int exerciseNumber;
    
    public void run() {
        IO.println("***** Exercise " + exerciseNumber + " *****");
        
    }

    public static Exercise of(int number) {
        return switch (number) {
            case 1 -> new Exercise_1();
            case 2 -> new Exercise_2();
            case 3 -> new Exercise_3();
            case 4 -> new Exercise_4();
            default -> throw new IllegalArgumentException("No exercise " + number);
        };
    }
}
