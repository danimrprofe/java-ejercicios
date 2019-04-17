/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t7.ordenacion;

/**
 *
 * @author dnick
 */
public class Ordenador {
    
    private int valor_max = 10;
    private int[] numeros;
    int pos;
    // Selección;
    int i,j;
    int num_minimo;
    int pos_minimo;
    int tempint;
    public void insercion(){
        for (j=0;j<pos;j++)
        {
            num_minimo = numeros[j];
            pos_minimo = j;
            for (i=j+1;i<pos;i++)
            {
                    if (numeros[i]< num_minimo)
                        {
                            num_minimo = numeros[i];
                            pos_minimo = i;
                        }
            }
            if (pos_minimo != j)
            {
                tempint = numeros[j];
                numeros[j] = numeros[pos_minimo];
                numeros[pos_minimo] = tempint;
            }                  
        }
        
    }
        
    
    public Ordenador(int elementos, int valor_max){
         crearVector(elementos,valor_max);
         pos = numeros.length;
    }
    
    public void pintaNumeros()
    {
        for (int j: numeros){
            System.out.print(j + " ");
            
        }
        System.out.print("\n");
    }
    
    public int aleatorio(int max){
       return (int)(Math.random()*max);
   }
    
    public void crearVector(int elementos, int valor_max)
    {
       numeros = new int[elementos];
        for (int i=0;i<elementos;i++)  
       {
           numeros[i]= aleatorio(valor_max);
       }
        
    }
}
