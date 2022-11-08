package Chapter3.MiniProject.Dictionary.main;

import Util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * A DAO is a class that mediates the transformation of data between the format of objects in Java to rows in a
 * database. The methods here are mostly filled out, you will just need to add a SQL statement.
 *
 * We may assume that the database has already created a table named 'dictionary_entry'.
 * It contains two columns: 'word', a varchar(255) which is also a primary key, and 'definition',
 * which is a varchar(255).
 */
public class DictionaryDAO {


    /**
     * Select all of the rows of the dictionary_entry table.
     * You only need to change the sql String, the rest of the method is already complete.
     *
     * @return a List of all the dictionary entries contained within the database.
     */
    public List<DictionaryEntry> getAllEntries(){
        Connection connection = ConnectionUtil.getConnection();
        List<DictionaryEntry> dictionaryEntries = new ArrayList<>();
        try {
            //Write SQL logic here
            String sql = "CHANGE ME!";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                DictionaryEntry loadedEntry = new DictionaryEntry(rs.getString("word"), rs.getString("definition"));
                dictionaryEntries.add(loadedEntry);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return dictionaryEntries;
    }
    /**
     * Insert a new row into the Dictionary Entry table, which contains the word and the definition.
     * You only need to change the sql String, the rest of the method is already complete.
     * @param entry an object containing the word and definition to be inserted into a database row.
     */
    public void addEntry(DictionaryEntry entry){
        Connection connection = ConnectionUtil.getConnection();
        try {
            //Write SQL logic here
            String sql = "CHANGE ME!";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    /**
     * Select a single entry from the database where the word is equal to some input.
     * Because word is a primary key, this will return either a single result (if there is a match)
     * or null (if there is no match).
     * You only need to change the sql String, the rest of the method is already complete.
     *
     * @return a single entry where the word corresponds to some input.
     */
    public DictionaryEntry getSingleEntry(String word){
        Connection connection = ConnectionUtil.getConnection();
        DictionaryEntry entry = null;
        try {
            //Write SQL logic here
            String sql = "CHANGE ME!";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                DictionaryEntry loadedEntry = new DictionaryEntry(rs.getString("word"), rs.getString("definition"));
                entry = loadedEntry;
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return entry;
    }

}
