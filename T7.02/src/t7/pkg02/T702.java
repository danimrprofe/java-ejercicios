/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t7.pkg02;

/**
 *
 * @author dnick
 */
public class T702 {
    
    static private int valor_maximo = 50;
    static private int filas = 10;
    static private int columnas = 4;
    static private int[][] matriz;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        matriz = new int[filas][columnas];
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                matriz[i][j]=aleatorio(10);
            }
        }
        imprimeMatriz();
    }
    
   static public int aleatorio(int max){
       return (int)(Math.random()*max);
   }
    
   static public void imprimeMatriz(){
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
   }
}
