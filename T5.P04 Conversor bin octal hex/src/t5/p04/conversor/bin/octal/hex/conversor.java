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
public class conversor {
    
    int num;
    public conversor(int numero){
       num = numero; 
    }
    public String getNumero(char parametro)
    {
        String resultado ="";
        switch(parametro){
                case 'O': return "hola";
                case 'B': resultado=convertirBinario(num);
                case 'H': resultado=convertirHexadecimal(num);
        }
        return resultado;
    }
    
    public String convertirBinario(int numero)
    {
        StringBuilder cadenabinaria = new StringBuilder();
        while(num>1)
        {
            cadenabinaria.append(num%2);
            num /= 2;    
        }
        cadenabinaria.append(1);
        return cadenabinaria.reverse().toString();
    }
    public String convertirHexadecimal(int numero)
    {
        StringBuilder cadenabinaria = new StringBuilder();
        while(num>16)
        {
            if ((num%16)<=9)
            {
                cadenabinaria.append(num%16);
            }
            else{
                switch(num%16){
                    case 10: cadenabinaria.append("A");
                    case 11: cadenabinaria.append("B");
                    case 12: cadenabinaria.append("C");
                    case 13: cadenabinaria.append("D");
                    case 14: cadenabinaria.append("E");
                    case 15: cadenabinaria.append("F");
                    
                    
                }
            }
            
            num /= 16;    
        }
        cadenabinaria.append(num);
        return cadenabinaria.reverse().toString();
    }
}
