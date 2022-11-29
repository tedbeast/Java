package Chapter5.MiniProject.Mini_Project_5_Library.main;

import Chapter5.MiniProject.Mini_Project_5_Library.main.Controller.LibraryController;
import Util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 * There is no need to modify anything in this class.
 * The main method will start a new Javalin API on the console at localhost:8080.
 * Take a look at the LibraryController class for API documentation as well as instructions for how to
 * access the API endpoints.
 */
public class Application {
    public static void main(String[] args) {
        databaseSetup();
        LibraryController libraryController = new LibraryController();
        libraryController.startAPI();
    }
    /**
     * For the purpose of this short exercise, this method will destroy and set up new book and author tables.
     * This is not a normal way to set up your tables, in real projects you should set up your database
     * schema in a SQL editor such as DBeaver or DataGrip.
     */
    public static void databaseSetup(){
        try {
            Connection conn = ConnectionUtil.getConnection();
            PreparedStatement ps1 = conn.prepareStatement("drop table if exists book");
            ps1.executeUpdate();
            PreparedStatement ps2 = conn.prepareStatement("drop table if exists author");
            ps2.executeUpdate();
            PreparedStatement ps3 = conn.prepareStatement("create table author(" +
                    "id int primary key, " +
                    "name varchar(255)); ");
            ps3.executeUpdate();
            PreparedStatement ps4 = conn.prepareStatement("create table book(" +
                    "isbn int primary key, " +
                    "author_id int, "+
                    "title varchar(255), " +
                    "copies_available varchar(255), " +
                    "foreign key (author_id) references author(id));");
            ps4.executeUpdate();
            PreparedStatement ps5 = conn.prepareStatement(
                    "insert into author (id, name) values " +
                            "(0, 'jorge luis borges')," +
                            "(1, 'italo calvino')," +
                            "(2, 'thomas pynchon')," +
                            "(3, 'marshall mcluhan')," +
                            "(4, 'immanuel kant')");
            ps5.executeUpdate();
            PreparedStatement ps6 = conn.prepareStatement(
                    "insert into book (isbn, author_id, title, copies_available) values " +
                            "(100, 0, 'ficciones', 2)," +
                            "(101, 0, 'book of sand', 0)," +
                            "(102, 1, 'mr palomar', 1)," +
                            "(103, 1, 'invisible cities', 3)," +
                            "(104, 2, 'crying of lot 49', 0)," +
                            "(105, 2, 'mason and dixon', 0)," +
                            "(106, 3, 'understanding media', 1)," +
                            "(107, 4, 'critique of pure reason', 7);");
            ps6.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
