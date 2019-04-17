/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.pkg01.dolar.y.euro;

/**
 *
 * @author dnick
 */


public class finanzas {

    private double euros, dolares, cambio;
    

    public finanzas(){
        cambio = 1.36;
    };
    public finanzas(double cambioDolarAEuro){
        cambio = cambioDolarAEuro;
    }
    
    public double dolaresToEuros(double dolares){
        return dolares/cambio;
}
    public double eurosToDolares(double euros){
        return euros*cambio;
}
            
}
