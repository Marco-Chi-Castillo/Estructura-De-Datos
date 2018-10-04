
package ejercicio3_cambio;

public class cambio {
    int monedas[] = new int [8];
    
    public void dinero(int cambio){     
        if(cambio-200 >= 0){
            monedas[7]++;
            dinero(cambio-200);
        }
        else if(cambio-100 >= 0){
            monedas[6]++;
            dinero(cambio-100);
        }
         else if(cambio-50 >= 0){
            monedas[5]++;
            dinero(cambio-50);
        }
        else  if(cambio-20 >= 0){
            monedas[4]++;
            dinero(cambio-20);
        }
        else   if(cambio-10 >= 0){
            monedas[3]++;
            dinero(cambio-10);
        }
         else  if(cambio-5 >= 0){
            monedas[2]++;
            dinero(cambio-5);
        }
        else   if(cambio-2 >= 0){
            monedas[1]++;
            dinero(cambio-2);
        }
         else  if(cambio-1 >= 0){
            monedas[0]++;
            dinero(cambio-1);
        }
    }
     public void impresionCambio(int cambio){
      dinero(cambio);
      if(monedas[7]>0)System.out.println(monedas[7] + " billetes de 200");
      if(monedas[6]>0)System.out.println(monedas[6] + " billetes de 100");
      if(monedas[5]>0)System.out.println(monedas[5] + " billetes de 50");
      if(monedas[4]>0)System.out.println(monedas[4] + " billetes de 20");
      if(monedas[3]>0)System.out.println(monedas[3] + " monedas de 10");
      if(monedas[2]>0)System.out.println(monedas[2] + " monedas de 5");
      if(monedas[1]>0)System.out.println(monedas[1] + " monedas de 2");
      if(monedas[0]>0)System.out.println(monedas[0] + " monedas de 1");
     }
}

   
