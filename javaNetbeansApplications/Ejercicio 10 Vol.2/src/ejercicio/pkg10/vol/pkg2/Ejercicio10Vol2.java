/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg10.vol.pkg2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LUKA28
 */
public class Ejercicio10Vol2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, cant, i, suma = 0, n1, n2;
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        System.out.println("EJERCICIO N°10 VOL.2");
        System.out.println("Ingrese la cantidad de numeros a ingresar (minimo 4): ");
        cant = teclado.nextInt();
        while (cant < 4) {
            System.out.println("No puede ingresar una cantidad menor a 4");
            System.out.println("Ingrese la cantidad de numeros a ingresar (minimo 4): ");
            cant = teclado.nextInt();
        }
        for (i = 1; i <= cant; i++) {
            System.out.println("Ingrese un numero: ");
            num = teclado.nextInt();
            lista.add(num);
        }
        
        System.out.println("La vieja lista contiene los siguientes numeros: ");
        System.out.println("VIEJA LISTA:");
        System.out.println(lista);
        
        Integer number;
        number = lista.get(1);
        lista.set(1, lista.get(3));
        lista.set(3, number);
        
        System.out.println("La nueva lista contiene los siguientes numeros: ");
        System.out.println("NUEVA LISTA:");
        System.out.println(lista);
    }

}
