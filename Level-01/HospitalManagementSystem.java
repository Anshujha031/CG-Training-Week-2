import java.util.*;

class Patient{
	//static varibales
	static String hospitalName = "AIMS";
	static int TotalPatients;
	
	//instance variables
	public String name ;
	public int age;
	public boolean ailment;
	
	//final 
	final public int patientId;
	
	//constructor for instance variables
	public Patient(String name , int age , boolean ailment , int patientId){
		this.name = name;
		this.age = age;
		this.ailment = ailment;
		this.patientId = patientId;
		TotalPatients++;
		}
		
	//static method to get Total Patients
	static void getTotalPatients(){
		System.out.println("Total Patients : " + TotalPatients);
		}
		
	//display all the details
	public void display(){
		System.out.println("Hospital Name : " + hospitalName);
		System.out.println("Patient Name : " + name);
		System.out.println("Patient Age : " + age);
		System.out.println("Ailment : " + ailment);
		getTotalPatients();
		}

}

class HospitalManagementSystem{
    public static void main(String[] args){
		Patient p1 = new Patient("Pratham",102,false,10023);
		Patient p2 = new Patient("Pratham",102,false,10023);
		if(p1 instanceof Patient){
			p1.display();
			}
		p2.display();
}
}