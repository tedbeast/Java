package Chapter0._2_Booleans.Comparators;

/**
 * If we want to make programs that "do something", we're going to need to create instructions that change
 * depending on the current state of the program.
 * Therefore, we're inevitably going to run into boolean expressions (ie true/false statements).
 * Let's start with the different ways to compare two numbers, in this case a and b.
 */
public class Comparators {
    /**
     * @param a the first number to be compared.
     * @param b the second number to be compared.
     * @return true if a is equal to b, false otherwise.
     */
    public boolean isEqual(int a, int b){
        return a == b;
    }

    /**
     * @param a the first number to be compared.
     * @param b the second number to be compared.
     * @return true if a is greater than b, false otherwise.
     */
    public boolean greaterThan(int a, int b){
        return a > b;
    }
    /**
     * @param a the first number to be compared.
     * @param b the second number to be compared.
     * @return true if a is less than b, false otherwise.
     */
    public boolean lessThan(int a, int b){
        return a < b;
    }
    /**
     * @param a the first number to be compared.
     * @param b the second number to be compared.
     * @return true if a is greater than or equal to b, false otherwise.
     */
    public boolean greaterThanOrEqualTo(int a, int b){
        return a >= b;
    }
    /**
     * @param a the first number to be compared.
     * @param b the second number to be compared.
     * @return true if a is less than or equal to b, false otherwise.
     */
    public boolean lessThanOrEqualTo(int a, int b){
        return a <= b;
    }
}