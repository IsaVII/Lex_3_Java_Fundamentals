package IsaVII.Exercises;

import java.awt.print.Printable;

public class Exercise_3 extends Exercise {
    /*
    A customer buys 3 items. Each item has a name, a quantity, and a price per unit. Store all values in variables, 
    calculate the total cost for each item and the overall grand total, then print a formatted receipt.

    Expected output:
    
    ==============================
               Receipt
    ==============================
    Apple        2 x 15.00 = 30.00 SEK
    Milk         1 x 22.50 = 22.50 SEK
    Bread        3 x 18.00 = 54.00 SEK
    ------------------------------
    Grand Total:           106.50 SEK
    ==============================
    Think about it: What type should price be — int or double? What happens to your grand total if you use the wrong type?
     If you change one item's quantity, how many lines of code need to change?
    
     */
    
    public void run() {
        exerciseNumber = 3;
        super.run();
        
        Item[] items = new Item[3];
        items[0] = new Item("Apple", 2, 15.00);
        items[1] = new Item("Milk", 1, 22.50);
        items[2] = new Item("Bread", 3, 18.00);
        
        double grandTotal = 0.0;
        IO.println("==============================");
        IO.println("           Receipt");
        IO.println("==============================");
        for (Item item : items) {
            item.printReceiptLine();
            grandTotal += item.totalCost();
        }
        IO.println("------------------------------");
        IO.println(String.format("Grand Total:           %.2f SEK%n", grandTotal));
        IO.println("==============================");
    }
    
    
    private class Item {
        String name;
        int quantity;
        double pricePerUnit;

        public Item(String name, int quantity, double pricePerUnit) {
            this.name = name;
            this.quantity = quantity;
            this.pricePerUnit = pricePerUnit;
        }

        public double totalCost() {
            return quantity * pricePerUnit;
        }
        
        public void printReceiptLine() {
            IO.println(String.format("%-12s %d x %.2f = %.2f SEK%n", name, quantity, pricePerUnit, totalCost()));
        }
    }
}
