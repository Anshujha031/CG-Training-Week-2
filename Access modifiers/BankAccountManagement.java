import java.util.*;

class BankAccount{
	public int accountNumber;
	protected String  accountHolder;
	private int balance;
	
	public BankAccount(int accountNumber , String accountHolder , int balance){
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
		}
		
	public int getBalance(){
		return balance;
		}
	
	public void setBalance(int newBalance){
		this.balance = newBalance;
		}
		
	public void display(){
		System.out.println("accountNumber " + accountNumber);
		System.out.println("accountHolder " + accountHolder);
		System.out.println("balance " + balance);
		}
}

class SavingAccount extends BankAccount{
	
	public SavingAccount(int accountNumber , String accountHolder , int balance){
		super(accountNumber,accountHolder,balance);
	
		}
	
	public void displaySavingAccount(){
		System.out.println("accountNumber " + accountNumber);
		System.out.println("accountHolder " + accountHolder);
		System.out.println("balance " + getBalance());
		}
	
}

class BankAccountManagement{
	public static void main(String[] args){
		BankAccount b = new BankAccount(101,"ravi",1000);
		b.display();
		System.out.println(  " Saving acc details ");
		SavingAccount sb = new SavingAccount(102,"kumar" , 5000);
		sb.displaySavingAccount();
	}
	
}