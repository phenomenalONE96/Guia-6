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
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*14. Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
        función tendrá como parámetros, la cantidad de euros y la moneda a converir que será una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
        El cambio de divisas es:
        * 0.86 libras es un 1 €
        * 1.28611 $ es un 1 €
        * 129.852 yenes es un 1 €*/
        
        Scanner read = new Scanner(System.in);
        
        String option = null;
        String sign = null;
        
        System.out.println("Ingrese el monto de euros a convertir.");
        Integer euros = read.nextInt();
        
        System.out.println("Ahora ingrese la opción que quiera según la moneda a convertir:");
        System.out.println("A. Libras");
        System.out.println("B. Dolar");
        System.out.println("C. Yenes");
        option = read.next();
        
        if(option.equals("A")) {
            sign = "libras";
        }
        
        if(option.equals("B")) {
            sign = "dólares";
        }
        
        if(option.equals("C")) {
            sign = "yenes";
        }
        
        Double retorno = change(euros, option);
        System.out.println("La conversión de euros es de: " + retorno + " " + sign);
    
    }
    public static Double change(Integer euros, String option) {
            Double total = null;
            Double libra = 0.86;
            Double dolar = 1.28611;
            Double yen = 129.852;
            Boolean exit = false;
            
        
         switch (option) {
            case "A": 
                        total = euros * libra;
                        break;
            case "B": 
                        total = euros * dolar;
                        break;
            case "C":     
                        total = euros * yen;
                        break;
        }
         
        return total;
        
    }
    
}
