package Chapter4._5_SQL.DQL.SELECT_WHERE;


import Util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * In our previous DQL lab, we learned to query all records from a table utilizing the "SELECT" keyword.
 * In some situations it is beneficial to filter what records are given to us from a table.
 *
 * For example lets look at the "users" table below:
 *        |   id  |     firstname        |        lastname        |
 *        ----------------------------------------------------------
 *        |1      |'Steve'               |'Garcia'                |
 *        |2      |'Alexa'               |'Smith'                 |
 *        |3      |'Steve'               |'Jones'                 |
 *        |4      |'Brandon'             |'Smith'                 |
 *        |5      |'Adam'                |'Jones'                 |
 *
 * Let's say we wanted to query all the records from the table that have the first name "Steve".
 *
 * The statement that will be utilized is as follows:
 * SELECT * FROM users WHERE firstname = 'Steve';
 *
 * In the above statement, the "WHERE" keyword allows us to filter the records based on the condition defined after the keyword.
 * The condition that we specified is that the firstname column must have the value "Steve".
 *
 * This statement would have returned the following result set:
 *
 *        |   id  |     firstname        |        lastname        |
 *        ----------------------------------------------------------
 *        |1      |'Steve'               |'Garcia'                |
 *        |3      |'Steve'               |'Jones'                 |
 *
 *  Additional resource on the "WHERE" keyword if needed: https://www.w3schools.com/sql/sql_where.asp
 *
 */
public class FilteringQueries {

    /**
     * Activity: Given the above users table, query all the records from the table users that have the lastname "Smith"
     */
    public List<User> filter(){
        //Write SQL statement here
        String sql = "CHANGE ME";


        List<User> users = new ArrayList<>();
        try {
            Connection connection = ConnectionUtil.getConnection();

            PreparedStatement ps = connection.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                users.add(new User(rs.getInt(1), rs.getString(2), rs.getString(3)));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }
}
