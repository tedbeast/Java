package Chapter7._2_Threading.RaceCondition;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * If you run these tests multiple times, you will actually find that not only the result is wrong, despite our
 * logic being generally correct, but that the actual value can vary every time we run the tests!
 * This is known as a race condition: an unpredictable result caused by the randomness of whichever thread
 * gets to write to the value first.
 *
 * This is a serious issue when we're dealing with important data, so we have to be super-careful with threading.
 */
public class RaceConditionTest {
    /**
     * This test will simulate a multithreaded application processing a user who has rapidly generated new transactions
     * that our app must take care of on the backend. Two queues will process two transactions each, but in the app's
     * initial state, the two threads conflict with each other.
     */
    @Test
    public void raceConditionTest1() throws InterruptedException {
        BankAccount acc1 = new BankAccount(0, 500);
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Queue<Transaction> transactionQueue1 = new ArrayDeque<>();
        Queue<Transaction> transactionQueue2 = new ArrayDeque<>();
        Transaction t1 = new Transaction(acc1, 2000);
        Transaction t2 = new Transaction(acc1, 100);
        Transaction t3 = new Transaction(acc1, 70);
        Transaction t4 = new Transaction(acc1, 5);
        transactionQueue1.add(t1);
        transactionQueue1.add(t2);
        transactionQueue2.add(t3);
        transactionQueue2.add(t4);
        BankAccountServiceThread bast1 = new BankAccountServiceThread(transactionQueue1);
        BankAccountServiceThread bast2 = new BankAccountServiceThread(transactionQueue2);
        executorService.submit(bast1);
        executorService.submit(bast2);
        executorService.shutdown();
        executorService.awaitTermination(60, TimeUnit.SECONDS);
        double actual = acc1.getBalance();
        double expected = 2675;
        Assert.assertEquals(expected, actual, .1);
    }
}
