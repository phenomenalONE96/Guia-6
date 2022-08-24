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
public class Extra11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          /*Escribir un programa que lea un número entero y devuelva el número de dígitos que componen ese número. Por ejemplo, si introducimos el número 12345, el programa
    deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador de división. Nota: recordar que las variables de tipo entero truncan los números o resultados.*/
    
   Scanner read = new Scanner(System.in);
   
        System.out.println("Ingrese un número entero y le indicaremos la cantidad de dígitos");
        int num = read.nextInt();
        int acc = 0;
        
        while(num != 0) {
            num = num/10;
            acc++;
        }
        System.out.println("La cantidad de dígitos del número ingresado es de: " + acc);
    }
    
}

