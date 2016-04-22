/**
* Ejercicio 8
* Realiza un programa que escoja al azar 10 cartas de la baraja española
* (10 objetos de la clase Carta). Emplea un objeto de la clase ArrayList para
* almacenarlas y asegúrate de que no se repite ninguna.
*/
package Ejercicio09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio9 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    ArrayList <Carta> baraja = new ArrayList<Carta>();
    
    System.out.println("10 Carta extraidas de la Baraja de cartas:");
    
    //inicializa cartita
     Carta cartitas = new Carta();  
    
   //añade al arraylist cartas
    for(int i = 0; i < 10; i++){
      do{
        cartitas = new Carta();   
      } while (baraja.contains(cartitas));
      if(!baraja.contains(cartitas)){
        baraja.add(cartitas);
      }
      
    }
    
    Collections.sort(baraja);
    
    for(int i = 0; i < baraja.size(); i++ ){
      System.out.print(baraja.get(i));
      if(i < 9){
        System.out.print(", ");
      }
    }
    System.out.println();
  }
  
}
