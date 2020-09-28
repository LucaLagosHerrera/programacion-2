/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg9;

import java.util.Scanner;

/**
 *
 * @author LUKA28
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num1, num2;
        String signo;
        System.out.println("EJERCICIO N°9 (CalculadoraPolacaInversaApp)");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        num1 = teclado.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        num2 = teclado.nextDouble();
        while (num1 == 0 && num2 == 0) {
            System.out.println("Los numeros ingresados no pueden ser ambos 0");
            System.out.println("Ingrese el primer numero: ");
            num1 = teclado.nextDouble();
            System.out.println("Ingrese el segundo numero: ");
            num2 = teclado.nextDouble();
        }
        System.out.println("Elija el tipo de operacion que quiera hacer (escriba el signo correspondiente): ");
        System.out.println("1) +");
        System.out.println("2) -");
        System.out.println("3) *");
        System.out.println("4) /");
        System.out.println("5) ^");
        System.out.println("6) %");
        signo = teclado.next();
        switch (signo) {
            case "+":
                double suma = num1 + num2;
                System.out.println("El resultado de la suma de " + num1 + " y " + num2 + " es: " + suma);
                break;
            case "-":
                double resta = num1 - num2;
                System.out.println("El resultado de la resta de " + num1 + " y " + num2 + " es: " + resta);
                break;
            case "*":
                double multi = num1 * num2;
                System.out.println("El resultado de la multiplicacion de " + num1 + " y " + num2 + " es: " + multi);
                break;
            case "/":
                while (num2 == 0) {
                    System.out.println("No se puede dividir ningun numero por 0");
                    System.out.println("Ingrese un segundo numero diferente a 0: ");
                    num2 = teclado.nextDouble();
                }
                double divi = num1 / num2;
                System.out.println("El resultado de la division de " + num1 + " y " + num2 + " es: " + divi);
                break;
            case "^":
                double prod = Math.pow(num1, num2);
                System.out.println("El resultado de " + num1 + " como base y " + num2 + " como exponente " + " es: " + prod);
                break;
            case "%":
                while (num2 == 0) {
                    System.out.println("No se puede obtener ningun resto si se hace una dvision por 0");
                    System.out.println("Ingrese un segundo numero diferente a 0: ");
                    num2 = teclado.nextDouble();
                }
                double resto = num1 % num2;
                System.out.println("El resto de la division de " + num1 + " y " + num2 + " es: " + resto);
                break;
        }
    }
}
