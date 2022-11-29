package Chapter4.MiniProject.Mini_Project_4_Flight_Tracker.main;

import Chapter4.MiniProject.Mini_Project_4_Flight_Tracker.main.Controller.FlightController;
import Util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * There is no need to modify anything in this class.
 * The main method will start a new Javalin API on the console at localhost:8080.
 * Take a look at the FlightController class for API documentation as well as instructions for how to
 * access the API endpoints.
 */
public class Application {
    public static void main(String[] args) {
        databaseSetup();
        FlightController flightController = new FlightController();
        flightController.startAPI();
    }
    /**
     * For the purpose of this short exercise, this method will destroy and set up a new flight table.
     * This is not a normal way to set up your tables, in real projects you should set up your database
     * schema in a SQL editor such as DBeaver or DataGrip.
     */
    public static void databaseSetup(){
        try {
            Connection conn = ConnectionUtil.getConnection();
            PreparedStatement ps1 = conn.prepareStatement("drop table if exists flight");
            ps1.executeUpdate();
            PreparedStatement ps2 = conn.prepareStatement("create table flight(" +
                    "flight_id int primary key, " +
                    "departure_city varchar(255), " +
                    "arrival_city varchar(255));");
            ps2.executeUpdate();
            PreparedStatement ps3 = conn.prepareStatement("insert into flight " +
                    "(flight_id, departure_city, arrival_city) values " +
                    "(9009, 'tampa', 'dallas')," +
                    "(9010, 'tampa', 'reston')," +
                    "(9011, 'reston', 'morgantown')," +
                    "(9012, 'morgantown', 'dallas')," +
                    "(9013, 'tampa', 'dallas')," +
                    "(9014, 'dallas', 'tampa');");
            ps3.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
