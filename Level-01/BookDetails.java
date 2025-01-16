import java.util.*;

class Book{
	public String title;
	public String author;
	public int price;
	
	public Book(String t , String a , int p){
		this.title = t;
		this.author = a;
		this.price = p;
		}
	
	public void display(){
		System.out.printf("%-20s%-20s%-5d%n", title, author , price);
		}
}

class BookDetails{
	public static void main(String[] args){
	Book b1 = new Book("DBMS","Kushagra",100);
	Book b2 = new Book("CN","Pratham",200);
	System.out.printf("%-20s%-20s%-5s%n", "Title", "Author" , "Price");
	System.out.println("---------------------------------------------");
	
		b1.display();
		b2.display();
	}
}