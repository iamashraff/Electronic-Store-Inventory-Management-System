package inventorymanagementsystem.UserManagement.Controller;
import inventorymanagementsystem.ProductManagement.View.MainMenuFrame;
import inventorymanagementsystem.UserManagement.Model.DBConnection;
import inventorymanagementsystem.UserManagement.Model.User;
import inventorymanagementsystem.UserManagement.View.UserManagement;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.HashSet;
import java.util.Set;

public class UserController {
    
    
    public UserController(){
 
    }//CONSTRUCTOR
    
    public void validateLogin(String username, String password){
    
      if(username.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Username required !", "Error", JOptionPane.ERROR_MESSAGE);
        } else if(password.isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "Password required !", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(!username.isEmpty() && !password.isEmpty()){
            DBConnection dbc = new DBConnection();
            dbc.setQuery("SELECT * FROM users WHERE username = '" + username + "' AND password = '" + password +"'");
            try{
                Connection con = DriverManager.getConnection(dbc.getUrl(), dbc.getUser(), dbc.getPassword());
                Statement stm = con.createStatement();
                ResultSet res = stm.executeQuery(dbc.getQuery());
                
                String roles = "";
                int rowcount = 0;
                if (res.last()) {
                  rowcount = res.getRow();
                  res.beforeFirst();
                }//END IF
                
                if (rowcount > 0){
                    User user = User.getInstance();
                    
                    int i = 0;
                    while (res.next()) {
                        
                      user.setUserID(res.getInt("ID"));
                      user.setFirstName(res.getString("firstname"));
                      user.setLastName(res.getString("lastname"));
                      user.setIsAdmin(res.getString("isAdmin"));
                      user.setUsername(res.getString("username"));
                      
                      roles = res.getString("isAdmin");

                      i++;
                    }
                    
                    
                    
                    
                    //MainMenuFrame mmf = new MainMenuFrame();
                    //mmf.setVisible(true);
                    //mmf.setLocationRelativeTo(null);
                    
                    if(roles.equals("false")){
                        MainMenuFrame mmf = new MainMenuFrame();
                        mmf.setVisible(true);
                        mmf.setLocationRelativeTo(null);  
                    }else if(roles.equals("true")){
                        UserManagement um = new UserManagement();
                        um.setVisible(true);
                        um.setLocationRelativeTo(null); 
                    }
                }else {
                    
                    JOptionPane.showMessageDialog(null, "Username or password is not found !", "Error", JOptionPane.ERROR_MESSAGE);
                }//END IF

            }catch(SQLException e){
                e.printStackTrace();
            }//END TRY-CATCH
        }
        else{
            JOptionPane.showMessageDialog(null, "Username or password not found !", "Error", JOptionPane.ERROR_MESSAGE);
        }//END IF
      
    }
    
    
}//END CLASS
