/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.pkg11.restaurante.mejicano;

/**
 *
 * @author dnick
 */
public class restaurante {
    private double chocos;
    private double papas;
    private int comensales;
    
    
    public restaurante(){
        
    }
    
    public void addChocos(int x)
    {
        chocos += x;
    }
        public void addPapas(int x)
    {
        papas += x;
    }
        
    public void showChocos(){
        System.out.println("Kg de chocos en el almacén: " + chocos);
    }
    public void showPapas(){
        System.out.println("Kg de papas en el almacén: " + papas);
    }
        
    public int getComensales(double kgchocos, double kgpapas)
    {
        chocos = kgchocos;
        papas = kgpapas;
        
        
        int paxporchocos = (int)Math.floor(chocos*3);
        int paxporpapas = (int)Math.floor(papas*3);
        
        System.out.println("Con " + chocos + " kg de chocos comen " + paxporchocos  + " personas");
        System.out.println("Con " + papas + " kg de papas comen " + paxporpapas + " personas");     

        if (paxporchocos>paxporpapas){
            return paxporpapas;
        }
        else
        {
            return paxporchocos;
        }
        
    }
}
