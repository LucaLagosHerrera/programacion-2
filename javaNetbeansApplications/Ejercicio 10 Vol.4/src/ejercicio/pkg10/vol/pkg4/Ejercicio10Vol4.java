/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg10.vol.pkg4;

import java.util.Scanner;

/**
 *
 * @author LUKA28
 */
public class Ejercicio10Vol4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, i, j, k, cant;
        Scanner teclado = new Scanner(System.in);
        System.out.println("EJERCICIO 10 VOL.4");
        System.out.println("Ingrese la cantidad de numeros a ingresar (minimo 4): ");
        cant = teclado.nextInt();
        while (cant < 4) {
            System.out.println("No puede ingresar una cantidad menor a 4 numeros");
            System.out.println("Ingrese la cantidad de numeros a ingresar (minimo 4): ");
            cant = teclado.nextInt();
        }
        int[] lista = new int[cant];
        for (i = 0; i < cant; i++) {
            System.out.println("Ingrese un numero: ");
            lista[i] = teclado.nextInt();
            System.out.println(lista[i]);
        }
        System.out.println("La vieja lista contiene los siguientes numeros: ");
        System.out.println("VIEJA LISTA:");
        for (j = 0; j < cant; j++) {
            System.out.println("Numero: " + lista[j]);
        }
        num1 = lista[1];
        num2 = lista[3];
        lista[1] = num2;
        lista[3] = num1;
        System.out.println("La nueva lista contiene los siguientes numeros: ");
        System.out.println("NUEVA LISTA:");
        for (j = 0; j < cant; j++) {
            System.out.println("Numero: " + lista[j]);
        }
    }
}
