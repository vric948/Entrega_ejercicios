package Dia4;

import java.util.Scanner;

public class Ejercicio4_1 {
    double numero1;
    double numero2;
    double suma;
    double resta;
    double multiplicacion;
    double division;

    public void obtenerDatos() {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        numero1 = input.nextDouble();

        System.out.println("Ingrese otro numero: ");
        numero2 = input.nextDouble();
    }
    public void resultadoOperaciones() {
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multiplicacion = numero1 * numero2;
        division = numero1 / numero2;
    }
    public void imprimirResultados() {
        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicación es: " + multiplicacion);
        System.out.println("El resultado de la división es: " + division);
    }
    public static void main(String[] args) {
        Ejercicio4_1 operaciones1 = new Ejercicio4_1();
        operaciones1.obtenerDatos();
        operaciones1.resultadoOperaciones();
        operaciones1.imprimirResultados();

        Ejercicio4_1 operaciones2 = new Ejercicio4_1();
        operaciones2.obtenerDatos();
        operaciones2.resultadoOperaciones();
        operaciones2.imprimirResultados();
    }
}