import java.util.ArrayList;

class Customer{
	public String name;
	private int accountNo;
	private int balance;
	
	public Customer(String name , int accountNo , int balance){
		this.name = name;
		this.accountNo = accountNo;
		this.balance = balance;
	}
	
	//get accountNo
	public int getaccountNo(){
		return accountNo;
	}
	
	//get balance
	public int getBalance(){
		return balance;
	}
	//set balance
	public  void  setBalance(int newBalance){
		balance+=newBalance;
	}
	
	//method to display balance
	public  void viewBalance(){
	    System.out.println("Total Balance : " + getBalance());
	}
	
}

class Bank{
	public String bankName;
	public ArrayList<Customer> customers;
	
	public Bank(String bankName){
		this.bankName = bankName;
		this.customers = new ArrayList<>(); 
	}
	
	//method to open accountNo
	public void openAccount(String name , int accountNo , int balance){
		Customer c1 = new Customer(name , accountNo , balance);
		customers.add(c1);
	}
	
	public void openAccount(Customer c){
		customers.add(c);
		}
	
	public void display(){
		System.out.println("****** " + bankName + " *******");
		
		for(Customer customer : customers){
			System.out.println("Name: " + customer.name );
				System.out.println("Account No: " + customer.getaccountNo() );
			System.out.println("Balance: " + customer.getBalance());
			customer.viewBalance();
		}
	}
	
}

class BankAndAccountHolder{
	public static void main(String[] args){
		
		Customer c1 = new Customer("Kussu" , 101 , 1000);
		Customer c2 = new Customer("Pratham" , 102 , 2000);
		
		Bank b1 = new Bank("SBI");
		
		//open an account
		b1.openAccount("Naveen",103,8000000);
		b1.openAccount(c1);
		
		
		b1.display();
		
	}
}