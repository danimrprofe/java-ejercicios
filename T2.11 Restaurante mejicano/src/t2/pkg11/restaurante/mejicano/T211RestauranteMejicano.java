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
public class T211RestauranteMejicano {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        restaurante rest = new restaurante();
        System.out.println(rest.getComensales(5.98, 8.34));
        rest.addChocos(5);
        rest.addPapas(29);    
        System.out.println(rest.getComensales(5.98, 8.34)); 
        rest.showChocos();
        rest.showPapas();
    }
    
    
    
}
