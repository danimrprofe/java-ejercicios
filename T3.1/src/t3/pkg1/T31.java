/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.pkg1;

/**
 *
 * @author dnick
 */
public class T31 {

    /**
     * @param args the command line arguments
     */
    static int a, b, c;
    static int mayor, menor;
    public static void main(String[] args) {
        // TODO code application logic here
        a=5;
        b=5;
        c=5;
        

        
        if(a<b){
            if (a<c)
            {
                menor = a;
                if (b<c)
                {
                    mayor = c;
                }
                else
                {
                    mayor = b;
                }
            }
            else
            {
                menor = c;
                if (b<a)
                {
                    mayor = a;
                }
                else
                {
                    mayor = b;
                }
            }
        }
        System.out.println("El mayor es: " + mayor);
        System.out.println("El menor es: " + menor);
        
    }
    
}
