package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {

    private String bd = "leng_prog2";
    private String url = "jdbc:postgresql://localhost:5432/" + bd;
    private String user = "postgres";
    private String pass = "Aldocarrizo";
    private String driver = "org.postgresql.Driver";

    public Connection conectar() {
        Connection link = null;
        try {
            Class.forName(driver);
            link = DriverManager.getConnection(url, user, pass);
            return link;
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return link;
    }

}
