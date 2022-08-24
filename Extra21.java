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
public class Extra21 {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Los profesores del curso de programación de Egg necesitan llevar un registro de las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
        desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
        Primer trabajo práctico evaluativo 10%
        Segundo trabajo práctico evaluativo 15%
        Primer Integrador 25%
        Segundo integrador 50%
        Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
        desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso.*/
        
         Scanner read = new Scanner(System.in);
        
        Double[][] matriz = new Double[10][4];
        Double[][] matriz2 = new Double[10][4];
        Double [] array = new Double[10];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < 4; j++) {
                
                matriz[i][j] = (Double)(Math.random() * 10);

            }
        }
        
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Alumno " + (i+1));
            for (int j = 0; j < 4; j++) {
                System.out.print(Math.round(matriz[i][j]*100.0)/100.0 + " ");
            }
            System.out.println("");
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < 4; j++) {
                                
                matriz2[i][0] = matriz[i][0] * 0.1;  
                matriz2[i][1] = matriz[i][1] * 0.15;
                matriz2[i][2] = matriz[i][2] * 0.25;
                matriz2[i][3] = matriz[i][3] * 0.5;

            }
        }
        
        System.out.println("");
        System.out.println("Cada nota representa un porcentaje que se sumará y, en caso de que el total sea mayor o igual a 7, el alumno será aprobado. Caso contrario, será reprobado.");
        System.out.println("- Primer trabajo práctico evaluativo 10%");
        System.out.println("- Segundo trabajo práctico evaluativo 15%");
        System.out.println("- Primer Integrador 25%");
        System.out.println("- Segundo Integrador 50%");
        System.out.println("");
        
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Alumno " + (i+1));
            for (int j = 0; j < 4; j++) {
                System.out.print(Math.round(matriz2[i][j]*100.0)/100.0 + " ");

            }
            System.out.println("");
        }
        
        Double total = 0.0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < 4; j++) {
                                
                 array[i] = matriz2[i][0] + matriz2[i][1] + matriz2[i][2] + matriz2[i][3];

            }
        }
        
        System.out.println("");
        System.out.println("Teniendo en cuenta la suma de cada nota, esta es la nota final de cada alumno:");
        System.out.println("");
        int apro = 0;
        int desapro = 0;
        
        for (int i = 0; i < array.length; i++) {
        
                                
                 if (array[i] >= 7.0) {
                     System.out.println("Nota final del alumno " + (i+1) + ": " + Math.round(array[i]*100.0)/100.0 + " APROBADO");
                     apro++;
                 } else {
                     System.out.println("Nota final del alumno " + (i+1) + ": " + Math.round(array[i]*100.0)/100.0 + " DESAPROBADO");
                     desapro++;
                 }


        }
        
        System.out.println("");
        System.out.println("El total de aprobados es de: " + apro);
        System.out.println("El total de desaprobados es de: " + desapro);
    
    }
}