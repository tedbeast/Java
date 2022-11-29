package Chapter5._3_SQL.DQL._10_AGGREGATE_FUNCTIONS;

import Util.ConnectionUtil;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static org.junit.Assert.fail;

public class AggregateFunctionsTest {
    private final AggregateFunctionsActivity aggregateFunctionsActivity = new AggregateFunctionsActivity();
    private Connection conn;

    @Before
    public void setup() {
        try {
            conn = ConnectionUtil.getConnection();

            String createTable = "CREATE TABLE employees (" +
                    "id SERIAL PRIMARY KEY," +
                    "first_name VARCHAR(255)," +
                    "last_name VARCHAR(255)," +
                    "salary DOUBLE PRECISION" +
                    ");";
            PreparedStatement createTableStatement = conn.prepareStatement(createTable);
            createTableStatement.executeUpdate();

            String insertData = "INSERT INTO employees (first_name, last_name, salary) VALUES" +
                    "('Steve', 'Garcia', 67400.00)," +
                    "('Alexa', 'Smith', 42500.00)," +
                    "('Steve', 'Jones', 99890.99)," +
                    "('Brandon', 'Smith', 120000)," +
                    "('Adam', 'Jones', 55050.50);";
            PreparedStatement insertDataStatement = conn.prepareStatement(insertData);
            insertDataStatement.executeUpdate();

        } catch(SQLException e) {
            e.printStackTrace();
        }
    }

    @After
    public void cleanup() {
        try {
            conn = ConnectionUtil.getConnection();

            String dropTable = "DROP TABLE IF EXISTS employees";
            PreparedStatement createTableStatement = conn.prepareStatement(dropTable);
            createTableStatement.executeUpdate();

        } catch(SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testActivityOrderResultSet() {
        try {
            Double expectedValue = (67400.00 + 42500.00 + 99890.99 + 120000 + 55050.50)/5;
            Double resultValue = aggregateFunctionsActivity.calculateAverageSalary();

            Assert.assertEquals(expectedValue, resultValue);
        }catch(Exception e) {
            e.printStackTrace();
            fail();
        }

    }

    @Test
    public void testActivityCountTheSmiths() {
        try {
            int expectedValue = 2;
            int resultValue = aggregateFunctionsActivity.countTheSmiths();

            Assert.assertEquals(expectedValue, resultValue);
        }catch(Exception e) {
            e.printStackTrace();
            fail();
        }

    }
}
