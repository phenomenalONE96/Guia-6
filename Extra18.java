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
public class Extra18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N, con los valores ingresados por el usuario.*/
       
       Scanner read = new Scanner(System.in);
       
        System.out.println("Ingrese el tamaño de su vector");
        int size = read.nextInt();
        
        int[] vector = new int[size];
        int total = 0;
        
        System.out.println("Lo que haremos es mostrarle el resultado de todos los números que usted ingrese.");
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese un número");
            int n = read.nextInt();
            
            total += n;
        }
        
        System.out.println("El total de todos los números ingresados es de: " + total);
    }
    
}
