import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RecorreCaracteresYLosguarda {
    public static void main(String[] args) {
        // Crear un archivo llamado "Ejercicio1.txt" en la carpeta actual
        File archivo = new File("Ejercicio1.txt");

        try {
            // Crear un objeto BufferedWriter para escribir en el archivo
            BufferedWriter escritor = new BufferedWriter(new FileWriter(archivo));

            // Leer caracteres desde el teclado y escribirlos en el archivo
            System.out.println("Introduce caracteres para escribir en el archivo (presiona Ctrl + D para finalizar):");
            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNext()) {
                String caracter = scanner.next();
                if (caracter.length() == 1) {
                    if (caracter.equalsIgnoreCase("h")) {
                        System.out.println("Se ha encontrado la letra 'h'");
                    } else {
                        escritor.write(caracter);
                        escritor.newLine(); // Agregar un salto de línea después de cada caracter
                    }
                } else {
                    System.out.println("Ingresa solo un caracter a la vez.");
                }
            }

            // Cerrar el escritor
            escritor.close();

            // Mostrar el contenido del archivo
            System.out.println("Contenido del archivo:");
            Scanner lector = new Scanner(archivo);
            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                System.out.println(linea);
            }
            lector.close();

        } catch (IOException e) {
            System.err.println("Error al escribir o leer el archivo: " + e.getMessage());
        }
    }
}
