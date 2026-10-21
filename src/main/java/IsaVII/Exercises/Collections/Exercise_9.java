package IsaVII.Exercises.Collections;

/*
 The most fitting collection is a HashSet because it automatically handles duplicates. 
 When a student submits their homework,  their name is being added to the HashSet. 
 If the student has already submitted (is already in the HashSet), we can print a rejection message. 
  */

import java.util.ArrayList;
import java.util.HashSet;

import static java.util.Arrays.asList;

public class Exercise_9 extends Exercise {
    /*
     You are building a homework submission tracker.
    
    A student can only submit once — duplicates must be rejected with a message
    You only need to know whether a student has submitted, not what they submitted
    The order submissions arrived in does not matter
    Before writing any code: which collection fits this scenario, and why?
    Write your answer as a comment at the top of your class.
    
    Then implement it:
    
    Add at least 8 student submissions (include some duplicates)
    Print a rejection message when a duplicate is detected
    Print all submitted students when done
     */
    
    @Override
    public void run() {
        exerciseNumber = 9;
        super.run();

        ArrayList<Submission> submissions = new ArrayList<>(asList(
                new Submission("Xemnas", "Homework 1"),
                new Submission("Vexen", "Homework 1"),
                new Submission("Saix", "Homework 1"),
                new Submission("Saix", "Homework 2"), // Duplicate
                new Submission("Axel", "Homework 1"),
                new Submission("Axel", "Homework 2"), // Duplicate
                new Submission("Roxas", "Homework 1"),
                new Submission("Xemnas", "Homework 2") // Duplicate
        ));
        
        //check for duplicates
        HashSet<String> submittedStudents = new HashSet<>();
        for (Submission submission : submissions) {
            String studentName = submission.getStudentName();
            
            if (submittedStudents.contains(studentName)) {
                IO.println("Duplicate submission detected for student: " + studentName);
            } else {
                submittedStudents.add(studentName);
            }
        }
        
        IO.println("All submitted students: " + submittedStudents);
    }
    
    public class Submission{
        String studentName;
        String submissionContent;
        
        public Submission(String studentName, String submissionContent) {
            this.studentName = studentName;
            this.submissionContent = submissionContent;
        }
        
        public String getStudentName() {
            return studentName;
        }
    }
}
