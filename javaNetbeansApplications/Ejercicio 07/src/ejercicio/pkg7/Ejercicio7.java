/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg7;


/**
 *
 * @author LUKA28
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double cuad, cubo, i;
        System.out.println("EJERCICIO N°7");
        for(i=1;i<=10;i++){
            cuad = Math.pow(i, 2);
            cubo = Math.pow(i, 3);
            System.out.println("Numero: " + i + " - Cuadrado: " + cuad + " - Cubo: " + cubo);
        }
    } 
}
