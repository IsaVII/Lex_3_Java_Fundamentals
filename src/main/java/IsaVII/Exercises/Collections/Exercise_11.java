package IsaVII.Exercises.Collections;

/*
HasMap, because there we can store the students name and their grade as key-value pairs.
Sorting step: creating an ArrayList of the names (the HashMap's keys), then sorting that ArrayList
by looking up each name's grade in the HashMap (decreasing order).
  */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class Exercise_11 extends Exercise {
    /*
    You need to store and look up student grades by name.

    Each student has exactly one grade (0–100)
    You need to find a student's grade quickly by name
    You also need to print all students sorted by grade from highest to lowest
    Before writing any code: which collection fits best for storage, and how will you handle the sorting step?
    Write your answer as a comment at the top of your class.
    
    Then implement it with at least 6 students.
     */
    
    @Override
    public void run() {
        exerciseNumber = 11;
        super.run();

        HashMap<String, Integer> studentGrades = new HashMap<>();
        studentGrades.put("Xemnas", 100);
        studentGrades.put("Xigbar", 75);
        studentGrades.put("Saix", 99);
        studentGrades.put("Axel", 41);
        studentGrades.put("Ansem", 88);
        studentGrades.put("Demyx", 62);

        //find student's grade
        String studentName = "Xemnas";
        Integer grade = studentGrades.get(studentName);
        IO.println(studentName + "'s grade: " + grade);

        //print all students sorted by grade from highest to lowest
        List<String> sortedNames = new ArrayList<>(studentGrades.keySet());
        sortedNames.sort(gradeComparator(studentGrades));

        IO.println("\nStudents sorted by grade (highest to lowest):");
        for (String name : sortedNames) {
            IO.println(name + ": " + studentGrades.get(name));
        }
    }
    
    private Comparator<String> gradeComparator(HashMap<String, Integer> studentGrades) {
        return (nameA, nameB) -> studentGrades.get(nameB) - studentGrades.get(nameA);
    }
     
}
