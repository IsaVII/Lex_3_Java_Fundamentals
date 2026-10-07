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
            case 5 -> new Exercise_5();
            case 6 -> new Exercise_6();
            case 7 -> new Exercise_7();
            default -> throw new IllegalArgumentException("No exercise " + number);
        };
    }
}
