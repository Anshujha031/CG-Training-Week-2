import java.util.*;

class EmployeeDetails{
	
	public String name;
	private int id;
	public int salary;
	
	
	public EmployeeDetails(String name , int id , int salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public void Display(){
		System.out.println("Employee Details: ");
		System.out.println("Name: " + name);
		System.out.println("Id: " + id);
		System.out.println("Salary: " + salary);
	}
}
	
class Main{
	public static void main(String[] args){
		
		EmployeeDetails emp = new EmployeeDetails("Naveen",101,30000000);
		
		emp.Display();
	}
}
