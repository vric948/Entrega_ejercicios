package Dia9;

import java.util.Scanner;

public class Ejercicio9_2 {
    public static void main(String[] args) {
        Ejercicio9_2_1 menu1 = new Ejercicio9_2_1();
        menu1.inicioMenuComida();
        menu1.opcionesMenuComida();
        menu1.ingresarNumero();
        menu1.switchesSeleccionMenu();
        menu1.imprimirSelecccion();
        menu1.mensajeDespedida();
    }
}

class Ejercicio9_2_1 {
    String opcionMenu;
    int seleccionMenu;

    public void inicioMenuComida() {
        System.out.println("\n¡Bienvenido!\n\nTenemos 5 opciones disponibles en el menu. \nPor favor, a continuacion, seleccione la que desea: ");
    }
    public void opcionesMenuComida() {
        System.out.println("\nOpcion 1: Pizza\nOpcion 2: Carne Asada\nOpcion 3: Quesadillas\nOpcion 4: Lasagna\nOpcion 5: Ramen");
    }
    public void ingresarNumero() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nIngrese el numero la comida que desea: ");
        seleccionMenu = input.nextInt();
    }
    public void switchesSeleccionMenu() {
        switch (seleccionMenu) {
            case 1:
                opcionMenu = "Pizza";
                break;
            case 2:
                opcionMenu = "Carne Asada";
                break;
            case 3:
                opcionMenu = "Quesadillas";
                break;
            case 4:
                opcionMenu = "Lasagna";
                break;
            case 5:
                opcionMenu = "Ramen";
                break;
            default:
                opcionMenu = "\nError: Ha ingresado una opcion invalida.\n";
        }
    }
    public void imprimirSelecccion() {
        System.out.println("\nUsted ha ordenado: " + opcionMenu);
    }
    public void mensajeDespedida() {
        System.out.println("\n¡Gracias!, vuelva pronto.");
    }
}
