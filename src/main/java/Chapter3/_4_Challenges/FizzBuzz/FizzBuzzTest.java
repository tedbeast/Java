package Chapter3._4_Challenges.FizzBuzz;

;
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    FizzBuzz fb = new FizzBuzz();
    @Test
    public void FizzBuzzTest1(){
        int num = 5;
        String target = "Buzz";
        Assert.assertEquals(target, fb.FizzBuzzGen(num));
    }
    @Test
    public void FizzBuzzTest2(){
        int num = 9;
        String target = "Fizz";
        Assert.assertEquals(target, fb.FizzBuzzGen(num));
    }
    @Test
    public void FizzBuzzTest3(){
        int num = 27;
        String target = "Fizz";
        Assert.assertEquals(target, fb.FizzBuzzGen(num));
    }
    @Test
    public void FizzBuzzTest4(){
        int num = 30;
        String target = "FizzBuzz";
        Assert.assertEquals(target, fb.FizzBuzzGen(num));
    }
    @Test
    public void FizzBuzzTest5(){
        int num = 28;
        String target = "";
        Assert.assertEquals(target, fb.FizzBuzzGen(num));
    }
    @Test
    public void FizzBuzzTest6(){
        int num = 2;
        String target = "";
        Assert.assertEquals(target, fb.FizzBuzzGen(num));
    }
}
