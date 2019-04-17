/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.pkg5.lucky.number;

/**
 *
 * @author dnick
 */
public class T35LuckyNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int lucky_number = 0;
        String nacimiento = "13-09-1984";
        String[] cifras = nacimiento.split("-");
        for(String cifra:cifras){
            lucky_number += Integer.parseInt(cifra);
        }
        
                
        System.out.println(lucky_number);
    }
    
}
