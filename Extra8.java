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
public class Extra8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
        la cantidad de números impares. Al igual que en el ejercicio anterior los números negativos no deben sumarse. Nota: recordar el uso de la sentencia break.*/
        
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números que desee ingresar");
        int size = read.nextInt();
        int par = 0, impar = 0, total = 0;
        
        int [] vector = new int[size];
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese un número. El programa se detendrá cuando ingrese un múltiplo de 5");
            Double n = read.nextDouble();
            
              if (n < 0) {
                System.out.println("El número ingresado no será tenido en cuenta ya que es un valor negativo");
                total += 0;
            } else {
            if (n % 2 == 0) {
                par += 1;
                total += 1;
            }
            if (n % 2 != 0) {
                impar += 1;
                total += 1;
            }
            
            if (n%5 == 0) {
                break;
            
            }}
           
        }
            System.out.println("La cantidad de números ingresados fue de: " + total);
            System.out.println("La cantidad de números pares fue de: " + par);
            System.out.println("La cantidad de números impares fue de: " + impar);
    }
    
}
