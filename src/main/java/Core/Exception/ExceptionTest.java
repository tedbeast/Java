package Core.Exception;

import Core.Exception.ExceptionChallenge;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

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
