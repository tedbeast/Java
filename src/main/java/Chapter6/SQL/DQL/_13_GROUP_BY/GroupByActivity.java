package Chapter6.SQL.DQL._13_GROUP_BY;

import Util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/** NOTE: Before attempting this activity, you should have already completed the Order By
 * and Aggregate Functions activities.
 *
 * The GROUP BY clause allows you to group your results and can be used with the ORDER BY clause. Group By is
 * frequently used in conjunction with aggregate functions. However, you cannot group by the output of the function.
 * Recall that the output of an aggregate function is a single aggregate value.
 *
 * Example: You could query a table of employees with the AVG() aggregate function and GROUP BY manager to find the
 * average (mean) salary of employees under that manager (then order it from greatest average salary to least):
 *      SELECT manager, AVG(salary)
 *      FROM employees
 *      GROUP BY manager
 *      ORDER BY AVG(salary) DESC
 */
public class GroupByActivity {
    //TODO: This lab might be more advanced than pre-training
    /**
     * Consider the following "songs" table which contains several songs from various artists.
     *   | id |     artist     |        album        |         song         |
     *   --------------------------------------------------------------------
     *   |1   |'The Beatles'   |'Abbey Road'         |'Come Together'       |
     *   |2   |'The Beatles'   |'Let It Be'          |'Let It Be'           |
     *   |3   |'Led Zeppelin'  |'IV'                 |'Black Dog'           |
     *   |4   |'Led Zeppelin'  |'Physical Graffiti'  |'Kashmir'             |
     *   |5   |'Led Zeppelin'  |'IV'                 |'Going to California' |
     *   |6   |'The Eagles'    |'Hotel California'   |'Hotel California'    |
     */

    public Map<String, Integer> groupAndCountSongsByArtist() {
        /**
         * Problem 1: Use the GROUP BY clause with the COUNT() aggregate function to query the songs table for the
         * number of songs by each artist.
         * HINT: You should avoid using the wild card (*) in your statement. All projected columns must either be used
         * in the GROUP BY clause or an aggregate function.
         */

        //Write your statement below:
        String sql = "CHANGE ME";


        //The following code will execute your statement on the database
        Map<String, Integer> counts = new HashMap<>();
        try {
            Connection connection = ConnectionUtil.getConnection();
            PreparedStatement pstmt = connection.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            while(rs.next()) {
                counts.put(rs.getString("artist"), rs.getInt("COUNT(song)"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return counts;
    }

}
