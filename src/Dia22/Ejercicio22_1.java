package Dia22;
import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio22_1 {
    public static void main(String[] args) {
        ingresarPalabras palabras = new ingresarPalabras();
        borrarPalabras borrar = new borrarPalabras();

        ArrayList<String> listaPalabras = palabras.ingresarPalabras();
        ArrayList<String> listaPalabrasSinRpeteidos = borrar.borrarPalabras(listaPalabras);

        palabras.imprimirPalabras(listaPalabrasSinRpeteidos);
    }
}

class ingresarPalabras {
    public ArrayList<String> ingresarPalabras() {
        Scanner input = new Scanner(System.in);
        ArrayList<String> listaPalabras = new ArrayList<>();


        System.out.print("Ingrese las palabras que desea: ");
        String entrada = input.nextLine();

        String[] palabras = entrada.split(" ");

        for (String palabra : palabras) {
            listaPalabras.add(palabra);
        }

        return listaPalabras;
    }

    public void imprimirPalabras(ArrayList<String> listaPalabras) {
        System.out.println("Aqui se muestra la lista de palabras sin palabras repetidas:");
        for (String palabra : listaPalabras) {
            System.out.println(palabra);
        }
    }
}
class borrarPalabras {
    public ArrayList<String> borrarPalabras(ArrayList<String> listaPalabras) {
        ArrayList<String> listaPalabrasSinRpeteidos = new ArrayList<>();

        for (String palabra : listaPalabras) {
            if (!listaPalabrasSinRpeteidos.contains(palabra)) {
                listaPalabrasSinRpeteidos.add(palabra);
            }
        }

        return listaPalabrasSinRpeteidos;
    }
}
