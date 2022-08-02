package Challenges.Level3.Sort;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        Sort s = new Sort();
        int[] unsorted = {7,3,67,9,3,5,3};
        int[] sorted = s.sortArray(unsorted);
        System.out.println(Arrays.toString(sorted));
    }
    public int[] sortArray(int[] arr){
//        Option 1: we sort the arr using utils
//        Arrays.sort(arr);

//        Option 2: we sort the arr using a stream
//        arr = Arrays.stream(arr).sorted().toArray();

//        Option 3: we sort the arr using our very own algorithm!!
        int[] sorted = new int[arr.length];
//        German's algorithm: for i numbers in arr,
//        find the minimum from the unsorted array, cross it out, and move it to ith position in
//        sorted array
//        2 for loops : the outer for loop move the minimum from the old array to new.
//        the inner for loop will find the minimum.
//        O(n^2)
        /*
        O(n) -> single for loop
        O(n^2) ->nested for loop
        O(1) -> time is not dependent on input (eg array.length, hashing)
        O(log(n)) -> tree search
        O(nlog(n)) -> searching a tree inside of a for loop (search n times)
         */
        for(int i = 0; i < arr.length; i++){
            int min = Integer.MAX_VALUE;
            int minindex = 0;
            for(int j  = 0; j < arr.length; j++){
                if(arr[j] < min){
                    min = arr[j];
                    minindex = j;
                }
            }
            //                    how we may 'cross things out'
            arr[minindex] = Integer.MAX_VALUE;
            sorted[i] = min;
        }
        return sorted;
    }
}
