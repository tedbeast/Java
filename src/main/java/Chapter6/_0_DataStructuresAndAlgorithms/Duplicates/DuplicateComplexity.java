package Chapter6._0_DataStructuresAndAlgorithms.Duplicates;

import java.util.HashSet;

/**
 * There are, as you may imagine, many ways to solve a problem.
 * however, some solutions may be better than others.
 * Notice that with the completed find duplicates problem, we have a for loop nested in a for loop:
 * this means that FOR every item in the nums array, we must traverse every item in the nums array.
 * So, we say that this problem scales to O(n^2) complexity with regards to the input, because we need to do
 * N operations N times.
 *
 * However, it's possible to solve this problem in a way that scales to O(nlog(n)) or even O(n) complexity with
 * regards to the input.
 *
 * The test cases will be testing for a 2x speedup in real-time over the n^2 time solution on large inputs.
 */
public class DuplicateComplexity {
    /**
     * Don't change this method, it will be our benchmark for speed.
     * @param words an array of Strings.
     * @return true if there are duplicate Strings in words.
     */
    public boolean findDuplicatesn2(String[] words){
        for(int i = 0; i < words.length; i++){
            for(int j = i+1; j < words.length; j++){
                if(words[i].equals(words[j])){
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * TODO: write a method that finds duplicate Strings that is more efficient than the provided method above.
     *
     * Hint: there are ways to store values using collections that are more efficient
     * with certain operations, such as very fast ways to store and check for unique values.
     *
     * How can we leverage collections that only accept unique values to check if a unique value has already
     * been added to the said collection?
     *
     * @param words an array of Strings.
     * @return true if there are duplicate Strings in words.
     */
    public boolean findDuplicatesFaster(String[] words){
        HashSet<String> strings = new HashSet<>();
        for(int i = 0; i < words.length; i++){
            if(strings.contains(words[i])){
                return true;
            }else{
                strings.add(words[i]);
            }
        }
        return false;
    }
}
