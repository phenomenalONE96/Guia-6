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
public class Extra24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese hasta que número desea ver en la serie Finobacci");
        int num = read.nextInt();
        
        fibonacci(num);
    }
    
    public static void fibonacci(int num) {
        
        int a = 0;
        int b = 1;
        int c = 1;
        
        System.out.println(a);
        for (int i = 1; i < num; i++) {
            System.out.println(c);
            c = b + a;
            a = b;
            b = c;
        }
    }
    
}
