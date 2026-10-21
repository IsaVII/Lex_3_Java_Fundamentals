package IsaVII.Exercises.Collections;

/*
For this scenario, we use a Queue collection, since it has the first-in, first-out behavior 
with pull and push operations.  
(Since the queue was not part of our introduction to collection, an ArrayList would be the other option).
  */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

import static java.util.Arrays.asList;

public class Exercise_10 extends Exercise {
    /*
     You are managing a waiting queue outside a concert venue.

    People join the back of the queue and are let in from the front (first in, first out)
    You need to add people and remove the next person in line efficiently
    Before writing any code: which collection fits this scenario, and why?
    Write your answer as a comment at the top of your class.
    
    Then implement it:
    
    Add at least 6 people to the queue
    Let in (remove and print) 2 people from the front
    Print the remaining queue in order
     */
    
    @Override
    public void run() {
        exerciseNumber = 10;
        super.run();

        //**** QUEUE *******
        IO.println("Using Queue:");
        Queue<String> queue = new LinkedList<>();
        //People are joining one by one 
        queue.add("Xemans");
        queue.add("Xigbar");
        queue.add("Saix");
        queue.add("Axel");
        queue.add("Ansem");
        
        IO.println("People in the queue: " + queue.toString());
        
        //Let in 2 people from the front
        IO.println("Letting in: " + queue.poll());
        IO.println("Letting in: " + queue.poll());
        
        IO.println("Remaining people in the queue: " + queue.toString());
        
        
        
        //**** ARRAY LIST *******
        IO.println("\n ***************\nUsing ArrayList:");
        ArrayList<String> waitingList = new ArrayList<>();
        //People are joining one by one
        waitingList.add("Xemans");
        waitingList.add("Xigbar");
        waitingList.add("Saix");
        waitingList.add("Axel");
        waitingList.add("Ansem");
        
        IO.println("People in the waiting list: " + waitingList.toString());
        
        //Let in 2 people from the front
        IO.println("Letting in: " + waitingList.remove(0));
        IO.println("Letting in: " + waitingList.remove(0));
        
        IO.println("Remaining people in the waiting list: " + waitingList.toString());
        
        
    }
    
     
}
