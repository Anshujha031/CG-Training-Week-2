import java.util.*;

class Book{
	//instance variaable
	public int isbn;
	protected String title;
	private String author;
	
	public Book(int isbn , String title , String author){
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		}
	
	public String getAuthor(){
		return author;
		}
	
	public void setAuthor(String newAuthor){
	   this.author = newAuthor;
		
		}
	
	public void display(){
		System.out.println("isbn number " + isbn);
		System.out.println("title " + title);
		System.out.println("author " + author);
		}
	
}

class EBook extends Book{
	
	public EBook(int isbn , String title , String author ){
	super(isbn , title , author);
	}
	
	public void displayEBook(){
		System.out.println("EBook Details");
		System.out.println("isbn number " + isbn);
		System.out.println("title " + title);
		System.out.println("author " + getAuthor());
		}
	
}

class Book_Library_System{
	public static void main(String[] args){
	Book b1 = new Book(101,"DBMS","Kumar");
	b1.display();
	EBook e1 = new EBook(102,"subclass" , "sanu");
	e1.display();
		
	}
}