package hierarchicalinheritance.bankaccounttypes;

public class FixedDepositAccount extends BankAccount{

    public FixedDepositAccount(int accountNumber , int balance){
        super(accountNumber, balance);
    }

    @Override
    public void displayAccountType(){
        System.out.println("Bank Type : Fixed Deposit Account");
        super.displayAccountType();
    }
}
