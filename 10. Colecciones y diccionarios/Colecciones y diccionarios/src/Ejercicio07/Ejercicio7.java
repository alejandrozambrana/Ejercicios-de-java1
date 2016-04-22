/**
* Ejercicio 7
* La máquina Eurocoin genera una moneda de curso legal cada vez que se pulsa
* un botón siguiendo la siguiente pauta: o bien coincide el valor con la moneda
* anteriormente generada - 1 céntimo, 2 céntimos, 5 céntimos, 10 céntimos, 25
* céntimos, 50 céntimos, 1 euro o 2 euros - o bien coincide la posición – cara o
* cruz. Simula, mediante un programa, la generación de 6 monedas aleatorias
* siguiendo la pauta correcta. Cada moneda generada debe ser una instancia
* de la clase Moneda y la secuencia se debe ir almacenando en una lista.
*/
package Ejercicio07;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio7 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    //crea array
    ArrayList<Moneda> dinero = new ArrayList <Moneda>();
    
    System.out.println("Resultado de la maquina EUROCOIN");
    
    /*String cantidad = monedillas.getCantidad();
    String posicion = monedillas.getPosicion();
    */
    
    //Saca la cantidad y la cara de la clase moneda
    for(int i = 0; i < 6; i++){
      Moneda monedillas = new Moneda();
      dinero.add(monedillas);
    }
    
    for(Moneda monedilla : dinero){
      System.out.println(monedilla);
    }
    
    
  }
  
}
