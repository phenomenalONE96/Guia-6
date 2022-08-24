package guia6.Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Brian Rollano
 */
public class Extra20 {

    
    /*Crear una función rellene un vector con números aleatorios, pasándole un arreglo por parámetro. Después haremos otra función o procedimiento que imprima el vector.*/
    
        public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        System.out.println("Por favor, ingrese el tamaño del vector:");
        int n = leer.nextInt();
        int[] vector = new int[n];
        load(vector);
        show(vector);
    }
        
        public static void load(int[] array) {
        int i, aux;
     
        for(i = 0; i < array.length; i++){
            aux = (int) (Math.random() * 10);
            array[i] = aux;
        }
    }
    
        public static void show(int[] array) {
            int i;
            System.out.println("Su vector es el siguiente:");
            for(i = 0; i < array.length; i ++)
                System.out.print("[" + array[i] + "] ");
        }
}

    
    
