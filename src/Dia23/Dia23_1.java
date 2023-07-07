package Dia23;
import java.util.ArrayList;
import java.util.List;
public class Dia23_1 {
    public static void main(String[] args) {
        List<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("Victor", 31));
        listaPersonas.add(new Persona("Ramon", 57));
        listaPersonas.add(new Persona("Karen", 27));
        listaPersonas.add(new Persona("Enrique", 22));
        listaPersonas.add(new Persona("Magdalena", 55));

        List<Persona> personasMayoresDe30 = Filtro.filtrar(listaPersonas, p -> {
            if (p.getEdad() > 30) {
                return p;
            }
            return null;
        });

        System.out.println("Las personas mayores de 30 años en la lista son:");
        for (Persona persona : personasMayoresDe30) {
            System.out.println(persona.getNombre() + " - " + persona.getEdad());
        }
    }
}
class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}
class Filtro {
    public static <A, B> List<B> filtrar(List<A> lista, FiltroEs<A, B> filtro) {
        List<B> edadesFiltradas = new ArrayList<>();
        for (A edad : lista) {
            B resultado = filtro.FiltroEs(edad);
            if (resultado != null) {
                edadesFiltradas.add(resultado);
            }
        }
        return edadesFiltradas;
    }
}
interface FiltroEs<A, B> {
    B FiltroEs(A edad);
}

