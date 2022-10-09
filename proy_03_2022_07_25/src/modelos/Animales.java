
package modelos;

public class Animales {
    
    private Integer id;
    private String nombre;
    private String raza;
    private String dueno;
    private Integer edad;

    public Animales(Integer id, String nombre, String raza, String dueno, Integer edad) {
        this.id = id;
        this.nombre = nombre;
        this.raza = raza;
        this.dueno = dueno;
        this.edad = edad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    
    
    
}
