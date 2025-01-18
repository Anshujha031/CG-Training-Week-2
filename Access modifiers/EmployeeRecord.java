
import java.util.*;

class employee{
	public int employeeID;
	protected String department;
	private int salary;
	
	public employee(int employeeID , String department , int salary){
		this.employeeID = employeeID;
		this.department = department;
		this.salary = salary;
		}
	
	public int getSalary(){
		return salary;
		}
	
	public void setSalary(int newSalary){
		this.salary = newSalary;
		}
	
	public void diaplay(){
		System.out.println("employeeID " + employeeID);
		System.out.println("department " + department);
		System.out.println("employeeID " + salary);
		}

}


class Manager extends employee{
	
	public Manager(int employeeID , String department , int salary){
		super(employeeID , department , salary);
		}
		
	public void displayManger(){
		System.out.println("employeeID " + employeeID);
		System.out.println("department " + department);
		System.out.println("salary " + getSalary());
		}
}

class EmployeeRecord{
public static void main(String[] args){
	employee em = new employee(101,"CSE",1000);
	em.diaplay();
	Manager m = new Manager(102,"ec",2000);
	m.displayManger();

}
}