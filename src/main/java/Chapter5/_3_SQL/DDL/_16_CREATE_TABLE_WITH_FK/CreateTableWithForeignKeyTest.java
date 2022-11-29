package Chapter5._3_SQL.DDL._16_CREATE_TABLE_WITH_FK;


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

public class CreateTableWithForeignKeyTest {
    CreateTableWithForeignKey createTableWithForeignKey = new CreateTableWithForeignKey();

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
            String sql = "DROP TABLE posts;";
            String sql1 = "DROP TABLE users;";

            PreparedStatement ps = connection.prepareStatement(sql + sql1);

            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("dropping table");
        }
    }


    /**
     * Notice in the method above that has the @Before annotation we have created the users table and inserted 5 records.
     *
     * This test calls the method with the SQL syntax that you wrote and then we are retrieving everything in the users table to ensure that Alexa was successfully updated.
     */
    @Test
    public void problem1Test(){
        //arrange
        User user1 = new User(1,"Steve","Garcia");
        User user2 = new User(2,"Alexa", "Smith");
        User user3 = new User(3,"Steve","Jones");
        User user4 = new User(4, "Brandon", "Smith");
        User user5 = new User(5,"Adam","Jones");
        List<User> expectedResult = new ArrayList<>();
        expectedResult.add(user1);
        expectedResult.add(user2);
        expectedResult.add(user3);
        expectedResult.add(user4);
        expectedResult.add(user5);


        //act
        createTableWithForeignKey.problem();

        try {
            Connection connection = ConnectionUtil.getConnection();

            String sql = "INSERT INTO posts (post, user_fk) VALUES ('test post123', 1)";

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.executeUpdate();

        } catch (SQLException e) {
            cleanup();
            e.printStackTrace();
            Assert.fail();
        }
    }

    /**
     * Notice in the method above that has the @Before annotation we have created the users table and inserted 5 records.
     *
     * This test checks if you can input a fk that doesnt exist in the users table.
     */
    //TODO identify a better way to check if a constraint exists on a column
    @Test
    public void problem1TestRefIntegrity(){
        //arrange
        User user1 = new User(1,"Steve","Garcia");
        User user2 = new User(2,"Alexa", "Smith");
        User user3 = new User(3,"Steve","Jones");
        User user4 = new User(4, "Brandon", "Smith");
        User user5 = new User(5,"Adam","Jones");
        List<User> expectedResult = new ArrayList<>();
        expectedResult.add(user1);
        expectedResult.add(user2);
        expectedResult.add(user3);
        expectedResult.add(user4);
        expectedResult.add(user5);


        //act
        createTableWithForeignKey.problem();

        try {
            Connection connection = ConnectionUtil.getConnection();

            String sql = "INSERT INTO posts (post, user_fk) VALUES ('test post123', 100)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.executeUpdate();
            //if executing the query doesn't throw an exception, then the test should fail.
            Assert.fail();
        } catch (SQLException ignored) {
        }
    }

}
