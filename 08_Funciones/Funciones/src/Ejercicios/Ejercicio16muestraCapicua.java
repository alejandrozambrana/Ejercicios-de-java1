  /**
   * 
   * Ejercicio 16 Muestra los números capicúa que hay entre 1 y 99999.
   * 
   * @author Alejandro Zambrana Naranjo
   */ 
package Ejercicios;

import static Funciones.Calculos.esCapicua;
 
public class Ejercicio16muestraCapicua {
 

 public static void main(String[] args) {
    for(int i = 1; i <= 99999; i++){
      if( esCapicua(i)){
        System.out.print(i + " ");
      }
    }
  }
}