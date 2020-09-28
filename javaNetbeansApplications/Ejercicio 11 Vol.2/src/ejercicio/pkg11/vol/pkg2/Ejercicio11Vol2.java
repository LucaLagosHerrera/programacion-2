/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg11.vol.pkg2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LUKA28
 */
public class Ejercicio11Vol2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        int opcion;
        ingresarLista(lista);
        Scanner teclado = new Scanner(System.in);
        System.out.println("LISTA DE OPCIONES");
        System.out.println("Ingrese la opcion a llevar a cabo:  ");
        System.out.println("1) Agregar numero");
        System.out.println("2) Buscar numero");
        System.out.println("3) Modificar numero");
        System.out.println("4) Eliminar numero");
        opcion = teclado.nextInt();
        while (opcion > 4 || opcion < 1) {
            System.out.println("La opcion elegida no es valida (no existe)");
            System.out.println("Ingrese la opcion a llevar a cabo:  ");
            System.out.println("1) Agregar numero");
            System.out.println("2) Buscar numero");
            System.out.println("3) Modificar numero");
            System.out.println("4) Eliminar numero");
            opcion = teclado.nextInt();
        }
        switch (opcion) {
            case 1:
                agregarNumero(lista);
                break;
            case 2:
                buscarNumero(lista);
                break;
            case 3:
                modificarNumero(lista);
                break;
            case 4:
                eliminarNumero(lista);
                break;
        }
    }

    public static void ingresarLista(ArrayList<Integer> lista) {
        Scanner teclado = new Scanner(System.in);
        int cant, n, i;
        System.out.println("--Lista para Pruebas--");
        System.out.println("Ingrese la cantidad de numeros a ingresar en la lista (minimo 4): ");
        cant = teclado.nextInt();
        while (cant < 4) {
            System.out.println("La cantidad minima de numeros en la lista debe ser de 4 valores");
            System.out.println("Ingrese la cantidad de numeros a ingresar en la lista (minimo 4): ");
            cant = teclado.nextInt();
        }
        for (i = 1; i <= cant; i++) {
            System.out.println("Ingrese un numero: ");
            n = teclado.nextInt();
            lista.add(n);
        }
        System.out.println("La lista esta integrada por los siguientes numeros: ");
        System.out.println(lista);
    }

    public static void agregarNumero(ArrayList<Integer> lista) {
        Scanner teclado = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero: ");
        num = teclado.nextInt();
        lista.add(num);
        System.out.println("Con este numero ingresado, la lista quedo asi: ");
        System.out.println(lista);
    }

    public static void buscarNumero(ArrayList<Integer> lista) {
        Scanner teclado = new Scanner(System.in);
        int num, posicion;
        System.out.println("Ingrese el numero a buscar: ");
        num = teclado.nextInt();
        posicion = lista.indexOf(num);
        if (lista.contains(num)) {
            System.out.println("El numero ingresado se encuentra en la posicion N°" + (posicion + 1));
        } else {
            System.out.println("El numero ingresado no se encuentra en la lista");
        }
    }

    public static void modificarNumero(ArrayList<Integer> lista) {
        Scanner teclado = new Scanner(System.in);
        int num, posicion, numNuevo;
        System.out.println("Ingrese el numero a modificar en la lista: ");
        num = teclado.nextInt();
        posicion = lista.indexOf(num);
        if (lista.contains(num)) {
            System.out.println("Ingrese el nuevo numero: ");
            numNuevo = teclado.nextInt();
            lista.set(posicion, numNuevo);
            System.out.println("Con esta modificacion, la lista quedo asi: ");
            System.out.println(lista);
        } else {
            System.out.println("El numero ingresado no existe en la lista");
        }
    }

    public static void eliminarNumero(ArrayList<Integer> lista) {
        Scanner teclado = new Scanner(System.in);
        int num, posicion;
        System.out.println("Ingrese el numero a eliminar en la lista: ");
        num = teclado.nextInt();
        posicion = lista.indexOf(num);
        if (lista.contains(num)) {
            lista.remove(posicion);
            System.out.println("Con este numero eliminado, la lista quedo asi: ");
            System.out.println(lista);
        } else {
            System.out.println("El numero ingresado no existe en la lista");
        }
    }
}
