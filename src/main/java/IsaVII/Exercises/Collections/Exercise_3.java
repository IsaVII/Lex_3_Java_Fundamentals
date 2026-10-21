package IsaVII.Exercises.Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import static java.util.Arrays.asList;

public class Exercise_3 extends Exercise {
    /*
      Build a simple phone book.
    
    Store at least 4 contacts as name → phone number pairs
    Ask the user to enter a name and look it up
    Print the phone number if found, or Contact not found. if not
     */
    
    @Override
    public void run() {
        exerciseNumber = 3;
        super.run();
        
        HashMap<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Xemnas", "071-2345678");
        phoneBook.put("Xigbar", "072-3456789");
        phoneBook.put("Xaldin", "073-4567890");
        phoneBook.put("Vexen", "074-5678901");  
        
        String name = IO.readln("Enter a name to look up: ");
        String phoneNumber = phoneBook.get(name);   
        
        if (phoneNumber != null) {
            IO.println("Phone number: " + phoneNumber);
        } else {
            IO.println("Contact not found.");
        }       
 
    }
    
    
    
}
