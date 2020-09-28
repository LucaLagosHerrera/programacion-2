/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg6;

/**
 *
 * @author LUKA28
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, conteo = 0;
        System.out.println("EJERCICIO N°6");
        for (num = 1; num <= 100; num++) {
            if (num % 2 == 0 && num % 3 == 0) {
                conteo = conteo + 1;
                System.out.println("Numero: " + num);
            }
        }
        System.out.println("La cantidad de numeros multiplos de 2 y 3 es: " + conteo);
    }

}
