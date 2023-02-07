package inventorymanagementsystem.UserManagement.Controller;
import inventorymanagementsystem.UserManagement.Model.DBConnection;
import inventorymanagementsystem.UserManagement.Model.UserManagementModel;
import java.sql.*;
import javax.swing.JOptionPane;

public class UserManagementController {
    
    public UserManagementController(){}//CONSTRUCTOR
    
    public void AddUser(String firstname, String lastname, 
            String isAdmin, String username, String password){
        
        if (isAdmin.equals("Admin")){
            isAdmin = "true";
        }else{
            isAdmin = "false";
        }//END IF
        
        DBConnection dbc = new DBConnection();
        String query = "INSERT INTO users (firstname,lastname,isAdmin,username,password) "
                + "VALUES ('" + firstname + "', '" + lastname + "', '" + isAdmin + "', '" + username + "', '" + password + "')" ;
        dbc.setQuery(query);
        System.out.println(query);
        
        try{
            Connection con = DriverManager.getConnection(dbc.getUrl(), dbc.getUser(), dbc.getPassword());
            Statement stm = con.createStatement();
            //ResultSet res = stm.executeQuery(dbc.getQuery());
             stm.executeUpdate(dbc.getQuery());
             System.out.println("User has been added.");
             JOptionPane.showMessageDialog(null, "User has been added !", "Success", JOptionPane.INFORMATION_MESSAGE);
            
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }//END TRY-CATCH
          
    }//END METHOD
    
    public void DeleteUser(String ID){
        
        DBConnection dbc = new DBConnection();
        String query = "DELETE FROM users WHERE id = '" + ID +"'";
        dbc.setQuery(query);
        try{
            Connection con = DriverManager.getConnection(dbc.getUrl(), dbc.getUser(), dbc.getPassword());
            Statement stm = con.createStatement();
            //ResultSet res = stm.executeQuery(dbc.getQuery());
             stm.executeUpdate(dbc.getQuery());
             System.out.println("User has been deleted.");
             JOptionPane.showMessageDialog(null, "User has been deleted !", "Success", JOptionPane.INFORMATION_MESSAGE);
            
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }//END TRY-CATCH
        
    
    }//END METHOD
    
    public void EditUser(String ID){
        UserManagementModel umd = UserManagementModel.getInstance();
        System.out.println(umd.getID() + " " + umd.getFirstname() + " " +
                umd.getLastname() + " " + umd.getIsAdmin() + " " + umd.getUsername() 
                + " " + umd.getPassword() + " " );
        
        DBConnection dbc = new DBConnection();
        String query = "UPDATE users SET firstname = '"+ umd.getFirstname() +"', lastname = '" + umd.getLastname() 
                +"', isAdmin = '" + umd.getIsAdmin() +"', username = '" + umd.getUsername() +"', password = '" + umd.getPassword() +"' " +
                "WHERE id = '" + ID +"'";
        dbc.setQuery(query);
        
        try{
            Connection con = DriverManager.getConnection(dbc.getUrl(), dbc.getUser(), dbc.getPassword());
            Statement stm = con.createStatement();
            stm.executeUpdate(dbc.getQuery());
            System.out.println("User has been updated.");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }//END TRY-CATCH
        
    
    }
    
    
}//END CLASS
