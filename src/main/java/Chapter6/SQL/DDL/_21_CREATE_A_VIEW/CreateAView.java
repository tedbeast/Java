package Chapter6.SQL.DDL._21_CREATE_A_VIEW;


import Util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * A VIEW in SQL is a virtual table that was created based on a SQL statement that was predefined.
 *
 * For example, lets say we had the following table:
 *      users table:
 *      |   id  |     firstname        |        lastname        |   age   |
 *      -------------------------------------------------------------------
 *      |1      |'Steve'               |'Garcia'                |23
 *      |2      |'Alexa'               |'Smith'                 |40
 *      |3      |'Steve'               |'Jones'                 |29
 *      |4      |'Brandon'             |'Smith'                 |50
 *      |5      |'Adam'                |'Jones'                 |61
 *
 * If we wanted to retrieve all the records with the firstname 'Steve', we can do that with the following statement:
 * SELECT * FROM users WHERE firstname = 'Steve';
 *
 * This statement would give us the following virtual table:
 *      virtual table:
 *      |   id  |     firstname        |        lastname        |   age   |
 *      -------------------------------------------------------------------
 *      |1      |'Steve'               |'Garcia'                |23
 *      |3      |'Steve'               |'Jones'                 |29
 *
 *
 * What we can do is put this virtual table in a view so we can query data based on this virtual table.
 *
 * The syntax for creating a view is as follows:
 * CREATE VIEW view_name AS sql_statement;
 *
 *
 * So the syntax for creating the table above would be:
 * CREATE VIEW stevesview AS SELECT * FROM users WHERE firstname = 'Steve';
 *
 *
 * This is beneficial because we can now execute SQL queries on this view instead of the entire table.
 * For example if I wanted to get the average ages of all the steves, I can do that with this new view and the aggregate function SUM() like so:
 * SELECT sum(age) from stevesview;
 *
 */
public class CreateAView {


    /**
     * problem: Create a view called "firstname_lastname" that has users table (from above) firstname and lastname only. This table should NOT have the id and age.
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
