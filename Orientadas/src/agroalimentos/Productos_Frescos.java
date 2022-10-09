/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agroalimentos;

/**
 *
 * @author aldoc
 */
public class Productos_Frescos extends Productos{
    String fecha_envasado,pais_origen;
    public Productos_Frescos(String vencimiento, String lote,String fecha_envasado,String pais_origen) {
        super(vencimiento, lote);
        this.fecha_envasado=fecha_envasado;
        this.pais_origen=pais_origen;
    }

    public String getFecha_envasado() {
        return fecha_envasado;
    }

    public void setFecha_envasado(String fecha_envasado) {
        this.fecha_envasado = fecha_envasado;
    }

    public String getPais_origen() {
        return pais_origen;
    }

    public void setPais_origen(String pais_origen) {
        this.pais_origen = pais_origen;
    }
    
    public void mostrar_frescos(){
        System.out.println("Fecha vencimiento:"+getVencimiento());
        System.out.println("lote:"+getLote());
        System.out.println("fecha de envasado:"+getFecha_envasado());
        System.out.println("Pais de origen:"+getPais_origen());
        System.out.println("------------------------------------------");
    }
    
    
    
}
