package Chapter4._3_FileIO.ReadFileIntoListOfStrings;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ReadFileIntoListOfStringsTest {
    ReadFileIntoListOfStrings rfilos = new ReadFileIntoListOfStrings();
    @Test
    public void readFileListTest1(){
        String input = "src/main/resources/Files/Clothing1.txt";
        List<String> output = rfilos.readIntoList(input);
        String target1 = "socks $3.99";
        String target2 = "coat $49.99";
        Assert.assertTrue(output.contains(target1));
        Assert.assertTrue(output.contains(target2));

    }
    @Test
    public void readFileListTest2(){
        String input = "src/main/resources/Files/ExactitudeOfScience.txt";
        List<String> output = rfilos.readIntoList(input);
        String target1 = "...In that Empire, the Art of Cartography attained such Perfection that the map of a";
        String target2 = "Tattered Ruins of that Map, inhabited by Animals and Beggars; in all the Land there is";
        Assert.assertTrue(output.contains(target1));
        Assert.assertTrue(output.contains(target2));
    }
}