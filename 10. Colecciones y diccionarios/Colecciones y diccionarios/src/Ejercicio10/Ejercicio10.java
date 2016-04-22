/**
* Ejercicio 10
* Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras
* (con su correspondiente traducción). Utiliza un objeto de la clase HashMap para
* almacenar las parejas de palabras. El programa pedirá una palabra en español
* y dará la correspondiente traducción en inglés.
*/
package Ejercicio10;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio10 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    String palabraIntroducida;
    
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
  
    System.out.print("Introduce la palabra de la que quieres saber la traduccion en ingles: ");
    palabraIntroducida = s.nextLine();
    
    if(diccionario.containsKey(palabraIntroducida)){
      System.out.println("En ingles es: " + diccionario.get(palabraIntroducida));
    }else{
      System.out.println("Lo siento, esa palabra no se encuentra en el diccionario");
    }
    
  }
}
