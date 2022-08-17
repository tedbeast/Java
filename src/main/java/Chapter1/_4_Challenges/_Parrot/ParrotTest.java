package Chapter1._4_Challenges._Parrot;

import org.junit.Test;

/*
This challenge's method will receive a String parameter named text. The method should return it.
 */
public class ParrotTest {
    Parrot p = new Parrot();
    @Test
    public void parrotTestHello(){
        String input = "hello";
        String expected = "hello";
        String actual = p.copy(input);
    }
    @Test
    public void parrotTestPolly(){
        String input = "polly";
        String expected = "polly";
        String actual = p.copy(input);
    }

}
