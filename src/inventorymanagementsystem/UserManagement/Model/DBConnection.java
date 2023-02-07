package inventorymanagementsystem.UserManagement.Model;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
      String query;
      String url = "jdbc:mysql://localhost:3306/inventory?autoReconnect=true&useSSL=false";
      String user = "root";
      String password = "";

    private static DBConnection instance = new DBConnection();
    
    public DBConnection(){
    }//CONSTRUCTOR
    
    public static DBConnection getInstance() {
        if (instance == null) {
            instance = new DBConnection();
        }
        return instance;
    }
    
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }
    
    public String getUrl() {
        return url;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
}
