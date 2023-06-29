package Dia8;
import java.util.Scanner;

public class Ejercicio8_3 {
    public static void main(String[] args) {
        Ejercicio8_3_1 factor1 = new Ejercicio8_3_1();
        factor1.ingresarNumero();
        factor1.calcularFactor();
        factor1.imprimirResultado();
    }
}
class Ejercicio8_3_1 {
    public int numero;
    public int resultado = 1;
    public int counter = 1;
    public void ingresarNumero() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el numero del que quiere calcular el factor");
        numero = input.nextInt();
    }
    public void calcularFactor() {
        do {
            resultado *= counter;
            counter++;
        } while (counter <= numero);
    }
    public void imprimirResultado() {
        System.out.println("El factorial del numero " + numero + " da como resultado: \n" + resultado);
    }
}
