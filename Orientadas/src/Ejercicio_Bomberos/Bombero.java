
package Ejercicio_Bomberos;

public class Bombero {
    String nombre,apellido;
    int edad;
    boolean casado,especialista;
    
    public Bombero(String nombre,String apellido,int edad,boolean casado){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.casado=casado;
    }
    
    public void mostrar(){
        System.out.println("Nombre:"+nombre);
        System.out.println("Apellido:"+apellido);
        System.out.println("Edad:"+edad);
        System.out.println("Casado:"+casado);
        
    }
    
    
}
