
package controladores;

import datos.AnimalesDAO;
import datos.IDAO;
import java.util.ArrayList;

public class AnimalesControl implements IDAO {

    @Override
    public ArrayList<Object> listar() {
        return new AnimalesDAO().listar();
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
