package Chapter7._2_Threading.RaceCondition;

import java.util.Queue;

/*
I haven't yet finished writing this challenge.
TODO: finish challenge
 */
public class BankAccountServiceThread implements Runnable {
    Queue<Transaction> transactionsQueue;
    public BankAccountServiceThread(Queue<Transaction> transactionsQueue){
        this.transactionsQueue = transactionsQueue;
    }
    @Override
    public void run() {
        for(Transaction t : transactionsQueue){
            t.apply();
        }
    }

}
