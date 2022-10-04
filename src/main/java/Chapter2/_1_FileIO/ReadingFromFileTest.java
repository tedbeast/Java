package Chapter2._1_FileIO;

import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;

public class ReadingFromFileTest {
    ReadingFromFile rff = new ReadingFromFile();

    /**
     * Read from HelloFile1.txt and verify that it does contain HelloWorld.
     */
    @Test
    public void readTest1(){
        String filepath = "src/main/resources/Files/HelloFile1.txt";
        try{
            String lineFromFile = rff.read(filepath);
            Assert.assertEquals(lineFromFile.trim(), "HelloWorld");
        }catch(FileNotFoundException e){
            e.printStackTrace();
            Assert.fail();
        }

    }
}
