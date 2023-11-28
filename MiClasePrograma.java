import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MiClasePrograma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear una colección para almacenar objetos de MiClase
        ArrayList<MiClase> miColeccion = new ArrayList<>();

        // Poblar la colección con objetos ingresados por el usuario
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el valor para el atributo 'atributo1' del objeto " + (i + 1) + ":");
            String atributo1 = scanner.nextLine();

            System.out.println("Ingrese el valor para el atributo 'atributo2' del objeto " + (i + 1) + ":");
            String atributo2 = scanner.nextLine();

            // Crear un objeto MiClase y agregarlo a la colección
            MiClase miObjeto = new MiClase(atributo1, atributo2);
            miColeccion.add(miObjeto);
        }

        // Ordenar la colección alfabéticamente
        Collections.sort(miColeccion);

        // Mostrar los objetos ordenados
        System.out.println("\nObjetos ordenados alfabéticamente:");
        for (MiClase miObjeto : miColeccion) {
            System.out.println(miObjeto);
        }
    }
}

class MiClase implements Comparable<MiClase> {
    private String atributo1;
    private String atributo2;

    public MiClase(String atributo1, String atributo2) {
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
    }

    // Métodos getter y setter para atributo1 y atributo2...

    @Override
    public int compareTo(MiClase otro) {
        // Comparar los objetos alfabéticamente usando atributo1
        return this.atributo1.compareTo(otro.atributo1);
    }

    @Override
    public String toString() {
        return "MiClase{" +
                "atributo1='" + atributo1 + '\'' +
                ", atributo2='" + atributo2 + '\'' +
                '}';
    }
}
