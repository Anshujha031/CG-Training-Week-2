import java.util.*;

class MobilePhone{
	public String brand;
	public int model;
	public int price;
	
	public MobilePhone(String b , int m , int p){
		this.brand = b;
		this.model = m;
		this.price = p;
		}
	
	public void display(){
		System.out.println("MobilePhone Details");
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Price: "+ price);
		}
	
}

class HandleMobilePhoneDetails{
	public static void main(String[] args){
		MobilePhone mp = new MobilePhone("Vivo" , 101 , 20000 );
		MobilePhone mp1 = new MobilePhone("Samsung" , 102 , 30000 );
		mp.display();
		System.out.println("--------------------------------------");
		mp1.display();
		
		}
}
