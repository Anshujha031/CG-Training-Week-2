package hierarchicalinheritance.bankaccounttypes;

public class BankAccount {
    public int accountNumber;
    public int balance;

    public BankAccount(int accountNumber,int balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayAccountType(){
        System.out.println("Account Number :" + accountNumber);
        System.out.println("Account Balance :" + balance);
    }
}
