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
public class Alumno extends Persona {
    String matricula,carrera;

    public Alumno(String nombre, String apellido, int edad,String matricula, String carrera) {
        super(nombre, apellido, edad);
        this.matricula = matricula;
        this.carrera = carrera;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    public void mostrarAlumno(){
        System.out.println("Nombre:"+getNombre());
        System.out.println("Apellido:"+getApellido());
        System.out.println("Edad:"+getEdad());
        System.out.println("Matricula:"+getMatricula());
        System.out.println("Carrera:"+getCarrera());
        System.out.println("-------------------------------------");
    }
    
    
    
    
}
