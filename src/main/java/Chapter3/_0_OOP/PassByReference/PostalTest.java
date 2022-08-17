package Chapter3._0_OOP.PassByReference;

import org.junit.Assert;
import org.junit.Test;

public class PostalTest {
    @Test
    public void postTest1(){
        Sender sally = new Sender();
        Recipient roy = new Recipient();
        Mail letter = new Mail("Hi roy!");
        String expected = "they got my mail :)";
        String actual = sally.sendMail(letter, roy);
        Assert.assertEquals(expected, actual);
    }
}
