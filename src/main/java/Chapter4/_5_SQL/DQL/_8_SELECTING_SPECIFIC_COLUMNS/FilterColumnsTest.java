package Chapter4._5_SQL.DQL._8_SELECTING_SPECIFIC_COLUMNS;

import Util.ConnectionUtil;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FilterColumnsTest {
    FilterColumns filterColumns = new FilterColumns();

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

            PreparedStatement ps = connection.prepareStatement(sql1 + sql2 + sql3 + sql4 + sql5 + sql6);

            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("failed creating table");
            e.printStackTrace();
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

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("dropping table");
        }
    }


    /**
     * Notice in the method above that has the @Before annotation we have created the users table and inserted 5 records.
     *
     * This test calls the method with the SQL syntax that you wrote and then we are retrieving everything in the users table to ensure that only the firstname column is retrieved.
     */
    @Test
    public void problem1Test(){
        //arrange
        User user1 = new User(0, "Steve", null);
        User user2 = new User(0,"Alexa", null);
        User user3 = new User(0,"Steve",null);
        User user4 = new User(0, "Brandon", null);
        User user5 = new User(0,"Adam",null);
        List<User> expectedResult = new ArrayList<>();
        expectedResult.add(user1);
        expectedResult.add(user2);
        expectedResult.add(user3);
        expectedResult.add(user4);
        expectedResult.add(user5);

        //act
        List<User> actualResult = filterColumns.problem1();

        //assert
        Assert.assertEquals(expectedResult, actualResult);
    }
}
