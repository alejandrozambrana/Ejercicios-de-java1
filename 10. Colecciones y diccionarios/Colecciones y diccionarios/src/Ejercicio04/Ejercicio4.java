/*
* Ejercicio 4
* Realiza un programa equivalente al anterior pero en esta ocasión, el programa
* debe ordenar palabras en lugar de números.
*/
package Ejercicio04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio4 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    //crea el array
    ArrayList <String> array = new ArrayList <String>();
    
    //Introducir datos
    for(int i = 0; i < 10; i++){
      System.out.print("Introduce la palabra " + (i + 1) + " del Array: ");
      array.add(s.next()) ;
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
