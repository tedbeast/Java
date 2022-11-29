package Chapter4._5_SQL.DDL.CREATE_TABLE_WITH_PK;

import Util.ConnectionUtil;
import org.junit.After;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static org.junit.Assert.fail;

public class CreateTableWithPKTest {

    private CreateTableWithPK createTableWithPK = new CreateTableWithPK();

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
    public void createTableSurrogateKeyTest(){

        try {
            createTableWithPK.createSurrogateKey();

            Connection connection = ConnectionUtil.getConnection();

            //Notice that we are not manually adding a number for the primary key here. The db will do this for us because of the "SERIAL" datatype to be used.
            String sql = "INSERT into songs (Title, Artist) VALUES ('Let it Be', 'Beatles')";

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            fail();
        }


    }


}
