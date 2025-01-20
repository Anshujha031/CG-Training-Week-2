import java.util.*;

class BankAccount{
	//static variables
	static public String bankName = "HDFC";
	static public int totalAccount = 0;
	
	//instance variable
	private String accountHolderName;
	final private int accountNumber;
	
	public BankAccount( String accountHolderName , int accountNumber){
		
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		totalAccount++;
		}
	
	public String getaccountHolerName(){
		return accountHolderName;
		}
		
	public void setAccountHolderName(String achn){
		this.accountHolderName = achn;
		}
	
	//getter for accountNumber (Final cannot be change)
	public int getAccountNumber(){
			return accountNumber;
			}
		
		
	static void getTotalAccounts(){
		System.out.println("Bank Name: " + bankName);
			System.out.println("Total Account" + totalAccount);
		}
		
	
		
public void displayAccountDetails(){
	
	System.out.println("Account Holder Name: " + accountHolderName);
	System.out.println("Account Number" + accountNumber);

	
	
}
	
	
}

class BankAccountSystem{
	public static void main(String[] args){
	BankAccount account1 = new BankAccount("Alice", 5000);
        BankAccount account2 = new BankAccount("Bob", 3000);
      
	  if(account1 instanceof BankAccount){
		  account1.displayAccountDetails();
		  }
		  
		 BankAccount.getTotalAccounts();
	}
}