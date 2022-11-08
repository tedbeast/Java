package Chapter3.MiniProject.Dictionary.main;

import Util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Application {
    public static void main(String[] args) {
        databaseSetup();
        DictionaryAPI api = new DictionaryAPI();
        api.runAPI();
    }

    public static void databaseSetup(){
        try {
            Connection conn = ConnectionUtil.getConnection();
            PreparedStatement ps1 = conn.prepareStatement("drop table if exists dictionary_entry");
            ps1.executeUpdate();
            PreparedStatement ps2 = conn.prepareStatement("create table dictionary_entry(word varchar(255) primary key , definition varchar(255))");
            ps2.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
