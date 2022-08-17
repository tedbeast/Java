package Chapter4._4_Exceptions.ThrowCustomException;

;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/*
You should throw a CustomException object here.
 */
public class CustomExceptionTest {
    static CustomExceptionThrower cet;
    @BeforeClass
    public static void setUp(){
        cet = new CustomExceptionThrower();
    }
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
