/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.pkg8.decimal.a.romano;

/**
 *
 * @author dnick
 */
public class T38DecimalARomano {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, decimal;
        for (i=0;i<100;i++)
        {
            decimal = i;
        while(decimal>=1000){
            System.out.print("M");
            decimal -= 1000;
        }
      
        if(decimal>=900){
            System.out.print("IM");
            decimal -= 900;
        }
        else
        {
            while(decimal>=500){
                System.out.print("D");
                decimal -= 500;
            }
        }
        
        while(decimal>=100){
            System.out.print("C");
            decimal -= 100;
        }
        if(decimal>=90){
            System.out.print("IC");
            decimal -= 90;
            
        }
        else
        {
            while(decimal>=50){
            System.out.print("L");
            decimal -= 50;
            }
        }
        

        while(decimal>=10){
            System.out.print("X");
            decimal -= 10;
        }
        
        if(decimal>=9){
            System.out.print("IX");
            decimal -= 9;
        }
        else
        {
            
            while(decimal>=5)
            {
                System.out.print("V");
                decimal -= 5;
            }
        }
        
        if(decimal>=4)
        {
         System.out.print("IV");
         decimal-=4;
        }
        else
        {
            while(decimal>=1)
            {
                System.out.print("I");
                decimal -= 1;
            }
        }
        System.out.print("\n");
        }       
    }
    
}
