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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un programa que dado un numero determine si es par o impar.
        
        Scanner leer = new Scanner(System.in);
        int num;
        
        
        do {
            System.out.println("Ingrese un número, le indicaremos si es par o impar");
             num = leer.nextInt();
            
             if (num > 1000) {
                 System.out.println("El número es muy grande");
             }
             
             else if (num % 2 == 0) {
                 System.out.println("El número es par");
             
             } else {
                 System.out.println("El número es impar");
             }  
             
        } while (num > 1000);
       
                }
}