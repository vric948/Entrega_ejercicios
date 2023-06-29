package Dia8;

import java.util.Scanner;

public class Ejercicio8_1 {
    public static void main(String[] args) {
        Ejecicio8_1_1 bucleNumero = new Ejecicio8_1_1();
        bucleNumero.bucleDoWhile();
    }
}

class Ejecicio8_1_1 {
    int numero;

    public void bucleDoWhile() {
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("ingrese un dato");
            numero = input.nextInt();
        }while (numero > -5);
    }
}
