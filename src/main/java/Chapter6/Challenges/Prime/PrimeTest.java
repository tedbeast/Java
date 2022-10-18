package Chapter6.Challenges.Prime;

;
import org.junit.Assert;
import org.junit.Test;

public class PrimeTest {
    Prime p = new Prime();

    /**
     * 7 is a prime number, so isPrime should return true.
     */
    @Test
    public void primeTestPrime1(){
        int num = 7;
        boolean target = true;
        Assert.assertEquals(target, p.isPrime(num));
    }

    /**
     * 29 is a prime number, so isPrime should return true.
     */
    @Test
    public void primeTestPrime2(){
        int num = 29;
        boolean target = true;
        Assert.assertEquals(target, p.isPrime(num));
    }

    /**
     * 1000003 is a prime number, so isPrime should return true.
     */
    @Test
    public void primeTestPrime3(){
        int num = 1000003;
        boolean target = true;
        Assert.assertEquals(target, p.isPrime(num));
    }

    /**
     * 4 is not a prime number (divisible by 2), so isPrime should return false.
     */
    @Test
    public void primeTestNotPrime1(){
        int num = 4;
        boolean target = false;
        Assert.assertEquals(target, p.isPrime(num));
    }

    /**
     * 1000005 is not a prime number (divisible by 5), so isPrime should return false.
     */
    @Test
    public void primeTestNotPrime2(){
        int num = 1000005;
        boolean target = false;
        Assert.assertEquals(target, p.isPrime(num));
    }
}
