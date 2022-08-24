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
public class Ejercicio19 {
    private static Scanner read = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        System.out.println("Ingrese el tamaño de su matriz");
        int size = read.nextInt();
        
        int[][] matriz = new int[size][size];
        
        load(matriz);
        check(matriz);
        print(matriz);
  
    }
    
    public static void load(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Ingrese el valor de su matriz en la posición: [" + i + "] [" + j + "]");
                matriz[i][j] = read.nextInt();
            }
        }
    }
    public static void check(int[][] matriz) {
        
        Boolean anti = false;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(matriz[i][j] != -matriz[j][i]) {
                    anti = true;
                }
            }
        }
        
        if (anti) {
            System.out.println("No es una matriz antisimétrica");
        } else {
            System.out.println("Es una matriz antisimétrica");
        }
    }
    public static void print(int[][] matriz) {
        System.out.println("Esta es su matriz");
        System.out.println("");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("Esta es la matriz traspuesta");
        System.out.println("");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println("");
        }
    }
    
}
