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
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
        //cambiando sus filas por columnas (o viceversa).
        
        int [][] matriz = new int[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = (int) (Math.random()*10);
            }
        }
        
        System.out.println("Matriz común");
            for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
                System.out.println("");
        }
        
        System.out.println("");
        System.out.println("Matriz traspuesta");
              for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[j][i] + " ");
            }
                System.out.println("");
        }
        
    }
    
}
