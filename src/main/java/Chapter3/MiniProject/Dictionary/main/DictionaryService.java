package Chapter3.MiniProject.Dictionary.main;

import java.util.List;

public class DictionaryService {
    DictionaryDAO dictionaryDAO = new DictionaryDAO();
    /**
     * Use the DictionaryDAO to add a word.
     * Beware! attempting to add a dictionary entry that contains a word already present in the database
     * will result in an exception. Rather, you should handle this elegantly by first checking
     * if the word exists in the database.
     * (hint: you could first use the getEntry method of this class to check if the result is null,
     * which would indicate that the word does not yet exist.)
     * @param entry a new dictionary entry.
     */
    public void addEntry(DictionaryEntry entry) {

    }

    /**
     * Use the DAO to get all entries from the dictionary.
     * @return all dictionary entries.
     */
    public List<DictionaryEntry> getAllEntries() {
        return null;
    }

    /**
     * Use the DictionaryDAO to retrieve an entry for a specific word.
     * If the word exists in the dictionary, return the word. If no word exists, return null.
     * @param word a word that the user may be searching for.
     * @return A dictionary entry for a specific word.
     */
    public DictionaryEntry getEntry(String word) {
        return null;
    }
}
