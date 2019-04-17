/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.pkg03.calculo.numero;

/**
 *
 * @author dnick
 */
public class T203CalculoNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        numero minumero = new numero(3);
        System.out.println(minumero.getValor());
        minumero.aniade(4);
        System.out.println(minumero.getValor());
        minumero.resta(1);
        System.out.println(minumero.getValor());
        System.out.println(minumero.getDoble());
        System.out.println(minumero.getTriple());
        minumero.setNumero(5);
        System.out.println(minumero.getValor());
    }
    
}
