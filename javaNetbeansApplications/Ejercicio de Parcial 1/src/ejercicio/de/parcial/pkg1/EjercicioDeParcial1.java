/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.de.parcial.pkg1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LUKA28
 */
public class EjercicioDeParcial1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        int opcion = 0;
        System.out.println("EJERCICIO DE PARCIAL N°1");
        while (opcion != 3) {
            System.out.println("Elija una opcion: ");
            System.out.println("1) Agregar un numero ");
            System.out.println("2) Eliminar un numero ");
            System.out.println("3) Finalizar");
            opcion = teclado.nextInt();
            while (opcion < 1 || opcion > 3) {
                System.out.println("Opcion Invalida");
                System.out.println("Elija una opcion: ");
                System.out.println("1) Agregar un numero ");
                System.out.println("2) Eliminar un numero ");
                System.out.println("3) Finalizar");
                opcion = teclado.nextInt();
            }
            switch (opcion) {
                case 1:
                    agregarNumero(lista);
                    break;
                case 2:
                    eliminarNumero(lista);
                    break;
            }
        }

        System.out.println("Ha finalizado las modificaciones de su lista, por lo que quedo asi: ");
        System.out.println(lista);
    }

    public static void agregarNumero(ArrayList<Integer> lista) {
        int num;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        num = teclado.nextInt();
        lista.add(num);
        System.out.println("El numero se ha ingresado en la lista correctamente ");
        System.out.println(lista);
    }

    public static void eliminarNumero(ArrayList<Integer> lista) {
        int num, posicion;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero a eliminar de la lista: ");
        System.out.println(lista);
        num = teclado.nextInt();
        posicion = lista.indexOf(num);
        if (lista.contains(num)) {
            lista.remove(posicion);
            System.out.println("El numero se ha eliminado correctamente ");
            System.out.println(lista);
        } else {
            System.out.println("El numero ingresado no se encuentra en la lista ");
        }
    }
}
