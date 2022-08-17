package Chapter4._4_Exceptions.UncheckedException;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class CauseUncheckedExceptionTest {
    static CauseUncheckedException cue;
    @BeforeClass
    public static void setUp(){
        cue = new CauseUncheckedException();
    }
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
