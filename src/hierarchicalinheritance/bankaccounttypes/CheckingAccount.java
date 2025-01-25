package hierarchicalinheritance.bankaccounttypes;

public class CheckingAccount extends BankAccount{
    public int withdrawLimit;

    public CheckingAccount(int accountNumber,int balance ,int withdrawLimit){
        super(accountNumber, balance);
        this.withdrawLimit = withdrawLimit;
    }

    @Override
    public void displayAccountType(){
        System.out.println("Bank Type : Checking Account");
        super.displayAccountType();
        System.out.println("Withdraw Limit : " + withdrawLimit);
    }
}
