/*
* Ejercicio 2
* Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
* ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de esos
* números. El tamaño de la lista también será aleatorio y podrá oscilar entre 10
* y 20 elementos ambos inclusive.
*/
package Ejercicio2;

import java.util.ArrayList;

public class Ejercicio2 {

  public static void main(String[] args) {

    //crea el array
    ArrayList <Integer> a = new ArrayList <Integer>();
    
    //define el tamaño del array
    int tamañoArray = (int)(Math.random()*10) + 11;
    
    //mete numeros aleatorios en el array
    for(int i = 0; i < tamañoArray; i++)
      a.add((int)(Math.random()*101));
    
    //muestra el array
    System.out.print("Array: ");
    for(int array : a){
      System.out.print(array + " ");
    }
    
    int suma = 0;
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;
    for(int i = 0 ; i < tamañoArray; i++){
      
      //suma
      suma = suma + a.get(i); 
      
      //maximo del array
      if(a.get(i) > maximo){
        maximo = a.get(i);
      }
      
      //minimo del array
      if(a.get(i) < minimo){
        minimo = a.get(i);
      }
    }
    
    //media
    int media = 0;
    media = suma/tamañoArray;
    
    System.out.println("\nLa suma del array es: " + suma);
    System.out.println("La media del array es: " + media);
    System.out.println("El maximo del array es: " + maximo);
    System.out.println("El minimo del array es:" + minimo);
  }
}
