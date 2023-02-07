package inventorymanagementsystem.UserManagement.Model;

public class UserManagementModel {
    
    String ID;
    String firstname;
    String lastname;
    String isAdmin;
    String username;
    String password;
    
    private static UserManagementModel instance = new UserManagementModel();
    
    private UserManagementModel() {
        
    }//CONSTRUCTOR
    
        public static UserManagementModel getInstance() {
        if (instance == null) {
            instance = new UserManagementModel();
        }
        return instance;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(String isAdmin) {
        this.isAdmin = isAdmin;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}//END CLASS
