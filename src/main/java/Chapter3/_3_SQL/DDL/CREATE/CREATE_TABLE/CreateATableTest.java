package Chapter3._3_SQL.DDL.CREATE.CREATE_TABLE;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.junit.After;
import org.junit.Test;

import Util.ConnectionUtil;

public class CreateATableTest {

    private CreateATable createATable = new CreateATable();

    /**
     * The @After annotation runs after every test so that way we drop the tables to avoid conflicts in future tests
     */
    @After
    public void cleanup(){

        try {

            Connection connection = ConnectionUtil.getConnection();

            //Write SQL logic here
            String sql = "DROP TABLE songs;";

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.executeUpdate();

        } catch (SQLException e) { 
            System.out.println("dropping table");
        }
    }


    @Test
    public void createTableTest(){
        
        try {
            createATable.createTable();

            Connection connection = ConnectionUtil.getConnection();

            //Write SQL logic here
            String sql = "INSERT into songs (Title, Artist) VALUES ('Let it Be', 'Beatles')";

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            fail();
        }


    }

}
