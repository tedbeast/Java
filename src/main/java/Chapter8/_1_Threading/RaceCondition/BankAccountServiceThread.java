package Chapter8._1_Threading.RaceCondition;

import java.util.Queue;

/**
 * Notice that this thread implements Runnable, which is a functional interface.
 *
 * Runnable allows Java to run this class as an independent thread, an independent execution of Java code that
 * can run at the same time as other executions of Java, while still belonging to the same application and sharing
 * memory & objects with other threads. Using threads can lead to better performance when the application either
 * needs to wait constantly (such as when it is waiting for responses sent over the web), or if we are leveraging
 * multiple cores of a processor.
 *
 * Nothing in this class should be changed.
 */
public class BankAccountServiceThread implements Runnable {
    Queue<Transaction> transactionsQueue;
    public BankAccountServiceThread(Queue<Transaction> transactionsQueue){
        this.transactionsQueue = transactionsQueue;
    }

    /**
     * run() is a method which Runnable requires the developer to implement. This method will define the code that
     * executes when the application attempts to run this class as a thread using the ExecutorService. You might think
     * of it as the thread's own main method.
     *
     * In this case, when the BankAccountServiceThread begins, it will access every transaction in a queue
     * and execute their updates. Because we have multiple threads running simultaneously, they may conflict with each
     * other.
     */
    @Override
    public void run() {
        for(Transaction t : transactionsQueue){
            t.apply();
        }
    }

}
