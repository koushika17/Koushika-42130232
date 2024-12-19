package library_management_system;
import java.util.*;
public class MainLibrary {

	public static void main(String[] args) {
		
     Library l = new Library();
     Scanner in = new Scanner(System.in); 
     int choice;
     
     do {
         System.out.println("=== Library Management System ===");
         System.out.println("1. Add Book");
         System.out.println("2. Remove Book");
         System.out.println("3. Issue Book");
         System.out.println("4. Return Book");
         System.out.println("5. Display Available Books");
         System.out.println("6. Exit");
         System.out.print("Enter your choice: ");
         choice = in.nextInt();

         switch (choice) {
             case 1:
                 l.addBook();
                 break;
             case 2:
                 l.removeBook();
                 break;
             case 3:
                 l.issueBook();
                 break;
             case 4:
                 l.returnBook();
                 break;
             case 5:
                 l.displayBooks();
                 break;
             case 6:
                 System.out.println(" Thank you!");
                 break;
             default:
                 System.out.println("Invalid choice. Try again.\n");
         }
     }
     while (choice != 6);
     in.close();


	}

}
