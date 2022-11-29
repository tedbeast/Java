package Chapter3.MiniProject.GroceryList.main;

import Util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * A DAO is a class that mediates the transformation of data between the format of objects in Java to rows in a
 * database. The methods here are mostly filled out, you will just need to add a SQL statement.
 *
 * We may assume that the database has already created a table named 'groceries'.
 * It contains a single column, named 'grocery_name' of type varchar(255).
 */
public class GroceryDAO {


    /**
     * Select all of the rows of the Grocery table.
     * You only need to change the sql String, the rest of the method is already complete.
     * @return a List of all the groceries contained within the database.
     */
    public List<String> getAllGroceries(){
        Connection connection = ConnectionUtil.getConnection();
        List<String> groceries = new ArrayList<>();
        try {
            //Write SQL logic here
            String sql = "change me!";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                groceries.add(rs.getString("grocery_name"));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return groceries;
    }
    /**
     * Insert a new row into the Grocery table, with the sole column containing groceryName.
     * You only need to change the sql String, the rest of the method is already complete.
     * @param groceryName the name of the grocery passed in from the GroceryService.
     */
    public void addGrocery(String groceryName){
        Connection connection = ConnectionUtil.getConnection();
        try {
            //Write SQL logic here
            String sql = "change me!";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

}
