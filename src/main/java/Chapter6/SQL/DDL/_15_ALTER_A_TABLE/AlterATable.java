package Chapter6.SQL.DDL._15_ALTER_A_TABLE;


import Util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Let's say we created the following table:
 *
 * users table:
 * |    id    |     firstname     |
 * --------------------------------
 * |1         |'Kevin'            |
 * |2         |'Brian'            |
 * |3         |'Charles'          |
 *
 * The users table when it was created, forgot to add the 'lastname' column.
 *
 * We could go about solving this in 2 different ways:
 * - We could remove the table completely and create the table again with the correct number of columns
 * - We can use the ALTER keyword to add a new column to the existing table. (This is what we will be looking at for this lab)
 *
 * The ALTER keyword allows us to add / remove columns and constraints on an existing table.
 *
 * The syntax for the ALTER keyword is different depending on what we want to achieve:
 *      - Adding a column:
 *          - ALTER TABLE table_name ADD column_name data_type;
 *      - Removing a column:
 *          - ALTER TABLE table_name DROP column_name;
 *
 */
public class AlterATable {

    /**
     * Background: We will utilize the table below for the following problem:
     *   users table:
     *   |    id    |     firstname     |
     *   --------------------------------
     *   |1         |'Kevin'            |
     *   |2         |'Brian'            |
     *   |3         |'Charles'          |
     *
     *  problem1: Use the ALTER keyword to add a "lastname" column to the "users" table.
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

    /**
     * Background: We will utilize the table below for the following problem:
     *   users table:
     *   |    id    |     firstname     |
     *   --------------------------------
     *   |1         |'Kevin'            |
     *   |2         |'Brian'            |
     *   |3         |'Charles'          |
     *
     *  problem1: Use the ALTER keyword to remove the "firstname" column from the "users" table.
     */
    public void problem2(){
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
