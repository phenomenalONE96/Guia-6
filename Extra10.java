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
public class Extra10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realice un programa para que el usuario adivine el resultado de una multiplicación entre dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
        si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
        utilizar la función Math.random() de Java.*/
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Haremos una multiplicación entre 2 números entre el 0 y 10, pero no le diremos cuáles son los números. Usted deberá adivinar el resultado");
        
        int num1 = (int) (Math.random()*10);
        int num2 = (int) (Math.random()*10);
        int total = num1 * num2;
        
        System.out.println("Ingrese el resultado secreto:");
   
        int result = read.nextInt();
        
        while(result != total) {
            System.out.println("Resultado incorrecto. Ingrese un nuevo resultado");
            result = read.nextInt();
           
        }
        
        if (result == total) {
            System.out.println("Felicitaciones! El resultado es el correcto");
            System.out.println("El primer número era " + num1 + " y sel segundo número era: " + num2);
            
        }
        
        
       
    }
    
    
}
