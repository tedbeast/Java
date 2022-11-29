package Chapter3._3_SQL.DML.INSERT;

import Util.ConnectionUtil;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertARecordTest {

    private InsertARecord insertARecord = new InsertARecord();

    /**
     * The @Before annotation runs before every test so that way we create the tables required prior to running the test
     */
    @Before
    public void beforeTest(){

        try {

            Connection connection = ConnectionUtil.getConnection();

            //Write SQL logic here
            String sql = "CREATE TABLE songs (Title varchar(100), Artist varchar(100));";

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("failed creating table");
        }
    }

    /**
     * The @After annotation runs after every test so that way we drop the tables to avoid conflicts in future tests
     */
    @After
    public void cleanup(){

        try {

            Connection connection = ConnectionUtil.getConnection();

            String sql = "DROP TABLE songs;";

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("dropping table");
        }
    }

    /**
     * DML statements return the number of rows affected. The addSong method will return true if the number of rows affected is greater than 0 and false if it's 0.
     * If the test returns true then the insert statement was successful and if it is false then it was unsuccessful.
     */
    @Test
    public void addSongTest(){
        Assert.assertTrue(insertARecord.addSong());
    }
}
