
package ejercicio3_cambio;

/**
 * @author Marco Antonio Chi Castillo
 */
import java.util.Scanner;
public class Ejercicio3_cambio {
    public static void main(String[] args) {
       Scanner en = new Scanner(System.in);
       cambio cam = new cambio();
       
        System.out.print("Costo $: ");
       int costo = en.nextInt();
        System.out.print("Pago $: ");
       int pago = en.nextInt();
       
        int cambio = pago - costo;
        //System.out.print("Su cambio $: " + cambio);
        cam.impresionCambio(cambio);
      
    }
    
}
