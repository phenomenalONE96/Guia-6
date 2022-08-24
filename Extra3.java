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
public class Extra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
        //Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese una letra, nosotros detectaremos si es una vocal o si no lo es.");
        String vocalOrNot = read.next();
        
        if (vocalOrNot.equals("a") || vocalOrNot.equals("e") || vocalOrNot.equals("i") || vocalOrNot.equals("o") || vocalOrNot.equals("u")) {
            System.out.println("Es una vocal");
        } else {
            System.out.println("Es una consonante");
        }
    }
    
}
