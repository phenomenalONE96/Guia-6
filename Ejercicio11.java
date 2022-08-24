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
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla el siguiente menú:

/*MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.*/

        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        Integer num1 = read.nextInt();
        System.out.println("Ingrese el segundo número");
        Integer num2 = read.nextInt();
        
            Boolean exit = false;
            Integer option = null;
            String siNo = "";
        
                
        while (!exit) {
   
            System.out.println();
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3 Multiplicar");
            System.out.println( "4. Dividir");
            System.out.println("5. Salir");
            
            System.out.println("Ingrese la opción que desee");
            option = read.nextInt();
            
            switch(option) {
                case 1: 
                    System.out.println("El resultado es: " + (num1 + num2));
                    break;
                case 2: 
                    System.out.println("El resultado es: " + (num1 - num2));
                    break;
                case 3: 
                    System.out.println("El resultado es: " + (num1 * num2));
                    break;
                case 4: 
                    System.out.println("El resultado es: " + (num1 / num2));
                    break;  
                case 5:
                    
                     System.out.println("Está seguro de salir? (S/N)");
                     
                    while(!exit) {
                        siNo = read.nextLine();
                    
                        if("S".equals(siNo)) {
                        exit = true;
                        break;
                 
                        } else if("N".equals(siNo)) {
                            exit = false;
                            break;
                          }
                    }
            }
        }

        
    }
    
}
