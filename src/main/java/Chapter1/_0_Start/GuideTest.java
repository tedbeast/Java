package Chapter1._0_Start;
//We have to import the classes we want to use.
;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * To create test cases, we're leveraging junit. Junit is a testing framework which we've added to our application
 * using Maven dependency manager. You can take a look at the pom.xml to understand Maven better.
 * Junit will run methods marked with its annotations and test if they pass Assert.
 *
 * There should be a green arrow by line 15, go ahead and run it to run this test class.
 */
public class GuideTest {
/**
 * Here we have defined a static variable. A static variable means that the existence of this variable is not
 * tied to a particular object, but rather a single variable is shared across the application. Meaning,
 * it's tied to a class rather than an object.
 * Its usage here is just to get the @BeforeClass annotation to work as expected. If you are using the static keyword
 * and don't fully understand why, you are probably making a mistake of not instantiating an object before you access
 * its fields or methods.
 */
    static Guide g;
    /**
     * This is an annotation: it's a way for Java to apply some special modification to a class, method, or variable.
     * In this case, it's provided to us by junit. The @BeforeClass annotation simply defines a method that is run
     * before any tests are run.
     */
    @BeforeClass
    public static void setUp(){
        /**
         * Here we are instantiating an object using the constructor that we've written in the Guide class.
         * Instantiating the Guide object as such will assign its id to 1, and will allow us to use its methods.
         */
        g = new Guide(1);
    }
    /**
     *  The @Test annotation defines a method that will be used as a test. Typically in a test, we must define certain
     *  inputs and some expected output, and compare it to the actual behavior of our object. We use Junit's Assert
     *  to see if a test actually passes or fails.
     *
     *  This test will use the Guide object that already exists, and verify that it works as expected when running
     *  guideMethod("hello").
     */
    @Test
    public void basicsTest1(){

        String inputMessage = "hello";
        String expected = "Success from guide object 1! it says: hello";
        String actual = g.guideMethod(inputMessage);
        Assert.assertEquals(expected, actual);

    }

    /**
     * This test will use the Guide object that already exists, and verify that it works as expected when running
     * guideMethod("test").
     */
    @Test
    public void basicsTest2(){

        String inputMessage = "test";
        String expected = "Success from guide object 1! it says: test";
        String actual = g.guideMethod(inputMessage);
        Assert.assertEquals(expected, actual);

    }

}
