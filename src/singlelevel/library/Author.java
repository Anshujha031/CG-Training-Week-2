package singlelevel.library;

public class Author extends Book{
    public String bio;
    public Author(String title , int publicatioYear , String bio ){
        super(title,publicatioYear);
        this.bio = bio;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Bio : " + bio);
    }
}
