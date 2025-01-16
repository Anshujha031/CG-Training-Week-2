import java.util.*;

class Item{
	public int itemCode;
	public String itemName;
	public int price;
	
	public Item(int itemCode , String itemName , int price){
		this.itemCode=itemCode;
		this.itemName=itemName;
		this.price=price;
		}
		
	
	
	public void display(int quantity){
		
		System.out.printf("%-15s%-20s%-10d%-10d%-10d%n", itemCode, itemName , price, quantity, cost(quantity));
		
		}
	
	public int cost(int quantity){
		return price * quantity;
		}
	
	
}

class TrackInventoryOfItems{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Item sc1 = new Item(101 , "Pen" ,200 );
		Item sc2 = new Item(102 , "Pencil" , 300);
		Item sc3 = new Item(103 , "Box" , 400);
		System.out.printf("%-15s%-20s%-10s%-10s%-10s%n", "itemCode", "itemName" , "price" , "Quantity" , "TotalCost");
		System.out.println("---------------------------------------------------");
		sc1.display(3);
		sc2.display(4);
		sc3.display(5);
		
		}
	
}