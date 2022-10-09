
package Ejercicio_sobrecarga;

public class Profesor {
    String nombre,apellido;
    Integer edad;
    boolean casado;
    public Profesor(String nombre,String apellido,Integer edad,boolean casado){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.casado=casado;
    }
    public Profesor(){
        
    }
    
    public void mostrar(){
        System.out.println("NOmbre:"+nombre);
        System.out.println("Apellido:"+apellido);
        System.out.println("Edad:"+edad);
        System.out.println("Casado?:"+casado);
        System.out.println("-------------------------------------------------------");
    }
    
}
