package Chapter2._3_SQL.DML.INSERT;

import Util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Now that we can create and drop tables, we need to be able to insert records into the table.
 * */
public class InsertARecord {

    /**
     * Activity: Assuming the table "songs" already exists, write the sql statement that allows us to add a new record into the table "songs".
     * */
    public boolean addSong(){
        try {
            Connection connection = ConnectionUtil.getConnection();

            //Write SQL logic here
            String sql = "INSERT INTO songs VALUES ('Let it be');";

            PreparedStatement ps = connection.prepareStatement(sql);

            return ps.executeUpdate() != 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
}
