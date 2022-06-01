package Level1.ContainsDuplicates;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ContainsDuplicates {
    public boolean containsDuplicate(int[] nums){
        Set<Integer> hs = new TreeSet<>();

        for(int i = 0; i < nums.length; i++){
            if(hs.contains(nums[i])){
                return true;
            }
            hs.add(nums[i]);
        }

        return false;
    }
}
