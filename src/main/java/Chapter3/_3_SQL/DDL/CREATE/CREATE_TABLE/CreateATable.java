package Chapter3._3_SQL.DDL.CREATE.CREATE_TABLE;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Util.ConnectionUtil;

public class CreateATable {
    
    /**
     * As of right now, all of the data that we are storing into variables are lost when the application ends. We need a tool that will
     * allow us to persist data permanently. This tool is called a database. 
     * The specific type of database we will be utilizing uses a language called SQL.
     * 
     * SQL stands for Structured Query Language. 
     * 
     * Before we store or retrieve any data, we need to define the format in which it is stored. SQL utilizes tables as its format. 
     * This follows a similar format to a spreadsheet. The tables will have rows and columns.
     * 
     * The columns define the attributes of the table.
     * One row defines a single complete item in the table.
     * 
     * For example, if we had a songs table, each column would define an attribute of a song and a row would define a single song.
     * 
     * Songs Table Diagram:
     * |      Title        |        Artist         |
     * ---------------------------------------------
     * |'Let it be'        |'Beatles'               |
     * |'Hotel California' |'Eagles'                |
     * |'Kashmir'          |'Led Zeppelin'          |
     * 
     * Let's create our first SQL table.
     * You can read about the syntax here: https://www.w3schools.com/sql/sql_create_table.asp
     * 
     * Assignment: Create a new table in our database called "songs" with 2 columns "Title" and "Artist".
     */
    public void createTable(){
        //Write SQL logic here
        String sql = "CHANGE ME";

        try {
            Connection connection = ConnectionUtil.getConnection();

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
