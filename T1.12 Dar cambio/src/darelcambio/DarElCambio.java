/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darelcambio;

/**
 *
 * @author dnick
 */
public class DarElCambio {

    /**
     * @param args the command line arguments
     */
    static private int billetes500 = 0;
    static private int billetes200 = 0;
    static private int billetes100 = 0;
    static private int billetes50 = 0;
    static private int billetes20 = 0;
    static private int billetes10 = 0;
    static private int billetes5 = 0;
    static private int monedas2 = 0;
    static private int monedas1 = 0;
    static private int cambio;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        calcularCambio2(162,800);
        
                
    }
    
    public static void calcularCambio2(int cuenta, int pagado){

        cambio = pagado - cuenta;
        int resto = cambio;
        int[] tipos = {500,200,100,50,20,10,5,2,1};
        int billetes;
        System.out.println("El cambio es de: " + cambio + " Euros");
        for (int tipo : tipos)
        {
            billetes=0;
            while(resto >= tipo) {   resto=resto-tipo;    billetes++;}
            if(billetes>0) {System.out.println(billetes + "  de " + tipo);}    
            
        }
                      
        
    }
    
    public static void calcularCambio(){
        final int cuenta = 231;
        final int pagado = 300;
        cambio = pagado - cuenta;
        int resto = cambio;
        
        System.out.println("El cambio es de: ");
        while(resto >= 500) {   resto=resto-500;    billetes500++;}
        if(billetes500>0) {System.out.println(billetes500 + "  de 500");}
        while(resto >= 200) {   resto=resto-200;    billetes200++;  }
        if(billetes200>0) {System.out.println(billetes200 + "  de 200");}
        while(resto >= 100) {   resto=resto-100;    billetes100++;  }
        if(billetes100>0) {System.out.println(billetes100 + "  de 100");}
        while(resto >= 50) {   resto=resto-50;    billetes50++;  }
        if(billetes50>0) {System.out.println(billetes50 + "  de 50");}
        while(resto >= 20) {   resto=resto-20;    billetes20++;  }
        if(billetes20>0) {System.out.println(billetes20 + "  de 20");}
        while(resto >= 10) {   resto=resto-10;    billetes10++;  }
        if(billetes10>0) {System.out.println(billetes10 + "  de 10");}
        while(resto >= 5) {   resto=resto-5;    billetes5++;  }
        if(billetes5>0) {System.out.println(billetes5 + "  de 5");}
        while(resto >= 2) {   resto=resto-2;    monedas2++;  }
        if(monedas2>0) {System.out.println(monedas2 + "  de 2");}
        while(resto >= 1) {   resto=resto-1;    monedas1++;  }
        if(monedas1>0) {System.out.println(monedas1 + "  de 1");}
        
        
    }
}
