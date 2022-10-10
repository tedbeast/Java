package Chapter6.Challenges.ReturnDuplicates;

;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ReturnDuplicatesTest {
    public static ReturnDuplicates rd;
    @BeforeClass
    public static void setUp(){
        rd = new ReturnDuplicates();
    }
    @Test
    public void rdTest1(){
        int[] input = {0, 1, 2, 2, 3, 4, 4};
        int expected1 = 2;
        int expected2 = 4;
        int notExpected = 0;
        int[] dups = rd.returnDuplicates(input);

        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        for(int i = 0; i < dups.length; i++){
            if(dups[i] == expected1){
                flag1 = true;
            }
            if(dups[i] == expected2){
                flag2 = true;
            }
            if(dups[i] == notExpected){
                flag3 = true;
            }
        }
        Assert.assertTrue(flag1);
        Assert.assertTrue(flag2);
        Assert.assertFalse(flag3);

    }
}
