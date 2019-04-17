/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3.p09.bebe;

/**
 *
 * @author dnick
 */
public class T3P09Bebe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new T3P09Bebe(8).berrea();
        // En principio se ejecutará el constructor
        // A continuación se llamará al método
    }
    
    T3P09Bebe(int i){
        this("Soy un bebe consentido");
        System.out.println("Hola, tengo " + i + " meses");
    }
    T3P09Bebe(String s){
        System.out.println(s);
    }
    
    void berrea(){
        System.out.println("Buaaaaaaaaa");
    }
    
}
