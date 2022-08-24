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
public class Ejercicio1 {

    public static void main(String[] args) {
        // Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. El programa deberá después mostrar el resultado de la suma
        
        Scanner leer = new Scanner(System.in);
        
        Integer num1; 
        Integer num2;
        
        System.out.println("Por favor, ingrese el primer número a sumar");
        num1 = leer.nextInt();
        
        System.out.println("Por favor, ingrese el segundo número a sumar");
        num2 = leer.nextInt();
        
        Integer suma = num1 + num2;
        
        System.out.println("El resultado es: " + suma);
      
    }
    
}
