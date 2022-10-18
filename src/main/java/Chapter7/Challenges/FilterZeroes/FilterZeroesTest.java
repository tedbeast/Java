package Chapter7.Challenges.FilterZeroes;

;
import org.junit.Assert;
import org.junit.Test;

public class FilterZeroesTest {
    FilterZeroes fz = new FilterZeroes();

    /**
     * {1, 2, 3, 4, 5} with all zeroes removed should produce {1, 2, 3, 4, 5}.
     */
    @Test
    public void filterZeroesNoZeroesTest(){
        int[] nums = {1, 2, 3, 4, 5};
        int[] target = {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(target, fz.filter(nums));
    }

    /**
     * {1, 0, 2, 3, 0, 4, 5} with all zeroes removed should produce {1, 2, 3, 4, 5}.
     */
    @Test
    public void filterZeroesTest1(){
        int[] nums = {1, 0, 2, 3, 0, 4, 5};
        int[] target = {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(target, fz.filter(nums));
    }

    /**
     * {6, 0, 4, 0, 2} with all zeroes removed should produce {6, 0, 4, 0, 2}.
     */
    @Test
    public void filterZeroesTest2(){
        int[] nums = {6, 0, 4, 0, 2};
        int[] target = {6, 4, 2};
        Assert.assertArrayEquals(target, fz.filter(nums));
    }

    /**
     * {6, 4, 2, 0, 0, 0} with all zeroes removed should produce {6, 4, 2}.
     */
    @Test
    public void filterZeroesTest3(){
        int[] nums = {6, 4, 2, 0, 0, 0};
        int[] target = {6, 4, 2};
        Assert.assertArrayEquals(target, fz.filter(nums));
    }
}
