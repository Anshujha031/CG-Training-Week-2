import java.util.*;

class Product{
	
	//instance variable
	public String productName;
	public int price;
	
	//class variable
	public static int totalProduct;
	
	public Product(String productName , int price){
		this.productName = productName;
		this.price = price;
		totalProduct++;
		
		}
		
		
	public void displayProductDetails(){
		System.out.println("ProductName " + productName );
		System.out.println("Price " + price );
		
		}
	
	//class method to display total productName
	public static void displayTotalProduct(){
		System.out.println("Total Product " + totalProduct);
		}
	
	

}

class Product_Inventory{
	public static void main(String[] args){
   Product p1 = new Product("Pen" , 100);
   Product p2 = new Product("pencil" , 200);
   p1.displayProductDetails();
   p2.displayProductDetails();
  Product.displayTotalProduct();
	}
}