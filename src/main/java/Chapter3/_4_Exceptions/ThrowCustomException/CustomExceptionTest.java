package Chapter3._4_Exceptions.ThrowCustomException;

;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class CustomExceptionTest {
    static CustomExceptionThrower cet;
    @BeforeClass
    public static void setUp(){
        cet = new CustomExceptionThrower();
    }

    /**
     * Test case leverages a try/catch: the correct behavior of throwCustomException should cause the try block to
     * immediately stop due to the exception, and switch to executing the catch block.
     *
     * If either we run throwCustomException without causing an exception, or if an exception is thrown that is not
     * an instance of CustomException, the test will fail.
     */
    @Test
    public void customExceptionTest1(){
        try{
            cet.throwCustomException();
            Assert.fail();
        } catch (Exception e) {
            Assert.assertTrue(e instanceof CustomException);
        }
    }

}
