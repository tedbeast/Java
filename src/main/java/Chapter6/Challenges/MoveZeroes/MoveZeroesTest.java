package Chapter6.Challenges.MoveZeroes;

;
import org.junit.Assert;
import org.junit.Test;

public class MoveZeroesTest {
    MoveZeroes mz = new MoveZeroes();
    @Test
    public void MoveZeroesTest1(){
        int[] nums = {1, 2, 3, 4, 5};
        int[] target = {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(target, mz.move(nums));
    }
    @Test
    public void MoveZeroesTest2(){
        int[] nums = {1, 0, 2, 0, 3, 0, 4, 0, 5, 0};
        int[] target = {1, 2, 3, 4, 5, 0, 0, 0, 0, 0};
        Assert.assertArrayEquals(target, mz.move(nums));
    }
    @Test
    public void MoveZeroesTest3(){
        int[] nums = {1, 2, 3, 0, 0, 0};
        int[] target = {1, 2, 3, 0, 0 , 0};
        Assert.assertArrayEquals(target, mz.move(nums));
    }
    @Test
    public void MoveZeroesTest4(){
        int[] nums = {1, 0, 0, 0, 2, 3};
        int[] target = {1, 2, 3, 0, 0 , 0};
        Assert.assertArrayEquals(target, mz.move(nums));
    }

}
