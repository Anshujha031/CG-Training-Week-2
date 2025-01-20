import java.util.*;

 class Product{
	//static variables
	static public int discount = 20;
	
	//instance variables
	public String productName;
	public int price;
	public int quantity;
	
	//final 
	final public int productID;
	
	public Product(int quantity ,String productName , int price , int productID ){
		this.productName = productName;
		this.productID = productID;
		this.price = price;
		this.quantity =quantity;
	}
	
	//method to update Discount
	static void updateDiscount(int ud){
	  discount =ud;
		
		}
		
	public void display(){
		System.out.println("Product Name : " + productName);
		System.out.println("Product Id : " + productID);
		System.out.println("Price : " + price);
		System.out.println("quantity : " + quantity);
		System.out.println("Total discount :" + Product.discount);
		}
}

class ShoppingCartSystem{
	public static void main(String[] args){
	Product p1 = new Product(200,"Pen" , 100 , 101);
	p1.updateDiscount(100);
	if(p1 instanceof Product){
		p1.display();
		}
	
		
	}
}