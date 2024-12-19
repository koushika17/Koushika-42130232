package library_management_system;

public class Book {
	int id;
	String title;
	boolean isissued = false;
	
	Book(int id,String title){
		this.id=id;
		this.title = title;
		this.isissued = false;
	}

}
