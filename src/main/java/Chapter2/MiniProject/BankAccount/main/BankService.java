package Chapter2.MiniProject.BankAccount.main;

public class BankService {
    /**
     * The balance should be kept private. If it were public, then other developers could write code in other classes
     * that could cause the balance to exhibit unintended behavior, like being negative. The private access modifier
     * will allow only the methods within this class to interact with the balance.
     */
    private double balance;

    /**
     * A constructor to build a BankService object that will start the bank balance at 0.
     */
    public BankService(){
        this.balance = 0;
    }

    /**
     * increase the user's balance by amount.
     * @param amount the amount to be deposited.
     */
    public void deposit(double amount){

    }

    /**
     * decrease the user's balance by amount.
     * If a withdrawl would result in the user having a negative balance, the withdrawl should not occur.
     * @param amount the amount to be withdrawn.
     */
    public void withdraw(double amount){

    }

    /**
     * @return the user's balance.
     */
    public double getBalance(){
        return 0;
    }
}
