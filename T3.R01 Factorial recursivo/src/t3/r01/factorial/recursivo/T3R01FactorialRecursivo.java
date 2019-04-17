/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.r01.factorial.recursivo;

/**
 *
 * @author dnick
 */
public class T3R01FactorialRecursivo {

    /**
     * @param args the command line arguments
     */
    static int num =0;
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(factorialRecursivo(4));
        System.out.println(factorialIterativo(4));
    }
    
    public static int factorialRecursivo(int num)
    {
        if (num==0) return 1;
        return factorialRecursivo(num-1)*num;
    }
    
    public static int factorialIterativo(int num)
    {
        int resultado = 1;
        if (num==0) 
        {
            return 1;
        }
        else
        {
            while(num>1)
            {
                resultado = resultado*num;
                num--;
            }
            return resultado;
        }
        

    }
}
