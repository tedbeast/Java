package Core.OOP.Overriding;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {
    @Test
    public void noiseTestDog(){
        Dog fido = new Dog();
        Assert.assertEquals(fido.noise(), "Woof");
    }
    @Test
    public void noiseTestShiba(){
        Dog doge = new Shiba();
        Assert.assertNotEquals(doge.noise(), "Woof");
    }
}
