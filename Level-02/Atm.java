import java.util.*;

class BankAccount{
	public String accountHolder;
	private int accountNumber;
	private int balance;
	
	public BankAccount(String accountHolder , int accountNumber , int balance){
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance=balance;
	}
	
	public void deposite(int amt){
		balance = balance+amt;
	}
	
	public void withdrawing(int amt){
		
		
		 if(amt>balance){
			System.out.println("In sufficient balance");
			}
		 else{
			balance = balance-amt;
		}
		
	}
	
	public void display(){
	  System.out.println("accountHolder " + accountHolder);
	  System.out.println("accountNumber " + accountNumber);
	  System.out.println("currentBalance " + balance);
		
	}
	
}

class Atm{
	public static void main(String[] args){
	BankAccount p1 = new BankAccount("Naveen",101,1000);
	BankAccount p2 = new BankAccount("Pratham",102,500);
	p1.deposite(1000);
	
	p1.display();
	System.out.println("********************************");
	p2.withdrawing(1000);
	p2.display();
		
	}
}