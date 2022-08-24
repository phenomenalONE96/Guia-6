/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6.Ejercicios;

/**
 *
 * @author Brian Rollano
 */
public class Extra12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0- 0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
    Ejemplo:
    0-0-0
    0-0-1
    0-0-2
    0-0-E
    0-0-4
    0-1-2
    0-1-E
    Nota: investigar función equals() y como convertir números a String.*/
    
        System.out.print("Le  mostraremos un contador el cual cada vez que aparezca un número 3, será sustituido por una letra E");
       
        for (int a = 0; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                for (int c = 0; c < 10; c++) {
                    
                    System.out.println("");
                    
                    if (a == 3) {
                        System.out.print("E" + "-");
                } else {
                        System.out.print(a + "-");
                    }
                    if (b == 3) {
                        System.out.print("E" + "-");
                } else {
                        System.out.print(b + "-");
                    }
                    if (c == 3) {
                        System.out.print("E");
                } else {
                        System.out.print(c);
                    }
        
            }
        }
            
        }
    }
    
}
