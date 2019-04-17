/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.pkg2.asteriscos;

/**
 *
 * @author dnick
 */
public class T32Asteriscos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,j;
        for (i=1;i<6;i++){
            for (j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    
}
