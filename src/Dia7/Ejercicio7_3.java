package Dia7;

public class Ejercicio7_3 {
    static int sumaNumerosNaturales;
    public static void main(String[] args) {
        for (int numerosNaturales = 0; numerosNaturales <= 100; numerosNaturales ++) {
            sumaNumerosNaturales += numerosNaturales;
        }
        System.out.println("La suma de los primeros cien numeros naturales da como resultado:\n" + sumaNumerosNaturales);
    }
}