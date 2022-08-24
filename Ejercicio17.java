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
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño de su vector.");
        Integer num = read.nextInt();
        
        int [] vector = new int [num];
        int contador = 0;
        int contador2 = 0;
        int contador3 = 0;
        int contador4 = 0;
        int contador5 = 0;
        
        for (int i = 0; i < num; i++) {
            vector[i] = (int) (Math.random() * 100000);
 
            if(vector[i] < 10) {
                contador=+1;
     
            } else if (vector[i] > 10 && vector[i] < 100){
                contador2=+1;
            } else if (vector[i] > 100 && vector[i] < 1000){
                contador3+=1;
            } else if (vector[i] > 1000 && vector[i] < 10000){
                contador4+=1;
            } else if (vector[i] > 10000 && vector[i] < 100000){
                contador5+=1;
            }
        
        }
        System.out.println("");
        System.out.println("Su vector es el siguiente:");
        for (int i = 0; i < num; i++) {
            System.out.println(vector[i]);
        }
        
        System.out.println("");  
        System.out.println("El vector tiene: ");
        System.out.println(contador + " números de 1 dígito.");
        System.out.println(contador2 + " números de 2 dígitos.");
        System.out.println(contador3 + " números de 3 dígitos.");
        System.out.println(contador4 + " números de 4 dígitos.");
        System.out.println(contador5 + " números de 5 dígitos.");
        
    }
    
    
}
