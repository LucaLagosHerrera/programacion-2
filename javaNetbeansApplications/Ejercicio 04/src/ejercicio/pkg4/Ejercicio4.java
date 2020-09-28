/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg4;

import java.util.Scanner;

/**
 *
 * @author LUKA28
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, conteo = 0, suma = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("EJERCICIO N°4");
        System.out.println("Ingrese un numero: ");
        num = teclado.nextInt();
        while (num >= 500) {
            System.out.println("El numero ingresado es invalido");
            System.out.println("Ingrese un numero: ");
            num = teclado.nextInt();
        }
        while (num <= 500) {
            System.out.println("Numero: " + num);
            suma = suma + num;
            conteo = conteo + 1;
            num = num + 8;
        }
        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("La cantidad de numeros es: " + conteo);
    }

}
