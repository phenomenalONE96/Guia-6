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
public class Extra15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
        matemática y deben devolver sus resultados para imprimirlos en el main.*/
        
        Scanner read = new Scanner(System.in);
       
        System.out.println("Ingresa el primer número");
        int num1 = read.nextInt();
        System.out.println("Ahora ingresa el segundo número");
        int num2 = read.nextInt();
        System.out.println("¿Qué operación desea hacer?");
        System.out.println("1 - Sumar");
        System.out.println("2 - Restar");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("5 - Salir del programa");
        int option = read.nextInt();
        
        while(option != 5) {
            switch(option) {
                case 1: 
                    int retorno = suma(num1, num2);
                    System.out.println("El resultado es " + retorno);
                    break;
                case 2:
                    int retorno2 = resta(num1, num2);
                    System.out.println("El resultado es " + retorno2);
                    break;
                case 3:
                     int retorno3 = multiplicar(num1, num2);
                     System.out.println("El resultado es " + retorno3);
                    break;
                case 4:
                     int retorno4 = dividir(num1, num2);
                     System.out.println("El resultado es " + retorno4);
                    break;
            }
            break;
        }
        
    }
    
    public static Integer suma(Integer num1, Integer num2) {
        int total = num1 + num2;
        return total;
    }
    public static int resta(Integer num1, Integer num2) {
        int total2 = num1 - num2;
        return total2;
    }
    public static int multiplicar(Integer num1, Integer num2) {
        int total3 = num1 * num2;
        return total3;
    }
    public static int dividir(Integer num1, Integer num2) {
        int total4 = num1 / num2;
        return total4;
    }
    
}
