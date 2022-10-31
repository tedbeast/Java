package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * The ConnectionUtil class will be utilized to create an active connection to our database. This class utilizes the singleton design pattern.
 * We will be utilizing an in-memory called h2database for the sql demos.
 */
public class ConnectionUtil {
    
    //url will represent our connection string. Since this is an in-memory db, we will represent a file location to store the data
    private static String url = "jdbc:h2:./h2/db";
    private static String username = "sa";
    private static String password = "sa";

    private static Connection connection = null;

    /**
     * @return active connection to the database
     */
    public static Connection getConnection(){
        if(connection == null){
            try {
                connection = DriverManager.getConnection(url, username, password);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return connection;
    }

}
