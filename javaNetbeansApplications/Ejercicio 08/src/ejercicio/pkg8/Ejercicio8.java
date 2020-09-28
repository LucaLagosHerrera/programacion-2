/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg8;

import java.util.Scanner;

/**
 *
 * @author LUKA28
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        int edad;
        double salario, porcentaje, sumaPorc;
        System.out.println("EJERCICIO N°8");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        nombre = teclado.next();
        System.out.println("Ingrese su edad: ");
        edad = teclado.nextInt();
        while (edad < 13) {
            System.out.println("La edad ingresada es invalida");
            System.out.println("Ingrese su edad: ");
            edad = teclado.nextInt();
        }
        if (edad >= 16 && edad <= 18) {
            System.out.println("Usted no tiene edad para trabajar");
        }
        if (edad >= 19 && edad <= 50) {
            System.out.println("Ingrese su salario: ");
            salario = teclado.nextDouble();
            while (salario <= 0) {
                System.out.println("Su salario ingresado no puede ser ni negativo ni 0");
                System.out.println("Ingrese su salario: ");
                salario = teclado.nextDouble();
            }
            porcentaje = (5 * salario) / 100;
            sumaPorc = salario + porcentaje;
            System.out.println(nombre + ", su salario correspondiente es: " + sumaPorc);
        }
        if (edad >= 51 && edad <= 60) {
            System.out.println("Ingrese su salario: ");
            salario = teclado.nextDouble();
            while (salario <= 0) {
                System.out.println("Su salario ingresado no puede ser ni negativo ni 0");
                System.out.println("Ingrese su salario: ");
                salario = teclado.nextDouble();
            }
            porcentaje = (10 * salario) / 100;
            sumaPorc = salario + porcentaje;
            System.out.println(nombre + ", su salario correspondiente es: " + sumaPorc);
        }
        if (edad > 60) {
            System.out.println("Ingrese su salario: ");
            salario = teclado.nextDouble();
            while (salario <= 0) {
                System.out.println("Su salario ingresado no puede ser ni negativo ni 0");
                System.out.println("Ingrese su salario: ");
                salario = teclado.nextDouble();
            }
            porcentaje = (15 * salario) / 100;
            sumaPorc = salario + porcentaje;
            System.out.println(nombre + ", su salario correspondiente es: " + sumaPorc);
        }
    }
}
