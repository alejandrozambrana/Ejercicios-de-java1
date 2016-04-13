/*
*Ejercicio 1
*Crea un ArrayList con los nombres de 6 compañeros de clase. A continuación,
*muestra esos nombres por pantalla. Utiliza para ello un bucle for que recorra
*todo el ArrayList sin usar ningún índice.
*/
package colecciones.y.diccionarios;

import java.util.ArrayList;

public class Ejercicio1 {

  public static void main(String[] args) {

    ArrayList <String> a = new ArrayList <String>();
    
    a.add("Antonio");
    a.add("Ruben");
    a.add("Edu");
    a.add("Junior");
    a.add("Arroyo");
    a.add("Jose");
    
    for(String nombre : a){
      System.out.println(nombre);
    }
  }
  
}
