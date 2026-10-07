package IsaVII.Exercises;

public class Exercise_12 extends Exercise{
   /*
   Ask the user to enter a score between 0 and 100. Print the matching letter grade. If the score is outside that 
   range, print an error message.

    Score	Grade
    90 to 100	A
    80 to 89	B
    70 to 79	C
    60 to 69	D
    0 to 59	F
    Example interaction:
    
    Enter score: 85
    Grade: B
    Think about it: If you order your else if branches from highest to lowest, how many comparisons do you actually need 
    per branch? Can you reduce each branch to just one condition?
    */
   
    @Override
    public void run() {
        exerciseNumber = 12;
        super.run();
        
        int score = Integer.parseInt(IO.readln("Enter score: "));
        
        String grade;
        if (score < 0 || score > 100) {
            grade = "Error: Score must be between 0 and 100.";
        } else if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        IO.println("Grade: " + grade);
    }

}
