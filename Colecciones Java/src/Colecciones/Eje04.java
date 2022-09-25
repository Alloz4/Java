package Colecciones.src;

/**
 * Implementacion basica de bot ELIZA Ejercicio04.
 * 
 * @author (Alberto Lopez) 
 * @version (24/04/2018)
 */
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Eje04 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        HashMap<String, String> thEliza = new HashMap<String, String>();

        // Asigno palabras clave a respuesta
        thEliza.put("HOLA", "Hola, �qu� tal?");
        thEliza.put("ENCANTADO", "Encantado de conocerte yo tambi�n");
        thEliza.put("ADIOS", "Adi�s, espero volverte a ver pronto");
        thEliza.put("HORA", "Los siento no llevo reloj");
        thEliza.put("NOMBRE", "Mi nombre es Eliza");
        thEliza.put("CACA", "Creo que tu lenguaje no es adecuado");
        String otro = "Lo siento, no te comprendo.";

        Scanner sc = new Scanner(System.in);

        // Obtengo la lista de claves
        Set<String> Claves = thEliza.keySet();

        System.out.println("Estas conectado con el sistema ELIZA 0.0 :");
        boolean fin = false;
        do {
            System.out.print("<");
            String linea = sc.nextLine();
            // Paso todo a mayusculas;
            linea = linea.toUpperCase();

            boolean encontrado = false;

            for (String palabraclave : Claves) {
                // Si la linea contiene la entrada en al clave
                if (linea.indexOf(palabraclave) >= 0) {
                    // if ( linea.contains(palabraclave)){ // Otra forma
                    System.out.println(">" + thEliza.get(palabraclave));
                    encontrado = true;
                    if (palabraclave.contentEquals("ADIOS")) {
                        fin = true;
                    }
                    break;
                }
            }
            if (!encontrado) {
                System.out.println(otro);
            }
        } while (!fin);
        System.out.println(" Fin de conexi�n.");

    }
}