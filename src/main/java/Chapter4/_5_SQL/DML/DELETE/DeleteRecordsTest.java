package Chapter4._5_SQL.DML.DELETE;

import Chapter4._5_SQL.DQL.SELECT_WHERE.User;
import Util.ConnectionUtil;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DeleteRecordsTest {
    DeleteRecords deleteRecords = new DeleteRecords();

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


            PreparedStatement ps = connection.prepareStatement(sql1 + sql2 + sql3 + sql4 + sql5);

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
     * Notice in the method above that has the @Before annotation we have created the users table and inserted 4 records.
     *
     * This test calls the method with the SQL syntax that you wrote and then we are retrieving everything in the users table to ensure that Steve Jones was successfully removed.
     */
    @Test
    public void deleteTest(){
        //arrange
        User user1 = new User(1,"Steve","Garcia");
        User user2 = new User(2,"Alexa", "Smith");
        User user3 = new User(4, "Brandon", "Smith");
        List<User> expectedResult = new ArrayList<>();
        expectedResult.add(user1);
        expectedResult.add(user2);
        expectedResult.add(user3);


        //act
        deleteRecords.delete();

        List<User> actualResult = new ArrayList<>();

        try {
            Connection connection = ConnectionUtil.getConnection();

            String sql = "SELECT * FROM users;";

            PreparedStatement ps = connection.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                actualResult.add(new User(rs.getInt(1), rs.getString(2), rs.getString(3)));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        //assert
        Assert.assertEquals(expectedResult, actualResult);
    }
}
