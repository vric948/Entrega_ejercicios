package Dia4;

import java.util.Scanner;

public class Ejercicio4_3 {
    private int numValores;
    private double todosValores;
    public void obtenerDatos () {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el numero de valores que quiere promediar");
        this.numValores = input.nextInt();
    }
    public void creacionBucle () {
        Scanner input2 = new Scanner(System.in);
        System.out.println("Ingrese los valores a promediar");
        for (int controlBucle = 0; controlBucle < this.numValores; controlBucle++) {
            double valores = input2.nextDouble();
            this.todosValores = this.todosValores + valores;
        }
    }
    public void promedio () {
        double resultado = this.todosValores / this.numValores;

        System.out.println("El promedio es: " + resultado);
    }
    public static void main(String []args) {
        Ejercicio4_3 promedio1 = new Ejercicio4_3();
        promedio1.obtenerDatos();
        promedio1.creacionBucle();
        promedio1.promedio();

        Ejercicio4_3 promedio2 = new Ejercicio4_3();
        promedio2.obtenerDatos();
        promedio2.creacionBucle();
        promedio2.promedio();
    }
}