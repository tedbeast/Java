package Chapter3.MiniProject.Dictionary.main;

/**
 * This class is a model. That mean's its sole purpose is to represent some structured data: and it
 * is intended to correspond 1:1 with a row in a database.
 */
public class DictionaryEntry {
    String word;
    String definition;

    /**
     * Constructor for a DictionaryEntry object.
     * @param word
     * @param definition
     */
    public DictionaryEntry(String word, String definition) {
        this.word = word;
        this.definition = definition;
    }

    /**
     * a blank constructor is required for the Jackson ObjectMapper to work.
     */
    public DictionaryEntry(){

    }

    /**
     * correctly named getter is required for the jackson ObjectMapper to work
     * @return word field of this class
     */
    public String getWord() {
        return word;
    }
    /**
     * correctly named setter is required for the jackson ObjectMapper to work
     * @param word value to set the word field of this class to
     */
    public void setWord(String word) {
        this.word = word;
    }
    /**
     * correctly named getter is required for the jackson ObjectMapper to work
     * @return definition field of this class
     */
    public String getDefinition() {
        return definition;
    }
    /**
     * correctly named setter is required for the jackson ObjectMapper to work
     * @param definition value to set the definition field of this class to
     */
    public void setDefinition(String definition) {
        this.definition = definition;
    }
}
