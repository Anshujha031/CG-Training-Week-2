import java.util.*;

class CarRental{
	public String customerName;
	public String carModel;
	public int rentalDays;
	public int rentPrice;
	
	//para constructor
	public CarRental(String customerName , String carModel ,int rentalDays , int rentPrice){
	 this.customerName = customerName;
	 this.carModel = carModel;
	 this.rentalDays = rentalDays;
	 this.rentPrice = rentPrice;
		
		}
	
	//constructor to calculate the total cost
	public static void totalCost(int rentDays , int rentPrice){
		System.out.println("Total_Cost " + rentDays*rentPrice);
		}
		
		
	//display method
	public void display(){
	System.out.println("CustomerName " + customerName);
	System.out.println("CarModel " + carModel);
	System.out.println("RentalDays " + rentalDays);
	System.out.println("RentPrice " + rentPrice);
	
		
		}
	
}

class Car_Rental_System{
	public static void main(String[] args){
		CarRental c1 = new CarRental("Pratham" , "Alto" , 5 , 100);
		
		System.out.println("Rental Details");
		c1.display();
		CarRental.totalCost(5,100);
		
		}
}
