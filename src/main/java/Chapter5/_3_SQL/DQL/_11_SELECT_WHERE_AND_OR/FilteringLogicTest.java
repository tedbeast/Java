package Chapter5._3_SQL.DQL._11_SELECT_WHERE_AND_OR;

import Util.ConnectionUtil;
import org.junit.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class FilteringLogicTest {
    private final FilteringLogicActivity filteringLogicActivity = new FilteringLogicActivity();
    private static Connection conn;

    @BeforeClass
    public static void getConnection() {
        conn = ConnectionUtil.getConnection();
    }


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

    @AfterClass
    public static void closeConnection() {
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testActivityFindEmployeesAnd() {
        Set<Employee> expectedList = new HashSet<>();
        expectedList.add(new Employee(3, "Steve", "Jones", 99890.99));

        Set<Employee> resultList = filteringLogicActivity.findEmployeesAnd();

        assertEquals(expectedList, resultList);
    }

    @Test
    public void testActivityFindEmployeesOr() {
        Set<Employee> expectedList = new HashSet<>();
        expectedList.add(new Employee(2, "Alexa", "Smith", 42500));
        expectedList.add(new Employee(4, "Brandon", "Smith", 120000));

        Set<Employee> resultList = filteringLogicActivity.findEmployeesOr();

        assertEquals(expectedList, resultList);
    }

}
