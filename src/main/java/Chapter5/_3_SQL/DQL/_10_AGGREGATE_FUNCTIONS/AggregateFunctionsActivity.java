package Chapter5._3_SQL.DQL._10_AGGREGATE_FUNCTIONS;

import Util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Aggregate functions in SQL are functions which preform operations on a data set and produce a single output.
 * For instance, COUNT() is an aggregate function. Count will return the number of rows of data in the result set.
 * So if we query a table with 12 rows using a statement like this:
 *     SELECT COUNT(*) FROM table_name
 * We should get a result that simply has the integer output from COUNT(), which should be 12.
 *
 * Aggregate functions "aggregate" data, combining and changing it into some output based on the input. Regardless of
 * how large that input is, the output will always be a single value. If we repeated the above query but the table had
 * 10,000 rows, the result would still be a single value: 10,000.
 *
 * There are many aggregate functions built into SQL, some commonly used ones include:
 * - SUM() - outputs the sum of the values in a single column from the result set
 * - AVG() - outputs the average (mean) value of the values in a single column from the result set
 * - MIN() - outputs the least value among the values in a single column from the result set
 * - MAX() - similar to MIN but outputs the greatest value
 * - FIRST() - outputs the first value found in a column of the result set
 * - LAST() - outputs the last value found in a column of the result set
 *
 * Example: You might use the SUM() function to find the total of all employee salaries:
 *      SELECT SUM(salary) FROM employees;
 *
 * See also postgresql aggregate functions: https://www.postgresql.org/docs/9.5/functions-aggregate.html
 * and: https://www.w3schools.com/sql/sql_count_avg_sum.asp
 *
 */
public class AggregateFunctionsActivity {
/**
 * Consider the following "employees" table which contains several employees and their salaries.
 *   |  id  |   first_name   |   last_name   |  salary  |
 *   --------------------------------------------------
 *   |1     |'Steve'         |'Garcia'       |67400.00  |
 *   |2     |'Alexa'         |'Smith'        |42500.00  |
 *   |3     |'Steve'         |'Jones'        |99890.99  |
 *   |4     |'Brandon'       |'Smith'        |120000    |
 *   |5     |'Adam'          |'Jones'        |55050.50  |
 *
 */

    public double calculateAverageSalary() {
        /**
         * Problem 1: use the AVG() aggregate function to output the average (mean) salary found in the table.
         * Note: the output should not contain any other info but the salary.
         */

        //Write your statement below:
        String sql = "CHANGE ME";

        //The following code will execute your statement on the database
        double average = 0.0;
        try {
            Connection connection = ConnectionUtil.getConnection();
            PreparedStatement pstmt = connection.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            if(rs.next()) {
                average = rs.getDouble(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return average;
    }

    public int countTheSmiths() {
        /**
         * Problem 2: use the COUNT() aggregate function to output the number of employees with the last name "Smith".
         * Note: the output should not contain any other info but the count.
         * Hint: Recall the Filtering Queries activity.
         */

        //Write your statement below:
        String sql = "CHANGE ME";

        //The following code will execute your statement on the database
        int count = 0;
        try {
            Connection connection = ConnectionUtil.getConnection();
            PreparedStatement pstmt = connection.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            if(rs.next()) {
                count = rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return count;

    }
}
