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
public class Extra16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   /*Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas ingresadas por teclado e indique si son mayores o menores de edad.
    Después de cada persona, el programa debe preguntarle al usuario si quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.*/
    
    Scanner read = new Scanner(System.in);
    
        System.out.println("Ingrese la cantidad de personas que serán encuestadas");
        int total = read.nextInt();
        
        int [] vector = new int[total];
        String [] vector2 = new String[total];

        for (int i = 0; i < vector.length; i++) {
           
                System.out.println("Ingrese su nombre");
                String name = read.next();
                vector2[i] = name;
                
                System.out.println("Ingrese su edad");
                int years = read.nextInt();
                vector[i] = years;
                
        }
        for (int i = 0; i < vector.length; i++) {
                
                System.out.println("¿Desea ver los datos de las personas encuestadas? Ingrese NO para salir. Caso contrario, el programa seguirá ejecutándose.");
                String answer = read.next();

                if(answer.equals("NO")) {
                   break;
                }
                if(vector[i] >= 18) {
                    System.out.println("Persona " + (i+1) + ": " + vector2[i] + " usted tiene " + vector[i] + " años y es mayor de edad");
                } else {
                    System.out.println("Persona " + (i+1) + ": " + vector2[i] + " usted tiene " + vector[i] + " años y es menor de edad");
                }
                
  
                }
                
        }
        
        
    
    }
   
