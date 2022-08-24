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
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
        //números al usuario hasta que la suma de los números introducidos supere el límite inicial.
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el límite positivo");
        Integer limit = leer.nextInt();
        Integer acumulattor = 0;
        
        do {
             System.out.println("Ingrese números a sumar");
             Integer number = leer.nextInt();
             
             acumulattor += number;
        }
        while(limit >= acumulattor);
    }
    
}
