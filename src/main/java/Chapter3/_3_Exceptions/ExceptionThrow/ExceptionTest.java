package Chapter3._3_Exceptions.ExceptionThrow;
import org.junit.Assert;
import org.junit.Test;
import org.junit.BeforeClass;

public class ExceptionTest {
    static ExceptionChallenge ec;
    @BeforeClass
    public static void setUp(){
        ec = new ExceptionChallenge();
    }
    @Test
    public void exceptionMustThrowTest(){
        Assert.assertThrows(Exception.class, ()->ec.mustThrow());
    }
}
