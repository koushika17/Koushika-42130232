package library_management_system;
import java.util.*;
public class Library {
	ArrayList<Book> books = new ArrayList<>();
	Scanner in = new Scanner(System.in);
	
	void addBook() {
		System.out.println("Enter book ID to add: ");
		int id = in.nextInt();
		in.nextLine();
		System.out.println("Enter the book title:");
		String title = in.nextLine();
		books.add(new Book(id,title));
		System.out.println("Book Added Successfully.\n");
		
	}
	
	void removeBook() {
		System.out.println("Enter book ID to remove: ");
		int id = in.nextInt(); 
		books.removeIf(Book -> Book.id == id);
		System.out.println("Book removed successfully.\n");
		
	}
	
	void issueBook() {
		System.out.println("Enter the ID to issue : ");
		int id = in.nextInt();
		for(Book b : books) {
			if(b.id == id && !b.isissued) {
				b.isissued = true;
				System.out.println("Book issued successfully..\n");
				return;
				
			}
			else if(b.id==id) {
			System.out.println("Book is already issued..\n");
			return;
		}
			else {
				System.out.println("Book not found.\n");
				return;

			}
	}
		
		
   
}
	
	
	
	
	
	void returnBook() {
		System.out.println("Enter the book Id to return: ");
		int id = in.nextInt();
		for(Book b : books) {
			if(b.id == id && b.isissued) {
				b.isissued=false;
				System.out.println("Book returend successfully..\n");
				return;
			}
			else {
				System.out.println("Book not found or issued");
				return;
			}
			
		}
	}
	
	void displayBooks() {
		System.out.println("Available Books :");
		for(Book b : books) {
			System.out.println("ID : "+b.id+" , Title: "+b.title+" , Issued: "+(b.isissued?"yes":"No"));
			
		}
		System.out.println(); 
	}
	
	
	
}
