
package ejercicio2_binario;

public class binario {
    public void esBinario(int numero){
       if(numero < 2){
           System.out.print(numero);
       }else{
           esBinario(numero/2);
           System.out.print(numero%2);
       }
    }
}
