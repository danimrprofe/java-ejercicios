/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1.pkg11.tiempo.a.minutos.horas;

/**
 *
 * @author dnick
 */
public class T111TiempoAMinutosHoras {

    /**
     * @param args the command line arguments
     */
    static int t_segundos = 51268;
    static int segundos;
    static int minutos;
    static int horas;
    
    public static void main(String[] args) {
        // TODO code application logic here
        segundos = t_segundos%60;
        minutos = t_segundos/60;
        horas = minutos/60;
        minutos = minutos%60;
        System.out.println("Pasando segundos: " + t_segundos);
        System.out.println(horas + " horas");
        System.out.println(minutos + " minutos");
        System.out.println(segundos + " segundos");
        
    }
    
}
