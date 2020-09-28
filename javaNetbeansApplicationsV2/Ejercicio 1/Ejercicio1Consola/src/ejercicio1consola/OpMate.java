/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1consola;

//Clase
import java.util.Scanner;

public class OpMate {

    //Atributos
    double numero1;
    double numero2;
    double potencia;
    double resultado;
    int operacion;
    double division;
    double resta;
    double numeroPote;
    Scanner teclado;

//Constructor
    public OpMate() {
        teclado = new Scanner(System.in);
    }

    //Setters y Getters
    public void getNumero() {
        System.out.println("Ingrese el primer numero: ");
        numero1 = teclado.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        numero2 = teclado.nextInt();
    }

    public void setSuma() {
        this.resultado = numero1 + numero2;
    }

    public void setResta() {
        this.resultado = numero1 - numero2;
    }

    public void setRestaInversa() {
        this.resultado = numero2 - numero1;
    }

    public void setMultiplicacion() {
        this.resultado = numero1 * numero2;
    }

    public void setDivision() {
        this.resultado = numero1 / numero2;
    }

    public void setDivisionInversa() {
        this.resultado = numero2 / numero1;
    }

    public void setPotenciaUno() {
        this.resultado = Math.pow(numero1, potencia);
    }

    public void setPotenciaDos() {
        this.resultado = Math.pow(numero2, potencia);
    }

    public void setResultado() {
        System.out.println("El resultado de la operacion elegida es: " + this.resultado);
    }

    public void getOperacion() {
        System.out.println("Elija la operacion a realizar: ");
        System.out.println("1) Suma");
        System.out.println("2) Resta");
        System.out.println("3) Multiplicacion");
        System.out.println("4) Division");
        System.out.println("5) Potenciacion");
        operacion = teclado.nextInt();
        while (operacion < 1 || operacion > 5) {
            System.out.println("OPCION INVALIDA");
            System.out.println("Elija la operacion a realizar: ");
            System.out.println("1) Suma");
            System.out.println("2) Resta");
            System.out.println("3) Multiplicacion");
            System.out.println("4) Division");
            System.out.println("5) Potenciacion");
            operacion = teclado.nextInt();
        }
        switch (operacion) {
            case 1:
                setSuma();
                setResultado();
                break;
            case 2:
                System.out.println("Elija como quiere restar los numeros: ");
                System.out.println("1) " + numero1 + "-" + numero2);
                System.out.println("2) " + numero2 + "-" + numero1);
                resta = teclado.nextInt();
                while (resta < 1 || resta > 2) {
                    System.out.println("OPCION INVALIDA");
                    System.out.println("Elija como quiere dividir los numeros: ");
                    System.out.println("1) " + numero1 + "-" + numero2);
                    System.out.println("2) " + numero2 + "-" + numero1);
                    resta = teclado.nextInt();
                }
                if (resta == 1) {
                    setResta();
                    setResultado();
                } else {
                    setRestaInversa();
                    setResultado();
                }
                break;
            case 3:
                setMultiplicacion();
                setResultado();
                break;
            case 4:
                System.out.println("Elija como quiere dividir los numeros: ");
                System.out.println("1) " + numero1 + "/" + numero2);
                System.out.println("2) " + numero2 + "/" + numero1);
                division = teclado.nextInt();
                while (division < 1 || division > 2) {
                    System.out.println("OPCION INVALIDA");
                    System.out.println("Elija como quiere dividir los numeros: ");
                    System.out.println("1) " + numero1 + "/" + numero2);
                    System.out.println("2) " + numero2 + "/" + numero1);
                    division = teclado.nextInt();
                }
                if (division == 1) {
                    setDivision();
                    setResultado();
                } else {
                    setDivisionInversa();
                    setResultado();
                }
                break;
            case 5:
                System.out.println("Ingrese la potencia: ");
                potencia = teclado.nextInt();
                System.out.println("Eija el numero a potenciar: ");
                System.out.println("1) " + numero1);
                System.out.println("2) " + numero2);
                numeroPote = teclado.nextInt();
                while (numeroPote < 1 || numeroPote > 2) {
                    System.out.println("OPCION INVALIDA");
                    System.out.println("Eija el numero a potenciar: ");
                    System.out.println("1) " + numero1);
                    System.out.println("2) " + numero2);
                    numeroPote = teclado.nextInt();
                }
                if (numeroPote == 1) {
                    setPotenciaUno();
                    setResultado();
                } else if (numeroPote == 2) {
                    setPotenciaDos();
                    setResultado();
                }
        }
    }
}
