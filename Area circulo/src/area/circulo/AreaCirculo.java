/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area.circulo;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author dnick
 */
public class AreaCirculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        final float PI = 3.1416F;

        float area = 0;
        int radio = 5;
        String input;
        
        System.out.println("\n Radio del circulo:");
        try {
            input = bf.readLine();
            radio = Integer.parseInt(input);
            
            area = PI * radio * radio;
            System.out.println("\nEl area de un circulo es:");
            System.out.println(area);
            
        } catch (IOException ex) {
            Logger.getLogger(AreaCirculo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
}
