import java.util.*;

class MovieTicket{
	String movieName;
	int seatNumber;
	int price;
	
	public MovieTicket(String movieName , int seatNumber,int price){
		this.movieName = movieName;
		this.seatNumber = seatNumber;
		this.price = price;
		}
	public void bookTicket(){
		if(price==0){
			System.out.println("A ticket is already booked");
			}
			else{
				System.out.println("Ticket booked successfull");
				price = 0;
				}
		}
	public void display(){
		System.out.println("Movie_Name" + " " + movieName);
		System.out.println("Seat_Number" + " " + seatNumber);
		System.out.println("Price" + " " + price);
		
		}
	
}

class MovieTicketBookingSystem{
	public static void main(String[] args){
	MovieTicket ticket = new MovieTicket("Ragnikanth",101,400);
	ticket.display();
	ticket.bookTicket();
	MovieTicket m = new MovieTicket("Ragnikanth",101,0);
	ticket.display();
	ticket.bookTicket();
	
		
	}
}