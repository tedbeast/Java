package Chapter9._2_Threading.Speedup;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SumCounterRunner {
    /**
     * This executorService will assist you in starting a few SumCounterThread objects.
     */
    ExecutorService executorService = Executors.newFixedThreadPool(2);

    /**
     * This method will be used as a benchmark to judge how much faster a multithreaded solution could be.
     * Do not change this method.
     * @param nums an array of numbers
     * @return the sum of all the values of nums.
     */
    public long SumCounterWithoutThreading(int[] nums){
        long sum = 0;
        for(int i = 0 ; i < nums.length; i++){
            sum+=nums[i];
        }
        return sum;
    }

    /**
     * The task here is to be able to calculate a sum at least 25% faster than the single-threaded approach.
     * If we limit ourselves to just the basic tools we have so far, this is probably impossible...
     * but if we leverage threading (and your computer has more than one core), we can achieve significant speedup.
     *
     * Notice that SumCounterThread is already partially set up with a constructor that takes in the nums array, as
     * well as two ints for indexes. You could split the work of summing an array across two threads.
     *
     * Look into this Baeldung tutorial for information on how to leverage the ExecutorService, Callables, and Futures:
     * https://www.baeldung.com/java-executor-service-tutorial
     *
     * @param nums
     * @return
     */
    public long SumCounterWithThreading(int[] nums){

        return 0;
    }
}
