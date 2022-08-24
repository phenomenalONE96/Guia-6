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
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
        //numero y si se encuentra repetido
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño de su vector.");
        Integer num = read.nextInt();
        
        int [] vector = new int [num];
        
        for (int i = 0; i < num; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
        System.out.println("");
        System.out.println("Su vector es el siguiente:");
        for (int i = 0; i < num; i++) {
            System.out.println(vector[i]);
        }
        
        System.out.println("");
        
        System.out.println("Ahora ingrese un número a buscar dentro del vector y le diremos en qué posición está y si está repetido");
        Integer option = read.nextInt();
        
        Integer contador = 0;
        
        for (int i = 0; i < num; i++) {
            if(option.equals(vector[i])){
                contador++;
                
                if(contador > 1) {
                    System.out.println(option + " se encuentra en la posición " + i);
                } else if(contador == 1) {
                    System.out.println(option + " se encuentra en la posición " + i);
                } 
 
            } 

        }
        
        if(contador == 1) {
            System.out.println(option + " se encuentra repetido " + contador + " vez");
        } else if (contador > 1) {
            System.out.println(option + " se encuentra repetido " + contador + " veces");
        } else {
            System.out.println("La palabra no se encuentra en el vector");
        }
        
        
    }
    
}
