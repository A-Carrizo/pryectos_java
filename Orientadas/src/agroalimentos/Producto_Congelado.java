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
public class Producto_Congelado extends Productos {
    String temperatura;
    public Producto_Congelado(String vencimiento, String lote,String temperatura) {
        super(vencimiento, lote);
        this.temperatura=temperatura;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }
    
    public void mostrar_congelado(){
        System.out.println("Fecha vencimiento:"+getVencimiento());
        System.out.println("lote:"+getLote());
        System.out.println("Temperatura:"+getTemperatura());
        System.out.println("------------------------------------------");
    }
    
    
    
}
