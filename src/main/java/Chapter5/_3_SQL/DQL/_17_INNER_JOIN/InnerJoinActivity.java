package Chapter5._3_SQL.DQL._17_INNER_JOIN;

import Util.ConnectionUtil;
import kotlin.Pair;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

/**
 * Sometimes we want query results from multiple tables. We can achieve this by doing a JOIN to include data from other
 * tables. We start with SELECT FROM tableA, and we can JOIN tableB, and JOIN tableC, and so on... Keep in mind this is
 * different from foreign key relations. Foreign keys enforce referential integrity and are part of the database schema.
 * Foreign key constraints would be part of DDL, while joins are part of queries, and thus the DQL sub-language.
 *
 * There are several types of joins. We will be looking at INNER JOIN here. INNER JOIN is when we query two or more
 * tables on some criteria, and only see results where there are matching rows in all tables.
 *
 * Example: SELECT * FROM tableA INNER JOIN tableB ON tableA.column1 = tableB.column3
 * Note: The text added to a simple select statement includes INNER, JOIN, and ON keywords. We join one table to another
 * based on some condition that matches rows from either table together. In the above example we are matching rows
 * from tableA which have the same value in column 1 as those in tableB column 3.
 *
 * Consider the following tables:
 *
 *         faculty table                           students table
 * | id |    teacher    |   class   |     | id |      student      |   class   |
 * ----------------------------------     --------------------------------------
 * |1   |'Mr. Tyson'    |'Physics'  |     |1   |'John Stewart'     |'Writing'  |
 * |2   |'Ms. Lovelace' |'Math'     |     |2   |'Stephen Colbert'  |'Science'  |
 * |3   |'Mr. McCarthy' |'Writing'  |     |3   |'Samantha Bee'     |'Math'     |
 * |4   |'Ms. Goodall'  |'Biology'  |     |4   |'Aasif Mandvi'     |'Writing'  |
 *                                        |5   |'Robert Riggle'    |'Science'  |
 *                                        |6   |'Jessica Williams' |'Art'      |
 *
 * We can query these tables with an INNER JOIN ON the class column in each table:
 *      SELECT faculty.teacher, students.id, students.student, students.class
 *      FROM faculty
 *      INNER JOIN students ON faculty.class = students.class
 *      WHERE faculty.id < 6;
 *
 * The above example would return a result set that includes teacher records 1, 2, and 3, as well as student
 * records 1, 2, 3, 4, and 5. Both teacher Ms. Goodall and student Jessica Williams would not be included in the
 * results. This is because there is no matching record in the opposite table for either of those records. (There is
 * no art teacher, and no students taking biology.)
 */
public class InnerJoinActivity {
    /**
     * Consider the following tables:
     *
     *              faculty                                  students
     * | id |    teacher    |   class   |     | id |      student      |   class   |
     * ----------------------------------     --------------------------------------
     * |1   |'Mr. Tyson'    |'Physics'  |     |1   |'John Stewart'     |'Writing'  |
     * |2   |'Ms. Lovelace' |'Math'     |     |2   |'Stephen Colbert'  |'Physics'  |
     * |3   |'Mr. McCarthy' |'Writing'  |     |3   |'Samantha Bee'     |'Math'     |
     * |4   |'Ms. Goodall'  |'Biology'  |     |4   |'Aasif Mandvi'     |'Writing'  |
     *                                        |5   |'Robert Riggle'    |'Physics'  |
     *                                        |6   |'Jessica Williams' |'Art'      |
     *
     *                       textbooks
     * | id |   class   |              textbook              |
     * -------------------------------------------------------
     * |1   |'Physics'  |'Motion 101'                        |
     * |2   |'Math'     |'What even is modulus anyway?'      |
     * |3   |'Biology'  |'Lions, Tigers, and Organs 5th ed'  |
     * |4   |'Writing'  |'The Story Circle Workbook'         |
     * |5   |'Art'      |'Teenage Mutant Ninja Turtles #10'  |
     */

    public Set<Pair<Integer, String>> innerJoin1() {
        /**
         * Problem 1: Write a query that will return the id, and name of each of Mr. McCarthy's students.
         * Note: There should not be a wild card (*) in your statement.
         * Hint: You will need to specify the column in your statement by writing table.column.
         */

        //Write your statement below:
        String sql = "CHANGE ME";
        //The following code will execute your statement on the database
        Set<Pair<Integer, String>> results = new HashSet<>();
        try {
            Connection connection = ConnectionUtil.getConnection();
            PreparedStatement pstmt = connection.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            while(rs.next()) {
                results.add(new Pair<Integer, String>(rs.getInt("id"), rs.getString("student")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return results;

    }
}
