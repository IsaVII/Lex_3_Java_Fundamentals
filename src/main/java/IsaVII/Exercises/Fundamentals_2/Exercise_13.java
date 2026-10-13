package IsaVII.Exercises.Fundamentals_2;

import java.util.Locale;

public class Exercise_13 extends Exercise {
    /*
    Ask the user to enter item names and their prices one at a time. When the user types done, 
    stop taking input. Use StringBuilder to build and print a formatted receipt including the 
     total.
    
    Example interaction:
    
    Enter item name (or 'done'): Apple
    Enter price: 15.00
    Enter item name (or 'done'): Milk
    Enter price: 22.50
    Enter item name (or 'done'): Bread
    Enter price: 18.00
    Enter item name (or 'done'): done
    
    ==============================
               Receipt
    ==============================
    Apple                   15.00
    Milk                    22.50
    Bread                   18.00
    ------------------------------
    Grand Total:            55.50
    ==============================
     */

    @Override
    public void run() {
        exerciseNumber = 13;
        super.run();
        
        StringBuilder receipt = new StringBuilder();
        double total = 0.0;
        
        receipt.append(getLine());
        receipt.append("           Receipt\n");
        receipt.append(getLine());
        
        while (true) {
            String itemName = IO.readln("Enter item name (or 'done'): ");
            if (itemName.equalsIgnoreCase("done")) {
                break;
            }
            double price = Double.parseDouble(IO.readln("Enter price: "));
            receipt.append(String.format(Locale.ENGLISH, "%-20s %10.2f%n", itemName, price));
            total += price;
        }
        
        receipt.append("------------------------------\n");
        receipt.append(String.format(Locale.ENGLISH, "Grand Total: %10.2f%n", total));
        receipt.append(getLine());
        
        IO.println(receipt.toString()); 
    }
    
    private String getLine(){
        return "==============================\n";
    }
}
