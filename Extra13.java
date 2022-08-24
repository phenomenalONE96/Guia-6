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
public class Extra13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   /*Crear un programa que dibuje una escalera de números, donde cada línea de números comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
    usuario al comenzar. Ejemplo: si se ingresa el número 3:
    1
    12
    123*/
   
        Scanner read = new Scanner(System.in);
   
        System.out.println("Haremos una escalera de números. Ingrese la altura que desee para su escalera");
        int alture = read.nextInt();
        
        int[][] matriz = new int[alture][alture];
        System.out.println();
        
        for (int i = 1; i <= alture; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j+1);
            }
            System.out.println("");
        }
    }
    
}
