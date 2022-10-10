package Chapter6.Challenges.Prime;

;
import org.junit.Assert;
import org.junit.Test;

public class PrimeTest {
    Prime p = new Prime();
    @Test
    public void primeTestPrime1(){
        int num = 7;
        boolean target = true;
        Assert.assertEquals(target, p.isPrime(num));
    }
    @Test
    public void primeTestPrime2(){
        int num = 29;
        boolean target = true;
        Assert.assertEquals(target, p.isPrime(num));
    }
    @Test
    public void primeTestPrime3(){
        int num = 1000003;
        boolean target = true;
        Assert.assertEquals(target, p.isPrime(num));
    }
    @Test
    public void primeTestNotPrime1(){
        int num = 4;
        boolean target = false;
        Assert.assertEquals(target, p.isPrime(num));
    }
    @Test
    public void primeTestNotPrime2(){
        int num = 1000005;
        boolean target = false;
        Assert.assertEquals(target, p.isPrime(num));
    }
}
