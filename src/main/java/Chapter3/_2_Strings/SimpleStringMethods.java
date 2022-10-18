package Chapter3._2_Strings;

/**
 * Strings are a special type of Object in Java that represent text, and they are stored a bit differently -
 * even though they are Objects, we don't need to use a constructor to instantiate them.
 *
 * Strings are actually immutable, which means that changing a string actually generates a brand new String,
 * and creating a new string that is the same as an already-existing string will just reuse the old String in memory.
 */
public class SimpleStringMethods {
    /**
     * @param s the String to be manipulated.
     * @return the length of string s.
     */
    public int length(String s){
        return 0;
    }

    /**
     * charAt can be used to retrieve specific characters of a String, such as the first character.
     * @param s the String to be manipulated.
     * @param n an index of String s.
     * @return the character of String s that is located at position n.
     */
    public char charAt(String s, int n){
        return ' ';
    }

    /**
     * indexOf can be used to retrieve the index of the first character of a String, such as the position of character
     * 'a' in banana, which would result in 1.
     * it returns -1 if the character does not exist.
     * @param s the String to be manipulated.
     * @param c a character within s.
     * @return the index of the first occurence of c within s.
     */
    public int indexOf(String s, char c){
        return 0;
    }

}
