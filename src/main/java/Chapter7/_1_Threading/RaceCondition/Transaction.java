package Chapter7._1_Threading.RaceCondition;

public class Transaction {
    /*
    this object exists to store information so that TransactionRunner can execute threads that perform bank transactions.
     */
    private BankAccount bankAccount;
    private double amt;

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public double getAmt() {
        return amt;
    }

    public void setAmt(double amt) {
        this.amt = amt;
    }
}
