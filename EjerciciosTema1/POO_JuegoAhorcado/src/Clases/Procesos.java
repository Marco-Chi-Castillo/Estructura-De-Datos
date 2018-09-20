
package Clases;

import java.util.Arrays;
import java.util.Scanner;

public class Procesos {
    char cadena[];
    char cadenaJuego[];
    char intento;
    String[] palabras;
    
    //Get y Setter.
    public char[] getCadena() {
        return cadena;
    }

    public char[] getCadenaJuego() {
        return cadenaJuego;
    }

    public void setCadena(char[] cadena) {
        this.cadena = cadena;
    }

    public void setCadenaJuego(char[] cadenaJuego) {
        this.cadenaJuego = cadenaJuego;
    }
    
    public void Cadena(String[] palabras, int tamaño){
        cadena = palabras[tamaño].toCharArray(); //Metodo para convertir un String en un Char.
        cadenaJuego = palabras[tamaño].toCharArray();
    }
    
    public void OcultarCadena(){
        for(int i = 0; i< cadenaJuego.length; i++){ //Ocultacion de palabra.
            cadenaJuego[i] = '*';
        }
        System.out.println("Adivina la palabra " + Arrays.toString(cadenaJuego)); //Convierte el Char en String.
    }
    
    public void Juego(Scanner en, int i){
        System.out.print(i + " -Intento: ");
        intento = en.next().charAt(0);
          for(int x = 0; x < cadena.length ;x++){ //Verificacion del entrada con la palabra escondida.
                if(cadena[x]==intento){
                 cadenaJuego[x] = intento;
                }
           } 
    }
    
    public void Verificacion(int i, int intentos){
         if(Arrays.equals(cadena, cadenaJuego)){ //Verifica dos arrays.
           System.out.println("\nFelicidades Lo has logrado: " + Arrays.toString(cadena));
                System.exit(0); //Finaliza un programa.
            }else if(i==intentos){
                System.out.println("\nOh No. Perdiste");
                System.exit(0); //Finaliza un programa.
          }
    }
}