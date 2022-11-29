package Chapter4._4_Strings.OtherStringMethods;

public class OtherStringMethods {
    /**
     * Substring will become an important part of solving puzzles with strings. It allows you to get part of a string
     * - eg, substring(0,3) of "banana" is "ban". (first number inclusive, second number exclusive.)
     * @param s the string to be manipulated
     * @param start the index of the start of the substring, inclusive.
     * @param end the index of the end of the substring, exclusive.
     * @return
     */
    public String partOfString(String s, int start, int end){
        return "";
    }

    /**
     * We've already talked about how all classes have equals and toString - how do we mandate that a class exhibits
     * certain behaviors apart from those provided by the Object class? The answer is interfaces, which are visited
     * in the next chapter. Strings implement the Comparable interface, which means that they have a compareTo method.
     * Strings' compareTo method compares Strings as if they're in a dictionary - ie, "cat" is less than "dog".
     * @param s1 the first String to be compared.
     * @param s2 the second String to be compared.
     * @return a number greater than 0 if s1 > s2 lexigraphically, a number less than 0 is s1 < s2 lexigraphically,
     * and 0 if s1 is equivalent to s2.
     */
    public int compareLexigraphically(String s1, String s2){
        return 0;
    }

    /**
     * The split method is useful for dividing a string into multiple strings, most notably for dividing a sentence
     * into its constituent words.
     * @param s1 the string to be manipulated.
     * @param splitAround the string that will be the text that s1 is split around (eg, for dividing a sentence into
     *                    words we use " ".
     * @return an array of Strings that represent s1 split by splitAround.
     */
    public String[] splitStringIntoMultipleStrings(String s1, String splitAround){
        return null;
    }
}
