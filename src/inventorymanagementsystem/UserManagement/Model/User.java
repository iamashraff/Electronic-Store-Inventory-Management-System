package inventorymanagementsystem.UserManagement.Model;

public class User {
    
    int userID;
    String firstName;
    String lastName;
    String username;
    String isAdmin;
 
    private static User instance = new User();
    
    private User(){
    }//CONSTRUCTOR
    
    public static User getInstance() {
        if (instance == null) {
            instance = new User();
        }
        return instance;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(String isAdmin) {
        this.isAdmin = isAdmin;
    }


    
}//END CLASS
