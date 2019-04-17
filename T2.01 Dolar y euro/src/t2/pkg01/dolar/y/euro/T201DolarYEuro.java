/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.pkg01.dolar.y.euro;

/**
 *
 * @author dnick
 */
public class T201DolarYEuro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        finanzas fin = new finanzas(1.2);
        System.out.println(fin.dolaresToEuros(2));
        System.out.println(fin.eurosToDolares(2));
    }
    
}
