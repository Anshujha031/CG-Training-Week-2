package hierarchicalinheritance.bankaccounttypes;

public class BankAccountMain {
    public static void main(String [] args){
        BankAccount b1 = new SavingAccount(101,2000,20);
        BankAccount b2 = new CheckingAccount(102,3000,100);
        BankAccount b3 = new FixedDepositAccount(103,5000);
        b1.displayAccountType();
        System.out.println("-------------------------");
        b2.displayAccountType();
        System.out.println("-------------------------");
        b3.displayAccountType();
    }
}
