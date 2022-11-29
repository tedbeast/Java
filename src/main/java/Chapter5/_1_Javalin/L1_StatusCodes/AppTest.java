package Chapter5._1_Javalin.L1_StatusCodes;

import Util.CommandLine;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import io.javalin.Javalin;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    Javalin app = JavalinSingleton.getInstance();

    /**
     * This method will start the web server on port 9001 and pause the thread for 3 seconds to allow time for the
     * server to spin up.
     * @throws InterruptedException
     */
    @Before
    public void beforeEach() throws InterruptedException{
        app.start(9001);
        Thread.sleep(3000);
    }

    /**
     * This will stop the server.
     */
    @After
    public void afterEach(){
        app.stop();
    }

    /**
     * This test will make a get request to endpoint /client-side-err and will check that the response
     * contains a " 4" indicating that the response code was in the 400 block of client-side codes
     */
    @Test
    public void problem1Test()
    {
        String actualResult = CommandLine.executeCommandPrompt("curl -I -X GET http://localhost:9001/client-side-err");
        if(actualResult.isEmpty()){
            Assert.fail("No response from server");
        }

        Assert.assertTrue(actualResult.contains(" 4"));

    }
}
