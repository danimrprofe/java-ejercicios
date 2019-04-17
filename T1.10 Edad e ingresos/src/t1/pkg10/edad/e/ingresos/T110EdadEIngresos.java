/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1.pkg10.edad.e.ingresos;

/**
 *
 * @author dnick
 */
public class T110EdadEIngresos {

    static boolean jasp;
    static int edad = 27;
    static int nivel_de_estudios = 4;
    static int ingresos = 29000;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
              
        jasp = ((edad>=28)&&(nivel_de_estudios>3))||((edad<30)&&(ingresos>28000));
        System.out.println(jasp);
    }
    
    }
    

