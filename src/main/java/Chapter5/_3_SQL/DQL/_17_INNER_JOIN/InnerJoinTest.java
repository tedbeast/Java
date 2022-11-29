package Chapter5._3_SQL.DQL._17_INNER_JOIN;

import Util.ConnectionUtil;
import kotlin.Pair;
import org.junit.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public class InnerJoinTest {
    private final InnerJoinActivity innerJoinActivity = new InnerJoinActivity();
    private static Connection conn;

    @BeforeClass
    public static void getConnection() {
        conn = ConnectionUtil.getConnection();
    }


    @Before
    public void setup() {
        try {
            String facultyTable = "CREATE TABLE faculty (" +
                    "id SERIAL PRIMARY KEY," +
                    "teacher VARCHAR(255)," +
                    "class VARCHAR(255)" +
                    ");";
            PreparedStatement facultyTableStatement = conn.prepareStatement(facultyTable);
            facultyTableStatement.executeUpdate();

            String insertFaculty = "INSERT INTO faculty (teacher, class) VALUES" +
                    "('Mr. Tyson', 'Physics')," +
                    "('Ms. Lovelace', 'Math')," +
                    "('Mr. McCarthy', 'Writing')," +
                    "('Ms. Goodall', 'Biology');";
            PreparedStatement insertFacultyData = conn.prepareStatement(insertFaculty);
            insertFacultyData.executeUpdate();


            String studentsTable = "CREATE TABLE students (" +
                    "id SERIAL PRIMARY KEY," +
                    "student VARCHAR(255)," +
                    "class VARCHAR(255)" +
                    ");";
            PreparedStatement studentsTableStatement = conn.prepareStatement(studentsTable);
            studentsTableStatement.executeUpdate();

            String insertStudents = "INSERT INTO students (student, class) VALUES" +
                    "('John Stewart', 'Writing')," +
                    "('Stephen Colbert', 'Physics')," +
                    "('Samantha Bee', 'Math')," +
                    "('Aasif Mandvi', 'Writing')," +
                    "('Robert Riggle', 'Physics')," +
                    "('Jessica Williams', 'Art');";
            PreparedStatement insertStudentsData = conn.prepareStatement(insertStudents);
            insertStudentsData.executeUpdate();


            String textbooksTable = "CREATE TABLE textbooks (" +
                    "id SERIAL PRIMARY KEY," +
                    "class VARCHAR(255)," +
                    "textbook VARCHAR(255)" +
                    ");";
            PreparedStatement textbooksTableStatement = conn.prepareStatement(textbooksTable);
            textbooksTableStatement.executeUpdate();

            String insertTextbooks = "INSERT INTO textbooks (class, textbook) VALUES" +
                    "('Physics' , 'Motion 101')," +
                    "('Math', 'What even is modulus anyway?')," +
                    "('Biology', 'Lions, Tigers, and Organs 5th ed')," +
                    "('Writing', 'The Story Circle Workbook')," +
                    "('Art', 'Teenage Mutant Ninja Turtles #10');";
            PreparedStatement insertTextbooksStatement = conn.prepareStatement(insertTextbooks);
            insertTextbooksStatement.executeUpdate();

        } catch(SQLException e) {
            e.printStackTrace();
        }
    }

    @After
    public void cleanup() {
        try {
            conn = ConnectionUtil.getConnection();

            String dropTable = "DROP TABLE IF EXISTS faculty, students, textbooks";
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
    public void testActivityInnerJoin1() {
        Set<Pair<Integer, String>> expected = new HashSet<>();
        expected.add(new Pair<Integer, String>(1, "John Stewart"));
        expected.add(new Pair<Integer, String>(4, "Aasif Mandvi"));

        Set<Pair<Integer, String>> result = innerJoinActivity.innerJoin1();

        Assert.assertEquals(expected, result);

    }

}
