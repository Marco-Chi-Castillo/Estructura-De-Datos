
package ejercicio2_binario;

/**
 * @author Marco Antonio Chi Castillo
 */
import java.util.Scanner;
public class Ejercicio2_binario {
    
    public static void main(String[] args) {
       Scanner en = new Scanner(System.in);
       binario bi = new binario();
       
       int numero;
       
       System.out.print("Numero: ");
       numero = en.nextInt();
       bi.esBinario(numero);
       
    }
}
