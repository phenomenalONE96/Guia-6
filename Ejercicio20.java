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
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
        //permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no. El programa deberá comprobar que los números introducidos son correctos, es decir,
        //están entre el 1 y el 9.
        
        int [][] matriz = new int[3][3];
        int [] fila = new int[3];
        int [] columna = new int[3];
        Scanner read = new Scanner (System.in);
        Integer num = 0;
        
        System.out.println("Su matriz es de 3x3. Usted ingresará los valores de la misma y determinaremos si es un cuadrado mágico.");
        System.out.println("Un cuadrado mágico es aquel que tanto la suma de sus filas, columnas y diagonales sumen igual");
        System.out.println("Ingrese un número del 1 al 9");
       
        for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    num = read.nextInt();
                    
                    while (num < 1 || num > 9) {
                        System.out.println("Número incorrecto. Por favor, ingrese un número mayor a 0 y menor a 10");
                        num = read.nextInt();                    
                   
                    }  
                    matriz[i][j] = num;
            }
        }

        System.out.println();
        System.out.println("Su matriz es la siguiente");
        print(matriz);
        Boolean retorno = validation(matriz, fila, columna);
        
    }        
        
    public static void print(int[][] matriz) {
         for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
        }
         
    }
        public static Boolean validation (int[][] matriz, int[] fila, int[] columna) {
        int diagonalSecundaria = 0;
        int diagonalPrimaria = 0;

        for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    
                    fila[i] += matriz[i][j];
         
                        if (i == j) {
                            diagonalPrimaria += matriz[i][j];     
                        }      
   
                        if ((i+j) == matriz.length - 1) {
                           diagonalSecundaria += matriz[i][j];
                        }
                }      
        }
                            
        for (int j = 0; j < 3; j++) {
             
                for (int i = 0; i < 3; i++) {
                     columna[j] += matriz[i][j];                 
                }              
         }   
        
            Boolean val = false;
       for (int i = 0; i < matriz.length; i++) {
                if(diagonalSecundaria == 15 && diagonalPrimaria == 15 && fila[i] == 15 && columna[i] == 15) {
                    val = true;
                    System.out.println("Es un cuadrado mágico");
                    break;
                } else {
                    val = false;
                    System.out.println("No es un cuadrado mágico");
                    break;
                }
                
            }
                
                return val;
        
        }
}    
        

        
     

    

       
    

 
       

    

    
  
            

