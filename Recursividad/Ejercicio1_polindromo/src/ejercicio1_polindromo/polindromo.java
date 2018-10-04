
package ejercicio1_polindromo;

public class polindromo {
        public Boolean Verificacion(String palabra, int i, int j){
        if(i != palabra.length()/2){ //Lo dividimos entre dos para ahorar repeticiones
            if(palabra.charAt(i) == palabra.charAt(j)){ //Verifica si la letra inicial es igual a la final
                return Verificacion(palabra, ++i, --j);
            }else{
                return false;
            }
        }
       return true; 
    }
    
    public String esPolindromo(String palabra, int i, int j){
        if(Verificacion(palabra, i ,j)){
            return "Es palindromo";
        }else{
            return "No es palindromo.";
        }
    }
}
