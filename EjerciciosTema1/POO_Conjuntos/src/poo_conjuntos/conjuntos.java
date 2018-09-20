
package poo_conjuntos;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class conjuntos {
  
    public ArrayList llenado(Scanner en, int a ){
        ArrayList C = new ArrayList();
        String s;
         for(int i = 0; i < a; i++){
            System.out.print((i+1) + "- Elemento: ");
            s = en.next();
            C.add(s);
        }
       return C;
    }
    
    public void conjuntoVacio(ArrayList a, ArrayList b){
        a.clear();
        b.clear();
        System.out.println("Conjunto C_A: " + a);
        System.out.println("Conjunto C_B: " + b);
    }
    
    public void esVacio(ArrayList a, ArrayList b){
        boolean ca = a.isEmpty(); //Esta propiedad devuelve true si el arreglo tiene elementos.
        boolean cb = b.isEmpty();
        
        //Para el primer conjunto
        if(ca == true){
            System.out.println("Conjunto C_A Contiene elementos.");
        }else{
            System.out.println("Conjunto C_A Esta vacio.");
        }
        
        //Para el segundo conjunto
        if(cb == true){
            System.out.println("Conjunto C_B Contiene elementos.");
        }else{
            System.out.println("Conjunto C_B Esta vacio.");
        }
    }
    
    public void AgregarElemento(ArrayList a, ArrayList b, Scanner en){
        int nuevo;
        System.out.print("\n1- C_A: " + a +"\n2- C_B: " + b + "\nElige Conjunto: ");
        int op = en.nextInt();
        switch(op){
            case 1: 
                System.out.print("Ingrese nuevo valor: ");
                nuevo = en.nextInt();
                a.add((a.size()), nuevo); //Colocamos el nuevo valor, el primero es la posicion y el segundo el nuevo elemento.
                System.out.println("C_A: " + a);
                break;
            case 2:
                System.out.print("Ingrese nuevo valor: ");
                nuevo = en.nextInt();
                b.add((b.size()), nuevo); //Colocamos el nuevo valor, el primero es la posicion y el segundo el nuevo elemento.
                System.out.println("C_B: " + b);
                break;
        }
    }
    
    public void BuscarElemento(ArrayList a, ArrayList b, Scanner en){
        boolean encontrado = false;
        String buscar;
        System.out.print("\nElemento A buscar: ");
        buscar = en.next();
        for(int i = 0; i < a.size(); i++){
            if(buscar.equals(a.get(i))){
                  System.out.println("El elemento se encuentra en C_A\nPosicion: " + (i+1));
                  encontrado = true;
            }else if(encontrado == false && i == a.size()-1){
                System.out.println("El elemento no se encontro en C_A");
            }
        }
         for(int i = 0; i < b.size(); i++){
            if(buscar.equals(b.get(i))){
                  System.out.println("El elemento se encuentra en C_B\nPosicion: " + (i+1));
            }else if(encontrado == false && i == b.size()-1){
                System.out.println("El elemento no se encontro en C_B");
            }
        }
    }
 
    public void eliminarElemento(ArrayList a, ArrayList b, Scanner en){
        String eliminar;
        System.out.print("\n1 - C_A: " + a +"\n2 - C_B: " + b + "\nElige Conjunto: ");
        int op = en.nextInt();
        
        System.out.print("\nElemento a Eliminar: ");
        eliminar = en.next();
        switch(op){
            case 1:
                for(int i = 0; i < a.size(); i++){
                    if(eliminar.equals(a.get(i))){
                          a.remove(i);
                          System.out.print("\nElemento eliminado ");
                          System.out.println("C_A:" + a);
                    }
                }
                break;
            case 2:
                for(int i = 0; i < b.size(); i++){
                    if(eliminar.equals(b.get(i))){
                          b.remove(i);
                          System.out.print("\nElemento eliminado ");
                          System.out.println("C_B: " + b);
                    }
                }
                break;
                
        }
    } 
    
    public void Union(ArrayList a, ArrayList b){
        System.out.println("\n1 - C_A: " + a +"\n2 - C_B: " + b);
        ArrayList union = new ArrayList();
        Set<String> hs = new HashSet<>(); //Es un metodo Set, el cual no permite repetidos en su areglo.
        //Agregamos las dos areglos a y b al Set hs.
        hs.addAll(a); 
        hs.addAll(b);
        //Se lo asignamos a union.
        union.addAll(hs);
        System.out.println("La union es: " + union);
    }
    
    public void Interseccion(ArrayList a, ArrayList b){
        ArrayList inter = new ArrayList();
        System.out.println("\n1 - C_A: " + a +"\n2 - C_B: " + b);
        for(int i = 0; i < b.size(); i++){
            if(a.contains(b.get(i))){ //contains, verifica si hay elementos de b en a.
                inter.add(b.get(i));
            }
        }
        System.out.println("La interseccion es: " + inter);
    }
    
    public void Diferencia(ArrayList a, ArrayList b){
        ArrayList dif1 = new ArrayList();
        ArrayList dif2 = new ArrayList();
        System.out.println("\n1 - C_A: " + a +"\n2 - C_B: " + b);
            for(int i = 0; i < a.size(); i++){
                if(!b.contains(a.get(i))){ 
                    dif1.add(a.get(i));
                }
            }
            System.out.println("La Diferencia de C_A - C_B es: " + dif1);
            for(int i = 0; i < b.size(); i++){
                if(!a.contains(b.get(i))){ 
                    dif2.add(b.get(i));
                }
            }
            System.out.println("La Diferencia de C_B - C_A es: " + dif2);
        }
    }
   
