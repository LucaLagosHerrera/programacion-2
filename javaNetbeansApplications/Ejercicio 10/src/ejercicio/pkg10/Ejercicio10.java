/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LUKA28
 */
public class Ejercicio10 {

    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        introValor(listaNumeros);
        mostrarListaVieja(listaNumeros);
        interPosicion(listaNumeros);
        mostrarListaNueva(listaNumeros);
    }

    public static void introValor(ArrayList<Integer> listaNumeros) {
        Integer num, i, cant;
        System.out.println("EJERCICIO N°10");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indique la cantidad de numeros a ingresar (minimo 4): ");
        cant = teclado.nextInt();
        while (cant < 4) {
            System.out.println("La condicion principal es ingresar minimo 4 numeros enteros");
            System.out.println("Indique la cantidad de numeros a ingresar (minimo 4): ");
            cant = teclado.nextInt();
        }
        for (i = 1; i <= cant; i++) {
            System.out.println("Ingrese un numero: ");
            num = teclado.nextInt();
            listaNumeros.add(num);
        }
    }

    public static void mostrarListaVieja(ArrayList<Integer> listaNumeros) {
        System.out.println("La vieja lista contiene los siguientes numeros: ");
        System.out.println("VIEJA LISTA:");
        System.out.println(listaNumeros);
    }

    public static void interPosicion(ArrayList<Integer> listaNumeros) {
        Integer number;
        number = listaNumeros.get(1);
        listaNumeros.set(1, listaNumeros.get(3));
        listaNumeros.set(3, number);
    }

    public static void mostrarListaNueva(ArrayList<Integer> listaNumeros) {
        System.out.println("La nueva lista contiene los siguientes numeros: ");
        System.out.println("NUEVA LISTA:");
        System.out.println(listaNumeros);
        
    }
}
