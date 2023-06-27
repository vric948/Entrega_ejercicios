package Dia6;

import java.util.Scanner;

public class Ejercicio3 {
    private int year;

    public static void main(String[] args) {
        Ejercicio3 year1 = new Ejercicio3();
        year1.ingresarA();
        year1.calcularA();
    }

    public void ingresarA() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese año:");
        year = input.nextInt();
    }

    public void calcularA() {
        if (year % 4 == 0) {
            if (year % 100 == 0 && year % 400 != 0)
                System.out.println("El año no es bisiesto");
            else
                System.out.println("El año es bisiesto");
        } else {
            System.out.println("El año no es bisiesto");
        }
    }
}