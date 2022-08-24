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
public class Extra19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escriba un programa que averigüe si dos vectores de N enteros son iguales (la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).
        
        Scanner read = new Scanner(System.in);
       
        System.out.println("Ingrese el tamaño de los dos vectores");
        int size = read.nextInt();
        
        int[] vector1 = new int[size];
        int[] vector2 = new int[size];
        
        System.out.println("Ambos vectores tendrán números aleatorios. ");
        
        loadArray(vector1, vector2);
        printArray(vector1, vector2);
    }
    
    
    
    
    
    
    
    
    
    
        public static void loadArray(int[] vector1, int[] vector2) {
        for (int i = 0; i < vector1.length; i++) {
                vector1[i] = (int) (Math.random()*10);
            
        }
        for (int i = 0; i < vector2.length; i++) {
                vector2[i] = (int) (Math.random()*10);
                
                }
            for (int i = 0; i < vector1.length; i++) {
                
            if(Arrays.equals(vector1, vector2)) {
                System.out.println("Son iguales");
                break;
            } else {
                System.out.println("No son iguales");
                break;
            }
            
        }
    }
        
        public static void printArray(int[] vector1, int[] vector2) {
            System.out.println("Su primer vector es:");
        for (int i = 0; i < vector1.length; i++) {
               System.out.print(vector1[i] + " ");

        }
            System.out.println("");
            System.out.println("Su segundo vector es:");
        for (int i = 0; i < vector1.length; i++) {
                System.out.print(vector2[i] + " ");
            
        }
         
        }
}
