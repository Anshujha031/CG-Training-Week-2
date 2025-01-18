import java.util.*;

class Course{
	//instance variable
	public String courseName;
	public int duration;
	public int fee;
	
	//class variable
	public  static String InstituteName = "TIT";
	
	//constructor to initialize an objects
	public Course(String courseName , int duration , int fee){
		this.courseName = courseName;
		this.duration = duration;
		this.fee = fee;
		
		}
	
	//display method
	public void display(){
		System.out.println("Course Name: " + courseName);
		System.out.println("Duration: " + duration);
		System.out.println("fee: " + fee);
		System.out.println("Instittution Name " + InstituteName);
		}
	
	//class method to update the institue name
	public static void updateInstituteName(String newInstituteName){
	InstituteName = newInstituteName;
		
		}
	

}

class Online_Course_Management{
	public static void main(String[] args){
		Course c1 = new Course("ComputerScience" , 2 , 5000);
		c1.display();
		Course.updateInstituteName("LNCT");
		c1.display();
		
		
		}

}