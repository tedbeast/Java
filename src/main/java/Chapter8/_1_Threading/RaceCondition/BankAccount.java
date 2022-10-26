package Chapter8._1_Threading.RaceCondition;

/**
 * This class is functioning as a shared resource between threads - meaning, both threads we create here will be
 * operating on this BankAccount class.
 *
 *  You will, however, have to make one small change to this class to ensure sure that the BankAccountServiceThreads do
 *  not cause race conditions. Race conditions are unpredictable behavior caused by multiple threads operating on
 *  a single variable at the same time. Look into the synchronized keyword: it will only allow a single thread to
 *  run the method at a time, preventing race condition issues. It will need to be applied to a method in this class,
 *  which will prevent the race condition issue.
 **/
public class BankAccount {

    private int userID;
    private double balance;
    public BankAccount(int userID, double initialBalance){
        this.userID = userID;
        this.balance = initialBalance;
    }

    /**
     * You may pretend that the Thread.sleep method represents the amount of time it takes to do security related
     * checks over the web, but for this example it ensures that a race condition happens when we have multiple threads
     * acting upon this method.
     * @param amt the dollar amount transaction (positive or negative) that will be applied to  bank account.
     */
    public void changeBalance(double amt){
        double tempBalance = balance;
        tempBalance = balance + amt;
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
//            this exception never happens, but we still need to watch for it every time we thread.sleep.
            e.printStackTrace();
        }
        balance = tempBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
