package Chapter4._3_Javalin.L2_PathParameters;

import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
     * This method stops the web server.
     */
    @After
    public void afterEach(){
        app.stop();
    }

    /**
     * This test will use curl to send a GET request to localhost:9001/firstname/Kevin and will expect a response body
     * containing "Kevin".
     * Curl is a command that can be used in the terminal to send HTTP requests.
     */
    @Test
    public void problem1aTest()
    {
        String expectedResult = "Kevin";

        String actualResult = CommandLine.executeCommandPrompt("curl http://localhost:9001/firstname/Kevin");

        if(actualResult.isEmpty()){
            Assert.fail("No response from server");
        }

        Assert.assertEquals(expectedResult, actualResult);
    }

    /**
     * This test will use curl to send a GET request to localhost:9001/firstname/Sam and will expect a response body
     * containing "Sam".
     * Curl is a command that can be used in the terminal to send HTTP requests.
     */
    @Test
    public void problem1bTest()
    {
        String expectedResult = "Sam";

        String actualResult = CommandLine.executeCommandPrompt("curl http://localhost:9001/firstname/Sam");

        if(actualResult.isEmpty()){
            Assert.fail("No response from server");
        }

        Assert.assertEquals(expectedResult, actualResult);
    }

}
