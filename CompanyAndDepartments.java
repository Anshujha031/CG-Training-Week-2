import java.util.ArrayList;
class Employee{
	public String name;
	public int id;
	
	//constructor
	public Employee(String name , int id){
		this.name = name;
		this.id = id;
	}
	
	
}

class Department{
	public String dName;
	public ArrayList<Employee> employees;
	
	//constructor
	public Department(String name){
		this.dName = name;
		
		this.employees = new ArrayList<>();
	}
	
    //display employees method
	public  void displayEmployee(){
		System.out.println("********Employees*********");
		for(Employee em : employees){
			
			System.out.println(em.name);
			System.out.println(em.id);
			
		}
	}
	//add employees
	public  void addEmployee(String name , int id ){
		Employee e1 = new Employee(name , id);
		employees.add(e1);
		
	}
}

class Company{
	public String name;
	public ArrayList<Department> departments;
	
	//constructor
	public Company(String name){
		this.name = name;
		this.departments = new ArrayList<>();
	}
	
	//method to add departments
	public void addDepartment(Department d1){
		departments.add(d1);
		
	}
	
	//display method to display all company details
	public  void displayCompanyDetails(){
		System.out.println("************ " + name + " ***************");
		for(Department dp : departments){
			System.out.println(dp.dName);
			dp.displayEmployee();
		}
	}
	
}

class CompanyAndDepartments{
	public static void main(String[] args){
		
		Company c = new Company("Capgemini");
		Department d1 = new Department("Computer Science");
		c.addDepartment(d1);
		d1.addEmployee("Naveen",101);
		c.displayCompanyDetails();
		
		
		
		
	}
}