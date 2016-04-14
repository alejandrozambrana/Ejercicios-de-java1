/*
* Ejercicio 3
* Escribe un programa que ordene 10 números enteros introducidos por teclado
* y almacenados en un objeto de la clase ArrayList.
*/
package Ejercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio3 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    //crea el array
    ArrayList <Integer> array = new ArrayList <Integer>();
    
    //Introducir datos
    for(int i = 0; i < 10; i++){
      System.out.print("Introduce el numero " + (i + 1) + " del Array: ");
      array.add(s.nextInt()) ;
    }
    
    //Muestra array
    System.out.print("Array original: [");
    for(int i = 0; i < 10; i++){
      if(i < 9){
        System.out.print(array.get(i) + ", ");
      } else {
        System.out.print(array.get(i) + "] ");
      }
    }
    
    //ordena el array de menor a mayor
    Collections.sort(array);
    
    //muestra el array ordenado
    System.out.println("\nArray ordenado: " + array);
  }
}
