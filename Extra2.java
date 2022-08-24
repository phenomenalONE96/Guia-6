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
public class Extra2 {

    /**
     * @param args the command line arguments
     * 
     * 2. Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una. Realizar las instrucciones necesarias para que: B tome el valor de C, C
       tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
     */
    public static void main(String[] args) {
        Integer a = 12;
        Integer b = 22;
        Integer c = 32;
        Integer d = 42;
        
        System.out.println("Vamos a intercambiar los valores de las variables, sabiendo que:");
        System.out.println("A = 12");
        System.out.println("B = 22");
        System.out.println("C = 32");
        System.out.println("D = 42");
        
        change(a, b, c, d);
    }
        public static void change(Integer a, Integer b, Integer c, Integer d) {
          
        Integer aux = c;
        b = c;
        aux = 0;
        aux = a;
        c = a;
        aux = 0;
        aux = d;
        a = d;
        aux = 0;
        aux = b;
        d = b;
        
        System.out.println("Los valores se han intercambiado. Ahora A vale D, B vale C, C vale A y D vale B.");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("C = " + c);
        System.out.println("D = " + d);
        
    }
}
    
