/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author LUKA28
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, suma;
        System.out.println("EJERCICIO N°1");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        num1 = teclado.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = teclado.nextInt();
        suma = num1 + num2;
        System.out.println("El resultado de la suma de " + num1 + " y " + num2 + " es: " + suma);
    }

}
