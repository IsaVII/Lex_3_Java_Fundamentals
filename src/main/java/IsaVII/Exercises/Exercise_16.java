package IsaVII.Exercises;

public class Exercise_16 extends Exercise {
    
    /*
    
    The user enters integers one at a time. After each entry, print the current total and how many numbers have been
     entered so far. When the user enters 0, stop and print a final summary including the average. 
     Do not include 0 in the total or the count.

    Example interaction:
    
    Enter a number (0 to stop): 10
    Total: 10 | Count: 1
    Enter a number (0 to stop): 30
    Total: 40 | Count: 2
    Enter a number (0 to stop): 20
    Total: 60 | Count: 3
    Enter a number (0 to stop): 0
    --- Summary ---
    Count:   3
    Total:   60
    Average: 20.0
    Think about it: total and count are both int. What happens when you divide them? What type must the average be, 
    and how do you force an int division to produce a decimal result?
     */
    
    
    @Override
    public void run() {
        exerciseNumber = 16;
        super.run();
        
        int total = 0;
        int count = 0;
        while (true) {
            int number = Integer.parseInt(IO.readln("Enter a number (0 to stop): "));
            if (number == 0) {
                break;
            }
            total += number;
            count++;
            IO.println("Total: " + total + " | Count: " + count);
        }
        double average = count == 0 ? 0 : (double) total / count;
        IO.println("--- Summary ---");
        IO.println("Count:   " + count);
        IO.println("Total:   " + total);
        IO.println("Average: " + average);
    }
}
