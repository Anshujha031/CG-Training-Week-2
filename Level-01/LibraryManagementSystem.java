import java.util.*;

class Book{
	
	//static variable
	static String libraryName = "TIT";
	
	//instance variable
	public String title;
	private String author;
	
	//final variable
	final int isbn;
	
	
	
	//constructor to initialize instance 
	public Book(String title ,  String author ,int isbn ){
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	
		
		}
		
	
    
	
	//static method to display library name
	static void displayLibraryName(){
		System.out.println("Library Name: " + libraryName);
		}
		
	//display method for instance
	public void displayLibraryDetails(){
		this.displayLibraryName();
		System.out.println("Title: " + title );
		System.out.println("Author Name: " + author );
		System.out.println("ISBN No: " + isbn );
		}
	
	
}

class LibraryManagementSystem{
	public static void main(String[] args){
	Book b1 = new Book("DBMS" , "Ravi", 101);
	
	b1.displayLibraryDetails();
		
	}
}