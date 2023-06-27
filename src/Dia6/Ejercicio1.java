package Dia6;

import java.util.Scanner;

public class Ejercicio1 {
    int numeroIngreado;

    public static void main(String []args) {
        Ejercicio1 numeroValidado1 = new Ejercicio1();

        numeroValidado1.ingresarNumero();
        numeroValidado1.validarNumero();
    }
    public void ingresarNumero () {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el numero");
        numeroIngreado = input.nextInt();
    }
    public void validarNumero () {
        if (numeroIngreado < 0) {
            System.out.println("El numero ingresado es negativo");
        } else if (numeroIngreado > 0) {
            System.out.println("El numero ingresado es positivo");
        } else {
            System.out.println("El numero ingresado es 0");
        }
    }
}