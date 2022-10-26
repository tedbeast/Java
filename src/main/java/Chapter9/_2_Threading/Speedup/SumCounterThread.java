package Chapter9._2_Threading.Speedup;
/*
I haven't yet finished writing this challenge.
TODO: finish challenge
 */
import java.util.concurrent.Callable;

/**
 * There is no need to change anything in this class.
 *
 * Notice that this class implements Callable, a functional interface.
 * This is a class that is capable of being run as a thread, an independent execution of Java code
 * that runs in the same memory space.
 *
 * A Callable is a thread that may return a value, in this case it has been defined to return a Long.
 */
public class SumCounterThread implements Callable<Long> {
    int[] nums;
    int startIndex;
    int endIndex;

    /**
     * Threads, like everything in Java, are technically objects, so even a thread might have a constructor.
     * In this case, the purpose of the thread is to divide the work of getting the sum of many values.
     * The nums array is the exact same nums array that the other arrays have access to, but this thread
     * is intended to get the sum of only a portion of the values. The remaining values will be summed by the
     * other threads.
     * @param nums an array of ints.
     * @param startIndex the first index of the partial sum, inclusive.
     * @param endIndex the last index of the partial sum, exclusive.
     */
    public SumCounterThread(int[] nums, int startIndex, int endIndex){
        this.nums = nums;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    /**
     * This thread will return the sum of all the values between startIndex and endIndex of the array.
     * @return
     * @throws Exception
     */
    @Override
    public Long call() throws Exception {
        long sum = 0;
        for(int i = startIndex ; i < endIndex; i++){
            sum+=nums[i];
        }
        return sum;
    }
}
