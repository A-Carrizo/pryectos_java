//Practica de Programacion Orientada a Objetos

//Creamos el package e importamos todas las librerias para la utilizacion
//de java
package objetos;
import java.util.*;

//Creacion de la clase Personas
public class Personas {
    
    //Creacion de los atributos de PERSONAS
    String nombre,apellido;
    Integer edad,cedula;
    
    //Creacion del constructor vacio porque los valores seran ingresados de
    //por teclado
    public Personas(){
        
    }
    
    //Creacion de todos los metodos SETTERS AND GETTTERS
    
    //NOmbre
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    //Apellido
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    
    
    //Edad
    public Integer getEdad(){
        return edad;
    }
    public void setEdad(Integer edad){
        this.edad=edad;
    }
    
    //
    public Integer getCedula(){
        return cedula;
    }
    public void setCedula(Integer cedula){
        this.cedula=cedula;
    }
    
    public void mostrar(){
        System.out.println("--------------------------------");
        System.out.println("Nombre:"+getNombre());
        System.out.println("Apellido:"+getApellido());
        System.out.println("Edad:"+getEdad());
        System.out.println("Cedula:"+getCedula());
    }
    
    public void pedir(){
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        String xnombre=entrada.next();
        setNombre(xnombre);
        
        System.out.println("Ingrese apellido:");
        String xapellido=entrada.next();
        setApellido(xapellido);
        
        System.out.println("Ingrese Edad:");
        Integer xedad=entrada.nextInt();
        setEdad(xedad);
        
        System.out.println("Ingrese cedula");
        Integer xcedula=entrada.nextInt();
        setEdad(xcedula);
        
    }
    
    
    
    
}
