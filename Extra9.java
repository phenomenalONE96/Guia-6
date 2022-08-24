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
public class Extra9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese dos números mayores a 1. El primero será el número a dividir y el segundo el divisor");
        int num1 = read.nextInt();
        int num2 = read.nextInt();
        int total = num1;
        int acc = 0;
        
           
            
           
            for (int i = 0; num2 < total; i++) {
            while (total >= num2) {
                total-= num2;
                System.out.println(num1 + " - " + num2 + " = " + total);
                num1-=num2;
                acc += 1;
            }
        }
            System.out.println("El residuo de la división es de: " + num1 + " y el cociente es de: " + acc);
            
        
        
        
       /* System.out.println(El residuo total);*/
        
        
        
    }
    
}
