/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t5.p01.bebe.caca.pipi;

public class Bebe {

    static void pedir() {
        System.out.println(strl + " , " + str2 + " , " + str3);
    }
    static {
        str2 = "mama pipi"; 
        str3 = "mama agua";
    }
    Bebe() { System.out.println("Nacimiento del bebe"); } 
    static String str2, str3,strl = "papa tengo caca";
 
    public static void main(String[] args) {
        System.out.println("El bebe se ha despertado y va a pedir cosas"); 
        System.out.println("El bebe dice: " + Bebe.strl); 
        Bebe.pedir();
    }
static Bebe bebel = new Bebe(); 
static Bebe bebe2 = new Bebe();
static Bebe bebe3 = new Bebe();
}