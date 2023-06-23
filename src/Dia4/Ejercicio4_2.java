package Dia4;

import java.util.Scanner;

public class Ejercicio4_2 {
    double radio;
    double numeroPi = Math.PI;

    public void obtenerDatos() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo en cm");
        radio = input.nextDouble();
    }
    public double calculoArea() {
        double areaCirculo = numeroPi * (radio * radio);
        return areaCirculo;
    }
    public void imprimirDatos() {
        System.out.println("El area del circulo es = " + calculoArea() + " cm^2");
    }
    public static void main(String []args) {
        Ejercicio4_2 circulo1 = new Ejercicio4_2();
        circulo1.obtenerDatos();
        circulo1.imprimirDatos();

        Ejercicio4_2 circulo2 = new Ejercicio4_2();
        circulo2.obtenerDatos();
        circulo2.imprimirDatos();
    }
}
