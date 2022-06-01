package Level1.ReverseArray;

import java.util.Arrays;

public class ReverseArray {
    public int[] reverse(int[] nums){
        /*
        I could either reverse 'in place' (ie i don't make a new array and perform
        only swaps)
        or I could not (easier)
         */
        /*
        int[] reversed = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            reversed[i] = nums[nums.length-i-1];
        }
        return reversed;

         */
        for(int i = 0; i < nums.length/2; i++){
            int temp = nums[i];
            nums[i] = nums[nums.length-i-1];
            nums[nums.length-i-1] = temp;

        }
        return nums;
    }
}
