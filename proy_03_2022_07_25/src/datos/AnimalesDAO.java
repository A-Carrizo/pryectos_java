
package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelos.Animales;



public class AnimalesDAO implements IDAO {
    
    Connection con;
    ArrayList<Object> lista = new ArrayList<>();
    Animales animalesObj;
    PreparedStatement ps;

    public AnimalesDAO() {
        con = new Conexion().conectar();
    }

    @Override
    public ArrayList<Object> listar() {
        try {
            String ssql = "SELECT * FROM animales";
            ps = con.prepareStatement(ssql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                animalesObj = new Animales( 
                        rs.getInt("id"), 
                        rs.getString("nombre"), 
                        rs.getString("raza"), 
                        rs.getString("dueno"), 
                        rs.getInt("edad")
                );
                lista.add(animalesObj);
            }
            return lista;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage() );
        }
        return null;
    }

    @Override
    public void insertar() {
        
    }

    @Override
    public void modificar() {
        
    }

    @Override
    public void eliminar() {
        
    }
    
    

    
}
