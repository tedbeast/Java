package Chapter7._0_DataStructuresAndAlgorithms.Search;
/*
I haven't yet finished writing this challenge.
TODO: finish challenge
 */
/*
We are used to searching for items in a list by traversing the list and checking each value.
While this is true in an unsorted list, a sorted list is a different case:
how do we search for a word in a dictionary, for instance? do we look at every word?
No, we look at the middle of a dictionary and see if our word is to the 'left' or the 'right' of the page we opened to,
and repeat the process until we are on the page we need...
The process in this case would be log2(n) rather than n.


The test cases will be testing for at least a 2x speedup in real-time over the baseline, n time solution on large inputs.
 */
public class SearchComplexity {
    public boolean containsN(int[] nums, int target){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                return true;
            }
        }
        return false;
    }
    public boolean containsLogN(int[] nums, int target){
        return false;
    }
}
