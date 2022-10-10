
package Chapter5._2_FileIO;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class ReadDataIntoListTest {
    ReadDataIntoList rdil = new ReadDataIntoList();
    @Test
    public void readDataIntoListTest1() throws IOException{
        String filepath = "src/main/resources/Files/Clothing1.txt";
        List<ClothingItem> items = rdil.readToList(filepath);
        ClothingItem clothing1 = new ClothingItem("tshirt", "$19.99");
        ClothingItem clothing2 = new ClothingItem("socks", "$3.99");
        ClothingItem clothing3 = new ClothingItem("hat", "$15.99");
        ClothingItem clothing4 = new ClothingItem("coat", "$49.99");
        Assert.assertTrue(items.contains(clothing1));
        Assert.assertTrue(items.contains(clothing2));
        Assert.assertTrue(items.contains(clothing3));
        Assert.assertTrue(items.contains(clothing4));
    }
    @Test
    public void readDataIntoListTest2() throws IOException {
        String filepath = "src/main/resources/Files/Clothing2.txt";
        List<ClothingItem> items = rdil.readToList(filepath);
        ClothingItem clothing1 = new ClothingItem("dress", "$59.99");
        ClothingItem clothing2 = new ClothingItem("blouse", "$39.99");
        ClothingItem clothing3 = new ClothingItem("scarf", "$19.99");
        Assert.assertTrue(items.contains(clothing1));
        Assert.assertTrue(items.contains(clothing2));
        Assert.assertTrue(items.contains(clothing3));
    }
}
