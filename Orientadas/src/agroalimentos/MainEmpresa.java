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
public class MainEmpresa {
    public static void main(String[] args){
        Productos_Frescos fresco1= new Productos_Frescos("17/07/2022","111","01/01/2021","Paraguay");
        
        Producto_Refrigerado refrigerado1= new Producto_Refrigerado("17/07/2022","111","22222");
        
        Producto_Congelado congelado1= new Producto_Congelado("17/07/2022","111","78~");
        
        fresco1.mostrar_frescos();
        refrigerado1.mostrar_refrigerado();
        congelado1.mostrar_congelado();
        
        
    }
    
}
