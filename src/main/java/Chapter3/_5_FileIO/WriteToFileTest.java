package Chapter3._5_FileIO;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFileTest {
    WriteToFile wf = new WriteToFile();

    /**
     * Thanks to the @Before annotation, this method will run before every test.
     * It resets BlankFile.txt.
     * @throws IOException
     */
    @Before
    public void resetFile() throws IOException {
        File f = new File("src/main/resources/Files/BlankFile.txt");
        f.delete();
        f.createNewFile();
    }

    /**
     * If we pass a filepath and "success" to the write method, the text "success" should be read from the file.
     * @throws FileNotFoundException
     */
    @Test
    public void writeTest1() throws FileNotFoundException {
        String filePath = "src/main/resources/Files/BlankFile.txt";
        String text = "success";
        wf.write(filePath, text);

        File file = new File(filePath);
        Scanner s = new Scanner(file);
        String line = s.nextLine().trim();
        Assert.assertEquals(line, text);

    }

}
