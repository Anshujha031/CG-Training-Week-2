package hierarchicalinheritance.bankaccounttypes;

public class SavingAccount extends BankAccount{
    public int interestRate;

    public SavingAccount(int accountNumber,int balance , int interestRate){
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountType(){
        System.out.println("Bank Type: Saving Account " );
        super.displayAccountType();
        System.out.println("Interest rate : " + interestRate);
    }

}
