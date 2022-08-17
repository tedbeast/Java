package Chapter4._0_OOP.Casting.CastingObject;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class CastThenReturnTest {
    static CastThenReturn ctr;
    @BeforeClass
    public static void setUp(){
        ctr = new CastThenReturn();
    }
    @Test
    public void UpCastTest1(){
        Sofa input = new Sofa();
        Assert.assertTrue(ctr.upCastSofaToFuton(input) instanceof Futon);
    }
    @Test
    public void DownCastTest1(){
        Futon input = new Futon();
        Assert.assertTrue(ctr.downCastFutonToSofa(input) instanceof Sofa);
    }
}
