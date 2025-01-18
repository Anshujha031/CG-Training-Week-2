import java.util.*;

class Book{
	public String title;
	public String author;
	public int price;
	public boolean availability;
	
	//para constructor
	public Book(String title , String author , int price , boolean availability){
		this.title = title;
		this.author = author;
		this.price = price;
		this.availability = availability;
	}
	
	//copy constructor
	public Book(Book b){
		this.title = b.title;
		this.author = b.author;
		this.price = b.price;
		this.availability = b.availability;
		}
	
	public void display(){
		System.out.println("Title " + title);
		System.out.println("author " + author);
		System.out.println("price " + price);
		System.out.println("availability " + availability);
		
	}
	
	public void borrow(){
		if(availability==true){
			System.out.println("Book Borrowed");
			availability = false;
			}
		else{
			System.out.println("Book not available");
			}
		}
}
	class Library_Book_System{
	public static void main(String[] args){
		Book b1 = new Book("DBMS" , "Naveen" , 100 , false);
		b1.display();
		System.out.println("Copy Constructor");
		Book b2 = new Book(b1);
		b2.display();
		b1.borrow();
		
		}
		
	}			