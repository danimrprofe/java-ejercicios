/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.t1;
import Math;

/**
 *
 * @author dnick
 */
public class EjerciciosT1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EjercicioPropuesto8();
    }
    
public static void EjercicioPropuesto4(){
 

        int num=5;
        num += num -1*4+1; 
        System.out.println(num); num=4 ;
        num %= 7 * num % 3 * 7 >> 1;
        System.out.println(num);
}       

public static void EjercicioPropuesto5y6(){
        double radio = 3.0f;
        double longitud = Math.PI*radio*2;
        double area = Math.PI*radio*radio;
        System.out.println("Radio de circunferencia = " + radio);
        System.out.println("Longitud circunferencia = " + longitud);
        System.out.println("Area circunferencia = " + area);
}

public static void EjercicioPropuesto8(){
        
       double posicion = Math.floor(Math.random()*26);
       System.out.println(posicion);
       char letra = (char)(posicion+'a');
       System.out.println(letra);
       char[] vocales = {'a','e','i','o','u'};
       
}
}
