package Dia23;

import java.util.Arrays;
import java.util.List;
public class Dia23_2 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(123, 223, 354, 652, 342, 918, 287,192, 102);

        calcularPromedios promedios = new calcularPromedios();
        double promedio = promedios.calcularPromedio(numeros);

        System.out.println("El promedio de los numeros es: " + promedio);
    }
}

class calcularPromedios {
    public double calcularPromedio(List<? extends Number> lista) {
        double suma = 0;
        for (Number numero : lista) {
            suma += numero.doubleValue();
        }
        return suma / lista.size();
    }
}