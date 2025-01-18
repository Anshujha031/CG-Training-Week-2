import java.util.*;

class Book{
	private String title;
	private String author;
	private int price;
	
	//default constructor
	public Book(){
		this.title = "Defaulttitle";
		this.author= "Defaultauthor";
		this.price= 500;
		}
	
	//parameterized constructor
	
	public Book(String title , String author , int price){
		this.title = title;
		this.author = author;
		this.price = price;
		}
		
	public void display(){
		 System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
		}
	
	
	public static void main(String[] args){
	    Book b1 = new Book("DBMS" , "Kushgra" , 100);
	    Book b2 = new Book("CPU" , "Pratham" , 120);
		Book b3 = new Book();
		
		System.out.println("Book 1 details: ");
		b1.display();
		System.out.println("Book 1 details: ");
		
		b2.display();
		System.out.println("Book 1 details default: ");
		b3.display();
		}
	
	
}