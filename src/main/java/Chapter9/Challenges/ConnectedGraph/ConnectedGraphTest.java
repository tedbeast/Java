package Chapter9.Challenges.ConnectedGraph;

import org.junit.Assert;
import org.junit.Test;

public class ConnectedGraphTest {
    ConnectedGraph cg = new ConnectedGraph();

    /**
     * a test with two nodes connected to each other.
     * It expects true because a path exists between all the nodes.
     * for instance:
     *      1 - 2
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

    /**
     * a test with two nodes disconnected from each other.
     * It expects false because there is no way to form a path between 1 and 2.
     * for instance:
     *      1   2
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

    /**
     * a test with three nodes connected to each other (triangle)
     * It expects true because a path can be formed between all the nodes.
     * for instance:
     *      1 - 2
     *      | /
     *      3
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

    /**
     * a test with three nodes arranged in a line (node 2 in the middle, node 1 and 2 not directly connected)
     * It expects true because a path could be formed between all the nodes, transiently.
     * 1 - 2 - 3
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

    /**
     * a test with the third node disconnected
     * It expects false because no path could be made to the third node.
     * For instance:
     *      1 - 2   3
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

    /**
     * a test with a square of nodes connected to a tail, 1 connected to 2/3, 2/3/5 connected to 4
     * It expects true because a path could be formed to all the nodes, transiently.
     *
     * For instance:
     *      1 - 2
     *      |   |
     *      3 - 4 - 5
     */
    @Test
    public void graphTest6(){
        boolean[][] input = {
                {true, true, true, false, false},
                {true, true, false, true, false},
                {true, false, true, true, false},
                {false, true, true, true, true},
                {false, false, false, true, true}
        };
        boolean expected = true;
        boolean actual = cg.isConnected(input);
        Assert.assertEquals(expected, actual);
    }

    /**
     * two disconnected graphs: a triangle of nodes, and 2 connected nodes.
     * It fails because no connection could be made between the two sections of the graph.
     *      1 - 2   4 - 5
     *      | /
     *      3
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
