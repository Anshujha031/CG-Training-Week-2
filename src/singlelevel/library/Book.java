package singlelevel.library;

public class Book {
    public String title;
    public int publicationYear;

    public Book(String title , int publicationYear){
        this.title = title;
        this.publicationYear = publicationYear;
    }
    public void displayInfo(){
        System.out.println("Book Details : ");
        System.out.println("Title : " + title);
        System.out.println("Publication year : "+ publicationYear);

    }

}
