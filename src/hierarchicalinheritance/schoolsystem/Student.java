package hierarchicalinheritance.schoolsystem;

public class Student extends Person{
    public char grade;

    public Student(String name,int age, char grade){
        super(name, age);
        this.grade = grade;
    }
    @Override
    public void displayRole(){
        System.out.println("Role :  Student");
        super.displayRole();
        System.out.println("Grade : " + grade);
    }
}
