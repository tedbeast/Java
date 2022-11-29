package Chapter6.SQL.DDL._14_TRUNCATE;

import Util.ConnectionUtil;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TruncateTest {

    private Truncate truncate = new Truncate();

    /**
     * The @Before annotation runs before every test so that way we create the tables required prior to running the test
     */
    @Before
    public void beforeTest(){
        try {

            Connection connection = ConnectionUtil.getConnection();

            //Write SQL logic here
            String sql1 = "CREATE TABLE users (id SERIAL PRIMARY KEY, firstname varchar(100), lastname varchar(100));";
            String sql2 = "INSERT INTO users (firstname, lastname) VALUES ('Steve', 'Garcia');";
            String sql3 = "INSERT INTO users (firstname, lastname) VALUES ('Alexa', 'Smith');";
            String sql4 = "INSERT INTO users (firstname, lastname) VALUES ('Steve', 'Jones');";
            String sql5 = "INSERT INTO users (firstname, lastname) VALUES ('Brandon', 'Smith');";
            String sql6 = "INSERT INTO users (firstname, lastname) VALUES ('Adam', 'Jones');";

            String sql7 = "CREATE TABLE songs (id SERIAL PRIMARY KEY, title varchar(100), artist varchar(100));";
            String sql8 = "INSERT INTO songs (title, artist) VALUES ('Let it be', 'Beatles');";
            String sql9 = "INSERT INTO songs (title, artist) VALUES ('Imagine', 'Beatles');";
            String sql10 = "INSERT INTO songs (title, artist) VALUES ('Kashmir', 'Led Zeppelin');";

            PreparedStatement ps = connection.prepareStatement(sql1 + sql2 + sql3 + sql4 + sql5 + sql6 + sql7 + sql8 + sql9 + sql10);

            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("table already exists");
        }
    }

    /**
     * The @After annotation runs after every test so that way we drop the tables to avoid conflicts in future tests
     */
    @After
    public void cleanup(){

        try {

            Connection connection = ConnectionUtil.getConnection();
            String sql = "DROP TABLE users;";
            String sql1 = "DROP TABLE songs;";

            PreparedStatement ps = connection.prepareStatement(sql + sql1);

            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("dropping table");
        }
    }

    /**
     * Testing there are no records in the users table
     */
    @Test
    public void problem1Test(){
        truncate.problem1();

        //Write SQL statement here
        String sql = "SELECT * FROM users;";
        int counter = 0;

        try {
            Connection connection = ConnectionUtil.getConnection();

            PreparedStatement ps = connection.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                counter++;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        Assert.assertEquals(0, counter);
    }

}
