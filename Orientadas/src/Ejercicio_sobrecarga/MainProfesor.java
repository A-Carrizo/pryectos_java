/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_sobrecarga;

/**
 *
 * @author aldoc
 */
public class MainProfesor {
    public static void main(String args[]){
        Profesor objeto1= new Profesor("aldo","carrizo",19,true);
        
        Profesor objeto2= new Profesor();
        objeto2.nombre="fer";
        objeto2.apellido="vaez";
        objeto2.edad=19;
        objeto2.casado=false;
        
        
        objeto1.mostrar();
        objeto2.mostrar();
    }
    
}
