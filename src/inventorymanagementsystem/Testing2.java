
package inventorymanagementsystem;
import inventorymanagementsystem.UserManagement.Model.DBConnection;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Testing2 {
    public static void main(String[] args) {
        DBConnection dbc = new DBConnection();
        dbc.setQuery("SELECT * FROM users");
        
        try{
            Connection con = DriverManager.getConnection(dbc.getUrl(), dbc.getUser(), dbc.getPassword());
            Statement stm = con.createStatement();
            ResultSet res = stm.executeQuery(dbc.getQuery());
            String columns[] = { "ID", "Name"};
            String data[][] = new String[8][2];

            int i = 0;
            while (res.next()) {
              int id = res.getInt("ID");
              String nom = res.getString("firstname");

              data[i][0] = id + "";
                System.out.println(data[i][0]);
              data[i][1] = nom;

              i++;
            }

            DefaultTableModel model = new DefaultTableModel(data, columns);
            JTable table = new JTable(model);
            table.setShowGrid(true);
            table.setShowVerticalLines(true);
            JScrollPane pane = new JScrollPane(table);
            JFrame f = new JFrame("Populate JTable from Database");
            JPanel panel = new JPanel();
            panel.add(pane);
            f.add(panel);
            f.setSize(500, 250);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setVisible(true);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
