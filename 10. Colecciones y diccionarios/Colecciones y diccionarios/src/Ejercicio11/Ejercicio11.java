/**
* Ejercicio 11
* Realiza un programa que escoja al azar 5 palabras en español del minidiccionario
* del ejercicio anterior. El programa irá pidiendo que el usuario
* teclee la traducción al inglés de cada una de las palabras y comprobará si
* son correctas. Al final, el programa deberá mostrar cuántas respuestas son
* válidas y cuántas erróneas.
*/
package Ejercicio11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio11 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    //Crea el diccionario
    HashMap <String, String> diccionario = new HashMap <String, String>();
    
    diccionario.put("mesa", "table");
    diccionario.put("rojo", "red");
    diccionario.put("alfombra", "carpet");
    diccionario.put("regalo", "present");
    diccionario.put("lapiz", "pen");
    diccionario.put("zapatos", "shoes");
    diccionario.put("hola", "hello");
    diccionario.put("adios", "bye");
    diccionario.put("ver", "see");
    diccionario.put("pensar", "think");
    diccionario.put("gracias", "Thank you");
    diccionario.put("derecha", "right");
    diccionario.put("izquierda", "left");
    diccionario.put("romper", "break");
    diccionario.put("dibujar", "draw");
    diccionario.put("jugar", "play");
    diccionario.put("ir", "go");
    diccionario.put("agua", "water");
    diccionario.put("silla", "chair");
    diccionario.put("reloj", "clock");
    
    int numeroAleatorio;
    String palabraIngles;
    int puntuacion = 0;
    
    // guarda las claves en un Array de String
    String[] array = diccionario.keySet().toArray(new String[0]);
    
    //crea arrayList y coje palabras aleatorias
    ArrayList <Integer> dicci = new ArrayList <Integer>();
    
    for(int i = 0; i < 5; i++){
      do{
        numeroAleatorio = (int)(Math.random()*20);
      } while(dicci.contains(numeroAleatorio));
    dicci.add(numeroAleatorio);
    }
    
    System.out.println("Traduce las palabras de español a ingles: ");
    for(int i = 0; i < 5; i++){
      System.out.println(array[dicci.get(i)]);
      System.out.println("Escribelo en ingles: ");
      palabraIngles = s.nextLine();
      if(palabraIngles.equalsIgnoreCase(diccionario.get(array[dicci.get(i)]))){
        System.out.println("Correcto");
        System.out.println("--------------------------");
        puntuacion++;
      }else{
        System.out.println("Incorrecto.");
        System.out.println("La respues correcta es: " + diccionario.get(array[dicci.get(i)]));
        System.out.println("--------------------------");
      }   
    }
    
    System.out.println("Tu puntuacion es: " + puntuacion);
  }
}
