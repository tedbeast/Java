package Level1.RemoveAllCharacter;

public class RemoveAllCharacter {
    public String removeAll(String s, String c){
        String replaced = s.replaceAll(c, "");
        return replaced;
    }
    /*
    useful string methods:
    charAt
    indexOf
    subString
    contains
    equals
    replace
    replaceAll
    split (turns an string into an array using some other string to separate it,
    eg split(" ") may separate a sentence into an array of words
     */
}