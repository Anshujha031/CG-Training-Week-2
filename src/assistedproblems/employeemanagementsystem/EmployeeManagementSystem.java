package assistedproblems.employeemanagementsystem;

public class EmployeeManagementSystem {
    public static void main(String[] args){

        Employee Manager = new Manager("Naveen Jha" , 25 ,300000000 , 5);
        Employee Developer = new Developer(" Pratham Mishra ",50,20, "Java" );
        Employee Intern = new Intern("Kushgra Gupta" , 23 , 10 ,"Java");

        System.out.println("Manager Details");
        Manager.displayDetails();
        System.out.println("******************");
        System.out.println("Developer Details");
        Developer.displayDetails();
        System.out.println("******************");
        System.out.println("Intern Details");
        Intern.displayDetails();
        System.out.println("*******------*******");
    }
}
