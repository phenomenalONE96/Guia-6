/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6.Ejercicios;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author Brian Rollano
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese por favor su nombre");
        String nombre = leer.nextLine();
        
        /*String may = toUpperCase(nombre);
        String min = toLowerCase(nombre);*/
        
        System.out.println("Su nombre en mayúsculas es: " + toUpperCase(nombre) + ". Su nombre en minúsculas es: " + toLowerCase(nombre));
        
    }
    
}
