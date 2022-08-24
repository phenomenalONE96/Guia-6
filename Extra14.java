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
public class Extra14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  /*Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
    de hijos para averiguar la media de edad de los hijos de todas las familias.*/
  
    Scanner read = new Scanner(System.in);
    
        int i = 0;
        int prom = 0;
        int sons = 0;
        int years = 0;
        int total = 0;
        
        System.out.println("¿Cuántas familias son?");
        int families = read.nextInt();

        while(i < families) {
            System.out.println("Familia " + (i+1) + " ¿Cuántos hijos tiene?");
            sons = read.nextInt();
            total += sons;
            
            int j = 0;
            
            if (sons < 0) {
              break;
            }
            
            while(j < sons) {
                System.out.println("Inserte la edad de su " + (j+1) + " hijo, familia " + (i+1));
                years = read.nextInt();
                prom += years;
                j+=1;
            }
            
            i+=1;
        }
        
        System.out.println("El total de hijos es de: " + total + ". La media de edades es de: " + (prom/total));

        
    }
    
}
