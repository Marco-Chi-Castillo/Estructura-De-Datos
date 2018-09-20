
package poo_juegoahorcado;

import Clases.Procesos;
import java.util.Scanner;
import java.util.Random;

public class POO_JuegoAhorcado {

    public static void main(String[] args) {
        int intentos = 12;
       Scanner entrada = new Scanner(System.in);
       Random r = new Random(); //Numero ramdom.
       String[] palabras = {"caballo","perro","gato","loro", "pez", "oveja", "nutria", "delfin", "cisne"}; //Arreglo de palabras.
       int n_azar = r.nextInt(palabras.length); //Convercion variable r en integer.
       
       //Declaracion del Objeto.
       Procesos pro = new Procesos(); 
       
       //Objetos.
       pro.Cadena(palabras, n_azar); //Convierte la cadena string a char.
       pro.OcultarCadena(); //Oculta la palabra.
       
       for(int i = 1; i <= intentos; i++){
           pro.Juego(entrada, i);
           pro.Verificacion(i, intentos);
           System.out.println(pro.getCadenaJuego()); 
       }
    }
}
