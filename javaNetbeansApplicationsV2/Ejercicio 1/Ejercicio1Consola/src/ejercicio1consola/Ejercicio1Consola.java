/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1consola;

public class Ejercicio1Consola {

    OpMate op;
    
    public Ejercicio1Consola(){
        op = new OpMate();
        op.getNumero();
        op.getOperacion();
    }
    public static void main(String[] args) {
        Ejercicio1Consola e = new Ejercicio1Consola();
    }
}
