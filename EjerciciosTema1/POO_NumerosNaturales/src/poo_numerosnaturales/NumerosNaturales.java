
package poo_numerosnaturales;
import java.util.Scanner;

public class NumerosNaturales {
    int num;
    
    public void Cero(){
        num = 0;
        System.out.println(num);
    }
    
    public void Sucesor(int numero){
        numero++;
        System.out.println("El sucesor es:" + numero);
    }
    
    public void esCero(int numero){
        if(numero!=0){
            System.out.println("No es cero");
        } else {
            System.out.println("Es cero");
        }
    }
    
    public void Igual(Scanner en, int numero){
        System.out.print("Nuevo Numero: ");
        num = en.nextInt();
        if(numero == num){
            System.out.println("Los numeros son iguales");
        }else{
            System.out.println("Los numeros no son iguales");
        }
    }
    
    public void Suma(Scanner en, int numero){
        System.out.print("Nuevo Numero: ");
        num = en.nextInt();
        System.out.println("La suma es: " + (num+numero));
    }
    
    public void Antecesor(int numero){
        numero--;
        System.out.println("El numero antecesor es: " + numero);
    }
    
    public void Diferencia(Scanner en, int numero){
        System.out.print("Nuevo Numero: ");
        num = en.nextInt();
        System.out.println("La Diferencia es: " + (numero-num));
    }
    
    public void Menor(Scanner en, int numero){
        System.out.print("Nuevo Numero: ");
        num = en.nextInt();
        if(numero < num){
            System.out.println("El nuevo numero es mayor");
        }else{
            System.out.println("El nuevo numero es menor");
        }
    }
    
}
