package hierarchicalinheritance.schoolsystem;

public class SchoolMain {
    public static void main(String[] args){
        Person p1 = new Teacher("Naveen Jha",25,"Physics");
        Person p2 = new Student("Pratham mishra",20,'C');
        Person p3 = new Staff("Kussu",50);

        System.out.println("Persons in School :");
        System.out.println("-----------------------------");
        p1.displayRole();
        System.out.println("-----------------------------");
                p2.displayRole();
        System.out.println("--------------------------------");
        p3.displayRole();

    }
}
