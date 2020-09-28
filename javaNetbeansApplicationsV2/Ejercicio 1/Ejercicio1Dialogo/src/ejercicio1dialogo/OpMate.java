/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1dialogo;

//Clase
import javax.swing.JOptionPane;

//Clase
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
    String operaciones[] = {"Suma", "Resta", "Multiplicacion", "Division", "Potenciacion"};
    String divisiones[] = {"Numero 1 / Numero 2", "Numero 2 / Numero 1"};
    String restas[] = {"Numero 1 - Numero 2", "Numero 2 - Numero 1"};


//Constructor
    public OpMate() {

    }

    //Setters y Getters
    public void getNumero() {
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
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
        JOptionPane.showMessageDialog(null, "El resultado obtenido es: " + this.resultado);
    }

    public void getOperacion() {
        operacion = JOptionPane.showOptionDialog(null, "Elija la Operacion a Realizar", "OPERACIONES", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, operaciones, operaciones[0]);
        switch (operacion) {
            case 0:
                setSuma();
                setResultado();
                break;
            case 1:
                resta = JOptionPane.showOptionDialog(null, "Elija como quiere restar los numeros", "RESTA", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, restas, restas[0]);
                if (resta == 0) {
                    setResta();
                    setResultado();
                } else {
                    setRestaInversa();
                    setResultado();
                }
                break;
            case 2:
                setMultiplicacion();
                setResultado();
                break;
            case 3:

                division = JOptionPane.showOptionDialog(null, "Elija como quiere dividir los numeros", "DIVISION", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, divisiones, divisiones[0]);
                if (division == 0) {
                    setDivision();
                    setResultado();
                } else {
                    setDivisionInversa();
                    setResultado();
                }
                break;
            case 4:
                String numerosPotencias[] = {"Numero 1", "Numero 2"};
                potencia = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la potencia: "));
                numeroPote = JOptionPane.showOptionDialog(null, "Elija el numero a potenciar", "POTENCIA", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, numerosPotencias, numerosPotencias[0]);
                if (numeroPote == 0) {
                    setPotenciaUno();
                    setResultado();
                } else {
                    setPotenciaDos();
                    setResultado();
                }
        }
    }
}
