package Chapter8._1_Threading.RaceCondition;

public class Transaction {
    /**
     * This object exists to store transaction information so that TransactionRunner can execute threads that perform
     * bank transactions.
     *
     * Nothing in this class should be changed.
     */
    private BankAccount bankAccount;
    private double changeAmount;
    public Transaction(BankAccount ba, double changeAmount){
        this.bankAccount = ba;
        this.changeAmount = changeAmount;
    }
    public void apply(){
        bankAccount.changeBalance(changeAmount);
    }
}
