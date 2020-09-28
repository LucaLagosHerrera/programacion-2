/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg11.vol.pkg3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author LUKA28
 */
public class Ejercicio11Vol3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        ArrayList<Integer> copiaLista = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        int opcion = 0, eleccion, num, copiaNum, posicion, copiaPosicion, numNuevo, copiaNumNuevo, cant, i;
        while (opcion != 11) {
            System.out.println("EJERCICIO N°11");
            System.out.println("--Lista de Numeros--");
            System.out.println("Elija una de las opciones: ");
            System.out.println("1) Agregar un numero ");
            System.out.println("2) Agregar un numero por cantidad");
            System.out.println("3) Buscar un numero ");
            System.out.println("4) Modificar un numero ");
            System.out.println("5) Eliminar un numero ");
            System.out.println("6) Eliminar todos los numeros");
            System.out.println("7) Mostrar la lista actual");
            System.out.println("8) Mostrar lista de manera ascendente");
            System.out.println("9) Mostrar lista de manera descendiente");
            System.out.println("10) Regresar la lista al orden original");
            System.out.println("11) Finalizar ");
            opcion = teclado.nextInt();
            while (opcion < 1 || opcion > 11) {
                System.out.println("La opcion ingresada es invalida");
                System.out.println("Elija una de las opciones: ");
                System.out.println("1) Agregar un numero ");
                System.out.println("2) Agregar numeros por cantidad");
                System.out.println("3) Buscar un numero ");
                System.out.println("4) Modificar un numero ");
                System.out.println("5) Eliminar un numero ");
                System.out.println("6) Eliminar todos los numeros");
                System.out.println("7) Mostrar la lista actual");
                System.out.println("8) Mostrar lista de manera ascendente");
                System.out.println("9) Mostrar lista de manera descendiente");
                System.out.println("10) Regresar la lista al orden original");
                System.out.println("11) Finalizar ");
                opcion = teclado.nextInt();
            }
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese un numero: ");
                    num = teclado.nextInt();
                    copiaNum = num;
                    lista.add(num);
                    copiaLista.add(copiaNum);
                    System.out.println("El numero ingresado (" + num + ") se ha agregado correctamente ");
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad de numeros a ingresar (minimo 2): ");
                    cant = teclado.nextInt();
                    while (cant < 2) {
                        System.out.println("El numero ingresado es invalido, ya que solo se pueden ingresar minimo 2 numeros");
                        System.out.println("Ingrese la cantidad de numeros a ingresar (minimo 2): ");
                        cant = teclado.nextInt();
                    }
                    for (i = 1; i <= cant; i++) {
                        System.out.println("Ingrese un numero: ");
                        num = teclado.nextInt();
                        copiaNum = num;
                        lista.add(num);
                        copiaLista.add(copiaNum);
                    }
                    System.out.println("Los numeros ingresados han sido agregados correctamente");
                    break;
                case 3:
                    if (!lista.isEmpty()) {
                        System.out.println("Ingrese el numero a buscar: ");
                        num = teclado.nextInt();
                        posicion = lista.indexOf(num);
                        if (lista.contains(num)) {
                            System.out.println("El numero ingresado (" + num + ") se encuentra en la posicion N°" + (posicion + 1));
                        } else {
                            System.out.println("El numero ingresado no se encuentra en la lista");
                        }
                    } else {
                        System.out.println("No se podra buscar ningun numero porque la lista esta vacia");
                    }
                    break;
                case 4:
                    if (!lista.isEmpty()) {
                        System.out.println("Ingrese el numero que quiere modificar: ");
                        num = teclado.nextInt();
                        copiaNum = num;
                        posicion = lista.indexOf(num);
                        copiaPosicion = copiaLista.indexOf(copiaNum);
                        if (lista.contains(num) && copiaLista.contains(copiaNum)) {
                            System.out.println("Ingrese el nuevo numero: ");
                            numNuevo = teclado.nextInt();
                            copiaNumNuevo = numNuevo;
                            lista.set(posicion, numNuevo);
                            copiaLista.set(copiaPosicion, copiaNumNuevo);
                            System.out.println("El numero " + num + " de la posicion N°" + (posicion + 1) + " se ha modificado correctamente ");
                            break;
                        } else {
                            System.out.println("El numero ingresado no se encuentra en la lista");
                        }
                    } else {
                        System.out.println("No se podra modificar ningun numero porque la lista esta vacia");
                    }
                    break;
                case 5:
                    if (!lista.isEmpty()) {
                        System.out.println("Ingrese el numero a eliminar: ");
                        num = teclado.nextInt();
                        copiaNum = num;
                        posicion = lista.indexOf(num);
                        copiaPosicion = copiaLista.indexOf(copiaNum);
                        if (lista.contains(num) && copiaLista.contains(copiaNum)) {
                            lista.remove(posicion);
                            copiaLista.remove(copiaPosicion);
                            System.out.println("El numero ingresado (" + num + ") ha sido eliminado correctamente");
                        } else {
                            System.out.println("El numero ingresado no se encuentra en la lista");
                        }
                    } else {
                        System.out.println("No se podra borrar ningun numero porque la lista esta vacia");
                    }
                    break;
                case 6:
                    if (!lista.isEmpty() && !copiaLista.isEmpty()) {
                        lista.clear();
                        copiaLista.clear();
                        System.out.println("Los numeros de la lista han sido eliminados correctamente");
                    } else {
                        System.out.println("No se han eliminado ningun numero ya que la lista esta vacia");
                    }
                    break;
                case 7:
                    if (!lista.isEmpty()) {
                        System.out.println("La lista esta conformada por los siguientes numeros: ");
                        System.out.println(lista);
                    } else {
                        System.out.println("La lista esta vacia");
                    }
                    break;
                case 8:
                    if (!lista.isEmpty()) {
                        Collections.sort(lista);
                        System.out.println("La lista ordenada de forma ascendiente se ve de esta manera: ");
                        System.out.println(lista);
                    } else {
                        System.out.println("La lista esta vacia");
                    }
                    break;
                case 9:
                    if (!lista.isEmpty()) {
                        Comparator<Integer> comparador = Collections.reverseOrder();
                        Collections.sort(lista, comparador);
                        System.out.println("La lista ordenada de forma descendiente se ve de esta manera: ");
                        System.out.println(lista);
                    } else {
                        System.out.println("La lista esta vacia");
                    }
                    break;
                case 10:
                    if (!copiaLista.isEmpty()) {
                        System.out.println("Se ha devuelto la lista actual en su orden original: ");
                        System.out.println(copiaLista);
                    } else {
                        System.out.println("La lista esta vacia");
                    }
            }
        }
        if (!lista.isEmpty()) {
            System.out.println("Elija en que orden quiere ver su lista: ");
            System.out.println("1) Orden Original ");
            System.out.println("2) Orden Ascendente ");
            System.out.println("3) Orden Descendiente ");
            eleccion = teclado.nextInt();
            while (eleccion < 1 || eleccion > 3) {
                System.out.println("La eleccion ingresada es invalida");
                System.out.println("Elija en que orden quiere ver su lista: ");
                System.out.println("1) Orden Original ");
                System.out.println("2) Orden Ascendente ");
                System.out.println("3) Orden Descendiente ");
                eleccion = teclado.nextInt();
            }
            switch (eleccion) {
                case 1:
                    System.out.println("Ha finalizado, por lo que su lista se ve asi: ");
                    System.out.println(copiaLista);
                    break;
                case 2:
                    Collections.sort(copiaLista);
                    System.out.println("Ha finalizado, por lo que su lista se ve asi: ");
                    System.out.println(copiaLista);
                    break;
                case 3:
                    Comparator<Integer> comparador = Collections.reverseOrder();
                    Collections.sort(copiaLista, comparador);
                    System.out.println("Ha finalizado, por lo que su lista se ve asi: ");
                    System.out.println(copiaLista);
            }
        } else {
            System.out.println("Ha finalizado, pero no hay lista que mostrar ya que esta vacia");
        }
    }
}
