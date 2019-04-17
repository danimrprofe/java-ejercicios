/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.pkg3.rombo.asteriscos;

/**
 *
 * @author dnick
 */
public class T33RomboAsteriscos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i,j;
        // TODO code application logic here
        for(i=1;i<=7;i=i+2){
            for(j=(7-i)/2;j>0;j--){
               System.out.print(" ");
            }
            for(j=1;j<=i;j++){
               System.out.print("*");
            }
            for(j=(7-i)/2;j>0;j--){
               System.out.print(" ");
            }
            
            System.out.print("\n");
        }
    }
    
}
