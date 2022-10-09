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
public class Maestro extends Persona {
    String materia, profesion;
    public Maestro(String nombre, String apellido, int edad,String materia,String profesion) {
        super(nombre, apellido, edad);
        this.materia=materia;
        this.profesion=profesion;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    
    public void mostrarProfe(){
        System.out.println("Nombre:"+getNombre());
        System.out.println("Apellido:"+getApellido());
        System.out.println("Edad:"+getEdad());
        System.out.println("Materia:"+getMateria());
        System.out.println("Profesion:"+getMateria());
        System.out.println("-------------------------------------");
        
    }

}
