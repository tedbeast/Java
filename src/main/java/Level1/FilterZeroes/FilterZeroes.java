package Level1.FilterZeroes;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FilterZeroes {
    public int[] filter(int[] nums){

        IntStream stream = Arrays.stream(nums);
//        for every item in a stream (this item being represented by n)
//        see if this conditional is met: and if so, put it into a new stream
        IntStream filteredStream = stream.filter(n -> n!=0);

        int[] filteredArray = filteredStream.toArray();
        return filteredArray;
    }
}
/*
stream notes...
streams are a feature added in java to allow us to manipulate individual items in an array
or collection with a lambda function..
they contain some useful methods ..
filter, map (applies some change to each item), foreach (executes some action for each item,
like printing, for instance), collect (turns the stream into a collection, like a list or set)
 */