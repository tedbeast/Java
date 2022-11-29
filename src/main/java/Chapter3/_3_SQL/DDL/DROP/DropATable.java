package Chapter3._3_SQL.DDL.DROP;

import Util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DropATable {


    /**
     * In the last activity we learned how to create tables in SQL. In this activity we are going to learn how to drop a table from the database schema.
     *
     * Let's drop the table we just created from the previous activity.
     *
     * You can read about the syntax here: https://www.w3schools.com/sql/sql_drop_table.asp
     * NOTE: Dropping a table is a part of the DDL sublanguage
     *
     *
     * Activity: Drop the table "songs"
     * */
    public void dropTable(){
        try {
            //Write SQL logic here
            String sql = "CHANGE ME";

            Connection connection = ConnectionUtil.getConnection();

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
