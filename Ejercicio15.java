/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6.Ejercicios;

/**
 *
 * @author Brian Rollano
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 15. Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los muestre por pantalla en orden descendente.
        
        int [] vector = new int[101];
        
    
            for (int j = 0; j < 101 ; j++) {
               vector[j] = 100 - j;
                
            }
            for (int j = 0; j < 101; j++) {
              
                System.out.println(vector[j]);
            }
            System.out.println("");
               
    }
    
}
