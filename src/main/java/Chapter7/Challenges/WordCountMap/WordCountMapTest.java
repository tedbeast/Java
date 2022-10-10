package Chapter7.Challenges.WordCountMap;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class WordCountMapTest {
    WordCountMap wcm = new WordCountMap();
    @Test
    public void wordCountTest1(){
        String input = "apple pear melon";
        Map<String, Integer> actual = wcm.returnWordMap(input);
        int a1 = actual.get("apple");
        int e1 = 1;
        int a2 = actual.get("pear");
        int e2 = 1;
        int a3 = actual.get("melon");
        int e3 = 1;
        Assert.assertEquals(a1,e1);
        Assert.assertEquals(a2,e2);
        Assert.assertEquals(a3,e3);
    }
    @Test
    public void wordCountTest2(){
        String input = "giraffe zebra giraffe";
        Map<String, Integer> actual = wcm.returnWordMap(input);
        int giraffeCount = actual.get("giraffe");
        int expectedGiraffeCount = 2;
        int zebraCount = actual.get("zebra");
        int expectedZebraCount = 1;
        Assert.assertEquals(giraffeCount, expectedGiraffeCount);
        Assert.assertEquals(zebraCount, expectedZebraCount);
    }
    @Test
    public void wordCountTest3(){
        String input = "apple pear melon apple pear apple";
        Map<String, Integer> actual = wcm.returnWordMap(input);
        int a1 = actual.get("apple");
        int e1 = 3;
        int a2 = actual.get("pear");
        int e2 = 2;
        int a3 = actual.get("melon");
        int e3 = 1;
        Assert.assertEquals(a1,e1);
        Assert.assertEquals(a2,e2);
        Assert.assertEquals(a3,e3);
    }

}
