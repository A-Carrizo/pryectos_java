/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas_mascotas;

/**
 *
 * @author aldoc
 */
public class Mascotas {
    String tipo,nombre,raza;
    int edad;
    char sexo;

    public Mascotas(String tipo, String nombre, String raza, int edad, char sexo) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.sexo = sexo;
    }
    
}
