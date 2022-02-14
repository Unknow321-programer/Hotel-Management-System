import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class dbConnection {
    Connection con;
    dbConnection() {
        con=null;
    }
    public Connection getDbconnection() throws SQLException {
        try {
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/hotel_management_system", "postgres", "pass123");
            return con;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            JOptionPane.showMessageDialog(null, "Not Connectio Properly ", "Not Connecting", JOptionPane.ERROR_MESSAGE);
            con.close();
            return null;
        }
    }
}
