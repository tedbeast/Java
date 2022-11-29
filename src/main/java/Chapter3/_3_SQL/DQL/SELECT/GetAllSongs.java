package Chapter3._3_SQL.DQL.SELECT;

import Util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * In this lab we are going to learn how to retrieve all the records from a table.
 *
 * The db table we will utilize is "songs" table from the DDL lab.
 *
 *      Songs Table Diagram:
 *      |      Title        |        Artist          |
 *      ----------------------------------------------
 *      |'Let it be'        |'Beatles'               |
 *      |'Hotel California' |'Eagles'                |
 *      |'Kashmir'          |'Led Zeppelin'          |
 *
 * The sublanguage for retrieving data from tables is called DQL (Data Query Language).
 * This language utilizes the keyword "SELECT".
 *
 * The syntax for retrieving all rows and columns from a database table looks like the following:
 *
 * SELECT * FROM table_name;
 *
 * NOTE: The square brackets above is representing a dynamic variable. Instead of writing [TABLE_NAME], you would input the table you are trying to retrieve data from.
 * External Documentation Here (If Needed): https://www.w3schools.com/sql/sql_select.asp
 *
 * Assignment: write the SQL statement below to retrieve all the rows and columns from the table "songs"
 *
 */
public class GetAllSongs {
    public List<Song> retrieveAllSongsFromTable(){
        //Write SQL logic here
        String sql = "CHANGE ME";

        List<Song> songs = new ArrayList<>();
        try {
            Connection connection = ConnectionUtil.getConnection();

            PreparedStatement ps = connection.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                songs.add(new Song(rs.getString(1), rs.getString(2)));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return songs;
    }
}
