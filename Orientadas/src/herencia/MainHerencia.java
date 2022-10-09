/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author aldoc
 */
public class MainHerencia {
    public static void main(String[] args){
        Alumno alumno1= new Alumno("aldo","carrizo",19,"ANL2022","Analisis Sistemas");
        Maestro maestro1= new Maestro("fer","baez",20,"Lenguajes 1","Maestro");
        alumno1.mostrarAlumno();
        maestro1.mostrarProfe();
    }
    
}
