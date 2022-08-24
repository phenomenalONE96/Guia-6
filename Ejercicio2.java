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
 * 
 * Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
 */
public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Por favor, ingrese su nombre");
        String nombre = leer.nextLine();
        
        System.out.println("Su nombre es: " + nombre);
        
    }
    
}
