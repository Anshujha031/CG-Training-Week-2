import java.util.*;

class Vehicle{
	//instance variable
	public String ownerName;
	public String vehicleType;
	
	//class variable
	public static int registrationFee = 1000;
	
	final public int registrationNumber;
	
	
	
	//constructor
	public Vehicle(String ownerName , String vehicleType , int registrationNumber){
		this.ownerName = ownerName;
		this.vehicleType = vehicleType;
		this.registrationNumber = registrationNumber;
		}
	
	//display method
	public void displayVehicleDetails(){
		System.out.println("Owner name : " + ownerName);
		System.out.println("Vehicle type : " + vehicleType);
		System.out.println("Registration Fee : " + registrationFee);
		System.out.println("Registration Number : " + registrationNumber);
		}
	
	//class method to update registration Fee
	public static void updateRgistrationFee(int newFee){
		registrationFee = newFee;
		}
	
}

class VehicalRegistration{
	public static void main(String[] args){
		Vehicle v1 = new Vehicle("Naveen" , "TATA" , 10223);
		
		if(v1 instanceof Vehicle){
		v1.displayVehicleDetails();
		}
		Vehicle.updateRgistrationFee(5000);
		v1.displayVehicleDetails();
	}
}