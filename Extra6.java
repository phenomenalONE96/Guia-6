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
public class Extra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
        
     Scanner read = new Scanner(System.in);
        System.out.println("Por favor, la cantidad de personas a las que mediremos");
        Integer persons = read.nextInt();
        Double [] vector = new Double[persons]; 
      
        int acc = 0;
        Double total = 0.0;
        Double total2 = 0.0;
        
        System.out.println("Ingrese por favor su altura.");
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Persona " + i+1);
            Double alture = read.nextDouble();
            total = total + alture;
            
            if(alture < 1.60) {
                acc += 1;
                total2 += alture;
            }
            }    
        
        total = (total/persons);
        total2 = total2/acc;
            System.out.println("La altura promedio de todas las personas es de: " + Math.round(total*100.0)/100.0 + "m");
            System.out.println("La cantidad de personas menores al 1.60m es de: " + acc + " y la altura promedio es de: " + Math.round(total2*100.0)/100.0 + "m");
        
    }
    }
    
    
    

