package Chapter5._3_Challenges.ContainsDuplicates;

import java.util.HashSet;

public class ContainsDuplicates {
    public boolean containsDuplicate(int[] nums){
        /*
        solution A (the one i've written):
        for every number of the list,
        check if the number exists after our number
            for every number after our number, check if we have something that matches

        solution B
        for every number i of the list,
        iterate through the entire list, while skipping the index i, return true if we have a match

        the issue with both of these is efficiency with respect to scalability
        TIME COMPLEXITY:
        O(n) time has to do with how much computation a problem requires as the problem scaled
        eg
        O(n) complexity: a problem of size 10 requires 10 computations while a size 100 requires 100
        O(n^2): a problem of size 10 requires 100 computations while size 100 requires 10000

        as a general rule,
        for every standard for loop (i++ type), multiple the time complexity by n
        for every tree traversal, multiply the time complexity by log(n)

        solution C
        the better solution is to not have to use that inner for loop
            how do we do that?
            data structures.. we could either use a hashset or a treeset
            we could achieve, potentially, o(n) time instead of o(n^2) time thanks to hashmap being constant o(1) time
            or o(n*log(n)) time if we use a treeset

         */
        /*
        solution A
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }*/

//        solution C
        HashSet<Integer> uniqueNums = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(uniqueNums.contains(nums[i])){
                return true;
            }else{
                uniqueNums.add(nums[i]);
            }
            /*
            hashset vs treeset vs any list implementation
            the time complexity of search in a hashset is o(1) (because it's a single math equation to find
            if the hash value of an object is equivalent to another)

            treeset is o(log(n)) because checking if a tree contains a value requires a tree traversal
            which is o(log(n))

            checking if a value is contained within a list is o(n) because it requires us to iterate through every value...
            we did this already in solution A

            the solutions have varying degrees of efficiency
            */
        }

        return false;
    }
}
