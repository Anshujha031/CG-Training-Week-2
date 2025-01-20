import java.util.*;

class Employee{
	
	static String companyName = "TIT";
	static int totalEmployee;
	public String name;
	final int id;
	public String destination;
	
	Employee(String name , int id ,String destination){
		
		
		this.name = name;
		this.id = id;
		this.destination = destination;
		totalEmployee++;
		}
	
	//display static variable
	static void displayTotalEmployee(){
		System.out.println("Total Employee: " + totalEmployee);
		}
	
	//display method
	public void display(){
		System.out.println("Company Name: " + companyName);
		System.out.println("Name: " + name);
		System.out.println("Id: " + id);
		System.out.println("destination: " + destination);
		this.displayTotalEmployee();
		}
}
class EmployeeManagementSystem{
	public static void main(String[] args){
		Employee e1 = new Employee("Rahul" , 101 , "Gwalior");
		if(e1 instanceof Employee ){
		e1.display();
		}
		Employee e2 = new Employee("Ravi" , 102 , "Gwalior");
		//e2.id = 103; give error not change due to final
		e2.display();
	}
}