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
public class Extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
        
        Integer hours, days;
        
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese cantidad de minutos");
        Integer minutes = read.nextInt();
        
  
        days = minutes / 1440;
        hours = (minutes % 1440)/60;

        if (days == 1) {
             System.out.println("El equivalente de los minutos ingresados es de: " + days + " día y " + hours + " horas.");
        } else {
            System.out.println("El equivalente de los minutos ingresados es de: " + days + " días y " + hours + " horas.");
        }
 
    }
    
}
