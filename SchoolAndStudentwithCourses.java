import java.util.ArrayList;

class School{
	public String schoolName;
	public ArrayList<Student> students;
	
	public School(String schoolName){
		this.schoolName = schoolName;
		this.students = new ArrayList<>();
	}
	
	//add students
	public void addStudent(Student student){
		this.students.add(student);
	}
	
	//display school details
	public void displayDetails(){
		System.out.println("----------" + schoolName + "-----------");
		
		for(Student st : students){
			System.out.println("Student Name : " + st.name);
			st.displayCourse();
			
			
		}
	}
}

class Course{
	String courseName;
    public ArrayList<Student> enrolledStudents;
	
	public Course(String courseName){
		this.courseName = courseName;
		this.enrolledStudents = new ArrayList<>();
	}
	
	//add students in course
	public void addEnrollStudents(Student student){
	       {
			enrolledStudents.add(student);
			//student.addCourses(this); // ensure bidirectional link
			}
		}
		
		//display enrolled Students
		public void displayenrolledStudents(){
			System.out.println("Enrolled students:");
			System.out.println("Course : " + courseName);
			for(Student student : enrolledStudents){
			    
				System.out.println(student.name);
				}
			}
		
		
		
		
}

class Student{
	public String name;
	public ArrayList<Course> courses;
	
	public Student(String name){
		this.name = name;
		this.courses = new ArrayList<>();
	}
	
    //add courses
	public void addCourses(Course course){
		courses.add(course);
		//course.addStudents(this); // bidirectional link
	}
	
	//display courses
	public void displayCourse(){
		for(Course c : courses){
			System.out.println("Course Name : " + c.courseName);
		}
		
	}
	
	
	
}

class SchoolAndStudentwithCourses{
	public static void main(String[] args){
		School sc1 = new School("TIT School");
		Student st1 = new Student("Pratham Mishra");
		sc1.addStudent(st1);
		Course c1 = new Course("Computer Science");
		st1.addCourses(c1);
		
		c1.addEnrollStudents(st1);
		
		
		
		Student st2 = new Student("Rahul Kumar");
		sc1.addStudent(st2);
		st2.addCourses(c1);
		c1.addEnrollStudents(st2);
		
		sc1.displayDetails();
		c1.displayenrolledStudents();
		
		
		
		
		//second schools
		School sc2 = new School("LNCT School");
		Student st = new Student("Kushgra Gupta");
	    sc2.addStudent(st);
		Course c = new Course("Info. tech");
		st.addCourses(c);
		sc2.displayDetails();
		
		
		
	}
}