package Dia8;

import java.util.Scanner;

public class Ejercicio8_2 {
    public static void main(String[] args) {
        Ejercicio8_2_1 bucle1 = new Ejercicio8_2_1();
        bucle1.ingresarNumero();
        bucle1.separarDigitos();
        bucle1.imprimirSuma();
    }
}
class Ejercicio8_2_1 {
    public int numero;
    public int digitos = 0;

    public void ingresarNumero() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        numero = input.nextInt();
    }
    public void separarDigitos() {

        while (numero != 0) {
            int digito = numero % 10;
            digitos += digito;
            numero/= 10;
        }
    }
    public void imprimirSuma() {
        System.out.println("La suma de los digitos del numero introducido es: \n" + digitos);
    }
}