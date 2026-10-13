package IsaVII.Exercises.Fundamentals_2;

public class Exercise_20 extends Exercise {
    /*
   Ask the user to enter their name, birth date (yyyy-MM-dd), city, and email. Calculate their age from the birth date. Use StringBuilder to build and print a formatted profile card.

    Example interaction:
    
    Enter name      : Sofia Karlsson
    Enter birth date: 1998-04-22
    Enter city      : Stockholm
    Enter email     : sofia@mail.com
    
    ╔══════════════════════════════╗
    ║         Profile Card         ║
    ╠══════════════════════════════╣
    ║ Name  : Sofia Karlsson       ║
    ║ Age   : 28                   ║
    ║ City  : Stockholm            ║
    ║ Email : sofia@mail.com       ║
    ╚══════════════════════════════╝
     */

    @Override
    public void run() {
        exerciseNumber = 20;
        super.run();

        //get user input
        String name = IO.readln("Enter name      : ");
        String birthDateStr = IO.readln("Enter birth date: ");
        String city = IO.readln("Enter city      : ");
        String email = IO.readln("Enter email     : "); 
        
        // Calculate age
        java.time.LocalDate birthDate = java.time.LocalDate.parse(birthDateStr);
        java.time.LocalDate currentDate = java.time.LocalDate.now();
        int age = java.time.Period.between(birthDate, currentDate).getYears();
        
        // Build profile card using StringBuilder
        StringBuilder profileCard = new StringBuilder();
        profileCard.append("╔══════════════════════════════╗\n");
        profileCard.append("║         Profile Card         ║\n");
        profileCard.append("╠══════════════════════════════╣\n");
        profileCard.append(String.format("║ Name  : %-20s ║\n", name));
        profileCard.append(String.format("║ Age   : %-20d ║\n", age));
        profileCard.append(String.format("║ City  : %-20s ║\n", city));
        profileCard.append(String.format("║ Email : %-20s ║\n", email));
        profileCard.append("╚══════════════════════════════╝\n");   
        
        IO.println(profileCard.toString());
      
    }

}
