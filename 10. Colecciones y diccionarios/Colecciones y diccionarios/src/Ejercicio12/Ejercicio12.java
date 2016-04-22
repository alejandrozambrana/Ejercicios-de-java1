/**
* Ejercicio 12
* Escribe un programa que genere una secuencia de 5 cartas de la baraja
* española y que sume los puntos según el juego de la brisca. El valor de las
* cartas se debe guardar en una estructura HashMap que debe contener parejas
* (figura, valor), por ejemplo (“caballo”, 3). La secuencia de cartas debe ser una
* estructura de la clase ArrayList que contiene objetos de la clase Carta. El valor
* de las cartas es el siguiente: as → 11, tres → 10, sota → 2, caballo → 3, rey →
* 4; el resto de cartas no vale nada.
* Ejemplo:
* as de oros
* cinco de bastos
* caballo de espadas
* sota de copas
* tres de oros
* Tienes 26 puntos
*/
package Ejercicio12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio12 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    ArrayList <Carta> resultado = new ArrayList<Carta>();
    
    // crea HashMap
    HashMap<String,Integer> valor = new HashMap<String, Integer>();
    
    valor.put("as", 11);
    valor.put("tres", 10);
    valor.put("sota", 2);
    valor.put("caballo", 3);
    valor.put("rey", 4);
    
    System.out.println("Resultado Brisca:");
    
    //inicializa cartita
     Carta cartitas = new Carta();  
    
   //añade al arraylist cartas
    for(int i = 0; i < 5; i++){
      do{
        cartitas = new Carta();   
      } while (resultado.contains(cartitas));
      if(!resultado.contains(cartitas)){
        resultado.add(cartitas);
      }
      
    }
   
    //Suma puntos
    int suma = 0;
    for(int i = 0; i < resultado.size(); i++ ){
      if(valor.containsKey(resultado.get(i).getNumero())){
        suma = suma + valor.get(resultado.get(i).getNumero());
      }
    }
    
    
    //ordena las cartas
    Collections.sort(resultado);
    
    for(int i = 0; i < resultado.size(); i++ ){
      System.out.println(resultado.get(i));
    }
    System.out.println("Tienes " + suma + " puntos");
  }
  
}
