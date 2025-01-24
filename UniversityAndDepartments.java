import java.util.ArrayList;

class Department{
	 public String dpName;
	 
	 public Department(String dpName){
		 this.dpName = dpName;
		 }


}

class Faculty{
	public String fName;
	public int fId;
	
	public Faculty(String fName , int fId){
		this.fName = fName;
		this.fId = fId;
		}

}

class University{
     public String uName;
	 public ArrayList<Department> departments;
	 public ArrayList<Faculty> faculties;
	 
	 public University(String name){
		 this.uName = uName;
		 this.departments = new ArrayList<>();
		 this.faculties = new ArrayList<>();
		 }
		 
	//add university
	public void addDepartment(Department department){
	departments.add(department);
		}
		
	//add faculties
	public void addFaculty(Faculty faculty){
		faculties.add(faculty);
		}
	
	public void showDepartments(){
		System.out.println("Department ");
		for(Department department : departments){
			System.out.println("-" + department.dpName);
			}
		}
		
	public void showFaculties(){
		System.out.println("Faculties ");
		for(Faculty faculty : faculties){
		System.out.println(faculty.fName);
		System.out.println(faculty.fId);
			
			}
		}
		
	//deletion of the university
	public void deleteUniversity() {
        System.out.println(uName + " is being deleted...");
        departments.clear(); // Composition: Deleting University deletes Departments
        System.out.println("All departments have been deleted.");
    }

}

class UniversityAndDepartments{
public static void main(String[] args){
	University u = new University("Tech University");
	
	Department cse = new Department("Computer Science");
	Department math = new Department("Maths");
	
	u.addDepartment(cse);
	u.addDepartment(math);
	
	Faculty f = new Faculty("Prof Naveen Jha" , 101);
	Faculty f1 = new Faculty("Prof Pratham mishra" , 102);
	
	u.addFaculty(f);
	u.addFaculty(f1);
	
	u.showDepartments();
	u.showFaculties();
	
	u.deleteUniversity();
	
}

}