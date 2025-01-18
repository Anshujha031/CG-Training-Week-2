import java.util.*;

class Vehicle{
	//instance variable
	public String ownerName;
	public String vehicleType;
	
	//class variable
	public static int registrationFee = 1000;
	
	//constructor
	public Vehicle(String ownerName , String vehicleType){
		this.ownerName = ownerName;
		this.vehicleType = vehicleType;
		}
	
	//display method
	public void displayVehicleDetails(){
		System.out.println("Owner name : " + ownerName);
		System.out.println("Vehicle type : " + vehicleType);
		System.out.println("Registration Fee : " + registrationFee);
		}
	
	//class method to update registration Fee
	public static void updateRgistrationFee(int newFee){
		registrationFee = newFee;
		}
	
}

class Vehical_Registration{
	public static void main(String[] args){
		Vehicle v1 = new Vehicle("Naveen" , "TATA");
		v1.displayVehicleDetails();
		Vehicle.updateRgistrationFee(5000);
		v1.displayVehicleDetails();
	}
}