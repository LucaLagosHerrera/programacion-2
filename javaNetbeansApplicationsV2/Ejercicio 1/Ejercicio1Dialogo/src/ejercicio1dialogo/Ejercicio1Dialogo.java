/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1dialogo;

/**
 *
 * @author LUKA28
 */
public class Ejercicio1Dialogo {

     OpMate op;
    
    public Ejercicio1Dialogo(){
        op = new OpMate();
        op.getNumero();
        op.getOperacion();
    }
    
    public static void main(String[] args) {
        Ejercicio1Dialogo e = new Ejercicio1Dialogo();
    }

}
