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
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
//fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
//Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
//de FDE, que no respete el formato se considera incorrecta. Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
//incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().

        Scanner leer = new Scanner(System.in);
               
        Boolean exit = false;
        Integer accumulator = 0, accumulator2 = 0; 
        String frase = "";
        
        System.out.println("Ingrese una frase de 5 letras, teniendo en cuenta que la primer letra deberá ser una 'x' y la última una 'o'. Cuando desee salir, ingrese '&&&&&'.");
        
        while(!"&&&&&".equals(frase)) {
        
        frase = leer.nextLine(); 
          
            for(int i = 0; i < frase.length(); i++) {
                if(frase.length() < 6 && frase.substring(frase.length()-1).equals("o") && frase.substring(0, 1).equals("x")) {
                System.out.println("Frase correcta");
                accumulator += 1;
                break;
               } else {
                        if(frase.equals("&&&&&")) {
                            System.out.println("Adiós!");
                            exit = true;
                            break;
                        }
                        System.out.println("Frase incorrecta");
                        accumulator2 += 1;
                        break;
                 }

            }
     
             
            }

        System.out.println("Las frases correctas fueron: " + accumulator + " y las frases incorrectas fueron: " + accumulator2);

    }
    
}
