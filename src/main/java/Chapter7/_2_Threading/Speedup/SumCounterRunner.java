package Chapter7._2_Threading.Speedup;
/*
I haven't yet finished writing this challenge.
TODO: finish challenge
 */
public class SumCounterRunner {

    /*
    leave this method alone, this will be our benchmark to determine how fast your threading capabilities are.
     */
    public long SumCounterWithoutThreading(int[] nums){
        long sum = 0;
        for(int i = 0 ; i < nums.length; i++){
            sum+=nums[i];
        }
        return sum;
    }
    /**
    The task now is to be able to calculate a sum at least 25% faster than the single-threaded approach.
    If we limit ourselves to just the basic tools we have so far, this is probably impossible...
    but if we leverage threading (and your computer has more than one core), we can achieve significant speedup.

    Notice that SumCounterThread is already partially set up with a constructor that takes in the nums array, as
    well as two ints for indexes. It also implements callable, so you should read about how that works. You might be
    able to split up the addition of the nums array across multiple actors to speed up the work.
     **/
    public long SumCounterWithThreading(int[] nums){
        return 0;
    }
}
