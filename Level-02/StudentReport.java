import java.util.*;

class Student{
	public String name;
	public int rollnumber;
	public int[] marks;
	
	public Student(String name , int rollnumber ,int[] marks){
		this.name = name;
		this.rollnumber = rollnumber;
		this.marks = marks;
		}
	
	public char gradeCalculator(int[] marks){
	double percentage = (marks[0]+marks[1]+marks[2])/100;
	
	if(percentage>=90){
	return 'A';
	}
	else if(percentage>=80){
		return 'B';
		}
	else if(percentage>=70){
		return 'C';
		}
	else{
		return 'D';
		}
		
		
		
		}
		
    public void display(){
		System.out.printf("%-20s%-30d%-10d%-10d%-10d%-10s%n" , name , rollnumber ,marks[0], marks[1], marks[2] , gradeCalculator(marks));
		
		}
	
}

class StudentReport{
	public static void main(String[] args){
	
	    int[] marks1 = {40,40,10};
	    int[] marks2 = {10,40,10};
	    int[] marks3 = {30,40,0};
	    
		Student st1 = new Student("Naveen",101,marks1);
		Student st2 = new Student("Kushgra",102,marks2);
		Student st3 = new Student("Pratham",103,marks3);
		System.out.printf("%-20s%-30s%-10s%-10s%-10s%-10s%n" , "name" , "rollnumber", "maths" , "chemistry" , "physics" , "gradeCalculator");
		System.out.println("---------------------------------------------------------------------------------------------------------------");
		st1.display();
		st2.display();
		st3.display();
		
	}
	
}