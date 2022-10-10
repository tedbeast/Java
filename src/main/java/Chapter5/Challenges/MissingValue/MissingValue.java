package Chapter5.Challenges.MissingValue;
//assume that arr is intended to have arrays that increment by 1 for each index. eg, {4,5,6,7}.
//arr may be missing a value eg, {4,5,6,7,9}. return the missing value (8)
//return -1 if no missing value exists
public class MissingValue {

    public static void main(String[] args) {
        /*
        MissingValue mv = new MissingValue();
        mv.getMissingValue(new int[] {0,1,2,3,5});

         */
        getMissingValue(new int[] {0,1,2,3,5});
    }
//    the time it takes to complete missingvalue scales linearly to the size of the input
//    as a general rule:
//    having a single for loop is O(n), nested for loops are O(n^(number of loops)), and tree traversals are o(log(n))
    public static int getMissingValue(int[] arr){
        int start = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(start+i != arr[i]){
                return start+i;
            }
        }
        return -1;
    }
}
