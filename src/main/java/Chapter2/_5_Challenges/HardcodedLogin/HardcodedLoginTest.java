package Chapter2._5_Challenges.HardcodedLogin;

import org.junit.Assert;
import org.junit.Test;

public class HardcodedLoginTest {

    HardcodedLogin hl = new HardcodedLogin();

    @Test
    public void loginTest1(){
        String user = "admin";
        String password = "qwerty";
        boolean expected = true;
        boolean actual = hl.login(user,password);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void loginTest2(){
        String user = "admin";
        String password = "password";
        boolean expected = false;
        boolean actual = hl.login(user,password);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void loginTest3(){
        String user = "admin";
        String password = "123456";
        boolean expected = false;
        boolean actual = hl.login(user,password);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void loginTest4(){
        String user = "user";
        String password = "password";
        boolean expected = true;
        boolean actual = hl.login(user,password);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void loginTest5(){
        String user = "user";
        String password = "qwerty";
        boolean expected = false;
        boolean actual = hl.login(user,password);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void loginTest6(){
        String user = "user";
        String password = "123456";
        boolean expected = false;
        boolean actual = hl.login(user,password);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void loginTest7(){
        String user = "guest";
        String password = "password";
        boolean expected = false;
        boolean actual = hl.login(user,password);
        Assert.assertEquals(expected, actual);
    }
}
