package Chapter5._3_SQL.DQL._12_ORDER_BY;

import Util.ConnectionUtil;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.fail;

public class OrderResultSetTest {
    private final OrderResultSetActivity orderResultSetActivity = new OrderResultSetActivity();
    private Connection conn;


    @Before
    public void setup() {
        try {
            conn = ConnectionUtil.getConnection();

            String createTable = "CREATE TABLE characters (" +
                    "id SERIAL PRIMARY KEY," +
                    "first_name VARCHAR(255)," +
                    "last_name VARCHAR(255)" +
                    ");";
            PreparedStatement createTableStatement = conn.prepareStatement(createTable);
            createTableStatement.executeUpdate();

            String insertData = "INSERT INTO characters (first_name, last_name) VALUES" +
                    "('Leto', 'Atreides')," +
                    "('Vladimir', 'Harkonnen')," +
                    "('Jessica', 'Atreides')," +
                    "('Paul', 'Atreides')," +
                    "('Feyd-Rautha', 'Harkonnen');";
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

            String dropTable = "DROP TABLE IF EXISTS characters";
            PreparedStatement createTableStatement = conn.prepareStatement(dropTable);
            createTableStatement.executeUpdate();

        } catch(SQLException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void testActivityOrderResultSet() {
        try {
            List<Character> expectedList = new LinkedList<>();
            expectedList.add(new Character(3, "Jessica", "Atreides"));
            expectedList.add(new Character(1, "Leto", "Atreides"));
            expectedList.add(new Character(4, "Paul", "Atreides"));
            expectedList.add(new Character(5, "Feyd-Rautha", "Harkonnen"));
            expectedList.add(new Character(2, "Vladimir", "Harkonnen"));


            List<Character> resultList = orderResultSetActivity.orderResultSetByName();

            Assert.assertEquals(expectedList, resultList);
        }catch(Exception e) {
            e.printStackTrace();
            fail();
        }

    }
}