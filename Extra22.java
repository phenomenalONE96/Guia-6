/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6.Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Brian Rollano
 */
public class Extra22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y muestre la suma de sus elementos.*/
    Scanner read = new Scanner(System.in);
       
        System.out.println("Ingrese la altura de su matriz");
        int height = read.nextInt();
        System.out.println("Ingrese el ancho de su matriz");
        int width = read.nextInt();
        int[][] matriz = new int[height][width];
        
        System.out.println("");
        loadArray(matriz);
        printArray(matriz);
        int retorno = totalAmount(matriz);
        System.out.println("La suma total de todos los elementos de su matriz es de: " + retorno);
        
    }
    
    public static void loadArray(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random()*10);
            }
        }
    }
    public static void printArray(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public static Integer totalAmount (int[][] matriz) {
        int total = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                total += matriz[i][j];
            }
          
        }
         return total;
    }
    
    
    
        
        
    
}
