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
            case 8 -> new Exercise_8();
            case 9 -> new Exercise_9();
            case 10 -> new Exercise_10();
            case 11 -> new Exercise_11();
            case 12 -> new Exercise_12();
            case 13 -> new Exercise_13();
            case 14 -> new Exercise_14();
            case 15 -> new Exercise_15();
            case 16 -> new Exercise_16();
            case 17 -> new Exercise_17();
            case 18 -> new Exercise_18();
            case 19 -> new Exercise_19();
            case 20 -> new Exercise_20();
            default -> throw new IllegalArgumentException("No exercise " + number);
        };
    }
}
