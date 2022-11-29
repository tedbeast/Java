package Chapter6.SQL.DQL._13_GROUP_BY;

import Util.ConnectionUtil;
import org.junit.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class GroupByTest {
    private final GroupByActivity groupByActivity = new GroupByActivity();
    private static Connection conn;

    @BeforeClass
    public static void getConnection() {
        conn = ConnectionUtil.getConnection();
    }


    @Before
    public void setup() {
        try {
            String createTable = "CREATE TABLE songs (" +
                    "id SERIAL PRIMARY KEY," +
                    "artist VARCHAR(255)," +
                    "album VARCHAR(255)," +
                    "song VARCHAR(255)" +
                    ");";
            PreparedStatement createTableStatement = conn.prepareStatement(createTable);
            createTableStatement.executeUpdate();

            String insertData = "INSERT INTO songs (artist, album, song) VALUES" +
                    "('The Beatles', 'Abbey Road', 'Come Together')," +
                    "('The Beatles', 'Let It Be', 'Let It Be' )," +
                    "('Led Zeppelin', 'IV', 'Black Dog')," +
                    "('Led Zeppelin', 'Physical Graffiti', 'Kashmir' )," +
                    "('Led Zeppelin', 'IV', 'Going to California' )," +
                    "('The Eagles', 'Hotel California', 'Hotel California');";
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

            String dropTable = "DROP TABLE IF EXISTS songs";
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
        } catch(SQLException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void testActivityGroupAndCountSongsByArtist() {
        Map<String, Integer> expectedCounts = new HashMap<>();
        expectedCounts.put("The Beatles", 2);
        expectedCounts.put("Led Zeppelin", 3);
        expectedCounts.put("The Eagles", 1);

        Map<String, Integer> resultCounts = groupByActivity.groupAndCountSongsByArtist();

        Assert.assertEquals(expectedCounts, resultCounts);

    }

}
