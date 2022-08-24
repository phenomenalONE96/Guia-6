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
public class Extra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio de n números (n>0). El valor de n se solicitará al principio del programa y los números
        //serán introducidos por el usuario. Realice dos versiones del programa, una usando el bucle “while” y otra con el bucle “do - while”.
        
       /* Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de números que ingresará");
        int total = read.nextInt();
        int count = 0;
        int max = 0;
        int min = 100000;
        int acc = 0;
        
        
       while (count != total) {
           System.out.println("Ingrese un número");
           int n = read.nextInt();

           if (n > max) {
               max = n;
           }
               
           if (n < min) {
                min = n;
               }
           
          count += 1;
          acc += n;
        }
         System.out.println("El valor máximo es: " + max);
         System.out.println("El valor minímo es: " + min);
         System.out.println("El promedio de números es de: " + (acc/total));*/
            
        Scanner read = new Scanner(System.in);    
        System.out.println("Ingrese la cantidad de números que ingresará");
        int total = read.nextInt();
        int count = 0;
        int max = 0;
        int min = 100000;
        int acc = 0;
        
        
      do {
           System.out.println("Ingrese un número");
           int n = read.nextInt();

           if (n > max) {
               max = n;
           }
               
           if (n < min) {
                min = n;
               }
           
          count += 1;
          acc += n;
          
        }  while (count != total);
            
         System.out.println("El valor máximo es: " + max);
         System.out.println("El valor minímo es: " + min);
         System.out.println("El promedio de números es de: " + (acc/total));
        
    }
    
}
