package Chapter5._3_SQL.DQL._11_SELECT_WHERE_AND_OR;

import Util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

/**
 * Any time we are using WHERE to filter our results set, we can use logical operators, for instance: AND, OR.
 *
 * |   logical AND     |    logical OR    |
 * ----------------------------------------
 * | T AND T = TRUE    |  T OR T = TRUE   |
 * | T AND F = FALSE   |  T OR F = TRUE   |
 * | F AND T = FALSE   |  F OR T = TRUE   |
 * | F AND F = FALSE   |  F OR F = FALSE  |
 *
 *
 * Consider the example:
 *      SELECT * FROM employees WHERE last_name = 'Jones' OR first_name = 'Steve';
 *
 *   |  id  |   first_name   |   last_name   |
 *   -----------------------------------------
 *   |1     |'Steve'         |'Garcia'       |
 *   |2     |'Alexa'         |'Smith'        |
 *   |3     |'Steve'         |'Jones'        |
 *   |4     |'Brandon'       |'Smith'        |
 *   |5     |'Adam'          |'Jones'        |
 *
 * This would include employees Steve Jones, Adam Jones, and Steve Garcia. If we changed the OR to an AND
 * the results set would only include Steve Jones.
 *
 * Here are a few examples of using some logical operators in a WHERE clause:
 *      SELECT * FROM table WHERE condition1 = value1 AND condition2 = value2;
 *      SELECT * FROM table WHERE something > 500 OR something < 100;
 *      SELECT * FROM table WHERE value NOT IN ('value1', 'value2');
 *
 * There are other logical operators as well, but we will focus on AND and OR for now. These operators are not just for
 * WHERE clauses, and can be used in many places in a SQL statement.
 *
 * See also: https://www.w3schools.com/sql/sql_operators.asp
 */



public class FilteringLogicActivity {
    /**
     * Consider the following "employees" table which contains several employees and their salaries.
     *   |  id  |   first_name   |   last_name   |  salary  |
     *   --------------------------------------------------
     *   |1     |'Steve'         |'Garcia'       |67400.00  |
     *   |2     |'Alexa'         |'Smith'        |42500.00  |
     *   |3     |'Steve'         |'Jones'        |99890.99  |
     *   |4     |'Brandon'       |'Smith'        |120000    |
     *   |5     |'Adam'          |'Jones'        |55050.50  |
     */

    public Set<Employee> findEmployeesAnd() {
        /**
         * Problem 1: Write a statement that will query the above table for all employees named 'Steve' who earn
         * more than $75,000.
         */

        //Write your statement below:
        String sql = "CHANGE ME";


        //The following code will execute your statement on the database
        Set<Employee> resultsSet = new HashSet<>();
        try {
            Connection connection = ConnectionUtil.getConnection();
            PreparedStatement pstmt = connection.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            while(rs.next()) {
                resultsSet.add(new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return resultsSet;
    }

    public Set<Employee> findEmployeesOr() {
        /**
         * Problem 2: Write a statement that will query the above table for all employees who earn more than $100,000 or less
         * than $50,000
         */

        //Write your statement below:
        String sql = "CHANGE ME";


        //The following code will execute your statement on the database
        Set<Employee> resultsSet = new HashSet<>();
        try {
            Connection connection = ConnectionUtil.getConnection();
            PreparedStatement pstmt = connection.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            while(rs.next()) {
                resultsSet.add(new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return resultsSet;
    }


}
