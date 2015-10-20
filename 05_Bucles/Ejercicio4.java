/**
 * Ejercicio 4 
 * Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás 
 * utilizando un bucle for .
 * 
 * @author Alejandro Zambrana Naranjo
 */

public class Ejercicio4 {
  public static void main(String[] args) {
    
    for (int i = 320; i >= 160; i= i - 20 /** es lo mismo que i -= 20 */) {
      System.out.println(i);
    }
  }
}


