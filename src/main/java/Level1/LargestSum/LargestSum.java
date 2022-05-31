package Level1.LargestSum;
/*
Task:
get the largest possible sum that can be obtained from a pair of values in the array.
 */
public class LargestSum {
    public int bigSum(int[] num){
        int max = Integer.MIN_VALUE;
//        i is the index of the first value we are comparing
        for(int i = 0; i < num.length; i++){
//            j is the index of the second value we are comparing
            for(int j = 0; j < num.length; j++){
//                check that we're not comparing the same value
                if(i!=j){
//                    check if we've found a new maximum
                    if(num[i]+num[j] > max){
                        max = num[i]+num[j];
                    }
                }
            }
        }
        return max;
    }
}
