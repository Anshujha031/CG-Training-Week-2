import java.util.*;

class HotelBooking{
	
	public String guestName;
	public String roomType;
	public int nights;
	
	
	//dafault
	public HotelBooking(){
		this.guestName = "Pratham";
		this.roomType = "single-Bad";
		this.nights = 1;
		}
	
	//para constructor
	public HotelBooking(String guestName , String roomType , int nights){
		this.guestName = guestName;
		this.roomType = roomType;
		this.nights = nights;
		}
	
	//copy constructor
	public HotelBooking(HotelBooking hotel){
		this.guestName = hotel.guestName;
		this.roomType = hotel.roomType;
		this.nights = hotel.nights;
		}
	
	//display method
	public void display(){
		System.out.println("guestName: " + guestName );
		System.out.println("roomType: " + roomType );
		System.out.println("nights: " + nights );
		
		}

}

class HotelBookingSystem{
	public static void main(String[] args){
		HotelBooking hb1 = new HotelBooking();
		System.out.println("Calling Default Constructor");
		hb1.display();
		
		HotelBooking hb2 = new HotelBooking("Naveen" , "Single-double-bad" , 20000 );
		System.out.println("Calling parameterised constructor");
		hb2.display();
		
		HotelBooking hb3 = new HotelBooking(hb2);
		System.out.println("calling copy Constructor");
		hb3.display();
		}

}