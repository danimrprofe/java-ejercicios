/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t5.p04.conversor.bin.octal.hex;

/**
 *
 * @author dnick
 */
public class T5P04ConversorBinOctalHex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        conversor conv = new conversor(255);
        System.out.println(conv.getNumero('H'));
    }
    
}
