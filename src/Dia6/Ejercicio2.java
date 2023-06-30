package Dia6;

import java.util.Scanner;

public class Ejercicio2 {
    int valorIngresado;
    public static void main(String []args) {
        Ejercicio2 valor1 = new Ejercicio2();
        valor1.ingresarValor();
        valor1.validarParImpar();
        valor1.validarPrimo();
    }
    public void ingresarValor() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        valorIngresado = input.nextInt();
    }
    public void validarParImpar() {
        if ((valorIngresado % 2) == 0) {
            System.out.println("El valor es par");
        }else {
            System.out.println("El valor es impar");
        }
    }
    public void validarPrimo() {
        if (valorIngresado <= 1) {
            System.out.println("El valor no es un numero primo");
        } else if (valorIngresado == 2 || valorIngresado == 3) {
            System.out.println("El valor es un numero primo");
        } else if (valorIngresado % 2 == 0) {
            System.out.println("El no valor es un numero primo");
        }
    }
}
