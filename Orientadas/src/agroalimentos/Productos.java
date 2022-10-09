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
public class Productos {
    String vencimiento,lote;

    public Productos(String vencimiento, String lote) {
        this.vencimiento = vencimiento;
        this.lote = lote;
    }

    public String getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(String vencimiento) {
        this.vencimiento = vencimiento;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }
    
    
}
