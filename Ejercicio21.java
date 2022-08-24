/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6.Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Brian Rollano
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
    dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
    que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de la matriz M en la cual empieza el primer elemento de la submatriz P.
    Ejemplo:

    Como podemos observar nuestra submatriz P se encuentra en la matriz M en los índices:
    4,4 - 4,5 - 4,6 - 5,4 - 5,5 - 5,6 - 6,4 - 6,5 - 6,6.*/
    
    Scanner read = new Scanner(System.in);
    int[][] m = new int[10][10];
    int[][] p = new int[3][3];
    int[][] c = new int[3][3];
    String[] index = new String[9]; 
    boolean exit = false;
    int acc;
    

        System.out.println("Esta es la matriz madre de un tamaño 10x10. Los valores de la misma son aleatorios");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                m[i][j] = (int) (Math.random() * 10);
            }
        }
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println("");
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese el valor a buscar en la fila " + i + ", columna " + j);
                p[i][j] = read.nextInt();
            }
        }
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (m[i][j] == p[0][0] && (10-i-3) > -1  && (10-j-3) > -1) {
                        acc = 0;                       
                        for (int k = 0; k < 3; k++) {
                            for (int l = 0; l < 3; l++) {                                
                                c[0+k][0+l] = m[i+k][j+l];
                                index[acc] = (i + k) + "-" + (j + l);
                                    acc++;

                            }
                        }
                    }
                 if(Arrays.deepEquals(c, p)) {
                     exit = true;
                     break;
                 }
               }
            }
        
        System.out.println("");
        
        if(exit){
            System.out.println("Se encontró coincidencia en los índices");
            for (int i = 0; i < 9; i++) {
                System.out.print(index[i] + " ");
            }
            
        } else {
            System.out.println("No se encontró coincidencias.");
        }

     }
}
    
    

