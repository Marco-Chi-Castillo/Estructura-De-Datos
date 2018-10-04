
package ejercicio1_polindromo;

/**
 *
 * @author Marco Antonio Chi Castillo
 */

import java.util.Scanner;
public class Ejercicio1_polindromo {

    public static void main(String[] args) {
        String entrada, palabra;
     
        polindromo po = new polindromo();
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe palabra: ");
        
        entrada = leer.nextLine();
        palabra = entrada.replaceAll(" ", ""); //convierte la palabra en una nueva palabra sin espacios.
        System.out.println(po.esPolindromo(palabra, 0, palabra.length()-1));
    }
}
