package Chapter4._5_SQL.DML.DELETE;

import Util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * The "DELETE" keyword is a part of the DML sublanguage and is utilized to remove records based on a condition.
 *
 * The syntax for deleting records from a table is as follows:
 *
 * DELETE FROM table_name WHERE condition;
 *
 * NOTE: Whenever you execute a DELETE statement, have a WHERE condition that identifies exactly what records you would like to delete.
 * Leaving this out will remove ALL records from the table.
 *
 * Additional resource if needed: https://www.w3schools.com/sql/sql_delete.asp
 */

public class DeleteRecords {

    /**
     * Given the following table:
     *        users table:
     *        |   id  |     firstname        |        lastname        |
     *        ----------------------------------------------------------
     *        |1      |'Steve'               |'Garcia'                |
     *        |2      |'Alexa'               |'Smith'                 |
     *        |3      |'Steve'               |'Jones'                 |
     *        |4      |'Brandon'             |'Smith'                 |
     *        |5      |'Adam'                |'Jones'                 |
     *
     * Assignment: Delete "Steve Jones" from the users table.
     */
    public void delete(){
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
