/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.pkg03.calculo.numero;

/**
 *
 * @author dnick
 */
public class numero {
    private int num;
    
    public numero(){
        num = 0;
    }
    public numero(int numero){
        num = numero;
    }
    
    public void aniade(int numero){
        num += numero;
        }
    public void resta(int numero){
        num -= numero;
    }
    
    public int getValor(){
        return num;
    }
    
    public void setNumero(int numero)
    {
        num = numero;
    }
    public int getDoble(){
        return num*2;
    }
    public int getTriple(){
        return num*3;
    }
    
    }
    

