package Chapter8._0_DataStructuresAndAlgorithms.Search;

/**
 * We are used to searching for items in a list by traversing the list and checking each value.
 * While this is true in an unsorted list, a sorted list is a different case:
 * how do we search for a word in a dictionary, for instance? do we look at every word?
 * No, we look at the middle of a dictionary and see if our word is to the 'left' or the 'right' of the page we opened
 * to, and repeat the process until we are on the page we need.
 * The process in this case would be log2(n) rather than n, because we divide the size of the problem in half
 * for every time we search for our word again.
 *
 * The test cases will be testing for at least a 10x speedup in real-time over the baseline,
 * n time solution, for an input of nearly a billion numbers.
 */
public class SearchComplexity {
    /**
     * No need to change anything in this method - it works and is used as a baseline for time.
     * @param nums an array of integers.
     * @param target an int that is being searched for.
     * @return true if nums contains target, false otherwise.
     */
    public boolean containsN(int[] nums, int target){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                return true;
            }
        }
        return false;
    }
    /**
     * TODO: Look into the binary search algorithm to solve this problem in a substantially faster time O(log(n))!
     * @param nums an array of integers.
     * @param target an int that is being searched for.
     * @return true if nums contains target, false otherwise.
     */
    public boolean containsLogN(int[] nums, int target){
        return false;
    }
}
