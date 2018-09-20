
package poo_numerosnaturales;
import java.util.Scanner;

public class POO_NumerosNaturales {


    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        NumerosNaturales pro = new NumerosNaturales();
        
        //Variables
        int num;
        byte opcion;
        
        System.out.println("1- Cero\n2- Sucesor\n3- Es cero\n4- Igual\n5- Suma\n6- Antecesor\n7- Diferencia\n8- Menor");
        System.out.print("Elige una opcion: ");
        opcion = en.nextByte();
        System.out.print("Numero Natural: ");
        num = en.nextInt();
        switch(opcion){
            case 1:
                pro.Cero();
                break;
            case 2:
                pro.Sucesor(num);
                break;
            case 3:
                pro.esCero(num);
                break;
            case 4:
                pro.Igual(en, num);
                break;
            case 5: 
                pro.Suma(en, num);
                break;
            case 6:
                pro.Antecesor(num);
                break;
            case 7:
                pro.Diferencia(en, num);
                break;
            case 8: 
                pro.Menor(en, num);
                break;
        }
        
    }
    
}
