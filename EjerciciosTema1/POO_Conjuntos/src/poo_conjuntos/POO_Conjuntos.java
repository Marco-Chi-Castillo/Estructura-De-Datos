
package poo_conjuntos;

import java.util.Scanner;
import java.util.ArrayList;

public class POO_Conjuntos {

    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);   
        ArrayList C_A = new ArrayList(); //Primer conjunto.
        ArrayList C_B = new ArrayList(); //Segundo conjunto.
        
        //Variables.
        int a, //Tamaño del areglo A
            b, //Tamaño del areglo B
            op;
        
        //Objetos.
        conjuntos con = new conjuntos();

        System.out.print("Numero Elementos de C_A: ");
        a = en.nextInt();
        C_A = con.llenado(en, a);
        
        System.out.print("Numero Elementos de C_B: ");
        b = en.nextInt();
        C_B = con.llenado(en, b);
        
        System.out.println("\nOpciones:");
        System.out.println("1- Conjunto Vacio\n2- Es vacio\n3- Añadir un elemento al conjunto\n4- Pertenece un elemento al conjunto " +
        "\n5- Retirar un elemento del conjunto\n6- Union de dos conjuntos\n7- Intersección de dos conjuntos\n8- diferencia de conjuntos. ");
        System.out.print("Opcion: ");
        op = en.nextInt();
        
        switch(op){
            case 1:
                con.conjuntoVacio(C_A, C_B);
                break;
            case 2:
                con.esVacio(C_A, C_B);
                break;
            case 3:
                con.AgregarElemento(C_A, C_B, en);
                break;
            case 4: 
                con.BuscarElemento(C_A, C_B, en);
                break;
            case 5:
                con.eliminarElemento(C_A, C_B, en);
                break;
            case 6:
                con.Union(C_A, C_B);
                break;
            case 7:
                con.Interseccion(C_A, C_B);
                break;
            case 8:
                con.Diferencia(C_A, C_B);
                break;
        }
    }
    
}
