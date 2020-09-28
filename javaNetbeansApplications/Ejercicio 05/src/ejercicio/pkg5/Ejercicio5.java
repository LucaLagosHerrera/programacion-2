/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg5;

import java.util.Scanner;

/**
 *
 * @author LUKA28
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num, cuad, suma = 0;
        System.out.println("EJERCICIO N°5");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        num = teclado.nextInt();
        while (num >= 100) {
            System.out.println("El numero ingresado es invalido");
            System.out.println("Ingrese un numero: ");
            num = teclado.nextInt();
        }
        while (num < 100) {
            cuad = Math.pow(num, 2);
            System.out.println("Numero: " + num + " - Cuadrado: " + cuad);
            num = num + 4;
            suma = suma + cuad;
        }
        System.out.println("El resultado de la suma de los cuadrados es: " + suma);
    }

}
