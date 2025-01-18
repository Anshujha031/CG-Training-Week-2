import java.util.*;

class Student{
	public int rollNumber;
	protected String name;
	private int CGPA;
	
	//constructor to initialize student
	public Student(int rollNumber , String name , int CGPA){
		this.rollNumber = rollNumber;
		this.name = name;
		this.CGPA = CGPA;
	}
	
	//get method to get cgpa
	public int getCGPA(){
		return CGPA;
	}
	
	//public method to modify CGPA
	public void setCGPA(int cgpa){
		this.CGPA = cgpa;
	}
	
	//display method
	public void display(){
		System.out.println("rollNumber  " + rollNumber);
		System.out.println("name " + name);
		System.out.println("cgpa + " + CGPA);
		
	}
}

// subclass PostgraduateStudent

class PostgraduateStudent extends Student{
	
	//constructor to initialize the sub class PostgraduateStudent
	public PostgraduateStudent(int rollNumber , String name, int CGPA){
		super(rollNumber , name , CGPA); // calling the superclass constructor
		}
		
	//display method to sub class
	public void displayPostGraduateStudent(){
		System.out.println("Post Graduate Students Details");
		System.out.println("rollNumber " + rollNumber);
		System.out.println("name " + name);
		System.out.println("cgpa " + getCGPA());
		}
	
}

class University_Management_System{
	public static void main(String[] args){
		Student st = new Student(101,"ravi",3);
		st.display();
		
		//modify cgpa
		st.setCGPA(10);
		System.out.println("Updated cgpa " + st.getCGPA());
		
		//creating sub class object
		PostgraduateStudent pst = new PostgraduateStudent(102, "naveen" ,10);
		pst.displayPostGraduateStudent();
	}
}