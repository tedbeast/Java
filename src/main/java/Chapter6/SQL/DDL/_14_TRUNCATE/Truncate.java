package Chapter6.SQL.DDL._14_TRUNCATE;


import Util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * The truncate keyword allows us to remove all records from a table but doesn't delete the table itself.
 *
 * The syntax for truncating a table:
 * TRUNCATE TABLE table_name;
 */
public class Truncate {

    /**
     *       users table
     *       |   id  |     firstname        |        lastname        |
     *       ----------------------------------------------------------
     *       |1      |'Steve'               |'Garcia'                |
     *       |2      |'Alexa'               |'Smith'                 |
     *       |3      |'Steve'               |'Jones'                 |
     *       |4      |'Brandon'             |'Smith'                 |
     *       |5      |'Adam'                |'Jones'                 |
     *
     *       problem1: remove all the records from the table "users"
     */
    public void problem1(){
        //Write SQL statement here
        String sql = "CHANGE ME";

        try {
            Connection connection = ConnectionUtil.getConnection();

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
