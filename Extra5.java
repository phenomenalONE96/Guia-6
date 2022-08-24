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
public class Extra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*5. Una obra social tiene tres clases de socios:
        o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
        o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A.
        o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
        o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente el costo del tratamiento (previo al descuento) y determine el
        importe en efectivo a pagar por dicho socio.*/ 
        
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la letra correspondiente a su plan:");
        System.out.println("- A");
        System.out.println("- B");
        System.out.println("- C");
        String letter = read.next();
        
        System.out.println("Por favor, ingrese el costo total del tratamiento que requiere");
        Double num = read.nextDouble();
        
        switch(letter) {
            case ("A"):
                Double discount = (num * 0.50);
                System.out.println("Como usted cuenta con el Plan A, obtiene un 50% de descuento, por lo que pagará " + discount.intValue());
                break;
            case "B":
                discount = (num * 0.65);
                System.out.println("Como usted cuenta con el Plan B, obtiene un 35% de descuento, por lo que pagará " + discount.intValue());
                break;
            case "C":
                System.out.println("Como usted cuenta con el Plan C, no obtiene ningún descuento, por lo que abonará " + num);
                break;
        }
    }
    
}
