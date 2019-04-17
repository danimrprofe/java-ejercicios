/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t7.ejemplotemperaturas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author dnick
 */
public class T7EjemploTemperaturas {
    
    private static int[] temperaturas;
    final static int POS = 10;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dato, media = 0;
        for(int i=0;i<POS;i++)
        {
            try 
            {
                System.out.println("Introduzca temperatura");
                String sdato = br.readLine();
                dato = Integer.parseInt(sdato);
                temperaturas[i]= dato;
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
        
        // Calculo de la media
        
        for (int i=0;i<POS;i++)
        {
            media = media + temperaturas[i];
        }
        media = media/POS;
        System.out.println(media);
    }
    
}
