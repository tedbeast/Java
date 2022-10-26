package Chapter0._0_Start;
/**
 * This is a CLASS. A CLASS is a blueprint for generating an OBJECT. Objects contain states (variables) and
 * behavior (methods).
 *
 * This is, however, a different class with a different purpose.
 */
public class GuideMain {
    /**
     * This is a main method. A main method is a method that Java is able to use as a starting point of the
     * application. Most of the challenges in this repository do not contain a main method, because we run our
     * classes and methods within test cases instead.
     *
     * This method will instantiate a new Guide object, produce a String using the Guide object's method "guideMethod",
     * and print what that String was.
     *
     * @param args when running a Java application from the command line, it could take arguments as additional
     *             information for running the app. We won't be using this.
     */
    public static void main(String[] args) {
//      The Guide object constructor is written to take in an int parameter, which in this case is 1.
        Guide myGuide = new Guide(1);
        String result = myGuide.guideMethod("hello from main!");
        System.out.println(result);

    }
}
