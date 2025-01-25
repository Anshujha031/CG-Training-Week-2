package hierarchicalinheritance.schoolsystem;

public class Staff extends Person{
    public Staff(String name, int age){
        super(name, age);
    }

    @Override
    public void displayRole(){
        System.out.println("Role : Staff");
        super.displayRole();
    }
}
