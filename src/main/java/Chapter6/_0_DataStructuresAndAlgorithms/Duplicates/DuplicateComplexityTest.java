package Chapter6._0_DataStructuresAndAlgorithms.Duplicates;

import org.junit.Assert;
import org.junit.Test;

public class DuplicateComplexityTest {

    DuplicateComplexity dc = new DuplicateComplexity();

    @Test
    public void findDuplicatesTest1(){
        String[] words = generateWords();
//        get system start time
        long benchmarkTime = System.currentTimeMillis();
        dc.findDuplicatesn2(words);
//        get total elapsed time of algorithm
        benchmarkTime = System.currentTimeMillis() - benchmarkTime;
        long algorithmTime = System.currentTimeMillis();
        boolean expected = false;
        boolean actual = dc.findDuplicatesFaster(words);
        algorithmTime = System.currentTimeMillis() - algorithmTime;
        Assert.assertEquals(expected, actual);
        System.out.println("Benchmark time: "+benchmarkTime +" milliseconds");
        System.out.println("Your time: "+algorithmTime+" milliseconds");
        Assert.assertTrue(algorithmTime<benchmarkTime/2);
    }
    @Test
    public void findDuplicatesTest2(){
        String[] words = generateWords();
        words[1] = "xyz";
//        get system start time
        long benchmarkTime = System.currentTimeMillis();
        dc.findDuplicatesn2(words);
//        get total elapsed time of algorithm
        benchmarkTime = System.currentTimeMillis() - benchmarkTime;
        long algorithmTime = System.currentTimeMillis();
        boolean expected = true;
        boolean actual = dc.findDuplicatesFaster(words);
        algorithmTime = System.currentTimeMillis() - algorithmTime;
        Assert.assertEquals(expected, actual);
        System.out.println("Benchmark time: "+benchmarkTime +" milliseconds");
        System.out.println("Your time: "+algorithmTime+" milliseconds");
        Assert.assertTrue(algorithmTime<benchmarkTime/2);
    }
    /*
    hacky way to get lots of predictable nonsense. not a test.
     */
    public String[] generateWords(){
        String[] chars = {"a", "b", "c", "d", "e", "f", "h", "i", "j", "k", "l", "m", "n", "o",
        "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9"
        ,"0"};
        String[] words = new String[chars.length*chars.length*chars.length];
        int currentWord = 0;
        for(int i = 0; i < chars.length; i++){
            for(int j = 0; j < chars.length; j++){
                for(int k = 0; k < chars.length; k++){
                        words[currentWord++] = chars[i] + chars[j] + chars[k];
                }
            }
        }
        return words;
    }
}
