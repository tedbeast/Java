package Chapter3._3_SQL.DML.INSERT;

import Util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Now that we can create and drop tables, we need to be able to insert records into the table.
 * */
public class InsertARecord {

    /**
     * For this lab, the table "songs" is already generated.
     *
     * Visual Representation of Songs Table:
     *      |      Title        |        Artist          |
     *      ----------------------------------------------
     *      |'Let it be'        |'Beatles'               |
     *      |'Hotel California' |'Eagles'                |
     *      |'Kashmir'          |'Led Zeppelin'          |
     *
     * Activity: Write the sql statement that allows us to add a new record into the table "songs".
     * */
    public boolean addSong(){
        //Write SQL logic here
        String sql = "CHANGE ME";

        try {
            Connection connection = ConnectionUtil.getConnection();

            PreparedStatement ps = connection.prepareStatement(sql);

            return ps.executeUpdate() != 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
}
