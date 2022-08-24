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
public class Extra17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese un número y le indicaremos si es un número primo");
        int num = read.nextInt();
        
        Boolean retorno = primeNumberOrNot(num);
        System.out.println(num + " ¿Es un número primo? " + retorno);
        
    }
    
    public static Boolean primeNumberOrNot(int num) {
        
        int acc = 0;
        Boolean exit = false;
        
            
            for (int i = num; i > 0; i--) {
                if(num % i == 0) {
                    acc ++;
                }
                
                if(acc == 2) {
                    exit = true;
                    
            } else {
                    exit = false;
                }
        }
        return exit;
        
    }
    
}
