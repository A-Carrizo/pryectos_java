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
public class Producto_Refrigerado extends Productos {
    String codigo_org;
    public Producto_Refrigerado(String vencimiento, String lote,String codigo_org) {
        super(vencimiento, lote);
        this.codigo_org=codigo_org;
    }

    public String getCodigo_org() {
        return codigo_org;
    }

    public void setCodigo_org(String codigo_org) {
        this.codigo_org = codigo_org;
    }
    
    
    
    public void mostrar_refrigerado(){
        System.out.println("Fecha vencimiento:"+getVencimiento());
        System.out.println("lote:"+getLote());
        System.out.println("Codigo de organismos:"+getCodigo_org());
        System.out.println("------------------------------------------");
    }
    
    
    
    
}
