package IsaVII.Exercises.Collections;

import java.util.ArrayList;

import static java.util.Arrays.asList;

public class Exercise_1 extends Exercise {
    /*
    You are managing a shopping list.

    Create an ArrayList<String> and add 5 items
    Print all items numbered (1, 2, 3…)
    Remove one item by name
    Print the updated list
     */
    
    @Override
    public void run() {
        exerciseNumber = 1;
        super.run();

        ArrayList<String> shoppingList = new ArrayList<>(asList("Salad", "Tomatoes", "Flour", "Eggs", "Milk"));
        
        printList(shoppingList);
        
        shoppingList.remove("Salad");
        
        IO.println("Updated shopping list:");
        printList(shoppingList);
    }
    
    private void printList(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            IO.println((i + 1) + ". " + list.get(i));
        }
    }
}
