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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
        
        Scanner temp = new Scanner(System.in);
        
        System.out.println("Ingrese la temperatura en grados Celsius y se lo mostraremos en grados Fahrenheit");
        Double c = temp.nextDouble();
        
        Double f = 32 + (9 * c / 5);
        
        System.out.println("La temperatura en F° es: " + f);
    }
    
}
