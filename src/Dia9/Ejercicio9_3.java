package Dia9;
import java.util.Scanner;

public class Ejercicio9_3 {
    public static void main(String[] args) {
        Ejercicio9_3_1 calculadora = new Ejercicio9_3_1();
        calculadora.inicioMenuCalculadora();
        calculadora.seleccionDeOperacion();

        float numero1 = calculadora.getNumero1();
        float numero2 = calculadora.getNumero2();
        char signoOperacion = calculadora.getSignoOperacion();

        Ejercicio9_3_2 operaciones = new Ejercicio9_3_2();
        float resultado = operaciones.switchesCalculo(numero1, numero2, signoOperacion);
        calculadora.imprimirResultado(resultado);
    }
}
class Ejercicio9_3_1 {
    private float numero1;
    private float numero2;
    private char signoOperacion;

    public void inicioMenuCalculadora() {
        Scanner input = new Scanner(System.in);

        System.out.println("Bienvenido a la calculadora");
        System.out.println("Ingrese el primer número:");
        numero1 = input.nextFloat();

        System.out.println("Ingrese el segundo número:");
        numero2 = input.nextFloat();
    }
    public void seleccionDeOperacion() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la operación (+, -, *, /):");
        signoOperacion = input.next().charAt(0);
    }
    public void imprimirResultado(float resultado) {
        System.out.println("El resultado de la operación es: " + resultado);
    }
    public float getNumero1() {
        return numero1;
    }
    public float getNumero2() {
        return numero2;
    }
    public char getSignoOperacion() {
        return signoOperacion;
    }
}
class Ejercicio9_3_2 {
    public float switchesCalculo(float numero1, float numero2, char signoOperacion) {
        float resultado = 0.0f;

        switch (signoOperacion) {
            case '+':
                resultado = suma(numero1, numero2);
                break;
            case '-':
                resultado = resta(numero1, numero2);
                break;
            case '*':
                resultado = multiplicacion(numero1, numero2);
                break;
            case '/':
                resultado = division(numero1, numero2);
                break;
            default:
                System.out.println("Error: No se pudo hacer el cálculo");
        }

        return resultado;
    }
    public float suma(float numero1, float numero2) {
        return numero1 + numero2;
    }
    public float resta(float numero1, float numero2) {
        return numero1 - numero2;
    }
    public float multiplicacion(float numero1, float numero2) {
        return numero1 * numero2;
    }
    public float division(float numero1, float numero2) {
            return numero1 / numero2;
        }
    }