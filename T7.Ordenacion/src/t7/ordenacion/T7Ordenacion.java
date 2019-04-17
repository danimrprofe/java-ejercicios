/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t7.ordenacion;

/**
 *
 * @author dnick
 */
public class T7Ordenacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     
        
        Ordenador ord = new Ordenador(20,100);
        ord.pintaNumeros();  
        
        long startTime = System.nanoTime();
        ord.insercion();
        long stopTime = System.nanoTime();
        
        ord.pintaNumeros();
        

System.out.println("Tiempo empleado: " + (stopTime - startTime)/1000 + " ns");

      
      
    }
    
}
