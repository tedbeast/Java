package Chapter3._3_SQL.DDL.DROP;

import Util.ConnectionUtil;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static org.junit.Assert.fail;

public class DropATableTest {
    private DropATable dropATable = new DropATable();

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
     *  In programming we utilize try / catch constructs to catch when there are potential for errors / exceptions.
     *  For this test, if I am able to insert a song into the songs table, then the songs table was never dropped and the test should fail.
     */
    @Test
    public void dropTableTest(){

        try {
            dropATable.dropTable();

            Connection connection = ConnectionUtil.getConnection();

            String sql = "INSERT INTO songs (Title, Artist) VALUES ('Let it be', 'Beatles');";

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.executeUpdate();

            //if the execute update passes, the test will fail
            Assert.fail();

        } catch (SQLException e) {
            //e.printStackTrace();
        }


    }
}
