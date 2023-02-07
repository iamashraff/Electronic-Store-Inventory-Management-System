package inventorymanagementsystem.ProductManagement.Controller;

import inventorymanagementsystem.ProductManagement.Model.Computer;
import inventorymanagementsystem.ProductManagement.Model.Phone;
import inventorymanagementsystem.UserManagement.Model.DBConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ProductController {
    
    
    public ProductController() {
        
    }//CONSTRUCTOR
    
    
    public void AddProduct(String type, String brand, String model, 
            int storage, int ram, double price, int quantity, String processor){
        DBConnection dbc = new DBConnection();
      String query = "";
        if(type.equals("Laptop") || type.equals("Desktop")){
            
            query = "INSERT INTO product ( brand, model, type, storage, ram, price, quantity, processor) " +
            "VALUES ('"+brand+"', '"+model+"', '"+type+"', '"+storage+"', '"+ram+"', '"+price+"', '"+quantity+"', '"+processor+"')";
        }else{
            query = "INSERT INTO product ( brand, model, type, storage, ram, price, quantity, processor) " +
            "VALUES ('"+brand+"', '"+model+"', '"+type+"', '"+storage+"', '"+ram+"', '"+price+"', '"+quantity+"', NULL)";
        }
        dbc.setQuery(query);
        
        System.out.println(query);
        try{
            Connection con = DriverManager.getConnection(dbc.getUrl(), dbc.getUser(), dbc.getPassword());
            Statement stm = con.createStatement();
            
             stm.executeUpdate(dbc.getQuery());
             System.out.println("Product has been added.");
             JOptionPane.showMessageDialog(null, "Product has been added !", "Success", JOptionPane.INFORMATION_MESSAGE);
            
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }//END TRY-CATCH  
            
    }
    
    //public void EditProduct(String type, String brand, String model, 
            //int storage, int ram, double price, int quantity, String processor){
        
        
        
    //}
    
    public void EditProduct(Computer comp, String userId){
        DBConnection dbc = new DBConnection();
        String query = "UPDATE product " +
        "SET  brand = '"+ comp.brand +"', model = '"+ comp.model +"', type = '"+ comp.type +"', storage = '"+ comp.storage +"', ram = '"+ comp.ram +"', price = '"+ comp.price +"', quantity = '"+ comp.quantity +"', processor = '"+ comp.processor +"'" +
        " WHERE id = " + userId;
        dbc.setQuery(query);
        
        try{
            Connection con = DriverManager.getConnection(dbc.getUrl(), dbc.getUser(), dbc.getPassword());
            Statement stm = con.createStatement();
            
             stm.executeUpdate(dbc.getQuery());
             System.out.println("Product has been edited.");
             JOptionPane.showMessageDialog(null, "Product has been edited !", "Success", JOptionPane.INFORMATION_MESSAGE);
            
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }//END TRY-CATCH    
    }
    
    public void EditProduct(Phone phone, String userId){
        DBConnection dbc = new DBConnection();
        String query = "UPDATE product " +
        "SET  brand = '"+ phone.brand +"', model = '"+ phone.model +"', type = '"+ phone.type +"', storage = '"+ phone.storage +"', ram = '"+ phone.ram +"', price = '"+ phone.price +"', quantity = '"+ phone.quantity +"' " +
        " WHERE id = " + userId;
        dbc.setQuery(query);
        
        try{
            Connection con = DriverManager.getConnection(dbc.getUrl(), dbc.getUser(), dbc.getPassword());
            Statement stm = con.createStatement();
            
             stm.executeUpdate(dbc.getQuery());
             System.out.println("Product has been edited.");
             JOptionPane.showMessageDialog(null, "Product has been edited !", "Success", JOptionPane.INFORMATION_MESSAGE);
            
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }//END TRY-CATCH 
        
    }
    
    public void DeleteProduct(String userId){
        DBConnection dbc = new DBConnection();
        String query = "DELETE FROM product WHERE id = '" + userId +"'";
        dbc.setQuery(query);
        try{
            Connection con = DriverManager.getConnection(dbc.getUrl(), dbc.getUser(), dbc.getPassword());
            Statement stm = con.createStatement();
            
             stm.executeUpdate(dbc.getQuery());
             System.out.println("Product has been deleted.");
             JOptionPane.showMessageDialog(null, "Product has been deleted !", "Success", JOptionPane.INFORMATION_MESSAGE);
            
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }//END TRY-CATCH 
    }
    
}
