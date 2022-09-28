package Chapter6._0_DataStructuresAndAlgorithms.Duplicates;

/**
there are, as you may imagine, many ways to solve a problem.
however, some solutions may be better than others.
Notice that with the completed find duplicates problem, we have a for loop nested in a for loop:
this means that FOR every item in the nums array, we must traverse every item in the nums array.
So, we say that this problem scales to n^2 complexity with regards to the input.

However, it's possible to solve this problem in a way that scales to nlog(n) or even n complexity with
regards to the input.
Hint: there are ways to store things using collections that are more efficient
with certain operations, such as very fast ways to store and check for unique values.

The test cases will be testing for a 2x speedup in real-time over the n^2 time solution on large inputs.
 */
public class DuplicateComplexity {
/**    dont change this method, it will be our benchmark for speed.**/
    public boolean findDuplicatesn2(String[] words){
        for(int i = 0; i < words.length; i++){
            for(int j = i+1; j < words.length; j++){
                if(words[i] == words[j]){
                    return true;
                }
            }
        }
        return false;
    }
/**    change this method. **/
    public boolean findDuplicatesFaster(String[] words){
        return false;
    }
}
