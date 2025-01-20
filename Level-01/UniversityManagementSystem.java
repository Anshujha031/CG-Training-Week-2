import java.util.*;

class Student{
	static public String universityName = "TIT";
	
	public String name;
	final int rollNumber;
	public char grade;
	static public int numberOfStudents;
	
	public Student(String name , int rollNumber , char grade){
		this.name = name;
		this.rollNumber = rollNumber;
		this.grade = grade;
		numberOfStudents++;
	}
	
	public static void displayTotalStudents(){
		System.out.println("Total Students : " + numberOfStudents );
	}
	
	public void display(){
		System.out.println("University : " + universityName);
		System.out.println("Name : " + name);
		System.out.println("rollNumber : " + rollNumber);
		System.out.println("grade : " + grade);
		Student.displayTotalStudents();
	}
	
}

// subclass
class PostgraduateStudent extends Student{
	
	//constructor to initialize the sub class PostgraduateStudent
	public PostgraduateStudent(int rollNumber , String name, char grade){
		super(name, rollNumber , grade); // calling the superclass constructor
	}
	
	//display method to sub class
	public void displayPostGraduateStudent(){
		System.out.println("Post Graduate Students Details");
		System.out.println("rollNumber " + rollNumber);
		System.out.println("name " + name);
		System.out.println("grade " + grade);
	}
	
}
class UniversityManagementSystem{
	public static void main(String[] args){
		Student st1 = new Student("Pratham" , 113 , 'C');
		st1.display();
		
		//creating the subclass object
		PostgraduateStudent pst = new PostgraduateStudent(102,"Ns", 'A');
		pst.displayPostGraduateStudent();
	}
}