package Chapter5._3_SQL.DQL._12_ORDER_BY;

import Util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 * When we query a database for information, that information is not necessarily ordered. Physically,
 * that information is serialized in some order, but it is not necessarily the order you might expect, and the
 * order is subject to change. When querying for information we usually want to indicate the order for our results.
 * This is done with the ORDER BY clause.
 *
 * Example: ORDER BY column1 [, column2, column3, etc...] [ASC|DESC]
 * Note: the portions in [brackets] are optional. You only need 1 column to order by, and if you do not specify the
 * ordering is ASC (ascending order) by default.
 *
 * We can order by a single column, or multiple columns. When using multiple columns, the extra columns act as
 * tie-breakers.
 *
 * We can order by columns in ascending or descending order. By default, ORDER BY is in ascending order. Ascending
 * order places lesser values before greater values. Descending order is the opposite, greatest values first.
 *
 * For example, one might add the ORDER BY clause after the WHERE clause of a query to order employees from highest to
 * lowest salary:
 *
 *      SELECT * FROM employee_table WHERE current = true ORDER BY salary DESC
 */
public class OrderResultSetActivity {
    /**
     * Consider the following "characters" table which lists several characters from Frank Herbert's Dune.
     *
     *      | id |  first_name  |  last_name  |
     *      -----------------------------------
     *      |1   |'Leto'        |'Atreides'   |
     *      |2   |'Vladimir'    |'Harkonnen'  |
     *      |3   |'Jessica'     |'Atreides'   |
     *      |4   |'Paul'        |'Atreides'   |
     *      |5   |'Feyd-Rautha' |'Harkonnen'  |
     *

     */

    public List<Character> orderResultSetByName() {
        /**
         * Problem 1: Write a statement below to query the database for all characters. Make sure the results are in
         * alphabetical order by last name, and first name as a tie-breaker.
         */
        //Write your statement below:
        String sql = "CHANGE ME";


        //This list object will hold the results
        List<Character> resultList = new LinkedList<>();

        //The following code will execute your statement on the database
        try {
            Connection connection = ConnectionUtil.getConnection();
            PreparedStatement pstmt = connection.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            while(rs.next()) {
                resultList.add(new Character(rs.getInt(1), rs.getString(2), rs.getString(3)));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return resultList;
    }
}

