package Chapter4._5_SQL.DQL._8_SELECTING_SPECIFIC_COLUMNS;
import Util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * In the DQL sublanguage, we have learned how to return all records from a table as well as filter the amount of records we get back utilizing the WHERE keyword.
 *
 * In this lab we are going to learn how to filter the amount of columns that we want returned.
 *
 * We will be utilizing the following table:
 *      users table:
 *      |   id  |     firstname        |        lastname        |
 *      ----------------------------------------------------------
 *      |1      |'Steve'               |'Garcia'                |
 *      |2      |'Alexa'               |'Smith'                 |
 *      |3      |'Steve'               |'Jones'                 |
 *      |4      |'Brandon'             |'Smith'                 |
 *      |5      |'Adam'                |'Jones'                 |
 *
 * Lets take a look at the syntax to return the entire table again:
 * SELECT * FROM users;
 *
 * In the statement above, the * is the wildcard to retrieve all of the columns in this specific table.
 * However we can specify the columns that we want to display by the following syntax:
 * SELECT col_1, col2, ... FROM users;
 *
 */
public class FilterColumns {

    /**
     * problem 1: Write the SQL statement to return all of the records from the users table above but only the 'firstname' column.
     */
    public List<User> problem1(){
        //Write SQL statement here
        String sql = "CHANGE ME";

        List<User> users = new ArrayList<>();
        try {
            Connection connection = ConnectionUtil.getConnection();

            PreparedStatement ps = connection.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                users.add(new User(0, rs.getString(1), null));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }
}
