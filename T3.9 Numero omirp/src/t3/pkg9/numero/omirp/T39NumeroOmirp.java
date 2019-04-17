/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.pkg9.numero.omirp;

/**
 *
 * @author dnick
 */
public class T39NumeroOmirp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
                
        for(num=1;num<10000;num++){
            if (es_primo(num) && (es_primo(reverseNumber(num))))
            {
                System.out.println(num);
            }

                    
        }
        
    }
    
    public static int reverseNumber(int num_original)
    {
        int reversed =0;
        while(num_original != 0) {
            int digit = num_original % 10;
            reversed = reversed * 10 + digit;
            num_original /= 10;
        }
        return reversed;
    }
    
    public static boolean es_primo(int num_original)
    {
        int divisores =0;
        int i;
        boolean es_primo;
        for(i=2;i<num_original;i++){
            if (num_original%i == 0){
                divisores++;
            }
        }
        if(divisores == 0){
            return true;
        }
        else
            return false;
    }
    
}
