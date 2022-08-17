package Chapter3._0_OOP.Constructors;

import org.junit.Assert;
import org.junit.Test;

/*
see 'player' for challenge instructions
 */
public class ConstructorTest {
    @Test
    public void player1ArgConstructorTest1(){
        Player p = new Player("Frodo");
        Assert.assertEquals(p.playerName, "Frodo");
        Assert.assertEquals(p.level, 1);
        Assert.assertEquals(p.inventory, null);
    }
    @Test
    public void player1ArgConstructorTest2(){
        Player p = new Player("Sam");
        Assert.assertEquals(p.playerName, "Sam");
        Assert.assertEquals(p.level, 1);
        Assert.assertEquals(p.inventory, null);
    }
    @Test
    public void player2ArgConstructorTest1(){
        Player p = new Player("Gollum", 5);
    }
    @Test
    public void addItemTest1(){
        Player p = new Player("Gandalf", 70);
        p.addItem("Pipe", 5);
        p.addItem("Staff", 500);
        Assert.assertTrue(p.inventory.get(0).title == "Pipe");
        Assert.assertTrue(p.inventory.get(0).value == 5);
        Assert.assertTrue(p.inventory.get(1).title == "Staff");
        Assert.assertTrue(p.inventory.get(1).value == 500);
    }
}