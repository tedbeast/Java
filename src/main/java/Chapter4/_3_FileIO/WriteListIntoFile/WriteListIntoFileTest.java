package Chapter4._3_FileIO.WriteListIntoFile;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteListIntoFileTest {
    WriteListIntoFile wlift = new WriteListIntoFile();
    @Before
    public void resetFile() throws IOException {
        File f = new File("src/main/resources/Files/BlankFile.txt");
        f.delete();
        f.createNewFile();
    }
    @Test
    public void writeTest1() throws FileNotFoundException {
        String filePath = "src/main/resources/Files/BlankFile.txt";
        List<String> texts = new ArrayList<>();
        texts.add("apple");
        texts.add("banana");
        texts.add("pear");
        wlift.write(filePath, texts);

        File file = new File(filePath);
        Scanner s = new Scanner(file);
        String line = s.nextLine().trim();
        Assert.assertEquals(line, "apple");
        line = s.nextLine().trim();
        Assert.assertEquals(line, "banana");
        line = s.nextLine().trim();
        Assert.assertEquals(line, "pear");
    }

    @Test
    public void writeTest2() throws FileNotFoundException {
        String filePath = "src/main/resources/Files/BlankFile.txt";
        List<String> texts = new ArrayList<>();
        texts.add("penguin");
        texts.add("zebra");
        texts.add("lion");
        wlift.write(filePath, texts);

        File file = new File(filePath);
        Scanner s = new Scanner(file);
        String line = s.nextLine().trim();
        Assert.assertEquals(line, "penguin");
        line = s.nextLine().trim();
        Assert.assertEquals(line, "zebra");
        line = s.nextLine().trim();
        Assert.assertEquals(line, "lion");
    }
}
