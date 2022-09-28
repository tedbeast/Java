package Chapter7._2_Threading.RaceCondition;
/*
I haven't yet finished writing this challenge.
TODO: finish challenge
 */
public class Transaction {
    /*
    this object exists to store information so that TransactionRunner can execute threads that perform bank transactions.
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
