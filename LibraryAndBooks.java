import java.util.ArrayList;

class Book{
	public String title;
	public String author;
	
	public Book(String title , String author){
		this.title = title;
		this.author = author;
		}
		
	public String toString(){
	return "Book{title = \"" + title + " , author = " + author + "}";
		}
	
}

class Library{
	public String name;
	public ArrayList<Book> books;
	
	public Library(String name){
		this.name = name;
		this.books = new ArrayList<>();
		}
		
	//method to add a book to the library
	public void addBook(Book book){
		books.add(book);
		}
		
	//method to display books in library
	public void displayBooks(){
		System.out.println("Library : " + name);
		if(books.isEmpty()){
			System.out.println("No books in the library");
			}
			else{
				for(Book book : books){
					System.out.println(book);
					}
				}
		}
	
}

class LibraryAndBooks{
	public static void main(String[] args){
		 // Create Books
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
		
		 // Create Libraries
        Library library1 = new Library("City Library");
        Library library2 = new Library("Community Library");
		
		//add books to bibrary
		library1.addBook(book1);
		library1.addBook(book2);
		library1.addBook(book3);
		
		//display books in each library
		library1.displayBooks();
		library2.displayBooks();
	}
}


