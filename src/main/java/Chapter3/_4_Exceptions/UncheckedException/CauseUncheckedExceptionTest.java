package Chapter3._4_Exceptions.UncheckedException;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class CauseUncheckedExceptionTest {
    static CauseUncheckedException cue;
    @BeforeClass
    public static void setUp(){
        cue = new CauseUncheckedException();
    }

    /**
     * Test case leverages a try/catch: the correct behavior of throwCustomException should cause the try block to
     * immediately stop due to the exception, and switch to executing the catch block.
     *
     * If either we run throwCustomException without causing an exception, or if an exception is thrown that is not
     * an instance of CustomException, the test will fail.
     */
    @Test
    public void uncheckedExceptionTest(){
        try{
            cue.throwUncheckedException();
            Assert.fail();
        }catch(Exception e){
            Assert.assertTrue(e instanceof RuntimeException);
        }
    }
}
