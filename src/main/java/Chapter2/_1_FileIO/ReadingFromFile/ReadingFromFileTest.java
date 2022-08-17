package Chapter2._1_FileIO.ReadingFromFile;

import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;

public class ReadingFromFileTest {
    ReadingFromFile rff = new ReadingFromFile();
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
