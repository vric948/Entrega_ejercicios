package Dia22;
import java.util.Scanner;
import java.util.Arrays;
public class Ejercicio22_2 {
    public static void main(String[] args) {
        Ingresarumeros numeros = new Ingresarumeros();
        SortearNumeros ordenador = new SortearNumeros();
        ImprimirListaNumeros impresor = new ImprimirListaNumeros();
        numeros.ingresarNumeros();
        ordenador.sortearNumeros(numeros.getNumeros());
        impresor.imprimirListaNumeros(numeros.getNumeros());
    }
}
class Ingresarumeros {
    private int[] numeros;

    public void ingresarNumeros() {
        numeros = new int[5];
        Scanner input = new Scanner(System.in);

        System.out.println("A continuacion ingrese 5 numeros");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = input.nextInt();
        }
    }
    public int[] getNumeros() {
        return numeros;
    }
}
class SortearNumeros {
    public void sortearNumeros(int[] numeros) {
        Arrays.sort(numeros);
    }
}
class ImprimirListaNumeros {
    public void imprimirListaNumeros(int[] numeros) {
        System.out.println("Los numeros ordenados en orden son:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}