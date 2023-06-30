package Dia9;
import java.util.Scanner;

public class Ejercicio9_1 {
    public static void main(String[] args) {
        Ejercicio9_1_1 semana1 = new Ejercicio9_1_1();
        semana1.ingresarNumero();
        semana1.switchesSemana();
        semana1.imprimirDia();
    }
}
class Ejercicio9_1_1 {
    String dia;
    int numero;
    public void ingresarNumero() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero entero de entre 1 al 7");

        numero = input.nextInt();
    }
    public void switchesSemana() {
        switch (numero) {
            case 1:
                dia = "Lunes";
                break;
            case 2:
                dia = "Martes";
                break;
            case 3:
                dia = "Miercoles";
                break;
            case 4:
                dia = "Jueves";
                break;
            case 5:
                dia = "Viernes";
                break;
            case 6:
                dia = "Sabado";
                break;
            case 7:
                dia = "Domingo";
                break;
            default:
                dia = "\nError: Ha ingresado un numero invalido";
                break;
        }
    }
    public void imprimirDia() {
        System.out.println("El dia de la semana asignado a ese numero es:\n" + dia);
    }
}