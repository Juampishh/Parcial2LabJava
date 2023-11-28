import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class ArrarDe50CaracteresEscribeLosPrimero20 {

        public static void main(String[] args) {
            char[] caracteres = generarCaracteres();
            escribirEnArchivo(caracteres);
            leerYMostrarPrimerosCaracteres();
        }

        private static char[] generarCaracteres() {
            char[] caracteres = new char[50];
            // Puedes generar los caracteres de alguna manera específica, o simplemente asignar valores manualmente como en este ejemplo:
            for (int i = 0; i < caracteres.length; i++) {
                caracteres[i] = (char) ('A' + i); // En este ejemplo, asignamos caracteres de A a Z.
            }
            return caracteres;
        }

        private static void escribirEnArchivo(char[] caracteres) {
            try (FileWriter writer = new FileWriter("archivo.txt")) {
                writer.write(caracteres);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private static void leerYMostrarPrimerosCaracteres() {
            try (FileReader reader = new FileReader("archivo.txt");
                 BufferedReader bufferedReader = new BufferedReader(reader)) {

                char[] primerosCaracteres = new char[20];
                int caracteresLeidos = bufferedReader.read(primerosCaracteres, 0, 20);

                if (caracteresLeidos > 0) {
                    System.out.println("Primeros 20 caracteres leídos: ");
                    System.out.println(new String(primerosCaracteres, 0, caracteresLeidos));
                } else {
                    System.out.println("No se pudo leer ningún caracter.");
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


