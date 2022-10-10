package Chapter8.Challenges.ConnectedGraph;

import org.junit.Assert;
import org.junit.Test;

public class ConnectedGraphTest {
    ConnectedGraph cg = new ConnectedGraph();
    /*
    a test with two nodes connected to each other.
     */
    @Test
    public void graphTest1(){
        boolean[][] input = {
                {true, true},
                {true, true}
        };
        boolean expected = true;
        boolean actual = cg.isConnected(input);
        Assert.assertEquals(expected, actual);
    }
    /*
    a test with two nodes disconnected from each other.
     */
    @Test
    public void graphTest2(){
        boolean[][] input = {
                {true, false},
                {false, true}
        };
        boolean expected = false;
        boolean actual = cg.isConnected(input);
        Assert.assertEquals(expected, actual);
    }
    /*
    a test with three nodes connected to each other (triangle)
     */
    @Test
    public void graphTest3(){
        boolean[][] input = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        boolean expected = true;
        boolean actual = cg.isConnected(input);
        Assert.assertEquals(expected, actual);
    }
    /*
    a test with three nodes arranged in a line (node 2 in the middle, node 1 and 2 not directly connected)
     */
    @Test
    public void graphTest4(){
        boolean[][] input = {
                {true, true, false},
                {true, true, true},
                {false, true, true}
        };
        boolean expected = true;
        boolean actual = cg.isConnected(input);
        Assert.assertEquals(expected, actual);
    }
    /*
    a test with the third node disconnected
     */
    @Test
    public void graphTest5(){
        boolean[][] input = {
                {true, true, false},
                {true, true, false},
                {false, false, true}
        };
        boolean expected = true;
        boolean actual = cg.isConnected(input);
        Assert.assertEquals(expected, actual);
    }
    /*
    a test with a square of nodes connected to a tail, 1 connected to 2/3, 2/3/5 connected to 4
     */
    @Test
    public void graphTest6(){
        boolean[][] input = {
                {true, true, true, false, false},
                {true, true, false, true, false},
                {true, false, true, true, false},
                {false, true, true, true, true},
                {false, false, false, false, true}
        };
        boolean expected = true;
        boolean actual = cg.isConnected(input);
        Assert.assertEquals(expected, actual);
    }
    /*
    two disconnected graphs: a triangle of nodes, and 2 connected nodes.
     */
    @Test
    public void graphTest7(){
        boolean[][] input = {
                {true, true, true, false, false},
                {true, true, true, false, false},
                {true, true, true, false, false},
                {false, false, false, true, true},
                {false, false, false, true, true}
        };
        boolean expected = false;
        boolean actual = cg.isConnected(input);
        Assert.assertEquals(expected, actual);
    }
}
